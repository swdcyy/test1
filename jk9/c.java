package jk9.c;
import eya.d;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import jk9.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import jk9.c$b;
import jk9.c$d;
import jk9.c$c;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$r;
import android.animation.ValueAnimator;
import jk9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import jk9.e;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import mrd.a;
import android.content.Context;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import com.kuaishou.android.model.mix.CommonMeta;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import trd.t;
import java.lang.Number;
import java.util.Collection;
import jk9.g;
import java.lang.Long;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.graphics.drawable.Drawable;
import ll9.a;
import android.graphics.Rect;
import android.content.res.Resources;
import java.util.Objects;
import cw9.c;
import jk9.f;
import erd.g;
import crd.b;
import brd.t;
import crd.a;
import jk9.c$a;
import eya.e;
import java.lang.Runnable;
import ekd.k1;
import ukd.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class c implements d	// class@002afa
{
    public ValueAnimator a;
    public a b;
    public final ArrayList c;
    public final Runnable d;
    public final Runnable e;
    public final c$c f;
    public final RecyclerView g;
    public final TextView h;
    public final QPhoto i;
    public final QComment j;
    public final a k;
    public final List l;

    public void c(RecyclerView p0,TextView p1,QPhoto p2,QComment p3,a p4,List p5){
       a.p(p0, "recyclerView");
       a.p(p1, "textView");
       a.p(p2, "photo");
       a.p(p3, "comment");
       a.p(p4, "easterEggCenter");
       a.p(p5, "imageUrls");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.c = new ArrayList();
       this.d = new c$b(this);
       this.e = new c$d(this);
       this.f = new c$c(this);
    }
    public List a(String p0,User p1,int p2,int p3){
       Object[] obj;
       Context context;
       String url;
       String str1;
       int i;
       long l;
       BifrostImageResourceEntry uBifrostImag1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, c.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "whole");
       a.p(p1, "user");
       if (this.j.getStatus()) {
          return CollectionsKt__CollectionsKt.E();
       }else {
          obj = null;
          if (this.j.mHasShowAtTailEasterEgg == null && (this.a == null && this.k.d != null)) {
             this.g.addOnScrollListener(this.f);
             if (PatchProxy.apply(obj, this, c.class, "8") != patchProxyRe) {
             }else if(this.a != null){
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.setRepeatCount(5);
                valueAnimato.setRepeatMode(2);
                valueAnimato.setDuration((long)333);
                valueAnimato.addUpdateListener(new d(this));
                valueAnimato.addListener(new e(this));
                this.a = valueAnimato;
                a.o(valueAnimato, "ValueAnimator.ofFloat\(0f¡­    animator = this\n    }");
             }
             this.b();
          }
       label_0092 :
          a uoa = PatchProxy.applyOneRefs(p1, this, c.class, "5");
          String str = "textView.context";
          if (uoa != patchProxyRe) {
          }else {
             Context context1 = this.h.getContext();
             CommentAtTailEasterEggConfig uCommentAtTa = this.k.c();
             if (uCommentAtTa != null && uCommentAtTa.mIsFromOldData == true) {
                CommonMeta commonMeta = this.i.getCommonMeta();
                if (commonMeta != null) {
                   commonMeta = commonMeta.mActivity61AnimationImageUrls;
                   if (commonMeta != null) {
                      CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(commonMeta);
                      if (uCDNUrl != null) {
                         url = uCDNUrl.getUrl();
                      label_00ce :
                         if (url != null) {
                            str1 = (url.length() > 0)? 1: null;
                            if (str1 == true) {
                               c tk = this.k;
                               Context context2 = this.h.getContext();
                               a.o(context2, str);
                               BifrostImageResourceEntry uBifrostImag = PatchProxy.applyOneRefs(url, this, c.class, "4");
                               if (uBifrostImag != patchProxyRe) {
                               }else {
                                  uBifrostImag = new BifrostImageResourceEntry();
                                  uBifrostImag.mEnableWarmup = true;
                                  uBifrostImag.mType = 0;
                                  uBifrostImag.mUrls = t.k(url);
                               }
                               uoa = tk.b(context2, uBifrostImag);
                            }
                         }
                      }
                   }
                }
                url = obj;
                goto label_00ce ;
             }
          label_0106 :
             Integer integer = Integer.valueOf(this.c.indexOf(p1.getId()));
             boolean b = (integer.intValue() != -1)? true: false;
             if (!b) {
                integer = obj;
             }
             if (integer != null) {
                i = integer.intValue();
             }else {
                this.c.add(p1.getId());
                i = this.c.size() - true;
             }
             c tl = this.l;
             if (!(tl.isEmpty() ^ true)) {
                tl = obj;
             }
             if (tl != null) {
                str1 = this.j.getId();
                Object obj1 = PatchProxy.applyOneRefs(str1, obj, g.class, "1");
                if (obj1 != patchProxyRe) {
                   l = obj1.longValue();
                }else if(str1 != null){
                   try{
                      l = Long.parseLong(str1);
                   }catch(java.lang.Exception e0){
                      l = 0;
                   }
                }else {
                   goto label_0166 ;
                }
             }else {
                uBifrostImag1 = obj;
             }
             if (uBifrostImag1 != null && uBifrostImag1.isValid() == true) {
                context = this.h.getContext();
                a.o(context, str);
                uoa = this.k.b(context, uBifrostImag1);
             }else {
                a.o(context1, "context");
                uoa = a.h(this.k.a(context1));
                a.o(uoa, "BehaviorSubject.createDe¡­DefaultDrawable\(context\)\)");
             }
          }
          Drawable uDrawable = uoa.i();
          if (uDrawable != null) {
             uoa = new a(uDrawable);
          }else {
             Rect rect = PatchProxy.apply(obj, this, c.class, "3");
             if (rect != patchProxyRe) {
             }else {
                context = this.h.getContext();
                a.o(context, str);
                Resources resources = context.getResources();
                Objects.requireNonNull(a.h);
                rect = new Rect(0, 0, c.b(resources, a.g), c.b(resources, a.g));
             }
             a uoa1 = new a(rect);
             if (!PatchProxy.applyVoidTwoRefs(uoa, uoa1, this, c.class, "6")) {
                b uob = uoa.subscribe(new f(this, uoa1));
                c uoc = PatchProxy.apply(obj, this, c.class, "7");
                if (uoc != patchProxyRe) {
                }else {
                   uoc = this.b;
                   if (uoc == null) {
                      uoc = new a();
                      this.b = uoc;
                   }
                }
                uoc.c(uob);
             }
             uoa = uoa1;
          }
          c ta = this.a;
          if (ta != null) {
             ta.addUpdateListener(new c$a(uoa));
          }
          return t.k(new e(uoa, 17, (p3 - 1), p3));
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       if (this.j.mHasShowAtTailEasterEgg != null) {
          return;
       }
       c ta = this.a;
       if (ta != null && !ta.isRunning()) {
          this.c();
          k1.r(this.d, 16);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       k1.m(this.d);
       k1.m(this.e);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       try{
          Object[] objArray = new Object[0];
          a.a(this.h, "nullLayouts", objArray);
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       this.h.invalidate();
       return;
    }
}
