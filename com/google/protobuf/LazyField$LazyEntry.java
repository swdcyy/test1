package com.google.protobuf.LazyField$LazyEntry;
import java.util.Map$Entry;
import java.lang.Object;
import com.google.protobuf.LazyField$1;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.LazyFieldLite;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class LazyField$LazyEntry implements Map$Entry	// class@00045d
{
    public Map$Entry entry;

    public void LazyField$LazyEntry(Map$Entry p0){
       super();
       this.entry = p0;
    }
    public void LazyField$LazyEntry(Map$Entry p0,LazyField$1 p1){
       super(p0);
    }
    public LazyField getField(){
       return this.entry.getValue();
    }
    public Object getKey(){
       return this.entry.getKey();
    }
    public Object getValue(){
       LazyField value = this.entry.getValue();
       if (value == null) {
          return null;
       }
       return value.getValue();
    }
    public Object setValue(Object p0){
       if (p0 instanceof MessageLite) {
          return this.entry.getValue().setValue(p0);
       }
       throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
