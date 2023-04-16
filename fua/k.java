package fua.k;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.yxcorp.gifshow.model.d;
import android.view.ViewGroup;
import fua.i;
import android.animation.Animator$AnimatorListener;
import fua.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import k2b.e0;
import dsa.e;
import q87.c;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import fua.j;
import com.yxcorp.gifshow.model.EventTrackType;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class k extends HomeHotPhotoSurveyMaskBasePresenter	// class@0029fe
{
    public KwaiImageView B;
    public ViewStub C;
    public ViewPropertyAnimator D;
    public ViewPropertyAnimator E;

    public void k(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "9")) {
          return;
       }
       k tD = this.D;
       if (tD != null) {
          tD.cancel();
       }
       tD = this.E;
       if (tD != null) {
          tD.cancel();
       }
       super.J8();
       return;
    }
    public boolean R8(){
       k obj = PatchProxy.apply(null, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       float aspectRatio = (obj != null)? obj.getAspectRatio(): 0;
       if (aspectRatio - 0x3f400000 > 0) {
          return false;
       }else {
          return true;
       }
    }
    public boolean S8(){
       PhotoMeta obj = PatchProxy.apply(null, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Y8().getPhotoMeta();
       if (obj != null && obj.mGeminiHotSurveyDisplayStrategy == 1) {
          return false;
       }
       return super.S8();
    }
    public void a9(boolean p0){
       ViewGroup viewGroup;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "3")) {
          return;
       }
       HotSurveyActionDetailSurvey hotSurveyAct = null;
       d.b(this.W8(), hotSurveyAct);
       if (!p0) {
          viewGroup = this.Z8();
          if (viewGroup != null) {
             viewGroup.setVisibility(8);
          }
          return;
       }else {
          HotSurveyActionDetailSurvey hotSurveyAct1 = PatchProxy.apply(hotSurveyAct, this, ok, "7");
          if (hotSurveyAct1 != PatchProxyResult.class) {
          }else {
             viewGroup = this.Z8();
             if (viewGroup != null) {
                ViewPropertyAnimator viewProperty = viewGroup.animate();
                if (viewProperty != null) {
                   viewProperty = viewProperty.alpha(0);
                   if (viewProperty != null) {
                      viewProperty = viewProperty.setDuration(250);
                      if (viewProperty != null) {
                         hotSurveyAct = viewProperty.setListener(new i(this));
                      }
                   }
                }
             }
             hotSurveyAct1 = hotSurveyAct;
          }
          this.E = hotSurveyAct1;
          if (hotSurveyAct1 != null) {
             hotSurveyAct1.start();
          }
          return;
       }
    }
    public void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       QPhoto mEntity = this.Y8().mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       h.a.a(this.X8(), mEntity, 0, "MASK", p0);
       return;
    }
    public void c9(boolean p0){
       ViewGroup viewGroup1;
       ViewPropertyAnimator viewProperty1;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("HomeHotPhotoCoverSurvey", "展示问卷面板", objArray);
       ViewGroup viewGroup = this.Z8();
       if (viewGroup != null && !viewGroup.getVisibility()) {
          return;
       }
       objArray = null;
       if (this.Z8() == null) {
          k tC = this.C;
          View view = (tC != null)? tC.inflate(): objArray;
          this.h9(view);
       }
       viewGroup = this.Z8();
       if (viewGroup != null) {
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          if (layoutParams != null) {
             k tB = this.B;
             int height = (tB != null)? tB.getHeight(): 0;
             layoutParams.height = height;
          }
       }
       if (p0) {
          viewGroup1 = this.Z8();
          if (viewGroup1 != null) {
             viewGroup1.setAlpha(0);
          }
          Object[] objArray1 = PatchProxy.apply(objArray, this, ok, "6");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             viewGroup1 = this.Z8();
             if (viewGroup1 != null) {
                ViewPropertyAnimator viewProperty = viewGroup1.animate();
                if (viewProperty != null) {
                   viewProperty = viewProperty.alpha(0x3f4ccccd);
                   if (viewProperty != null) {
                      viewProperty = viewProperty.setDuration(250);
                      if (viewProperty != null) {
                         viewProperty1 = viewProperty.setListener(new j(this));
                      }
                   }
                }
             }
             objArray1 = viewProperty1;
          }
          this.D = objArray1;
          if (objArray1 != null) {
             objArray1.start();
          }
       }
       viewGroup1 = this.Z8();
       if (viewGroup1 != null) {
          viewGroup1.setVisibility(0);
       }
       HomeHotPhotoSurveyMaskBasePresenter.e9(this, EventTrackType.SHOW_TYPE, null, null, 6, null);
       this.P8(this.Z8());
       QPhoto mEntity = this.Y8().mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       h.a.b(this.X8(), mEntity, 0, "MASK");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3105);
       this.C = m1.f(p0, 0x7f0a0e37);
       return;
    }
}
