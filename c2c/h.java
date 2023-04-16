package c2c.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import c2c.h$a;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import com.yxcorp.utility.n;
import c2c.h$b;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public final class h extends PresenterV2	// class@000510
{
    public RelativeLayout p;
    public ProfileBgVideoInfo q;
    public PublishSubject r;

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tq = this.q;
       String str = "mVideoInfo";
       if (tq == null) {
          a.S(str);
       }
       if (tq.getVideoWidth()) {
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (tq.getVideoHeight()) {
             this.P8();
             return;
          }
       }
       tq = this.r;
       if (tq == null) {
          a.S("mMediaPreparedSubject");
       }
       this.X7(tq.subscribe(new h$a(this)));
       return;
    }
    public final void P8(){
       h tp;
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          h tq = this.q;
          if (tq == null) {
             a.S("mVideoInfo");
          }
          if (tq.getVideoWidth()) {
             tq = this.q;
             if (tq == null) {
                a.S("mVideoInfo");
             }
             if (tq.getVideoHeight()) {
                int i = n.k(activity);
                String str = "mMediaContainer";
                if (!i) {
                   tp = this.p;
                   if (tp == null) {
                      a.S(str);
                   }
                   tp.post(new h$b(this));
                   return;
                }else {
                   h tp1 = this.p;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   h tp2 = this.p;
                   if (tp2 == null) {
                      a.S(str);
                   }
                   ViewGroup$LayoutParams layoutParams = tp2.getLayoutParams();
                   layoutParams.width = i;
                   tp2 = this.q;
                   if (tp2 == null) {
                      a.S("mVideoInfo");
                   }
                   int i1 = tp2.getVideoHeight() * i;
                   tp = this.q;
                   if (tp == null) {
                      a.S("mVideoInfo");
                   }
                   layoutParams.height = i1 / tp.getVideoWidth();
                   tp1.setLayoutParams(layoutParams);
                }
             }
          }
       }
    label_0080 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.media_container);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.media_container\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       Object obj = this.r8("PROFILE_PREVIEW_VIDEO_INFO");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_INFO\)");
       this.q = obj;
       obj = this.r8("PROFILE_PREVIEW_MEDIA_PREPARED");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_MEDIA_PREPARED\)");
       this.r = obj;
       return;
    }
}
