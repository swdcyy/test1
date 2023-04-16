package com.google.common.base.Suppliers$a;
import ok.x;
import java.lang.Object;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;

public class Suppliers$a implements x	// class@0004bc
{
    public x b;
    public boolean c;
    public Object d;

    public void Suppliers$a(x p0){
       super();
       n.j(p0);
       this.b = p0;
    }
    public Object get(){
       if (this.c == null) {
          _monitor_enter(this);
          if (this.c == null) {
             Object obj = this.b.get();
             this.d = obj;
             this.c = true;
             this.b = null;
             _monitor_exit(this);
             return obj;
          }else {
             _monitor_exit(this);
          }
       }
       return this.d;
    }
    public String toString(){
       return "Suppliers.memoize\("+this.b+"\)";
    }
}
