package com.google.common.util.concurrent.h;
import java.util.concurrent.Future;
import java.lang.Object;
import java.lang.Thread;

public final class h	// class@00193c
{

    public static Object a(Future p0){
       Thread thread = null;
       try{
       label_0001 :
          p0 = p0.get();
          if (thread) {
             Thread.currentThread().interrupt();
          }
          return p0;
       }catch(java.lang.InterruptedException e0){
          thread = 1;
          goto label_0001 ;
       }
    }
}
