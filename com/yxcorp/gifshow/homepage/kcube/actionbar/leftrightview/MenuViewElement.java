package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement;
import qsa.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$mLeftBtn$2;
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
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.MenuViewElement$createView$1;
import msd.l;
import mr6.b;
import com.yxcorp.gifshow.widget.IconifyImageButton;
import android.content.res.Resources;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.MenuViewPresenter;
import nc5.t;
import ok.x;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.b;
import com.yxcorp.utility.Log;
import gsa.e0;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import sb5.e;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

public final class MenuViewElement extends i	// class@0016ff
{
    public Drawable n;
    public final p o;
    public static final int p;
    public static final int q;
    public static final MenuViewElement$a r;

    static {
       MenuViewElement.r = new MenuViewElement$a(null);
       MenuViewElement.p = a1.e(9.20f);
       MenuViewElement.q = a1.e(6.50f);
    }
    public void MenuViewElement(){
       super();
       this.o = s.c(new MenuViewElement$mLeftBtn$2(this));
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MenuViewElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       return this.a(MenuViewElement$createView$1.INSTANCE);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, MenuViewElement.class, "3")) {
          return;
       }
       super.l();
       IconifyImageButton iconifyImage = this.x();
       a.o(iconifyImage, "mLeftBtn");
       IconifyImageButton iconifyImage1 = this.x();
       a.o(iconifyImage1, "mLeftBtn");
       Resources resources = iconifyImage1.getResources();
       iconifyImage.setContentDescription(resources.getString(R.string.at));
       return;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MenuViewElement.class, "5")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(new MenuViewPresenter());
       Object obj = t.b.get();
       a.o(obj, "MenuRedDotUtil.HOME_MENU_ONLY_INIT_CLICK.get\(\)");
       if (obj.booleanValue()) {
          p0.U7(new b());
          Log.g("MenuViewElement", "开启侧边栏懒加载，走新策略");
       }
       PatchProxy.onMethodExit(MenuViewElement.class, "5");
       return;
    }
    public void v(e0 p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MenuViewElement menuViewElem = MenuViewElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, menuViewElem, "4")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       if (this.n == null) {
          this.n = this.w();
       }
       MenuViewElement tn = this.n;
       if (tn != null) {
          tn.setAlpha(p0.K);
          tn.invalidateSelf();
       }
       IconifyImageButton iconifyImage = this.x();
       a.o(iconifyImage, "mLeftBtn");
       iconifyImage.setAlpha(p0.U);
       iconifyImage = this.x();
       e0 t = p0.T;
       e0 e = p0.E;
       Object[] objArray = null;
       if (PatchProxy.isSupport(menuViewElem)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(e), this, menuViewElem, "7");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(e != 1){
             i = (e != 2)? HomeTabBarIconExperimentUtils.b(): HomeTabBarIconExperimentUtils.c();
          }else {
             Object obj1 = PatchProxy.apply(objArray, objArray, HomeTabBarIconExperimentUtils.class, "2");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else if(HomeTabBarIconExperimentUtils.a()){
                i = 0x7f0819eb;
             }else {
                i = 0x7f0819ea;
             }
          }
       }else {
          goto label_0059 ;
       }
       e.b(iconifyImage, t, i, t$b.h);
       if (!PatchProxy.applyVoidOneRefs(p0, this, menuViewElem, "9")) {
          Drawable uDrawable = this.w();
          if (uDrawable instanceof GradientDrawable) {
             uDrawable.mutate();
             uDrawable.setColor(p0.i);
          }
          Object[] objArray1 = PatchProxy.apply(objArray, this, menuViewElem, "8");
          if (objArray1 != patchProxyRe) {
          }else {
             IconifyImageButton iconifyImage1 = this.x();
             a.o(iconifyImage1, "mLeftBtn");
             Drawable dotDrawable = iconifyImage1.getDotDrawable();
             if (dotDrawable instanceof LayerDrawable && dotDrawable.getNumberOfLayers() > 1) {
                objArray = dotDrawable.getDrawable(1);
             }
             objArray1 = objArray;
          }
          if (objArray1 instanceof GradientDrawable) {
             objArray1.mutate();
             objArray1.setColor(p0.j);
          }
       }
       return;
    }
    public final Drawable w(){
       Object[] objArray = null;
       IconifyImageButton obj = PatchProxy.apply(objArray, this, MenuViewElement.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x();
       a.o(obj, "mLeftBtn");
       Drawable dotDrawable = obj.getDotDrawable();
       a.o(dotDrawable, "mLeftBtn.dotDrawable");
       if (dotDrawable instanceof LayerDrawable && dotDrawable.getNumberOfLayers() > 1) {
          objArray = dotDrawable.getDrawable(0);
       }
       return objArray;
    }
    public final IconifyImageButton x(){
       Object obj = PatchProxy.apply(null, this, MenuViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
}
