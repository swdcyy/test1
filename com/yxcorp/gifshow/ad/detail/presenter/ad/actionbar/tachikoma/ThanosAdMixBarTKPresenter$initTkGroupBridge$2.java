package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$initTkGroupBridge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.util.h;
import qrd.p;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import g59.c0;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Rect;
import android.widget.FrameLayout;
import im8.f;
import java.lang.Float;
import lnc.a1;
import java.lang.StringBuilder;
import yx.j0;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import ekd.f;

public final class ThanosAdMixBarTKPresenter$initTkGroupBridge$2 extends Lambda implements l	// class@00157e
{
    public final ThanosAdMixBarTKPresenter this$0;

    public void ThanosAdMixBarTKPresenter$initTkGroupBridge$2(ThanosAdMixBarTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       Object obj = this;
       AnimatorSet obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ThanosAdMixBarTKPresenter$initTkGroupBridge$2.class, "1")) {
          return;
       }
       a.p(obj1, "it");
       boolean booleanx = obj1.getBoolean("expandState");
       ThanosAdMixBarTKPresenter$initTkGroupBridge$2 this$0 = obj.this$0;
       Objects.requireNonNull(this$0);
       Rect obj2 = PatchProxy.apply(null, this$0, ThanosAdMixBarTKPresenter.class, "5");
       if (obj2 != PatchProxyResult.class) {
       }else {
          obj2 = this$0.E.getValue();
       }
       ThanosAdMixBarTKPresenter y = obj.this$0.y;
       Objects.requireNonNull(obj2);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(booleanx), y, obj2, oh, "6")) {
          if (obj2.c.isRunning()) {
             obj2.c.end();
             obj2.c.cancel();
          }
          obj2.c.addUpdateListener(new c0(booleanx, y));
          obj2.c.setDuration(300);
          obj2.c.start();
       }
       Rect rect = new Rect();
       obj2 = new Rect();
       ThanosAdMixBarTKPresenter x = obj.this$0.x;
       if (x != null) {
          x.getGlobalVisibleRect(rect);
       }
       x = obj.this$0.y;
       if (x != null) {
          x.getGlobalVisibleRect(obj2);
       }
       x = obj.this$0.w;
       if (x == null) {
          a.S("mContentCurrentHeightRatio");
       }
       Float uFloat = x.get();
       float f = 0x3f800000;
       float f1 = (uFloat != null)? uFloat.floatValue(): 0x3f800000;
       if (f1) {
          f = f1;
       }
       int i = a1.d(R.dimen.arg_RES_7f070283);
       float f2 = (float)obj2.bottom / f;
       float f3 = (float)rect.top / f;
       ThanosAdMixBarTKPresenter x1 = obj.this$0.x;
       int height = (x1 != null)? x1.getHeight(): 0;
       f3 = f3 + (float)height;
       float f4 = (f2 - f3) - (float)i;
       Object[] objArray = new Object[0];
       j0.f("TachikomaMixBarPresenter", " mix bar rect "+rect+','+"infoRect "+obj2+", "+"mContentCurrentHeightRatio is "+f+", "+"bottomPadding: "+i+", "+"infoBottom: "+f2+", "+"mixBarBottom: "+f3+", "+"diff: "+f4, objArray);
       if (booleanx) {
          ThanosAdMixBarTKPresenter x2 = obj.this$0.x;
          a.m(x2);
          obj1 = f.e(x2, x2.getTranslationY(), f4, 450, new LinearInterpolator());
          a.o(obj1, "AnimationUtils.getTransl¡­    LinearInterpolator\(\)\)");
       }else {
          ThanosAdMixBarTKPresenter x3 = obj.this$0.x;
          a.m(x3);
          obj1 = f.e(x3, x3.getTranslationY(), 0, 450, new LinearInterpolator());
          a.o(obj1, "AnimationUtils.getTransl¡­    LinearInterpolator\(\)\)");
       }
       obj1.start();
       return;
    }
}
