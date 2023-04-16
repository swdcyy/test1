package de9.a;
import ui9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import n4b.a;
import de9.a$b;
import n4b.a$b;
import elb.a;
import de9.a$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;

public final class a extends d implements b	// class@001f1e
{
    public a n;
    public final l o;

    public void a(CameraPageType p0,b p1,l p2){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "magicHandler");
       super(p0, p1);
       this.o = p2;
       this.n = new a(new a$b(this));
       this.d.n(a.class, new a$a(this));
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "1")) {
          return;
       }
       a tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, tn, a.class, "1")) {
          tn.e();
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tn, a.class, "2")) {
          tn.e();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.onDestroy();
       this.n.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.n.unbind();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
}
