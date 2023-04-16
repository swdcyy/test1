package com.yxcorp.gifshow.prettify.makeup.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.p$a;
import com.yxcorp.gifshow.camerasdk.p$c;
import com.yxcorp.gifshow.camerasdk.q;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import og9.a;
import f1c.c;
import erd.g;
import crd.b;
import f1c.a;
import f1c.b;
import android.content.Intent;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b extends d	// class@00116b
{
    public h n;
    public boolean o;

    public void b(CameraPageType p0,b p1,h p2){
       super(p0, p1);
       this.n = p2;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.t0(null, null);
       }
       return;
    }
    public void k(View p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       super.k(p0);
       if (this.o != null) {
          return;
       }
       p0 = PatchProxy.apply(null, this, uob, "10");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(!this.c.equals(CameraPageType.VIDEO) && !this.c.equals(CameraPageType.PHOTO)){
          d tc = this.c;
          if (tc != CameraPageType.WHATS_UP && tc != CameraPageType.TIE_TIE) {
             b = false;
          }
       }
       b = true;
       if (!b) {
          return;
       }else {
          this.d.l(a.class, new c(this));
          return;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.h.t0(null, null);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.h.t0(null, null);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.t0(new a(this), new b(this));
       }
       return;
    }
    public void w1(Intent p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       super.w1(p0);
       if (a.a().c()) {
          Object obj = PatchProxy.applyOneRefs(p0, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 == null){
             String stringExtra = p0.getStringExtra("makeupSuitId");
             if (stringExtra != null && !TextUtils.isEmpty(stringExtra.trim())) {
                b = true;
             }
          }
          b = false;
          this.o = b;
       }
       return;
    }
}
