package com.kwai.slide.play.detail.rightactionbar.like.b;
import rq7.a;
import jh5.a;
import pp7.a;
import fs7.b;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.util.cdnresource.a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.util.cdnresource.f;
import pp7.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import w4.e;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.rightactionbar.like.b$a;
import qrd.l1;
import java.lang.Integer;
import com.kwai.slide.play.detail.rightactionbar.like.b$b;
import uy6.h;
import uy6.b;
import com.yxcorp.utility.TextUtils;
import qp7.t0;
import qp7.x0;
import android.graphics.Typeface;
import android.content.Context;
import android.content.res.Resources;

public final class b extends a	// class@001867
{
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final b j;

    public void b(){
       super(null);
    }
    public void b(a p0){
       super();
       this.d = new a(p0);
       this.e = new a(p0);
       this.f = new a(p0);
       this.g = new a(p0);
       this.h = new a(p0);
       this.i = new a(p0);
       this.j = new b();
    }
    public final void g(String p0,QPhoto p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "8")) {
          return;
       }
       String str = "PHOTO_LIKE_ICON";
       String str1 = b.a(-1568263472).c(str, p1);
       b = a.a(str, str1);
       if (b) {
          p0 = str1;
       }
       this.g.f(f.i(p0, CdnResource$ResourceKey.slide_play_like_image, CdnResource$ResourceKey.slide_play_unlike_image, this.j.a("LikeViewModelDefLiveIcon", R.drawable.arg_RES_7f08091f), b));
       return;
    }
    public final Boolean h(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a();
    }
    public final void i(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       this.d.f(Boolean.valueOf(p0));
       return;
    }
    public final void j(LikeAnimationEnum p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "likeAnimationEnum");
       b te = this.e;
       b$a uoa = new b$a();
       if (!PatchProxy.applyVoidOneRefs(p0, uoa, b$a.class, "2")) {
          a.p(p0, "<set-?>");
          uoa.a = p0;
       }
       uoa.b = p1;
       te.f(uoa);
       return;
    }
    public final void k(int p0,String p1,boolean p2){
       b$b uob;
       Context uContext;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, b.class, "15")) {
          return;
       }
       if (PatchProxy.isSupport(b.class)) {
          uob = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, b.class, "13");
          if (uob != PatchProxyResult.class) {
          }else {
          label_003c :
             uob = new b$b();
             if (p0 > 0) {
                String str = TextUtils.O((long)p0, h.a.n);
                a.o(str, "TextUtils.valueOf\(number¡­tExp.config.enableNumOpt\)");
                uob.a(str);
                uob.b(this.a().b);
                uob.c(Typeface.DEFAULT_BOLD);
             }else if(!p2){
                p1 = this.b().getResources().getString(R.string.arg_RES_7f10383a);
                a.o(p1, "context.resources.getStr¡­tring.nasa_encouragement\)");
             }else if(p1 == null || !p1.length()){
                uContext = 1;
             }else {
                uContext = null;
             }
             if (uContext) {
                p1 = this.b().getResources().getString(R.string.arg_RES_7f101cb7);
                a.o(p1, "context.resources.getString\(R.string.like_new\)");
             }
             uob.a(p1);
             uob.b(12.00f);
             uob.c(Typeface.DEFAULT_BOLD);
          }
       }else {
          goto label_003c ;
       }
       if (!PatchProxy.applyVoidOneRefs(uob, this, b.class, "14")) {
          a.p(uob, "likeTextModel");
          this.f.f(uob);
       }
       return;
    }
}
