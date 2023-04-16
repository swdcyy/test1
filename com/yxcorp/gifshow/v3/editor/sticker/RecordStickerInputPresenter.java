package com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$keyboardOffsetLiveData$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$b;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import cq.a;
import q87.c;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$d;
import th0.e;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import lmd.a;

public abstract class RecordStickerInputPresenter extends PresenterV2	// class@001202
{
    public final RecordStickerInputPresenter$e A;
    public final EditDecorationContainerViewV2 B;
    public final Fragment C;
    public final p p;
    public int q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public EditDecorationBaseDrawer v;
    public boolean w;
    public boolean x;
    public AnimatorSet y;
    public final Observer z;
    public static final RecordStickerInputPresenter$a D;

    static {
       RecordStickerInputPresenter.D = new RecordStickerInputPresenter$a(null);
    }
    public void RecordStickerInputPresenter(EditDecorationContainerViewV2 p0,Fragment p1){
       a.p(p0, "containerView");
       a.p(p1, "fragment");
       super();
       this.B = p0;
       this.C = p1;
       this.p = s.c(RecordStickerInputPresenter$keyboardOffsetLiveData$2.INSTANCE);
       this.u = 0x3f800000;
       this.z = new RecordStickerInputPresenter$b(this);
       this.A = new RecordStickerInputPresenter$e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, RecordStickerInputPresenter.class, "2")) {
          return;
       }
       f.l(this.C).I0(this.getActivity(), this.S8());
       this.S8().observeForever(this.z);
       this.B.d(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RecordStickerInputPresenter.class, "3")) {
          return;
       }
       this.S8().removeObserver(this.z);
       this.B.M(this.A);
       return;
    }
    public final EditDecorationContainerViewV2 P8(){
       return this.B;
    }
    public final EditDecorationBaseDrawer R8(){
       Object[] objArray = null;
       EditDecorationBaseDrawer obj = PatchProxy.apply(objArray, this, RecordStickerInputPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B.getSelectDrawer() instanceof EditDecorationBaseDrawer) {
          objArray = this.B.getSelectDrawer();
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer<out com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData>");
       }else {
          obj = this.B.getSelectDrawer();
          if (obj != null) {
             ExceptionHandler.handleCaughtException(new RuntimeException("RecordStickerInputPresenter "+obj.getClass()+" does not match EditTextBaseElement"));
          }
       }
       return objArray;
    }
    public final MutableLiveData S8(){
       Object obj = PatchProxy.apply(null, this, RecordStickerInputPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final EditDecorationBaseDrawer V8(){
       return this.v;
    }
    public abstract boolean W8(EditDecorationBaseDrawer p0);
    public void X8(){
    }
    public void Y8(){
    }
    public void Z8(EditDecorationBaseDrawer p0,Float p1,Float p2){
    }
    public void a9(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordStickerInputPresenter.class, "4")) {
          return;
       }
       a.p(p0, "decorationDrawer");
       this.u = p0.getAdditionalScale();
       p0.setAdditionalScale(0);
       p0.setAlpha(0);
       p0.update();
       this.B.T();
       this.B.B0();
       this.x = true;
       return;
    }
    public final void b9(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(RecordStickerInputPresenter.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, RecordStickerInputPresenter.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecordStickerInputPresenter", "previewPullUpAnimation startX = "+p0+" endX = "+p1+" startY = "+p2+" endY = "+p3, objArray);
       if (!this.W8(this.v)) {
          return;
       }
       RecordStickerInputPresenter ty = this.y;
       float[] uofloatArray = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       uofloatArray = new float[]{p2,p3};
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray);
       if (ty != null && ty.isRunning()) {
          ty.cancel();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       boolean b = (p2 - p3 > 0)? true: false;
       this.r = b;
       valueAnimato.addUpdateListener(new RecordStickerInputPresenter$c(this));
       valueAnimato1.addUpdateListener(new RecordStickerInputPresenter$d(this));
       uAnimatorSet.setDuration(250);
       uAnimatorSet.setInterpolator(new e());
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       this.y = uAnimatorSet;
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, RecordStickerInputPresenter.class, "9")) {
          return;
       }
       RecordStickerInputPresenter tv = this.v;
       if (tv != null) {
          tv.setAdditionalScale(this.u);
       }
       tv = this.v;
       if (tv != null) {
          tv.setAlpha(0x3f733333);
       }
       tv = this.v;
       if (tv != null) {
          tv.update();
       }
       this.B.T();
       this.B.A0();
       this.x = false;
       return;
    }
    public boolean d9(){
       return this instanceof a;
    }
}
