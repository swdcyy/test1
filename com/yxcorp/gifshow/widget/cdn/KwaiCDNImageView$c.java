package com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$c;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$d;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.String;
import ub.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentHashMap;
import bd.f;
import android.graphics.drawable.Animatable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.widget.cdn.DesignCDNDataTrack;
import java.lang.Long;
import java.lang.System;
import zyc.d;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Throwable;
import android.content.Context;
import android.widget.ImageView;
import ekd.p0;
import nsd.u;
import zyc.f;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Map;

public final class KwaiCDNImageView$c extends KwaiCDNImageView$d	// class@001963
{
    public final AtomicInteger d;
    public final ConcurrentHashMap e;
    public final String f;
    public String g;
    public final int h;
    public final KwaiCDNImageView i;

    public void KwaiCDNImageView$c(KwaiCDNImageView p0,String p1,String p2,int p3,a p4){
       a.p(p1, "token");
       a.p(p2, "pathOrUrl");
       this.i = p0;
       super(p0, p4);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.d = new AtomicInteger(0);
       this.e = new ConcurrentHashMap();
    }
    public void a(String p0,f p1,Animatable p2){
       super.a(p0, p1, p2);
       Log.g("design_cdn#ui", "onFinalImageSet token: "+this.f+" path: "+this.g);
       DesignCDNDataTrack uDesignCDNDa = new DesignCDNDataTrack("cdn_load", true, this.b(), "icon");
       Long longx = this.e.get(this.g);
       if (longx != null) {
          a.o(longx, "mDurationMap[pathOrUrl] ?: return@apply");
          long l = longx.longValue();
          if (l > 0) {
             uDesignCDNDa.setDuration((System.currentTimeMillis() - l));
          }
       }
       d.e(uDesignCDNDa);
       this.e.remove(this.g);
       return;
    }
    public final String b(){
       String str;
       if (this.c()) {
          str = "local";
       }else if(!this.d()){
          str = "token";
       }else {
          str = "remote";
       }
       return str;
    }
    public final boolean c(){
       return (u.q2(this.g, "http", false, 2, null) ^ 0x01);
    }
    public final boolean d(){
       return (StringsKt__StringsKt.O2(this.g, this.f, false, 2, null) ^ 0x01);
    }
    public final KwaiCDNImageView$c e(String p0){
       this.g = p0;
       return this;
    }
    public void onFailure(String p0,Throwable p1){
       DesignCDNDataTrack uDesignCDNDa;
       KwaiCDNImageView$c f;
       KwaiCDNImageView$c uoc = this;
       Context obj = p1;
       super.onFailure(p0, p1);
       if (obj) {
          p1.printStackTrace();
       }
       String str = "design_cdn#ui";
       if (!p0.C(uoc.i.getContext())) {
          Log.d(str, "Fallback onFailure can\'t reach network!!");
          return;
       }else {
          char c = ' ';
          String str1 = " path: ";
          if (uoc.d.incrementAndGet() >= 4) {
             uDesignCDNDa = new DesignCDNDataTrack("cdn_load", false, null, "icon", 4, null);
             d.e(v1);
             Log.d(str, "Fallback final retry: token: "+uoc.f+str1+uoc.g+c+obj);
             return;
          }else {
             Log.d(str, "Fallback onFailure: token: "+uoc.f+str1+uoc.g+c+obj);
             String str2 = "icon";
             String str3 = " => ";
             String str4 = "context";
             if (this.c()) {
                obj = uoc.i.getContext();
                a.o(obj, str4);
                str4 = f.h(obj, str2, uoc.f, uoc.h);
                if (str4 != null) {
                   if (a.g(uoc.g, str4)) {
                      return;
                   }else {
                      Log.g(str, "Fallback switch url token: "+uoc.f+str1+uoc.g+str3+str4);
                      this.e(str4);
                      uoc.i.E(Uri.parse(str4), str4, 0, 0, this);
                   }
                }else {
                   return;
                }
             }else if(this.d()){
                obj = uoc.i.getContext();
                a.o(obj, str4);
                f = uoc.f;
                a.p(obj, str4);
                a.p(str2, "resType");
                a.p(f, "token");
                str4 = d.d(f.b.a(obj, str2, f, uoc.h));
                Log.g(str, "composeFallbackUrl cdn url: "+str4);
                if (str4 != null) {
                   if (a.g(uoc.g, str4)) {
                      return;
                   }else {
                      Log.g(str, "Fallback switch token: "+uoc.f+str1+uoc.g+str3+str4);
                      this.e(str4);
                      uoc.i.E(Uri.parse(str4), str4, 0, 0, this);
                   }
                }else {
                   return;
                }
             }else if(StringsKt__StringsKt.O2(uoc.g, "_dark", false, 2, null)){
                str4 = u.g2(uoc.g, "_dark", "", false, 4, null);
                if (a.g(uoc.g, str4)) {
                   return;
                }else {
                   Log.g(str, "Fallback switch light token: "+uoc.f+str1+uoc.g+str3+str4);
                   this.e(str4);
                   uoc.i.E(Uri.parse(str4), str4, 0, 0, this);
                }
             }else {
                uDesignCDNDa = new DesignCDNDataTrack("cdn_load", false, null, "icon", 4, null);
                d.e(obj);
             }
             return;
          }
       }
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       this.a(p0, p1, p2);
    }
    public void onSubmit(String p0,Object p1){
       super.onSubmit(p0, p1);
       Log.g("design_cdn#ui", "bindToken token: "+this.f+" path: "+this.g);
       this.e.put(this.g, Long.valueOf(System.currentTimeMillis()));
       DesignCDNDataTrack uDesignCDNDa = new DesignCDNDataTrack("cdn_load", false, this.b(), "icon", 2, null);
       d.e(this.e);
    }
}
