package com.yxcorp.gifshow.v3.q;
import z1.a;
import java.lang.Object;
import uv8.o$b;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class q implements a	// class@00161c
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       if (p0.c != null) {
          try{
             p0.f();
          }catch(java.lang.Exception e3){
             PostUtils.D("EditorActivity", "factory.unbindActivity\(\)", e3);
          }
       }
    }
}
