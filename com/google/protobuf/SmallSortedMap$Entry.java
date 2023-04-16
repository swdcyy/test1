package com.google.protobuf.SmallSortedMap$Entry;
import java.util.Map$Entry;
import java.lang.Comparable;
import com.google.protobuf.SmallSortedMap;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class SmallSortedMap$Entry implements Map$Entry, Comparable	// class@0004af
{
    public final Comparable key;
    public final SmallSortedMap this$0;
    public Object value;

    public void SmallSortedMap$Entry(SmallSortedMap p0,Comparable p1,Object p2){
       this.this$0 = p0;
       super();
       this.key = p1;
       this.value = p2;
    }
    public void SmallSortedMap$Entry(SmallSortedMap p0,Map$Entry p1){
       super(p0, p1.getKey(), p1.getValue());
    }
    public int compareTo(SmallSortedMap$Entry p0){
       return this.getKey().compareTo(p0.getKey());
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof Map$Entry) {
          return false;
       }
       if (!this.equals(this.key, p0.getKey()) || !this.equals(this.value, p0.getValue())) {
          b = false;
       }
       return b;
    }
    public final boolean equals(Object p0,Object p1){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
       }else {
          b = p0.equals(p1);
       }
       return b;
    }
    public Comparable getKey(){
       return this.key;
    }
    public Object getKey(){
       return this.getKey();
    }
    public Object getValue(){
       return this.value;
    }
    public int hashCode(){
       SmallSortedMap$Entry tkey = this.key;
       int i = 0;
       int i1 = (tkey == null)? 0: tkey.hashCode();
       SmallSortedMap$Entry tvalue = this.value;
       if (tvalue != null) {
          i = tvalue.hashCode();
       }
       return (i1 ^ i);
    }
    public Object setValue(Object p0){
       this.this$0.checkMutable();
       SmallSortedMap$Entry tvalue = this.value;
       this.value = p0;
       return tvalue;
    }
    public String toString(){
       return this.key+"="+this.value;
    }
}
