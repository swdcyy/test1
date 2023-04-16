package com.yxcorp.gifshow.camera.record.screen.ScreenOffOnController$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.camera.record.screen.b;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import yg9.c;
import java.lang.Runnable;
import android.app.Activity;

public class ScreenOffOnController$1 extends BroadcastReceiver	// class@000f04
{
    public final b a;
    public static final int b;

    public void ScreenOffOnController$1(b p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreenOffOnController$1.class, "1")) {
          return;
       }
       this.a.e.runOnUiThread(new c(this, p1));
       return;
    }
}
