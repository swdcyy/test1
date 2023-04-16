package com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$a;
import n3d.a;
import msd.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;

public final class ScreencastFloatButtonHelper$a implements a	// class@001a24
{
    public final a b;

    public void ScreencastFloatButtonHelper$a(a p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ScreencastFloatButtonHelper$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ScreencastFloatButtonHelper$a.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (i9.a(uoc.a())) {
          this.b.invoke();
       }
       return;
    }
}
