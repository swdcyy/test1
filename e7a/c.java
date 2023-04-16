package e7a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.StringBuilder;
import lnc.bb;
import k2b.u1;
import android.view.animation.Animation;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

public class c extends PresenterV2	// class@002080
{
    public boolean p;
    public boolean q;

    public void c(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.R8(this.m8());
       if (this.p != null) {
          StringBuilder str = "";
          bb.b(this.m8(), str, R.id.key_view_checker_tag_id);
          u1.R("SlidePlayViewLeakMonitorPresenter", "Step1&2自校验："+str, 14);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.q = false;
       this.P8(this.m8());
       if (this.q != null) {
          StringBuilder str = "";
          bb.b(this.m8(), str, R.id.key_view_dismiss_but_has_anim);
          u1.R("SlidePlayViewLeakMonitorPresenter", "Step3自校验："+str, 14);
       }
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.getAnimation() == null || (!p0.getAnimation().hasEnded() || (p0 instanceof LottieAnimationView && (p0.p() && p0.getTag(0x7f0a15e4) == null)))) {
          p0.setTag(R.id.key_view_dismiss_but_has_anim, "DISMISS_BUT_HAS_ANIM");
          this.q = true;
       }
    label_003f :
       if (p0 instanceof ViewGroup) {
          int i = 0;
          ViewGroup viewGroup = p0;
          while (i < viewGroup.getChildCount()) {
             this.P8(viewGroup.getChildAt(i));
             i = i + 1;
          }
       }
       return;
    }
    public final void R8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = 0x7f0a15e3;
       int i1 = 0x7f0a15e4;
       if (p0 instanceof ViewGroup) {
          if (p0.getVisibility() == 8 && p0.getTag(i1) == null) {
             p0.setTag(i, "DEFAULT_GONE");
             this.p = true;
          }
          int i2 = 0;
          ViewGroup viewGroup = p0;
          while (i2 < viewGroup.getChildCount()) {
             this.R8(viewGroup.getChildAt(i2));
             i2 = i2 + 1;
          }
       }else if(p0.getVisibility() == 8 && (p0 instanceof ImageView && (p0.getDrawable() != null && p0.getTag(i1) == null))){
          p0.setTag(i, "GONE_BUT_HAS_DRAWABLE");
          this.p = true;
       }
       return;
    }
}
