package com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.ImageView;
import java.lang.CharSequence;
import java.lang.System;
import zsd.u;
import zyc.f;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.download.DownloadManager;
import zyc.b;
import kotlin.Result;
import android.content.res.Resources;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import w4.k;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView$a;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView$b;
import w4.j;
import kotlin.text.StringsKt__StringsKt;
import com.yxcorp.gifshow.widget.cdn.DesignCDNDataTrack;
import zyc.d;
import java.util.Set;

public class KwaiLottieAnimationView extends LottieAnimationView	// class@001968
{
    public String r;
    public int s;
    public final Set t;
    public KwaiLottieAnimationView$a u;

    public void KwaiLottieAnimationView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void KwaiLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void KwaiLottieAnimationView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.r = "";
       this.t = new HashSet();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Z1);
       a.o(typedArray, "context.obtainStyledAttr¡­.KwaiLottieAnimationView\)");
       int i = 0;
       p2 = typedArray.getResourceId(i, i);
       if (p2) {
          i = typedArray.getInt(1, i);
          this.s = i;
          this.E(p2, i);
       }
       typedArray.recycle();
       return;
    }
    public void KwaiLottieAnimationView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void D(int p0){
       this.E(p0, this.s);
    }
    public final void E(int p0,int p1){
       String str = this.getContext().getString(p0);
       a.o(str, "context.getString\(token\)");
       this.G(str, p1);
    }
    public final void F(String p0){
       a.p(p0, "token");
       this.G(p0, this.s);
    }
    public final void G(String p0,int p1){
       Context context;
       String str3;
       String str4;
       long l1;
       Result$a uoa1;
       String str = "_dark";
       a.p(p0, "token");
       int i = 1;
       int i1 = (!p0.length())? 1: 0;
       if (i1) {
          return;
       }else {
          this.r = p0;
          this.s = p1;
          long l = System.currentTimeMillis();
          int i2 = 2;
          String str1 = "context";
          if (u.H1(p0, "_cdn", false, i2, null)) {
             context = this.getContext();
             a.o(context, str1);
             String str2 = "motion";
             str = f.d(context, str2, p0, p1);
             str3 = "KwaiLottieAnimationView";
             Log.g(str3, "preload path:"+str);
             if (str != null && str.length()) {
                i = 0;
             }
             if (!i) {
                DownloadManager.C("design_kid_motion", "");
                this.setAnimationFromFile(str);
                str4 = "file";
             }else {
                context = this.getContext();
                a.o(context, str1);
                str4 = f.h(context, str2, p0, p1);
                Log.g(str3, "cdn url:"+str4);
                this.setAnimationFromUrl(str4);
                if (str4 == null) {
                   str4 = "compose";
                }
             }
          }else if(p1 == i2 || (!p1 && b.d())){
             uoa1 = 1;
          }else {
             uoa1 = null;
          }
          if (uoa1) {
             Context context1 = this.getContext();
             a.o(context1, str1);
             Resources resources = context1.getResources();
             a.o(resources, "context.resources");
             String[] stringArray = SplitAssetHelper.list(resources.getAssets(), p0+str);
             if (stringArray != null) {
                l1 ol1 = (!stringArray.length)? 1: null;
                if (!ol1) {
                label_00d5 :
                   Result.constructor-impl(l1.a);
                   if (i) {
                      str4 = p0+str;
                   label_00fc :
                      this.setImageAssetsFolder(str4+"/images/");
                      this.setAnimation(str4+"/data.json");
                      str4 = "assets";
                   }
                }
             }
             i = 0;
             goto label_00d5 ;
          }
          str4 = p0;
          goto label_00fc ;
          KwaiLottieAnimationView tu = this.u;
          if (tu != null) {
             this.w(tu);
          }
          String str5 = this;
          str3 = p0;
          String str6 = str4;
          l1 = l;
          KwaiLottieAnimationView$a uoa = new KwaiLottieAnimationView$a(str5, str3, str6, l1);
          this.u = tu;
          a.m(tu);
          this.d(tu);
          KwaiLottieAnimationView$b uob = new KwaiLottieAnimationView$b(str5, str3, str6, l1);
          this.setFailureListener(tu);
          return;
       }
    }
    public final void H(String p0,String p1,boolean p2,long p3){
       boolean b = false;
       if (u.q2(p1, "http", b, 2, null)) {
          p1 = (StringsKt__StringsKt.O2(p1, p0, b, 2, null))? "fallback": "url";
       }
    label_0016 :
       DesignCDNDataTrack uDesignCDNDa = new DesignCDNDataTrack("cdn_load", p2, p1, "motion");
       uDesignCDNDa.setDuration((System.currentTimeMillis() - p3));
       d.e(uDesignCDNDa);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.u();
       this.t.clear();
    }
}
