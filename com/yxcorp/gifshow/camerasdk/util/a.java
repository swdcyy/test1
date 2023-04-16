package com.yxcorp.gifshow.camerasdk.util.a;
import n65.a$c;
import java.lang.Object;
import java.lang.String;
import cj9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;
import java.util.ConcurrentModificationException;
import com.yxcorp.utility.SystemUtil;
import java.lang.Thread;
import java.lang.InterruptedException;
import qi9.q1;
import java.lang.Throwable;
import q87.c;

public final class a implements a$c	// class@00104f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
       }else {
          v0 ov0 = null;
       label_000d :
          if (ov0 < 5) {
             try{
                ov0.b(p0);
             }catch(java.util.ConcurrentModificationException e1){
                e1.printStackTrace();
                if (ov0 != 4) {
                   if (!SystemUtil.O()) {
                      long l = 100;
                      try{
                         Thread.sleep(l);
                      }catch(java.lang.InterruptedException e1){
                         e1.printStackTrace();
                         q1.C().e("CameraSafelyLibraryLoader", "loadLibrary", e1);
                      }
                   }
                }else {
                   throw e1;
                }
             }
          }
       }
       return;
    }
}
