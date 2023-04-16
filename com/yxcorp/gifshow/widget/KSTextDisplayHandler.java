package com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.HashMap;
import android.widget.TextView;
import java.lang.Object;
import com.gifshow.twitter.widget.Extractor;
import com.yxcorp.gifshow.widget.m0;
import java.util.ArrayList;
import lnc.c0;
import tyc.l0;
import java.lang.ref.WeakReference;
import android.content.Context;
import ync.a;
import android.text.Editable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.util.resource.n;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import rnc.i;
import java.lang.CharSequence;
import java.util.Objects;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.regex.Matcher;
import android.text.style.ReplacementSpan;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.m0$a;
import lnc.e3$a;
import android.text.TextPaint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.style.BackgroundColorSpan;
import android.graphics.Paint$Style;
import java.lang.Math;
import n0.c;
import android.graphics.drawable.Drawable;
import lnc.e3;
import android.widget.EditText;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import com.gifshow.twitter.widget.Extractor$Entity;
import lnc.c0$a;
import com.yxcorp.gifshow.widget.SourceURLSpan;
import android.text.style.ImageSpan;
import android.text.TextUtils;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import lu7.f;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$c;
import com.yxcorp.gifshow.widget.d$c;
import fg6.a;
import com.google.gson.Gson;
import java.net.URLEncoder;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import eya.c;
import com.yxcorp.gifshow.widget.KwaiURLSpan;
import tyc.n2;
import android.text.style.StyleSpan;
import java.io.UnsupportedEncodingException;
import rnc.h$a;
import android.content.res.Resources;
import rnc.l;
import ekd.y;
import ekd.z;
import android.graphics.drawable.Drawable$Callback;
import rnc.n;
import com.gifshow.twitter.widget.Extractor$Entity$Type;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import qn9.b;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.TagItem;
import tyc.e2;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$1;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$b;
import android.text.InputFilter;
import com.yxcorp.gifshow.widget.EmojiEditText$f;

public class KSTextDisplayHandler	// class@001868
{
    public final int a;
    public final WeakReference b;
    public KSTextDisplayHandler$b c;
    public KSTextDisplayHandler$a d;
    public int e;
    public boolean f;
    public Extractor g;
    public int h;
    public boolean i;
    public EmojiEditText$f j;
    public List k;
    public BaseFeed l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public m0 t;
    public n2 u;
    public List v;
    public Pattern w;
    public List x;
    public boolean y;
    public boolean z;
    public static Pattern A;
    public static HashMap B;
    public static boolean C;

