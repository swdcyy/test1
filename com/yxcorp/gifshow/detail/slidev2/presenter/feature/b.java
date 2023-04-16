package com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.lang.String;
import java.util.regex.Pattern;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.widget.d;
import koc.c;
import com.yxcorp.gifshow.topic.c;
import tyc.s4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashMap;
import java.util.List;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper;
import oe6.b;
import android.content.Context;
import wh5.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.android.model.mix.w;
import java.util.Iterator;
import com.kuaishou.android.model.mix.AtUserItem;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.a;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import qkc.a;
import com.yxcorp.gifshow.topic.c$a;
import b89.a;
import nsd.u;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$TYPE;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$a;
import b89.a$b;
import tyc.s4$a;
import e8a.a;
import com.yxcorp.gifshow.widget.d$a;
import brd.t;
import android.text.SpannableStringBuilder;
import e8a.b;
import erd.o;
import t45.d;
import brd.z;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rnc.i;
import java.util.regex.Matcher;
import lu7.f;
import android.text.Spannable;
import com.yxcorp.gifshow.util.ColorURLSpan;
import flb.a;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import qra.c;
import b89.a$c;
import android.text.TextUtils;

public abstract class b	// class@00193c
{
    public final d a;
    public final c b;
    public final a c;
    public final c d;
    public final s4 e;
    public final AtomicReference f;
    public final QPhoto g;
    public final Map h;
    public final int i;
    public final int j;
    public final int k;
    public static final Pattern l;
    public static final int m;

