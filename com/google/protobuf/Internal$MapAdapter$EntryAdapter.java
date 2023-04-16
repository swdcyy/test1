package com.google.protobuf.Internal$MapAdapter$EntryAdapter;
import java.util.Map$Entry;
import com.google.protobuf.Internal$MapAdapter;
import java.lang.Object;
import com.google.protobuf.Internal$MapAdapter$Converter;

public class Internal$MapAdapter$EntryAdapter implements Map$Entry	// class@000452
{
    public final Map$Entry realEntry;
    public final Internal$MapAdapter this$0;

    public void Internal$MapAdapter$EntryAdapter(Internal$MapAdapter p0,Map$Entry p1){
       this.this$0 = p0;
       super();
       this.realEntry = p1;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof Map$Entry) {
          return false;
       }
       if (!this.getKey().equals(p0.getKey()) || !this.getValue().equals(this.getValue())) {
          b = false;
       }
       return b;
    }
    public Object getKey(){
       return this.realEntry.getKey();
    }
    public Object getValue(){
       return this.this$0.valueConverter.doForward(this.realEntry.getValue());
    }
    public int hashCode(){
       return this.realEntry.hashCode();
    }
    public Object setValue(Object p0){
       p0 = this.realEntry.setValue(this.this$0.valueConverter.doBackward(p0));
       if (p0 == null) {
          return null;
       }
       return this.this$0.valueConverter.doForward(p0);
    }
}
