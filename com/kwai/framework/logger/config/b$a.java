package com.kwai.framework.logger.config.b$a;
import tq.d;
import com.kwai.framework.logger.config.b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w96.d;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class b$a implements d	// class@000b8d
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       d.C().v("VaderLogger", "["+this.a.a+"]vader exception: ", p0);
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().w("VaderLogger", "["+this.a.a+"]vader event: "+p0+", value: "+p1, objArray);
       return;
    }
    public void logCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().w("VaderLogger", "["+this.a.a+"]vader logCustomEvent: "+p0+", value: "+p1, objArray);
       b.a(0x4b316083).f1(p0, p1, 1);
       return;
    }
}
