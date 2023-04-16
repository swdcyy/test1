package com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper;
import com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper$isEnabled$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Rect;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zw3.d;
import java.util.Objects;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public final class MerchantAutoPlayHelper	// class@001786
{
    public static final p a;
    public static final MerchantAutoPlayHelper b;

    static {
       MerchantAutoPlayHelper.b = new MerchantAutoPlayHelper();
       MerchantAutoPlayHelper.a = s.c(MerchantAutoPlayHelper$isEnabled$2.INSTANCE);
    }
    public void MerchantAutoPlayHelper(){
       super();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, MerchantAutoPlayHelper.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = MerchantAutoPlayHelper.a.getValue();
       }
       return obj.booleanValue();
    }
    public final float a(int p0,int p1){
       return (((float)p0 * 0x3f800000) / (float)p1);
    }
    public final boolean b(View p0){
       Rect obj = PatchProxy.applyOneRefs(p0, this, MerchantAutoPlayHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Rect();
       boolean b = false;
       if (p0.getGlobalVisibleRect(obj) && (((float)obj.height() * 0x3f800000) / (float)p0.getHeight()) - 0x3f000000 >= 0) {
          b = true;
       }
       return b;
    }
    public final PresenterV2 c(){
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, MerchantAutoPlayHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (MerchantAutoPlayHelper.d()) {
          Objects.requireNonNull(d.a);
          objArray = new MerchantAutoPlayCardPresenter();
       }
       PatchProxy.onMethodExit(MerchantAutoPlayHelper.class, "1");
       return objArray;
    }
    public final void e(LivePlayTextureView p0,View p1,ImageView p2,View p3,int p4,int p5){
       MerchantAutoPlayHelper merchantAuto = MerchantAutoPlayHelper.class;
       if (PatchProxy.isSupport(merchantAuto)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, merchantAuto, "4")) {
             return;
          }
       }
       int width = p1.getWidth();
       int height = p1.getHeight();
       float f = this.a(p4, p5);
       float f1 = this.a(width, height);
       this.f(p0, width, (int)((float)width / f));
       this.f(p3, width, height);
       if (f - f1 >= 0 && f - f1 > 0) {
          this.f(p2, width, height);
       }
       return;
    }
    public final void f(View p0,int p1,int p2){
       if (PatchProxy.isSupport(MerchantAutoPlayHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MerchantAutoPlayHelper.class, "5")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1;
       layoutParams.height = p2;
       p0.setLayoutParams(layoutParams);
       return;
    }
}
