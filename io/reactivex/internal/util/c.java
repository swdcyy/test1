package io.reactivex.internal.util.c;
import ird.a;
import java.lang.Thread;
import io.reactivex.internal.schedulers.g;
import erd.e;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public final class c	// class@0014d5
{

    public static void a(){
       if (a.z) {
          if (!Thread.currentThread() instanceof g) {
             e x = a.x;
             boolean b = (x != null)? x.a(): false;
             if (b) {
             label_001f :
                throw new IllegalStateException("Attempt to block on a Scheduler "+Thread.currentThread().getName()+" that doesn\'t support blocking operators as they may lead to deadlock");
             }
          }else {
             goto label_001f ;
          }
       }
       return;
    }
}
