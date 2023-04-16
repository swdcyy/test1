package com.yxcorp.gifshow.homepage.functions.e$d;
import erd.g;
import com.yxcorp.gifshow.homepage.functions.e;
import f55.g;
import android.app.Activity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import java.lang.IndexOutOfBoundsException;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class e$d implements g	// class@0016db
{
    public final g b;
    public final Activity c;
    public final e d;

    public void e$d(e p0,g p1,Activity p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
       }else {
          this.b.a(412, "fromApi getFeed failed", null);
          if (!p0 instanceof IndexOutOfBoundsException) {
             ExceptionHandler.handleException(this.c, p0);
          }
       }
       return;
    }
}
