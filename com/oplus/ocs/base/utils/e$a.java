package com.oplus.ocs.base.utils.e$a;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Class;

public final class e$a	// class@000b24
{
    public Object a;
    public List b;

    public void e$a(Object p0){
       super();
       this.a = d.a(p0);
       this.b = new ArrayList();
    }
    public final e$a a(String p0,Object p1){
       this.b.add(d.a(p0+"="+p1));
       return this;
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(100)+this.a.getClass().getSimpleName()+'{';
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          str = str+this.b.get(i1);
          int i2 = i - 1;
          if (i1 < i2) {
             str = str+", ";
          }
          i1 = i1 + 1;
       }
       return str+'}';
    }
}
