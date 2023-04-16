package com.google.common.collect.Maps$n;
import com.google.common.collect.f;
import java.util.Map;
import java.lang.Object;
import com.google.common.collect.Maps;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public class Maps$n implements f	// class@00184f
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public void Maps$n(Map p0,Map p1,Map p2,Map p3){
       super();
       this.a = Maps.C(p0);
       this.b = Maps.C(p1);
       this.c = Maps.C(p2);
       this.d = Maps.C(p3);
    }
    public Map a(){
       return this.d;
    }
    public Map b(){
       return this.b;
    }
    public Map c(){
       return this.a;
    }
    public Map d(){
       return this.c;
    }
    public boolean e(){
       boolean b = (this.a.isEmpty() && (this.b.isEmpty() && this.d.isEmpty()))? true: false;
       return b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof f) {
          return false;
       }
       if (!this.c().equals(p0.c()) || (!this.b().equals(p0.b()) || (!this.d().equals(p0.d()) || !this.a().equals(p0.a())))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.c(),this.b(),this.d(),this.a()};
       return k.b(objArray);
    }
    public String toString(){
       StringBuilder str = (this.a.isEmpty() && (this.b.isEmpty() && this.d.isEmpty()))? 1: null;
       if (str) {
          return "equal";
       }else {
          str = "not equal";
          if (!this.a.isEmpty()) {
             str = str+": only on left="+this.a;
          }
          if (!this.b.isEmpty()) {
             str = str+": only on right="+this.b;
          }
          if (!this.d.isEmpty()) {
             str = str+": value differences="+this.d;
          }
          return str;
       }
    }
}
