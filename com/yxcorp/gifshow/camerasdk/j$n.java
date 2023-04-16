package com.yxcorp.gifshow.camerasdk.j$n;
import ui9.e;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectSlot;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectError;
import qi9.q1;
import java.lang.StringBuilder;
import q87.c;

public class j$n implements e	// class@001027
{
    public final e a;
    public final j b;

    public void j$n(j p0,e p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onEffectPlayCompleted(EffectSlot p0,int p1){
       j$n on = j$n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, on, "1")) {
          return;
       }
       on = this.b;
       if (on.r != null && on.z == null) {
          this.a.onEffectPlayCompleted(p0, p1);
       }
       return;
    }
    public void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$n.class, "2")) {
          return;
       }
       j$n tb = this.b;
       if (tb.r != null && tb.z == null) {
          this.a.onLoadGroupEffect(p0, p1, p2);
       }
       return;
    }
    public void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$n.class, "3")) {
          return;
       }
       j$n tb = this.b;
       if (tb.r != null && tb.z == null) {
          Object[] objArray = new Object[0];
          q1.C().t("CameraSDK", "onSetEffectFailed:"+p2, objArray);
          this.a.onSetEffectFailed(p0, p1, p2);
       }
       return;
    }
}
