package com.google.gson.internal.LinkedTreeMap$e;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class LinkedTreeMap$e implements Map$Entry	// class@00056e
{
    public LinkedTreeMap$e b;
    public LinkedTreeMap$e c;
    public LinkedTreeMap$e d;
    public LinkedTreeMap$e e;
    public LinkedTreeMap$e f;
    public final Object g;
    public Object h;
    public int i;

    public void LinkedTreeMap$e(){
       super();
       this.g = null;
       this.f = this;
       this.e = this;
    }
    public void LinkedTreeMap$e(LinkedTreeMap$e p0,Object p1,LinkedTreeMap$e p2,LinkedTreeMap$e p3){
       super();
       this.b = p0;
       this.g = p1;
       this.i = 1;
       this.e = p2;
       this.f = p3;
       p3.e = this;
       p2.f = this;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          LinkedTreeMap$e tg = this.g;
          if (tg == null) {
             if (p0.getKey() != null) {
             label_0032 :
                return b;
             }
          }else if(tg.equals(p0.getKey())){
          }
          tg = this.h;
          if (tg == null) {
             if (p0.getValue() != null) {
             }
          }else if(tg.equals(p0.getValue())){
          }
          b = true;
          goto label_0032 ;
       }else {
          goto label_0032 ;
       }
    }
    public Object getKey(){
       return this.g;
    }
    public Object getValue(){
       return this.h;
    }
    public int hashCode(){
       LinkedTreeMap$e tg = this.g;
       int i = 0;
       int i1 = (tg == null)? 0: tg.hashCode();
       LinkedTreeMap$e th = this.h;
       if (th != null) {
          i = th.hashCode();
       }
       return (i1 ^ i);
    }
    public Object setValue(Object p0){
       LinkedTreeMap$e th = this.h;
       this.h = p0;
       return th;
    }
    public String toString(){
       return this.g+"="+this.h;
    }
}
