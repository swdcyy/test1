package fua.c;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import fua.c$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dsa.e;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import android.animation.ValueAnimator;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.yxcorp.gifshow.model.d;
import lnc.a1;
import kotlin.jvm.internal.a;
import fua.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import fua.e;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import fua.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import android.view.View;
import android.view.ViewStub;
import fua.f;
import fua.g;
import com.yxcorp.gifshow.model.EventTrackType;
import ekd.m1;

public final class c extends HomeHotPhotoSurveyMaskBasePresenter	// class@0029f6
{
    public ViewStub B;
    public ValueAnimator C;
    public ValueAnimator D;
    public static final c$a E;

    static {
       c.E = new c$a(null);
    }
    public void c(){
       super();
    }
    public void E8(){
       boolean b;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       PhotoMeta obj = PatchProxy.apply(objArray, this, uoc, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray1 = new Object[false];
          e.C().w("HomeHotPhotoCoverSurvey", "直接出蒙层"+this.Y8().getPhotoId(), objArray1);
          obj = this.Y8().getPhotoMeta();
          b = (obj != null && obj.mGeminiHotSurveyDisplayStrategy == 1)? true: false;
       }
       if (b && this.S8()) {
          obj = this.Y8().getPhotoMeta();
          if (obj != null && obj.mNeedActionSurvey == 1) {
             k1.o(this.z);
          }else {
             this.a9(false);
          }
          return;
       }else if(HomeCardExperimentUtil.e.a() == 1){
          return;
       }else {
          super.E8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       c tC = this.C;
       if (tC != null) {
          tC.cancel();
       }
       tC = this.D;
       if (tC != null) {
          tC.cancel();
       }
       super.J8();
       return;
    }
    public void a9(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "6")) {
          return;
       }
       d.b(this.W8(), null);
       if (p0) {
          ValueAnimator valueAnimato = PatchProxy.apply(null, this, uoc, "8");
          if (valueAnimato != PatchProxyResult.class) {
          }else {
             int[] ointArray = new int[]{a1.e(208.00f),0};
             valueAnimato = ValueAnimator.ofInt(ointArray);
             a.o(valueAnimato, "anim");
             valueAnimato.setDuration(250);
             valueAnimato.addUpdateListener(new d(this));
             valueAnimato.addListener(new e(this));
          }
          this.D = valueAnimato;
          if (valueAnimato != null) {
             valueAnimato.start();
          }
       }else {
          ViewGroup viewGroup = this.Z8();
          if (viewGroup != null) {
             viewGroup.setVisibility(8);
          }
       }
       return;
    }
    public void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       QPhoto mEntity = this.Y8().mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       h.a.a(this.X8(), mEntity, 1, "PANEL", p0);
       return;
    }
    public void c9(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.C().w("HomeHotPhotoCoverSurvey", "展示问卷面板anim="+p0, objArray);
       ViewGroup viewGroup = this.Z8();
       if (viewGroup != null && !viewGroup.getVisibility()) {
          return;
       }
       Object[] objArray1 = null;
       if (this.Z8() == null) {
          c tB = this.B;
          View view = (tB != null)? tB.inflate(): objArray1;
          this.h9(view);
       }
       if (p0) {
          ValueAnimator valueAnimato = PatchProxy.apply(objArray1, this, uoc, "5");
          if (valueAnimato != PatchProxyResult.class) {
          }else {
             int[] ointArray = new int[2];
             ointArray[i] = i;
             ointArray[1] = a1.e(208.00f);
             valueAnimato = ValueAnimator.ofInt(ointArray);
             a.o(valueAnimato, "anim");
             valueAnimato.setDuration(250);
             valueAnimato.addUpdateListener(new f(this));
             valueAnimato.addListener(new g(this));
          }
          this.C = valueAnimato;
          if (valueAnimato != null) {
             valueAnimato.start();
          }
       }
       ViewGroup viewGroup1 = this.Z8();
       if (viewGroup1 != null) {
          viewGroup1.setVisibility(i);
       }
       HomeHotPhotoSurveyMaskBasePresenter.e9(this, EventTrackType.SHOW_TYPE, null, null, 6, null);
       this.P8(this.Z8());
       QPhoto mEntity = this.Y8().mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       h.a.b(this.X8(), mEntity, 1, "PANEL");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a0e36);
       return;
    }
}
