package com.yxcorp.gifshow.camera.record.screen.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yg9.b;
import java.lang.Runnable;
import t45.c;
import android.content.Intent;
import android.content.IntentFilter;
import com.yxcorp.gifshow.camera.record.screen.a;

public class b extends d	// class@000f06
{
    public BroadcastReceiver n;
    public IntentFilter o;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.onDestroy();
       c.a(new b(this));
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       IntentFilter intentFilter = new IntentFilter();
       this.o = intentFilter;
       intentFilter.addAction("android.intent.action.SCREEN_ON");
       this.o.addAction("android.intent.action.SCREEN_OFF");
       this.b2(new a(this));
       return;
    }
}
