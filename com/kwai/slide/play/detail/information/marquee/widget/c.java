package com.kwai.slide.play.detail.information.marquee.widget.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import jr7.b;
import hr7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.slide.play.detail.information.marquee.widget.c$a;
import com.kwai.slide.play.detail.information.marquee.widget.a;
import android.view.View$OnClickListener;
import android.view.View;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.kwai.slide.play.detail.information.marquee.widget.b;
import android.widget.ImageView;
import lnc.a1;
import ir7.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import android.text.TextPaint;
import android.widget.TextView;
import ir7.a;
import jb0.a$a;
import jb0.a;
import java.lang.StringBuilder;
import rnc.i;
import ir7.b;
import ir7.c;
import ir7.d;
import ir7.e;
import java.lang.Boolean;
import bld.b;
import android.graphics.Color;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import ak5.j;
import tyc.a1;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiTextView;
import ir7.f;
import android.widget.TextView$BufferType;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class c extends RecyclerView$Adapter	// class@0017f6
{
    public b e;
    public List f;

    public void c(List p0,b p1){
       super();
       this.f = p0;
       this.e = p1;
    }
    public a J0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.get(p0);
    }
    public int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a uoa = this.J0(p0);
       uoa = (uoa != null)? uoa.b: 0;
       return uoa;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.f))? 0: this.f.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c$a b1;
       a b2;
       c$a c;
       String str3;
       KSTextDisplayHandler obj2;
       boolean b3;
       b obj3;
       Object obj = this;
       c obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String str = "2";
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uoc, str)) {
          a uoa = obj.J0(p1);
          if (uoa != null && uoa.b != null) {
             obj1.a.setOnClickListener(new a(obj, uoa));
             c$a b = obj1.b;
             b uob = null;
             if (b != null) {
                d uod = b.g0(uob, uob, uoa.c);
                obj1.b.setPlaceHolderImage(uoa.d);
                b1 = obj1.b;
                b uob1 = (uod == null)? uob: uod.e();
                b1.setController(uob1);
                obj1.b.setOnClickListener(new b(obj, uoa));
             }
             b = obj1.e;
             int i = 3;
             int i1 = 4;
             boolean i2 = 2;
             if (b != null) {
                b2 = uoa.b;
                if (b2 == i) {
                   b.setBackground(a1.f(R.drawable.arg_RES_7f0822e7));
                }else if(b2 == i1){
                   b.setBackground(a1.f(R.drawable.arg_RES_7f08231a));
                }else if(b2 == 5){
                   b.setBackground(a1.f(R.drawable.arg_RES_7f081b3f));
                }else if(b2 == i2 || b2 == 7){
                   b.setBackground(a1.f(R.drawable.arg_RES_7f08090c));
                }else {
                   b.setBackground(uob);
                }
             }
             c = obj1.c;
             String str1 = "";
             if (c != null) {
                b1 = obj1.f;
                b = b1;
                c$a uoa1 = b1;
                String str2 = 1;
                a uoa2 = 6;
                c$a uoa3 = c;
                a uoa4 = PatchProxy.applyThreeRefs(b, c, uoa, 0, g.class, "1");
                if (uoa4 != patchProxyRe) {
                label_017d :
                   str3 = str;
                }else if(TextUtils.x(uoa.e)){
                   str3 = str;
                }else {
                   uoa4 = uoa.b;
                   if (uoa4 != str2 && uoa4 != uoa2) {
                      uoa4 = uoa.e;
                      goto label_017d ;
                   }else {
                      float f = (float)g.b;
                      b2 = uoa.h;
                      if (b2 != null && !TextUtils.x(b2.mTagText)) {
                         f = (f - uoa1.getPaint().measureText(uoa.h.mTagText)) - (float)g.c;
                      }
                      String a = g.a;
                      float f1 = uoa3.getPaint().measureText(a);
                      float f2 = uoa3.getPaint().measureText(":");
                      if (TextUtils.x(uoa.f)) {
                         uoa4 = i.j(a.b(uoa.e, (int)(f - f2), new a(uoa3))+":");
                         goto label_017d ;
                      }else {
                         c = uoa3;
                         str2 = uoa.e+a+uoa.f;
                         if (c.getPaint().measureText(str2) - f <= 0) {
                            uoa4 = i.j(str2+":");
                            goto label_017d ;
                         }else {
                            uoa2 = uoa.e;
                            float f3 = c.getPaint().measureText(uoa2, false, uoa2.length());
                            a f4 = uoa.f;
                            str3 = str;
                            float f5 = c.getPaint().measureText(f4, false, f4.length());
                            f = ((f - f1) - f2) / 2.00f;
                            v7 = f3 - f;
                            if (f1 >= 0 && f5 - f >= 0) {
                               int i3 = (int)f;
                               str = a.b(uoa.e, i3, new b(c));
                               uoa4 = i.j(str+a+a.b(uoa.f, i3, new c(c))+":");
                            }else if(f1 >= 0 && f5 - f <= 0){
                               uoa4 = i.j(a.b(uoa.e, (int)(f + (f - f5)), new d(c))+a+uoa.f+":");
                            }else if(f3 - f <= 0 && f5 - f >= 0){
                               uoa4 = i.j(uoa.e+a+a.b(uoa.f, (int)(f + (f - f3)), new e(c))+":");
                            }
                         }
                      }
                   }
                }
                uoa4 = str1;
                obj1.c.setText(uoa4);
             }else {
                str3 = str;
                i2 = false;
             }
             if (obj1.f != null) {
                a h = uoa.h;
                obj2 = PatchProxy.applyOneRefs(h, obj, uoc, "3");
                if (obj2 != patchProxyRe) {
                   b3 = obj2.booleanValue();
                }else if(h != null && (!TextUtils.x(h.mTagText) && (!TextUtils.x(h.mTextColor) && (TextUtils.x(h.mTageType) || TextUtils.x(h.mBgColor))))){
                   b3 = true;
                }else {
                   b3 = false;
                }
                if (b3) {
                   obj1.f.setVisibility(4);
                }else {
                   obj1.f.setVisibility(false);
                   obj3 = new b();
                   obj3.v(Color.parseColor(uoa.h.mBgColor));
                   obj3.g(KwaiRadiusStyles.R3);
                   obj3.s(DrawableCreator$Shape.Rectangle);
                   obj1.f.setBackground(obj3.a());
                   obj1.f.setTextColor(Color.parseColor(uoa.h.mTextColor));
                   obj1.f.setText(uoa.h.mTagText);
                }
             }
             if (obj1.d != null) {
                if (j.o().t()) {
                   obj1.d.setKSTextDisplayHandler(new a1(obj1.d));
                }
                obj2 = obj1.d.getKSTextDisplayHandler();
                obj2.s(obj1.d.getCurrentTextColor());
                obj2.o(3);
                c$a d = obj1.d;
                obj3 = PatchProxy.applyTwoRefs(d, uoa, null, g.class, str3);
                if (obj3 != patchProxyRe) {
                   str1 = obj3;
                }else if(TextUtils.x(uoa.g)){
                   str1 = (uoa.b == 6)? uoa.g.toString(): a.b(uoa.g.toString(), (g.b * 2), new f(d));
                }
                String str4 = str1;
                d.setText(str4, TextView$BufferType.SPANNABLE);
                obj1.d.setClickable(false);
             }
             obj1 = obj.e;
             if (obj1 != null) {
                obj1.d(uoa);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       c$a uoa;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_001a :
             int i = 0x7f0d039f;
             switch (p1){
                 case 1:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d039a, p0, false));
                   break;
                 case 2:
                 case 5:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d039c, p0, false));
                   break;
                 case 3:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), i, p0, false));
                   break;
                 case 4:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), i, p0, false));
                   break;
                 case 6:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d039b, p0, false));
                   break;
                 case 7:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d039d, p0, false));
                   break;
                 default:
                   uoa = new c$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d039e, p0, false));
             }
          }
       }else {
          goto label_001a ;
       }
       return uoa;
    }
}
