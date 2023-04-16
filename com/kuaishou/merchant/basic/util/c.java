package com.kuaishou.merchant.basic.util.c;
import io.reactivex.g;
import java.util.List;
import crd.a;
import java.lang.Object;
import brd.v;
import com.kuaishou.merchant.basic.util.d;
import ot3.o;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import ot3.u0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mt3.a;
import lnc.a1;
import crd.c;
import com.yxcorp.utility.f;
import brd.t;
import ot3.q;
import com.kuaishou.merchant.basic.util.d$c;
import erd.g;
import java.lang.Float;
import java.lang.Boolean;
import android.content.Context;
import android.view.View;
import xm4.a;
import lnc.b3;
import android.app.Application;
import o56.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import ot3.a;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import ot3.n;
import com.kuaishou.merchant.basic.util.d$b;
import com.yxcorp.utility.n;
import android.widget.TextView;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel$Style;
import ot3.m;
import android.util.SparseIntArray;

public final class c implements g	// class@0015d5
{
    public final List b;
    public final a c;
    public final float d;
    public final boolean e;

    public void c(List p0,a p1,float p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       float f;
       c uoc1;
       c uoc = this;
       c c = uoc.c;
       c d = uoc.d;
       c e = uoc.e;
       o oo = new o(p0);
       Iterator iterator = uoc.b.iterator();
       while (iterator.hasNext()) {
          CharSequence uCharSequenc = iterator.next();
          if (uCharSequenc != null) {
             Object obj = null;
             if (uCharSequenc.mTime > 0) {
                if (uCharSequenc.mType != 18) {
                   b uob = PatchProxy.applyTwoRefs(uCharSequenc, oo, obj, d.class, "32");
                   if (uob != PatchProxyResult.class) {
                   }else {
                      long l = uCharSequenc.mTime - u0.b();
                      uCharSequenc.mSpannableText = obj;
                      if (!TextUtils.x(uCharSequenc.mContent)) {
                         uCharSequenc.mSpannableText = a.j(uCharSequenc.mContent).f(a1.d(0x7f070f6d)).b(a1.a(0x7f061dfb)).h();
                         uob = c.b();
                      }else {
                         uob = f.d().b(l, 100).subscribe(new q(uCharSequenc, oo));
                      }
                   }
                   c.c(uob);
                }
             }else if(!TextUtils.x(uCharSequenc.mIconUrl)){
                if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(uCharSequenc, oo, Float.valueOf(d), Boolean.valueOf(e), null, d.class, "28")) {
                   continue ;
                }else if(d > 0){
                   f = (float)uCharSequenc.getWidth() / (float)uCharSequenc.getHeight();
                   f = f * d;
                   uoc1 = d;
                }else {
                   uoc1 = (float)uCharSequenc.getHeight();
                   f = (float)uCharSequenc.getWidth();
                }
                if (e != null) {
                   b3 uob3 = new b3(a.b(), new BitmapDrawable(a1.m(), a.a(a.a(a1.c(), 0x7f0d06aa))));
                   uob3.b(false);
                   uob3.g(a1.d(R.dimen.arg_RES_7f07031b));
                   uob3.d((int)f, (int)uoc1);
                   uCharSequenc.mSpannableText = uob3.a();
                }
                d.p(uCharSequenc.mIconUrl, new n(uCharSequenc, f, uoc1, oo));
             }else if(uCharSequenc.mType == 35){
                if (PatchProxy.applyVoidTwoRefs(uCharSequenc, oo, obj, d.class, "33")) {
                   continue ;
                }else {
                   TextView textView = n.G(a1.c(), R.layout.arg_RES_7f0d068d);
                   textView.setGravity(17);
                   textView.setText(uCharSequenc.mContent);
                   Commodity$IconLabel mStyle = uCharSequenc.mStyle;
                   if (mStyle != null) {
                      if (!TextUtils.x(mStyle.mBackgroundUrl)) {
                         d.p(mStyle.mBackgroundUrl, new m(textView, uCharSequenc, mStyle, oo));
                      }else {
                         d.d(textView, uCharSequenc, false);
                         uCharSequenc.mSpannableText = d.c(textView);
                      }
                   }else {
                      textView.setHeight(a1.e(14.00f));
                      textView.setTextSize(1, 9.00f);
                      uCharSequenc.mSpannableText = d.c(textView);
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(uCharSequenc, obj, d.class, "31")){
                continue ;
             }else {
                uCharSequenc.mSpannableText = d.n(d.a, uCharSequenc);
             }
          }
       }
       oo.a();
       return;
    }
}
