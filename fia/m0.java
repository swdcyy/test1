package fia.m0;
import fia.a;
import fia.m0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import android.app.Activity;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.os.Handler;
import fia.l0;
import java.lang.Runnable;
import fia.m0$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;

public final class m0 extends a	// class@002920
{
    public a G;
    public PhotoDetailParam H;
    public PublishSubject I;
    public View J;
    public final IMediaPlayer$OnInfoListener K;

    public void m0(){
       super();
       this.K = new m0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "7")) {
          return;
       }
       super.E8();
       m0 tG = this.G;
       if (tG != null) {
          e player = tG.getPlayer();
          if (player != null) {
             player.addOnInfoListener(this.K);
          }
       }
       this.q9();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "9")) {
          return;
       }
       super.J8();
       m0 tG = this.G;
       if (tG != null) {
          e player = tG.getPlayer();
          if (player != null) {
             player.removeOnInfoListener(this.K);
          }
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "4")) {
          return;
       }
       m0 tJ = this.J;
       if (tJ != null && !tJ.getVisibility()) {
          this.q9();
          tJ = this.J;
          if (tJ != null) {
             tJ.setVisibility(8);
          }
       }
       return;
    }
    public String Y8(){
       return "GUIDE_MASK";
    }
    public String Z8(){
       return "GUIDE_FOLLOWPAGE_MASK";
    }
    public void j8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, m0.class, "6")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       if (!PatchProxy.applyVoidOneRefs(obj, this, uoa, "2")) {
          a.p(obj, "<set-?>");
          this.v = obj;
       }
       this.G = this.q8(a.class);
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.H = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       if (!PatchProxy.applyVoidOneRefs(obj, this, uoa, "4")) {
          a.p(obj, "<set-?>");
          this.w = obj;
       }
       this.I = this.r8("DETAIL_SLIDE_CHANGE_SCREEN_VISIBLE");
       return;
    }
    public void n9(FollowFeatureGuideSnackBarResponse p0){
       m0 om0 = m0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om0, "1")) {
          return;
       }
       a.p(p0, "response");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, om0, "3")) {
          m0 tI = this.I;
          if (tI != null) {
             tI.onNext(new ChangeScreenVisibleEvent(this.b9(), ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.FOLLOW_GUIDE));
          }
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a tA = this.A;
          if (!tA instanceof ViewGroup) {
             tA = objArray;
          }
          if (tA != null) {
             if (this.J == null) {
                this.J = LayoutInflater.from(activity).inflate(0x7f0d0412, objArray);
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
                layoutParams.gravity = 85;
                tA.addView(this.J, layoutParams);
             }
             m0 tJ = this.J;
             if (tJ != null) {
                tJ.setVisibility(0);
                this.j9();
                this.S8(p0, tJ);
                this.P8(p0, tJ);
                this.R8(p0, tJ);
                if (!PatchProxy.applyVoid(objArray, this, om0, "2")) {
                   this.c9().postDelayed(new l0(this), this.d9());
                }
                tJ.setOnClickListener(new m0$b(activity, this, p0));
             }
          }
       }
    label_0094 :
       return;
    }
    public final boolean o9(){
       Object obj = PatchProxy.apply(null, this, m0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!FollowConfigUtil.h()) {
          this.k9("Mask实验没命中");
          return false;
       }else if(this.W8()){
          return false;
       }else {
          return true;
       }
    }
    public final void q9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "5")) {
          return;
       }
       m0 tI = this.I;
       if (tI != null) {
          tI.onNext(new ChangeScreenVisibleEvent(this.b9(), ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.FOLLOW_GUIDE));
       }
       return;
    }
}
