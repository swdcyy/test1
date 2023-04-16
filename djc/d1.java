package djc.d1;
import mp7.e;
import djc.d1$a;
import nsd.u;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mp7.e$a;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import java.lang.Number;
import java.util.Map;
import java.util.List;
import djc.a1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import djc.d1$b;
import android.view.View$OnClickListener;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.graphics.Color;
import yic.p;
import com.kwai.sdk.switchconfig.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import com.yxcorp.utility.n;
import qrd.l1;
import android.graphics.drawable.Drawable;
import djc.d1$c;
import android.view.View$OnTouchListener;
import android.content.res.Resources;
import djc.d1$d;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import androidx.core.widget.b;
import ip7.h;

public final class d1 implements e	// class@0021df
{
    public final Map a;
    public final ImmerseSharePanelFragment b;
    public static final d1$a c;

    static {
       d1.c = new d1$a(null);
    }
    public void d1(ImmerseSharePanelFragment p0){
       a.p(p0, "fragment");
       super();
       this.b = p0;
       this.a = new LinkedHashMap();
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uod1, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       return e$a.a(this, p0, p1, p2, p3, p4);
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uod1, "7")) {
             return;
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       e$a.f(this, p0, p1, p2, p3, p4, p5);
       return;
    }
    public int c(i0 p0,int p1,int p2){
       if (PatchProxy.isSupport(d1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d1.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       p0 = this.a.get(Integer.valueOf(p1));
       a.m(p0);
       return p0.intValue();
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uod1, "6")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       e$a.e(this, p0, p1, p2, p3, p4);
       return;
    }
    public List e(int p0){
       List obj;
       ArrayList uArrayList;
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod1, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = this.a.get(Integer.valueOf(0));
          a.m(obj);
          a1[] uoa1Array = new a1[]{new a1(this.b, obj.intValue())};
          obj = CollectionsKt__CollectionsKt.P(uoa1Array);
       }catch(java.lang.Exception e0){
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public boolean f(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       d1$b obj;
       ShareInitResponse$SharePanelElement sharePanelEl;
       int view5;
       ImageRequestBuilder view5;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p5;
       d d1 uod1 = d1.class;
       int i = 5;
       boolean i1 = 1;
       int i2 = 2;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),oobject2};
          obj = PatchProxy.apply(objArray, this, uod1, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i4 = this;
       }
       a.p(oobject, "op");
       a.p(oobject1, "v");
       String str = "share_immersive_channel_icon_local";
       if (p2 == i2) {
          obj = v4;
          d1$b uob = v4;
          String str1 = str;
          obj = new d1$b(this, p0, p1, p3, p4);
          oobject1.setOnClickListener(uob);
          sharePanelEl = p0.a();
          View view = oobject1.findViewById(R.id.btn_root_group);
          a.o(view, "v.findViewById\(R.id.btn_root_group\)");
          View view1 = oobject1.findViewById(R.id.prime_btn);
          a.o(view1, "v.findViewById\(R.id.prime_btn\)");
          View view2 = oobject1.findViewById(R.id.normal_btn);
          a.o(view2, "v.findViewById\(R.id.normal_btn\)");
          View view3 = oobject1.findViewById(R.id.normal_btn_title);
          a.o(view3, "v.findViewById\(R.id.normal_btn_title\)");
          View view4 = oobject1.findViewById(R.id.prime_btn_padding_container);
          a.o(view4, "v.findViewById\(R.id.prime_btn_padding_container\)");
          if (sharePanelEl.mPrime != null) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = -2;
                view.setLayoutParams(layoutParams);
             }
             view2.setVisibility(8);
             view4.setVisibility(0);
             view = view1.findViewById(R.id.prime_icon);
             a.o(view, "primeBtn.findViewById\(R.id.prime_icon\)");
             view2 = view1.findViewById(R.id.prime_text);
             a.o(view2, "primeBtn.findViewById\(R.id.prime_text\)");
             view2.setText(sharePanelEl.mPrimeText);
             view2.setTextColor(Color.parseColor(sharePanelEl.mPrimeFontColor));
             view2.setTextSize(sharePanelEl.mPrimeFontSize);
             int i3 = p.a.a(oobject, sharePanelEl.mPrime);
             if (a.t().d(str1, 0) && i3 != -1) {
                sharePanelEl.mPrimeIconUrl = null;
                sharePanelEl.mIconResId = i3;
                ImageRequestBuilder imageRequest = ImageRequestBuilder.j(i3);
                imageRequest.n(ImageRequest$CacheChoice.SMALL);
                d uod = Fresco.newDraweeControllerBuilder();
                uod.w(imageRequest.a());
                view.setController(uod.e());
             }else {
                view.L(sharePanelEl.mPrimeIconUrl);
             }
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setCornerRadius((float)n.c(view1.getContext(), 27.50f));
             gradientDraw.setColor(Color.parseColor(sharePanelEl.mPrimeBgColor));
             view1.setBackground(gradientDraw);
             oobject1.setOnTouchListener(new d1$c(view));
          }else {
             ViewGroup$LayoutParams layoutParams1 = view.getLayoutParams();
             if (layoutParams1 != null) {
                layoutParams1.width = (int)p1.getResources().getDimension(0x7f070462);
                view.setLayoutParams(layoutParams1);
             }
             view4.setVisibility(8);
             view2.setVisibility(0);
             view5 = p.a.a(oobject, sharePanelEl.mPrime);
             if (a.t().d(str1, 0) && view5 != -1) {
                sharePanelEl.mIconUrl = null;
                sharePanelEl.mIconResId = view5;
                view5 = ImageRequestBuilder.j(view5);
                view5.n(ImageRequest$CacheChoice.SMALL);
                uod1 = Fresco.newDraweeControllerBuilder();
                uod1.w(view5.a());
                view2.setController(uod1.e());
             }else {
                view2.L(sharePanelEl.mIconUrl);
             }
             oobject1.setOnTouchListener(new d1$d(view2));
          }
          view3.setText(sharePanelEl.mDisplayName);
          if (oobject2 != null) {
             view3.setTextColor(Color.parseColor(oobject2.mFontColour));
             view3.setTextSize(2, (float)oobject2.mFontSize.intValue());
             if (sharePanelEl.mAutoAdjustFontSize != null) {
                ShareInitResponse$ThemeElement mMinFontSize = oobject2.mMinFontSize;
                i = (mMinFontSize != null)? mMinFontSize.intValue(): 5;
                b.h(view3, i, 80, 2, 2);
             }else {
                b.i(view3, 0);
             }
          }
          i1 = true;
       }else {
          sharePanelEl = p0.a();
          view5 = p.a.a(oobject, 0);
          if (a.t().d(str, 0) && view5 != -1) {
             sharePanelEl.mIconUrl = null;
             sharePanelEl.mIconResId = view5;
          }
          i1 = false;
       }
       return i1;
    }
    public int g(int p0){
       return 0x7f0d0622;
    }
    public int h(j0 p0,int p1){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod1, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "bundle");
       if (p0.b() == null) {
          this.a.put(Integer.valueOf(p1), Integer.valueOf(1));
       }else {
          this.a.put(Integer.valueOf(p1), Integer.valueOf(2));
       }
       return 1;
    }
    public int i(int p0){
       p0 = (p0 != 2)? 0x7f0d0624: 0x7f0d0625;
       return p0;
    }
}
