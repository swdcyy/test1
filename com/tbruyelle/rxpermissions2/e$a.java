package com.tbruyelle.rxpermissions2.e$a;
import erd.o;
import com.tbruyelle.rxpermissions2.e;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.util.Iterator;
import zq8.a;
import java.lang.Boolean;

public class e$a implements o	// class@000e08
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (p0.isEmpty()) {
          p0 = t.empty();
       }else {
          p0 = p0.iterator();
          while (true) {
             if (p0.hasNext()) {
                if (p0.next().b == null) {
                   p0 = t.just(Boolean.FALSE);
                   break ;
                }
             }else {
                p0 = t.just(Boolean.TRUE);
                break ;
             }
          }
       }
       return p0;
    }
}
