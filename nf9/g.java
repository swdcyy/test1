package nf9.g;
import ui9.b;
import ui9.c;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import nf9.a;
import oc9.t;
import i5b.p;
import nf9.g$a;
import i5b.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import je9.a;
import nf9.f;
import erd.g;
import crd.b;
import m4b.e;
import com.kwai.video.westeros.models.EffectHint;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import i5b.c;
import i5b.c$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import g26.b;
import lnc.x6;
import lnc.y6;
import android.content.Intent;

public class g extends e0 implements b, c	// class@00317d
{
    public final p q;

    public void g(CameraPageType p0,b p1){
       super(p0, p1);
       this.L0(new a(p0, p1));
       this.q = new p(new g$a(this));
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       super.G();
       this.q.G();
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, g.class, "9")) {
          return;
       }
       this.q.onEffectDescriptionUpdated(p0, p1, p2);
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "10")) {
          return;
       }
       this.q.h(p0, p1);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(this.d.l(a.class, new f(this)));
       this.q.doBindView(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       super.onDestroy();
       this.q.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.q.unbind();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       this.q.onEffectHintUpdated(p0);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       super.onResume();
       this.q.onResume();
       return;
    }
    public boolean pc(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, p.class, "25");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          p j = obj.j;
          if (j != null) {
             a.m(j);
             b1 = c.k.a(j).f();
          }else {
             b1 = false;
          }
          if (b1) {
             if (!uActivity instanceof SwapMagicAlbumActivity) {
                x6 ox6 = y6.r(b.class);
                a.m(ox6);
                if (ox6.g20(uActivity)) {
                }
             }else {
             }
          }
          b = true;
       }
       return b;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       super.w();
       this.q.w();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.w1(p0);
       this.q.w1(p0);
       return;
    }
}
