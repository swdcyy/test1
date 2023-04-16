package com.vivo.push.model.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;

public final class a	// class@00108c
{
    public String a;
    public String b;

    public void a(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (a.class != p0.getClass()) {
          return false;
       }
       a ta = this.a;
       if (ta == null) {
          if (p0.a != null) {
             return false;
          }
       }else if(!ta.equals(p0.a)){
          return false;
       }
       return true;
    }
    public final int hashCode(){
       a ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return (i + 31);
    }
    public final String toString(){
       return "ConfigItem{mKey=\'"+this.a+'''+", mValue=\'"+this.b+'''+'}';
    }
}
