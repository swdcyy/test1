package com.google.common.util.concurrent.AbstractFuture$g;
import com.google.common.util.concurrent.AbstractFuture$b;
import com.google.common.util.concurrent.AbstractFuture$a;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$d;
import java.lang.Object;
import com.google.common.util.concurrent.AbstractFuture$j;
import java.lang.Thread;

public final class AbstractFuture$g extends AbstractFuture$b	// class@001929
{

    public void AbstractFuture$g(){
       super(null);
    }
    public void AbstractFuture$g(AbstractFuture$a p0){
       super(null);
    }
    public boolean a(AbstractFuture p0,AbstractFuture$d p1,AbstractFuture$d p2){
       _monitor_enter(p0);
       if (p0.c == p1) {
          p0.c = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public boolean b(AbstractFuture p0,Object p1,Object p2){
       _monitor_enter(p0);
       if (p0.b == p1) {
          p0.b = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public boolean c(AbstractFuture p0,AbstractFuture$j p1,AbstractFuture$j p2){
       _monitor_enter(p0);
       if (p0.d == p1) {
          p0.d = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public void d(AbstractFuture$j p0,AbstractFuture$j p1){
       p0.b = p1;
    }
    public void e(AbstractFuture$j p0,Thread p1){
       p0.a = p1;
    }
}
