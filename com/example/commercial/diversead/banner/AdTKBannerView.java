package com.example.commercial.diversead.banner.AdTKBannerView;
import ql9.e$b;
import com.yxcorp.gifshow.ad.widget.RoundCornerLayout;
import com.example.commercial.diversead.banner.AdTKBannerView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.HashMap;
import java.lang.StringBuilder;
import yx.j0;
import pa.a;
import java.lang.Runnable;
import ekd.k1;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import a59.a;
import a59.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
import mxb.c;
import android.view.ViewGroup;
import ux.b;
import java.lang.Class;
import java.lang.reflect.Constructor;
import sx.d;
import rx.d;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.Pair;
import erd.g;
import rx.d$b;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import tkd.b;
import tkd.d;
import hvb.g;
import com.yxcorp.gifshow.novelcoreapi.NovelSdkPlugin;
import com.example.commercial.diversead.banner.AdTKBannerView$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import z49.s0;
import android.view.View;
import ql9.e$a;

public final class AdTKBannerView extends RoundCornerLayout implements e$b	// class@00102d
{
    public final a j;
    public TkBridgeGroup k;
    public e$a l;
    public QPhoto m;
    public HashMap n;
    public a o;
    public boolean p;
    public HashMap q;
    public static final AdTKBannerView$a r;

    static {
       AdTKBannerView.r = new AdTKBannerView$a(null);
    }
    public void AdTKBannerView(Context p0){
       a.p(p0, "mContext");
       super(p0);
       this.j = new a();
       this.n = new HashMap(8);
    }
    public void a(){
       Object[] objArray = new Object[0];
       j0.f("bannerLeakLog", " 清理广告 "+this, objArray);
       Object[] objArray1 = new Object[0];
       j0.f("AdTKBannerView", "onDestory "+this, objArray1);
       this.c(3);
       k1.r(new a(this), 50);
       this.o = null;
    }
    public final void c(int p0){
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("status", Integer.valueOf(p0));
       AdTKBannerView to = this.o;
       if (to != null) {
          a$a.a(to, a.a.p(jsonObject), null, 2, null);
       }
       return;
    }
    public final String d(QPhoto p0){
       String str = (c.w(p0) != null)? "Hornbill_Novel_Banner": "undefined";
       return str;
    }
    public void onAttachedToWindow(){
       AdTKBannerView obj;
       super.onAttachedToWindow();
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AdTKBannerView";
       j0.f(str, "onAttachedToWindow", objArray);
       if (this.p == null) {
          String str1 = this.d(this.m);
          Class[] uClassArray = new Class[]{str1.getClass()};
          Object[] objArray1 = new Object[]{str1};
          obj = b.class.getDeclaredConstructor(uClassArray).newInstance(objArray1);
          a.o(obj, "T::class.java.getDeclare…ava\).newInstance\(session\)");
          Object obj1 = obj;
          obj = this.m;
          QPhoto mEntity = (obj != null)? obj.mEntity: null;
          QPhoto qPhoto = mEntity;
          a.m(qPhoto);
          d$b.c(obj1, 1, qPhoto, null, null, null, 28, null);
          this.p = true;
       }
       obj = this.k;
       if (obj != null) {
          obj.h();
       }
       Object[] objArray2 = new Object[i];
       j0.f(str, "pushNovelBgTheme", objArray2);
       String str2 = a.a.q(new AdTKBannerView$b("novelTheme", Integer.valueOf(d.a(-951558122).OI())));
       a.o(str2, "jsonString");
       RxBus.f.b(new s0(str2));
       this.c(1);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       Object[] objArray = new Object[0];
       j0.f("AdTKBannerView", "onDetachedFromWindow", objArray);
       this.c(2);
       AdTKBannerView tk = this.k;
       if (tk != null) {
          tk.g();
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
       Object[] objArray = new Object[0];
       j0.f("AdTKBannerView", "onWindowVisibilityChanged "+p0, objArray);
       if (!p0) {
          this.c(1);
       }else {
          this.c(2);
       }
       return;
    }
    public final void setAdInteractionListener(e$a p0){
       this.l = p0;
    }
}
