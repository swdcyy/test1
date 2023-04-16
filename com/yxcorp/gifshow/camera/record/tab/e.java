package com.yxcorp.gifshow.camera.record.tab.e;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eh9.n;
import eh9.v;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;

public class e extends d	// class@000f50
{

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.w1(p0);
       f.b(n.class, new v(this), this.f);
       return;
    }
}
