package com.yxcorp.gifshow.homepage.kcube.actionbar.decoratorview.BackgroundViewElement;
import qsa.j;
import com.yxcorp.gifshow.homepage.kcube.actionbar.decoratorview.BackgroundViewElement$backgroundSwitchView$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.BackgroundSwitchView;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import gsa.e0;
import pua.a;

public final class BackgroundViewElement extends j	// class@0016f3
{
    public final p j;

    public void BackgroundViewElement(){
       super();
       this.j = s.c(new BackgroundViewElement$backgroundSwitchView$2(this));
    }
    public View c(ViewGroup p0){
       BackgroundSwitchView uBackgroundS = PatchProxy.applyOneRefs(p0, this, BackgroundViewElement.class, "2");
       if (uBackgroundS != PatchProxyResult.class) {
       }else {
          a.p(p0, "container");
          uBackgroundS = new BackgroundSwitchView(p0.getContext());
          ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
       }
       return uBackgroundS;
    }
    public void t(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundViewElement.class, "3")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       BackgroundSwitchView uBackgroundS = this.u();
       e0 c0 = p0.c0;
       if (c0 == null) {
          c0 = p0.b0;
       }
       uBackgroundS.setLeftBackground(c0);
       uBackgroundS = this.u();
       c0 = p0.d0;
       if (c0 == null) {
          c0 = p0.b0;
       }
       uBackgroundS.setRightBackground(c0);
       this.u().setProgress(p0.e0);
       return;
    }
    public final BackgroundSwitchView u(){
       Object obj = PatchProxy.apply(null, this, BackgroundViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
