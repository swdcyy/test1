package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayPictureTagPresenter$initTagText$1$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import a2.l;
import lnc.f3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import p1.b;
import lnc.a1;

public final class SlidePlayPictureTagPresenter$initTagText$1$2 extends Lambda implements q	// class@0018cc
{
    public static final SlidePlayPictureTagPresenter$initTagText$1$2 INSTANCE;

    static {
       SlidePlayPictureTagPresenter$initTagText$1$2.INSTANCE = new SlidePlayPictureTagPresenter$initTagText$1$2();
    }
    public void SlidePlayPictureTagPresenter$initTagText$1$2(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(View p0,l p1,f3 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlidePlayPictureTagPresenter$initTagText$1$2.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "insets");
       a.p(p2, "<anonymous parameter 2>");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.bottomMargin = p1.f(2).d + a1.d(0x7f070331);
       p0.setLayoutParams(layoutParams);
       return;
    }
}
