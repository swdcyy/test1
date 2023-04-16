package ff9.a;
import ui9.b;
import ui9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.c;
import ff9.a$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.c$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.q;
import java.util.Objects;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.b;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import k4b.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.westeros.models.EffectHint;

public class a extends d implements b, c	// class@00230f
{
    public c n;

    public void a(CameraPageType p0,b p1){
       super(p0, p1);
       this.n = new c(new a$a(this));
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "3")) {
          return;
       }
       p0.e = null;
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void nb(q p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       super.nb(p0);
       a tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(null, tn, c.class, str)) {
          tn.d.p(new b(tn));
          if (!TextUtils.x(tn.e)) {
             Object[] objArray = new Object[0];
             b.D().w("SelectImageHandler", "reopen setPickedFaceImage "+tn.e, objArray);
             tn.d.u(tn.e);
          }
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
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.n.onEffectHintUpdated(p0);
       return;
    }
}
