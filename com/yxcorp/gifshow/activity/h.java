package com.yxcorp.gifshow.activity.h;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Runtime;
import java.lang.Thread;
import java.lang.System;
import java.lang.CharSequence;
import e17.i;
import java.lang.AssertionError;

public final class h implements g	// class@00134c
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       Runtime.getRuntime().gc();
       try{
          int i = 100;
          Thread.sleep(i);
          System.runFinalization();
          i.d(R.style.arg_RES_7f11066a, "成功执行GC操作");
          return;
       }catch(java.lang.InterruptedException e0){
          throw new AssertionError();
       }
    }
}
