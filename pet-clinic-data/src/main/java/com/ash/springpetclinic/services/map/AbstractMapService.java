package com.ash.springpetclinic.services.map;

import com.ash.springpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object Cannot be Null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry ->entry.getValue().equals(object));
    }

    private long getNextId(){
        Long nextid=null;
        try{
            nextid= Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextid=1L;
        }
        return nextid;
    }

}