    static {
       KSTextDisplayHandler.A = Pattern.compile("#\\d+$");
       KSTextDisplayHandler.B = new HashMap();
    }
    public void KSTextDisplayHandler(TextView p0){
       super();
       this.e = 1;
       this.g = new Extractor();
       this.h = 0;
       this.i = false;
       this.m = 0;
       this.p = 0;
       this.q = 0;
       this.r = true;
       this.s = false;
       this.t = new m0();
       this.v = new ArrayList();
       this.w = c0.a;
       this.x = new ArrayList();
       this.z = true;
       this.b = new WeakReference(p0);
       this.u = new l0();
       this.a = a.c(p0.getContext());
    }
    public void a(Editable p0){
       String str;
       String str3;
       Matcher matcher1;
       Matcher matcher2;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, KSTextDisplayHandler.class, "8")) {
          return;
       }
       if (obj1 == null) {
          return;
       }
       int b = true;
       if (!KSTextDisplayHandler.C) {
          n.x(Category.EMOJI);
          KSTextDisplayHandler.C = b;
       }
       Object obj2 = obj.b.get();
       int i = p0.length();
       try{
          obj.i = b;
          obj.k(obj1, obj2, p0.toString());
       }catch(java.lang.RuntimeException e0){
          str = "format";
          Log.c(str, "É¾³ýÖØ¸´spanÒì³£", e0);
          u1.Q("KSTextDisplayHandler", str);
       }
       int i1 = 0;
       if (this.i()) {
          if (i.f()) {
             i.j(p0);
          }else {
             obj.m(obj1, obj2, i1, i);
          }
       }
       if (this.h()) {
          obj.l(obj1, obj2, i1, i);
       }
       if (this.j()) {
          obj.n(obj1, obj2, p0.toString());
       }
       KSTextDisplayHandler t = obj.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.isSupport(m0.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i1), Integer.valueOf(i), t, m0.class, "2")) {
          Log.b("TextParser", "start editable: "+p0.toString());
          t.a();
          Matcher matcher = t.a.matcher((p0.toString()).substring(i1, (i1 + i)));
          while (matcher.find()) {
             Log.b("TextParser", "find group: "+matcher.group());
             str = matcher.group(b);
             String str1 = "1";
             String str2 = "";
             if (!str1.equals(str)) {
                Log.b("TextParser", "filter unknown type: "+str);
                obj1.replace(matcher.start(), matcher.end(), str2);
                break ;
             }else if(str1.equals(str) && t.b != null){
                if (PatchProxy.isSupport(m0.class)) {
                   str3 = str2;
                   matcher1 = matcher;
                   if (PatchProxy.applyVoidFourRefs(p0, matcher, Integer.valueOf(i1), Integer.valueOf(i), t, m0.class, "3")) {
                      matcher = matcher1;
                   label_013d :
                      b = 1;
                   }
                }else {
                   str3 = str2;
                   matcher1 = matcher;
                }
                int i2 = matcher1.start() + i1;
                int i3 = matcher1.end() + i1;
                ReplacementSpan[] spans = obj1.getSpans(i2, i3, ReplacementSpan.class);
                if (spans != null && spans.length > 0) {
                   i3 = spans.length;
                   for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                      obj1.removeSpan(spans[i4]);
                      Log.b("TextParser", "remove span");
                   }
                }
                str = matcher1.group();
                i3 = 2;
                matcher2 = matcher1;
                StringBuilder str4 = matcher2.group(i3);
                String str5 = matcher2.group(3);
                Iterator iterator = t.f.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if ((iterator.next().a).equals(str4)) {
                         i2 = matcher2.start() + i1;
                         i3 = matcher2.end() + i1;
                         Log.b("TextParser", "replace start: "+i2+" end: "+i3);
                         obj1.replace(i2, i3, str3);
                         Log.g("TextParser", "after replace: "+p0.toString());
                         matcher = matcher2;
                         goto label_013d ;
                      }
                   }else {
                      t.f.add(new m0$a(str4, str5));
                      Log.b("TextParser", "formatNearByCommunity whole:"+str+" id:"+str4+" name: "+str5);
                      int i5 = matcher2.start() + i1;
                      str4 = "formatNearByCommunity START:"+i5;
                      i5 = matcher2.end() + i1;
                      Log.b("TextParser", str4+" end:"+i5);
                      e3$a uoa = new e3$a(str, str5);
                      m0 d = t.d;
                      if (d > null) {
                         uoa.e = d;
                      }
                      d = t.c;
                      if (d != null) {
                         uoa.j = d;
                         uoa.k = i3;
                      }
                      d = t.e;
                      if (d != null) {
                         uoa.c = d;
                      }
                      TextPaint textPaint = new TextPaint(1);
                      textPaint.setTextSize((float)uoa.e);
                      e3$a b1 = uoa.b;
                      if (!b1 instanceof Spannable) {
                         b1 = new SpannableString(uoa.b);
                      }else {
                      }
                      float desiredWidth = StaticLayout.getDesiredWidth(b1, textPaint);
                      if (desiredWidth - 0x3f800000 < 0) {
                         desiredWidth = (float)uoa.e;
                      }
                      if (uoa.d != null) {
                         b1.setSpan(new BackgroundColorSpan(uoa.d), i1, b1.length(), 33);
                      }
                      textPaint.setColor(uoa.c);
                      textPaint.setStyle(Paint$Style.FILL);
                      e3$a f = uoa.f;
                      if (f > 0) {
                         textPaint.setShadowLayer(f, uoa.g, uoa.h, uoa.i);
                      }
                      int i6 = i;
                      b = 0;
                      c uoc = c.b(b1, b, b1.length(), textPaint, (int)Math.ceil((double)desiredWidth));
                      uoc.g(true);
                      e3$a j = uoa.j;
                      if (j != null) {
                         i5 = uoa.e + 10;
                         j.setBounds(b, b, i5, i5);
                      }
                      e3 uoe3 = new e3(uoc.a());
                      uoe3.c = uoa.a;
                      uoe3.d = uoa.j;
                      uoe3.e = uoa.k;
                      i2 = matcher2.start() + 0;
                      i5 = matcher2.end() + 0;
                      obj1.setSpan(uoe3, i2, i5, 17);
                      i = i6;
                      b = 1;
                      i1 = 0;
                      matcher = matcher2;
                      continue ;
                   }
                }
                Log.b("TextParser", "end editable: "+p0.toString());
             }else {
                matcher2 = matcher;
                Log.g("TextParser", "not support show near community");
                obj1.replace(matcher2.start(), matcher2.end(), str2);
                goto label_02f8 ;
             }
          }
       }
       if (obj2 instanceof EditText) {
          obj2.setSelection(obj2.getSelectionStart(), obj2.getSelectionEnd());
       }
       obj.i = false;
       return;
    }
    public StringBuilder b(Editable p0,CharSequence p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSTextDisplayHandler.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g(p0, p1, 0, p0.length());
    }
    public List c(Editable p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSTextDisplayHandler.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a(this.b(p0, p1));
    }
    public ArrayList d(){
       Object obj = PatchProxy.apply(null, this, KSTextDisplayHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.v);
    }
    public ArrayList e(){
       ArrayList obj = PatchProxy.apply(null, this, KSTextDisplayHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().d());
       }
       return obj;
    }
    public List f(){
       return this.x;
    }
    public final StringBuilder g(Editable p0,CharSequence p1,int p2,int p3){
       StringBuilder obj;
       int spanStart;
       if (PatchProxy.isSupport(KSTextDisplayHandler.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, KSTextDisplayHandler.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new StringBuilder(p1);
       c0$a[] spans = p0.getSpans(p2, p3, c0$a.class);
       int len = spans.length;
       int i = 0;
       int i1 = 0;
       String str = " ";
       while (i1 < len) {
          object oobject = spans[i1];
          spanStart = p0.getSpanStart(oobject);
          int spanEnd = p0.getSpanEnd(oobject);
          StringBuilder str1 = "";
          int i2 = spanStart;
          while (i2 < spanEnd) {
             if (i2 != spanStart) {
                int i3 = spanEnd - 1;
                if (i2 != i3) {
                   str1 = str1+str;
                label_0058 :
                   i2 = i2 + 1;
                }
             }
             str1 = str1+"\n";
             goto label_0058 ;
          }
          spanStart = spanStart - p2;
          spanEnd = spanEnd - p2;
          obj.replace(spanStart, spanEnd, str1);
          i1 = i1 + 1;
       }
       SourceURLSpan[] spans1 = p0.getSpans(p2, p3, SourceURLSpan.class);
       p3 = spans1.length;
       for (; i < p3; i = i + 1) {
          object oobject1 = spans1[i];
          i1 = p0.getSpanStart(oobject1);
          len = p0.getSpanEnd(oobject1);
          StringBuilder str2 = "";
          spanStart = i1;
          while (spanStart < len) {
             if (spanStart != i1) {
                int i4 = len - 1;
                if (spanStart != i4) {
                   str2 = str2+str;
                label_0092 :
                   spanStart = spanStart + 1;
                }
             }
             str2 = str2+"\n";
             goto label_0092 ;
          }
          i1 = i1 - p2;
          len = len - p2;
          obj.replace(i1, len, str2);
       }
       return obj;
    }
    public boolean h(){
       boolean b = ((this.e & 2) == 2)? true: false;
       return b;
    }
    public boolean i(){
       int i = 1;
       if ((this.e & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean j(){
       boolean b = ((this.e & 4) == 4)? true: false;
       return b;
    }
    public void k(Editable p0,TextView p1,String p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTextDisplayHandler.class, "10")) {
          return;
       }
       int i = 0;
       ImageSpan[] spans = p0.getSpans(i, p0.length(), ImageSpan.class);
       int len = spans.length;
       this = 0;
       while (this < len) {
          object oobject = spans[this];
          int spanStart = p0.getSpanStart(oobject);
          int i1 = p0.length() - 1;
          if (spanStart <= i1 && (p0.getSpanEnd(oobject) > p0.length() || (oobject.getSource() != null && p2.indexOf(oobject.getSource(), spanStart) != p0.getSpanStart(oobject)))) {
             p0.removeSpan(oobject);
          }
          this++;
       }
       SourceURLSpan[] spans1 = p0.getSpans(i, p0.length(), SourceURLSpan.class);
       int len1 = spans1.length;
       len = 0;
       while (len < len1) {
          object this1 = spans1[len];
          if (TextUtils.isEmpty(this1.b) || p1 instanceof EditText) {
             p0.removeSpan(this1);
          }
          len = len + 1;
       }
       if (p1 instanceof EditText) {
          c0$a[] spans2 = p0.getSpans(i, p0.length(), c0$a.class);
          int len2 = spans2.length;
          for (; i < len2; i = i + 1) {
             p0.removeSpan(spans2[i]);
          }
       }
       return;
    }
    public void l(Editable p0,TextView p1,int p2,int p3){
       Matcher matcher;
       int i3;
       String i3;
       KSTextDisplayHandler a;
       int i5;
       KSTextDisplayHandler kSTextDispla = this;
       Editable uEditable = p0;
       int i = p2;
       if (PatchProxy.isSupport(KSTextDisplayHandler.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, KSTextDisplayHandler.class, "9")) {
          return;
       }
       if (kSTextDispla.y != null) {
          kSTextDispla.x.clear();
       }
       if (PatchProxy.isSupport(KSTextDisplayHandler.class)) {
          matcher = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p2), Integer.valueOf(p3), this, KSTextDisplayHandler.class, "13");
          if (matcher != PatchProxyResult.class) {
             try{
                while (matcher.find()) {
                   int i1 = matcher.start() + i;
                   int i2 = matcher.end() + i;
                   if (uEditable.getSpans(i1, i2, c0$a.class).length <= 0) {
                      i1 = matcher.start() + i;
                      i2 = matcher.end() + i;
                      if (uEditable.getSpans(i1, i2, SourceURLSpan.class).length > 0) {
                      }else {
                         i1 = matcher.start() + i;
                         i2 = matcher.end() + i;
                         ReplacementSpan[] spans = uEditable.getSpans(i1, i2, ReplacementSpan.class);
                         if (spans != null && spans.length > 0) {
                            i2 = spans.length;
                            for (i3 = 0; i3 < i2; i3++) {
                               uEditable.removeSpan(spans[i3]);
                               Log.b("KS", "remove span");
                            }
                         }
                         String str = matcher.group();
                         i3 = matcher.group(1);
                         Object String str1 = matcher.group(2);
                         User user = new User(str1, i3, "U", null, null);
                         if (kSTextDispla.s != null && (kSTextDispla.z == null || f.i(v6))) {
                            String str2 = f.d(str1, i3);
                            KSTextDisplayHandler o = kSTextDispla.o;
                            a = (o == null)? kSTextDispla.a: o;
                            if (o == null) {
                               o = kSTextDispla.a;
                            }
                            int i4 = matcher.start() + i;
                            i5 = i + matcher.end();
                            uEditable.setSpan(c0.a(str, str2, a, o), i4, i5, 17);
                            if (kSTextDispla.y != null) {
                               kSTextDispla.x.add(new KSTextDisplayHandler$c(str1, str2, i3));
                            }
                         }else {
                            i5 = matcher.end() + i;
                            i5 = i5 - ("\(O"+str1+"\)").length();
                            i2 = matcher.end() + i;
                            uEditable.setSpan(new d$c(), i5, i2, 33);
                            if (kSTextDispla.y != null) {
                               kSTextDispla.x.add(new KSTextDisplayHandler$c(str1, "", i3));
                            }
                         }
                         String str3 = URLEncoder.encode(a.a.q(v6), "UTF-8");
                         KSTextDisplayHandler i31 = kSTextDispla.d;
                         str1 = null;
                         i3 = (i31 != null)? i31.a(str, v6): str1;
                         i3 = (i3 != null && i3.contains("{user_id}"))? i3.replace("{user_id}", v6.getId()): str1;
                         KSTextDisplayHandler u = kSTextDispla.u;
                         str3 = c.b()+v6.getId()+"?user="+str3;
                         if (kSTextDispla.s != null) {
                            str1 = PatchProxy.applyOneRefs(v6, str1, KSTextDisplayHandler.class, "19");
                            if (str1 != PatchProxyResult.class) {
                            }else {
                               str1 = f.a(v6);
                            }
                         }else {
                            str1 = v6.getName();
                         }
                         KwaiURLSpan kwaiURLSpan = u.b(str3, i3, str1);
                         int str11 = 0x7f0100e5;
                         kwaiURLSpan.c(R.anim.arg_RES_7f010109, str11);
                         kwaiURLSpan.b(str11, R.anim.arg_RES_7f010112);
                         kwaiURLSpan.e(true);
                         i31 = kSTextDispla.o;
                         if (i31 == null) {
                            i31 = kSTextDispla.a;
                         }
                         kwaiURLSpan.d(i31);
                         kwaiURLSpan.n = str;
                         i1 = matcher.start() + i;
                         i3 = matcher.end() + i;
                         uEditable.setSpan(kwaiURLSpan, i1, i3, 17);
                         if (kSTextDispla.q != null) {
                            i2 = matcher.start() + i;
                            i3 = matcher.end() + i;
                            uEditable.setSpan(new StyleSpan(kSTextDispla.q), i2, i3, 33);
                         }
                      }
                   }
                }
             }catch(java.io.UnsupportedEncodingException e0){
                Log.d("@", "UEE: "+e0.getMessage());
             }
             return;
          }
       }
       int i6 = p3 + i;
       matcher = kSTextDispla.w.matcher(kSTextDispla.g(uEditable, uEditable.subSequence(i, i6), i, i6));
       goto label_0063 ;
    }
    public void m(Editable p0,TextView p1,int p2,int p3){
       int i;
       if (PatchProxy.isSupport(KSTextDisplayHandler.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, KSTextDisplayHandler.class, "12")) {
          return;
       }
       h$a uoa = i.g(p0.subSequence(p2, (p3 + p2)).toString());
       while (uoa.b()) {
          i = uoa.d() + p2;
          int i1 = uoa.a() + p2;
          if (p0.getSpans(i, i1, ReplacementSpan.class).length > 0) {
             Log.b("KS", "skip bubble span");
          }else {
             String str = uoa.c();
             Drawable uDrawable = (this.r != null)? l.c(str, p1.getResources()): i.c(str, p1.getResources());
             if (uDrawable != null) {
                TextView textView = this.b.get();
                if (textView != null && uDrawable instanceof y) {
                   z oz = PatchProxy.applyTwoRefs(str, textView, null, KSTextDisplayHandler.class, "18");
                   if (oz != PatchProxyResult.class) {
                   }else {
                      oz = KSTextDisplayHandler.B.get(str);
                      if (oz == null) {
                         oz = new z();
                         KSTextDisplayHandler.B.put(str, oz);
                      }
                      oz.b = new WeakReference(textView);
                   }
                   uDrawable.setCallback(oz);
                }
                i = uoa.d() + p2;
                int i2 = uoa.a() + p2;
                p0.setSpan(new n(uDrawable, str), i, i2, 33);
                Log.b("KS", "add emoji span");
             }
          }
       }
       return;
    }
    public void n(Editable p0,TextView p1,String p2){
       int i1;
       int this;
       Extractor$Entity uEntity1;
       Iterator iterator2;
       int i2;
       String str4;
       int i3;
       CommonMeta uCommonMeta;
       String str5;
       String id;
       String b1;
       String str6;
       String str7;
       Object[] tagItem1;
       String tagItem1;
       KwaiURLSpan tagItem11;
       StyleSpan styleSpan;
       int i6;
       KSTextDisplayHandler tagItem11;
       c0$a uoa;
       KSTextDisplayHandler c;
       int i10;
       KSTextDisplayHandler kSTextDispla = this;
       Editable uEditable = p0;
       String str = p2;
       String str1 = "UTF-8";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTextDisplayHandler.class, "11")) {
          return;
       }
       kSTextDispla.v.clear();
       List list = kSTextDispla.c(uEditable, str);
       KSTextDisplayHandler h = kSTextDispla.h;
       int b = 2;
       Integer integer = 35;
       int i = 1;
       if (h == i) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Extractor$Entity uEntity = iterator.next();
             if (uEntity.a().intValue() < p2.length() && str.charAt(uEntity.a().intValue()) == integer) {
                i1 = uEntity.a().intValue() + i;
                uEditable.replace(uEntity.a().intValue(), i1, " ");
             }
          }
          str = p0.toString();
       }else if(h == b){
          int i7 = 0;
          i6 = 0;
          while (i7 < list.size()) {
             Extractor$Entity uEntity2 = list.get(i7);
             if (uEntity2.a().intValue() < p2.length() && str.charAt(uEntity2.a().intValue()) != integer) {
                b = uEntity2.a().intValue() + i6;
                if (b < p0.length()) {
                   int i8 = uEntity2.b().intValue() + i6;
                   int i9 = uEntity2.a().intValue() + i6;
                   i10 = i9 + 1;
                   uEntity1 = new Extractor$Entity(i8, i10, uEntity2.d(), uEntity2.c());
                   this = uEntity2.a().intValue() + i6;
                   this = this - 1;
                   i10 = uEntity2.a().intValue() + i6;
                   i8 = uEntity2.a().intValue() - 1;
                   uEditable.replace(this, i10, str.charAt(i8)+"#");
                   i6 = i6 + 1;
                label_0157 :
                   if (uEntity1 == null) {
                      this = uEntity2.b().intValue() + i6;
                      i10 = uEntity2.a().intValue() + i6;
                      uEntity1 = new Extractor$Entity(this, i10, uEntity2.d(), uEntity2.c());
                   }
                   list.set(i7, uEntity1);
                   i7 = i7 + 1;
                   integer = 35;
                   Extractor$Entity$Type uEntity$Type = 1;
                }
             }else if(uEntity2.a().intValue() == p2.length()){
                b = 1;
                this = uEntity2.a().intValue() - b;
                if (str.charAt(this) != '#') {
                   uEditable.append("#");
                   i10 = uEntity2.b().intValue() + i6;
                   i = uEntity2.a().intValue() + i6;
                   i = i + b;
                   uEntity1 = new Extractor$Entity(i10, i, uEntity2.d(), uEntity2.c());
                   goto label_0157 ;
                }
             }
             uEntity1 = null;
             goto label_0157 ;
          }
          if (i6 > 0) {
             str = p0.toString();
          }
       }
       String str2 = str;
       Iterator iterator1 = list.iterator();
       String str3 = null;
       this = 0;
       while (iterator1.hasNext()) {
          uEntity1 = iterator1.next();
          this = uEntity1.a().intValue();
          if (uEditable.getSpans(uEntity1.b().intValue(), uEntity1.a().intValue(), c0$a.class).length > 0 || uEditable.getSpans(uEntity1.b().intValue(), uEntity1.a().intValue(), SourceURLSpan.class).length > 0) {
             iterator2 = iterator1;
             i2 = this;
             str4 = str1;
             i3 = 0;
          }else {
             str3 = uEntity1.d();
             KSTextDisplayHandler l = kSTextDispla.l;
             if (l != null) {
                uCommonMeta = l.a(CommonMeta.class);
                str5 = TextUtils.k(uCommonMeta.mListLoadSequenceID);
                id = kSTextDispla.l.getId();
                uCommonMeta = uCommonMeta.mExpTag;
             }else {
                String str8 = "";
                str5 = str8;
                id = str5;
             }
             b1 = b.b;
             iterator2 = iterator1;
             Object[] objArray = new Object[]{URLEncoder.encode(str6, str1),Boolean.TRUE,str5,String.valueOf(kSTextDispla.m),id,uCommonMeta};
             str6 = (str3.trim()).replace("#", "");
             i2 = this;
             str = String.format(b1, objArray);
             if (kSTextDispla.k != null) {
                TagItem tagItem = new TagItem();
                str7 = str;
                tagItem.mTag = (str3.trim()).replace("#", "");
                int i4 = kSTextDispla.k.indexOf(tagItem);
                if (i4 != -1) {
                   tagItem1 = new Object[]{URLEncoder.encode(str6, str1),Boolean.valueOf(kSTextDispla.k.get(i4).mRich),str5,String.valueOf(kSTextDispla.m),id,uCommonMeta};
                   str6 = (str3.trim()).replace("#", "");
                   str4 = str1;
                   tagItem1 = String.format(b1, tagItem1);
                label_029f :
                   if (kSTextDispla.f != null) {
                      tagItem11 = kSTextDispla.u.a(tagItem1, str3);
                      tagItem11.l = new e2(kSTextDispla, str6, str3);
                      tagItem11.e(true);
                      tagItem11.d(kSTextDispla.n);
                      if (kSTextDispla.p != null) {
                         styleSpan = new StyleSpan(kSTextDispla.p);
                      label_02d1 :
                         tagItem11.c(R.anim.arg_RES_7f010109, 0x7f0100e5);
                         tagItem11.b(R.anim.arg_RES_7f0100e5, 0x7f010112);
                         int i5 = uEntity1.b().intValue();
                         if (uEntity1.a().intValue() < str2.length()) {
                            if (str2.charAt(uEntity1.a().intValue()) == '#') {
                               i6 = uEntity1.a().intValue() + 1;
                            label_031b :
                               uEditable.setSpan(tagItem11, i5, i6, 17);
                               if (styleSpan != null) {
                                  uEditable.setSpan(styleSpan, i5, i6, 33);
                               }
                               kSTextDispla.v.add(uEntity1);
                               Log.b("KS", "add bubble span");
                               tagItem11 = kSTextDispla.c;
                               if (tagItem11 != null) {
                                  tagItem11.c(str3);
                               }
                            }
                         }else {
                            uoa = 35;
                         }
                         i6 = uEntity1.a().intValue();
                         goto label_031b ;
                      }
                   }else {
                      KSTextDisplayHandler$1 u1 = new KSTextDisplayHandler$1(kSTextDispla, tagItem1, str3);
                      u1.d(kSTextDispla.n);
                      tagItem11 = u1;
                   }
                   styleSpan = null;
                   goto label_02d1 ;
                }
             }else {
                str7 = str;
             }
             str4 = str1;
             tagItem1 = str7;
             goto label_029f ;
          }
          iterator1 = iterator2;
          str1 = str4;
          this = i2;
       }
       i3 = 0;
       if (p1 instanceof EditText) {
          if (str3 == null) {
             if (str2.endsWith("#")) {
             label_03b4 :
                str3 = "#";
             label_03c3 :
                str5 = str3;
                b1 = 0;
             label_03c8 :
                Matcher matcher = KSTextDisplayHandler.A.matcher(str2);
                if (b1 && matcher.find()) {
                   str5 = (matcher.group()).replace("#", "");
                   uoa = 0;
                }else {
                   i1 = b1;
                }
             }else {
                uEntity1 = 1;
             }
          }else if(str2.endsWith("#")){
             if (this < (str2.length() - 1)) {
                goto label_03b4 ;
             }
          }else {
             uEntity1 = 1;
          }
          if (!str2.endsWith("#") && this == str2.length()) {
             goto label_03c3 ;
          }
          str5 = null;
          b1 = 1;
          goto label_03c8 ;
       }else {
          str5 = null;
          uoa = 1;
       }
       if (uoa) {
          c = kSTextDispla.c;
          if (c != null) {
             c.b(uEditable);
          }
       }else {
          c = kSTextDispla.c;
          if (c != null) {
             c.a(uEditable, str5);
          }
       }
       return;
    }
    public KSTextDisplayHandler o(int p0){
       ArrayList obj;
       InputFilter[] filters;
       int len;
       object oobject;
       KSTextDisplayHandler kSTextDispla = KSTextDisplayHandler.class;
       if (PatchProxy.isSupport(kSTextDispla)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kSTextDispla, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e = p0;
       kSTextDispla = this.t;
       int i = 8;
       int i1 = 0;
       boolean b = ((p0 & i) == i)? true: false;
       kSTextDispla.b = b;
       TextView textView = this.b.get();
       if (this.j() && (textView != null && this.j == null)) {
          obj = new ArrayList();
          if (textView.getFilters() != null) {
             filters = textView.getFilters();
             len = filters.length;
             while (i1 < len) {
                oobject = filters[i1];
                if (oobject != null) {
                   obj.add(oobject);
                }
                i1 = i1 + 1;
             }
          }
          EmojiEditText$f uof = new EmojiEditText$f();
          this.j = uof;
          obj.add(uof);
          filters = new InputFilter[obj.size()];
          obj.toArray(filters);
          textView.setFilters(filters);
       }else if(textView != null && this.j != null){
          obj = new ArrayList();
          if (textView.getFilters() != null) {
             filters = textView.getFilters();
             len = filters.length;
             while (i1 < len) {
                oobject = filters[i1];
                if (oobject != null) {
                   obj.add(oobject);
                }
                i1 = i1 + 1;
             }
          }
          obj.remove(this.j);
          filters = new InputFilter[obj.size()];
          obj.toArray(filters);
          textView.setFilters(filters);
       }
       return this;
    }
    public KSTextDisplayHandler p(boolean p0){
       this.s = p0;
       return this;
    }
    public KSTextDisplayHandler q(int p0){
       this.n = p0;
       return this;
    }
    public KSTextDisplayHandler r(boolean p0){
       this.z = p0;
       return this;
    }
    public KSTextDisplayHandler s(int p0){
       this.o = p0;
       return this;
    }
}