    static {
       b.l = Pattern.compile("\(@[^@]+?\)\\\(O\(\\d+\)\\\)");
       b.m = a1.d(0x7f070e95);
    }
    public void b(QPhoto p0,int p1,int p2,int p3,Boolean p4,boolean p5){
       d uod = this;
       QPhoto qPhoto = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       super();
       d uod1 = new d();
       uod.a = uod1;
       c uoc = new c();
       uod.b = uoc;
       uod.d = new c();
       s4 os4 = new s4();
       uod.e = os4;
       uod.f = new AtomicReference();
       uod.h = new HashMap();
       uod.g = qPhoto;
       uod.j = i;
       uod.k = i1;
       uod.i = i2;
       uoc.n(p0.getTags());
       uoc.k(i);
       i = 1;
       uoc.l(i);
       uoc.h = i1;
       uoc.o.e = i1;
       uoc.j(b.G());
       uoc.a(i);
       Context uContext = a1.c();
       uoc.l = uContext;
       c o = uoc.o;
       o.a = uContext;
       uoc.m = false;
       o.j = false;
       uoc.i(qPhoto, 3);
       i1 = c.b() ^ i;
       uoc.d = i1;
       uoc.o.b = i1;
       String str = "1";
       if (qPhoto != null && !p0.isAd()) {
          Objects.requireNonNull(os4);
          if (!PatchProxy.applyVoidOneRefs(qPhoto, os4, s4.class, str)) {
             os4.e = qPhoto;
             os4.f = p0.getCaptionSearchInfo();
          }
          os4.b = i;
          os4.j(a1.a(R.color.arg_RES_7f061ff3));
       }
       uod1.h(i);
       uod1.f(i2);
       b uob = PatchProxy.applyOneRefs(qPhoto, uod, b.class, str);
       if (uob != PatchProxyResult.class) {
       }else {
          Iterator iterator = w.M(p0).iterator();
          while (iterator.hasNext()) {
             AtUserItem uAtUserItem = iterator.next();
             uod.h.put(uAtUserItem.userId, uAtUserItem);
          }
          uob = uod.h;
       }
       uod1.j = uob;
       uod1.e = p4.booleanValue();
       uod1.b(a.a);
       b d = uod.d;
       d.e(new a(i));
       d.b(R.drawable.arg_RES_7f08073e);
       d.d(i);
       d.c(uod.i);
       a uoa = new a(uod.g, "FEED_LEFT_CORNER", false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8188, null);
       uod.c = d;
       if (p5) {
          RoundIconTagSpan$TYPE fEATURE_CAPT = RoundIconTagSpan$TYPE.FEATURE_CAPTION_ANCHOR_NEW;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(fEATURE_CAPT, d, a.class, "2")) {
             a.p(fEATURE_CAPT, "type");
             d.d = fEATURE_CAPT;
          }
       }
       return;
    }
    public void a(PhotoCommonHashTagHelper$a p0,a$b p1,s4$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "8")) {
          return;
       }
       this.b.h(p0);
       this.e.k(p2);
       this.a.c(new a(this));
       this.c.b(p1);
       return;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i;
    }
    public t c(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f.get() != null) {
          return t.just(this.f.get());
       }
       return t.just(this).map(new b(this)).subscribeOn(d.c).observeOn(d.a);
    }
    public final SpannableStringBuilder d(String p0,c p1,d p2,a p3,c p4,s4 p5){
       Matcher obj;
       b uob = b.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return new SpannableStringBuilder();
       }else {
          p0 = String.valueOf(i.j(p0));
          obj = b.l.matcher(p0);
          while (obj.find()) {
             String str = obj.group(1);
             String str1 = obj.group(i);
             if (str != null) {
                p0 = p0.replace(str, f.b(str1, str));
             }
          }
          SpannableStringBuilder spannableStr = this.e(p0);
          if (p5 != null) {
             p5.h(spannableStr);
          }
          p1.g(spannableStr);
          String str2 = "\n";
          if (!TextUtils.x(((spannableStr.toString()).replace(str2, "")).trim())) {
             p2.a(spannableStr);
             spannableStr = this.l(this.k(this.k(this.k(spannableStr, str2, " "), "\r", " "), "  ", " "));
             ColorURLSpan[] spans = spannableStr.getSpans(i1, spannableStr.length(), ColorURLSpan.class);
             List list = a.e.a();
             if (spans != null) {
                int len = spans.length;
                while (i1 < len) {
                   object oobject = spans[i1];
                   ActivityInfo uActivityInf = a.b(list, oobject.b());
                   if (uActivityInf != null) {
                      this.h(oobject, uActivityInf);
                   }else if((oobject.b()).startsWith("#")){
                      oobject.g(this.j);
                   }else {
                      oobject.g(this.i);
                   }
                   oobject.l(this.k);
                   i1 = i1 + 1;
                }
             }
             p3.c(spannableStr);
             p4.f(spannableStr);
             return spannableStr;
          }else {
             return new SpannableStringBuilder();
          }
       }
    }
    public SpannableStringBuilder e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CharSequence uCharSequenc = c.a(p0, (float)b.m);
       if (uCharSequenc instanceof SpannableStringBuilder) {
       }else {
          uCharSequenc = new SpannableStringBuilder(uCharSequenc);
       }
       return uCharSequenc;
    }
    public a$c f(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a();
    }
    public s4 g(){
       return this.e;
    }
    public abstract void h(ColorURLSpan p0,ActivityInfo p1);
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       this.d.a();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.f.get() == null) {
          b tf = this.f;
          _monitor_enter(tf);
          if (this.f.get() == null) {
             this.f.set(this.d(this.g.getCaption(), this.b, this.a, this.c, this.d, this.e));
          }
          _monitor_exit(tf);
       }
       return;
    }
    public final SpannableStringBuilder k(SpannableStringBuilder p0,String p1,CharSequence p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = TextUtils.indexOf(p0, p1);
       while (i >= 0) {
          int i1 = p1.length() + i;
          p0.setSpan(p1, i, i1, 33);
          i = p0.getSpanStart(p1);
          i1 = p0.getSpanEnd(p1);
          if (i >= 0) {
             p0.replace(i, i1, p2);
          }else {
             break ;
          }
       }
       return p0;
    }
    public final SpannableStringBuilder l(SpannableStringBuilder p0){
       String obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.toString();
       int i = 0;
       int i1 = 0;
       while (obj.length() > 0 && obj.startsWith(" ")) {
          obj = obj.substring(1);
          i1 = i1 + 1;
       }
       int i2 = 0;
       while (obj.length() > 0 && obj.endsWith(" ")) {
          int i3 = obj.length() - 1;
          obj = obj.substring(i, i3);
          i2 = i2 + 1;
       }
       return p0.delete(i, i1).delete((p0.length() - i2), p0.length());
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.b.h(null);
       this.e.k(null);
       this.a.c(null);
       this.c.b(null);
       return;
    }
}
