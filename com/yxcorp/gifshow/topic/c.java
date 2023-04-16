package com.yxcorp.gifshow.topic.c;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import cya.c;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import wp.a;
import com.yxcorp.gifshow.topic.c$a;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import com.yxcorp.gifshow.util.ColorURLSpan;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.topic.c$b;
import java.lang.Integer;
import android.graphics.Rect;
import pkc.a;
import android.view.View$OnClickListener;

public class c	// class@001da5
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public List e;
    public c$a f;
    public final Pattern g;

    public void c(){
       super();
       this.e = Lists.b();
       String str = c.a.getString("nearbyCommunityCaptionParserRegex", "");
       this.g = (!TextUtils.isEmpty(str))? Pattern.compile(str): Pattern.compile("\\$\\$\\{\(\\d+[-\\|\\w+?]+\)\\}\(\\w+?\)\\$\\$");
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       if (!q.f(this.e)) {
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.a == null) {
                continue ;
             }else {
                c tf = this.f;
                if (tf != null) {
                   tf.a(uoa);
                }
             }
          }
       }
       return;
    }
    public c b(int p0){
       this.d = p0;
       return this;
    }
    public c c(int p0){
       this.b = p0;
       return this;
    }
    public c d(boolean p0){
       this.a = p0;
       return this;
    }
    public c e(c$a p0){
       this.f = p0;
       return this;
    }
    public void f(SpannableStringBuilder p0){
       Object obj = this;
       SpannableStringBuilder spannableStr = p0;
       if (PatchProxy.applyVoidOneRefs(spannableStr, obj, c.class, "2")) {
          return;
       }
       Matcher matcher = obj.g.matcher(spannableStr);
       obj.e.clear();
       while (matcher.find()) {
          if (spannableStr.getSpans(matcher.start(), matcher.end(), ColorURLSpan.class).length > 0) {
             continue ;
          }else {
             String str = "";
             if (obj.a != null) {
                a uoa = new a();
                int i = 1;
                String str1 = matcher.group(i);
                String str2 = matcher.group(2);
                String str3 = "S";
                String str4 = str3+str2;
                object oobject = str1.split("\\|")[i];
                uoa.mName = str2;
                uoa.mId = oobject;
                String str5 = "1";
                uoa.a = str5.equals(str1.split("\\|")[0]);
                obj.e.add(uoa);
                if (uoa.a != null) {
                   spannableStr.replace(matcher.start(), matcher.end(), str4);
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   Object[] objArray = null;
                   Object[] objArray1 = PatchProxy.apply(objArray, obj, c.class, "3");
                   if (objArray1 != patchProxyRe) {
                   }else {
                      c d = obj.d;
                      if (d > null) {
                         c$b uob = new c$b(a1.f(d), str3);
                         int i4 = a1.e(18.00f);
                         int i5 = a1.e(18.00f);
                         if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyTwoRefs(Integer.valueOf(i4), Integer.valueOf(i5), uob, c$b.class, str5) != patchProxyRe) {
                         }else {
                            boolean b = false;
                            uob.b = b;
                            uob.c = new Rect(b, b, i4, i5);
                         }
                         uob.f = a1.e(0x3f800000);
                         objArray = uob;
                      }
                      objArray1 = objArray;
                   }
                   i = matcher.start() + 1;
                   int i1 = 17;
                   spannableStr.setSpan(objArray1, matcher.start(), i, i1);
                   Object[] objArray2 = new Object[]{oobject};
                   ColorURLSpan uColorURLSpa = new ColorURLSpan(String.format("kwai://local/topic/detail?communityId=%s&tabIndex=0&showGuide=1", objArray2), str2);
                   int i2 = 0x7f0100e5;
                   uColorURLSpa.d(R.anim.arg_RES_7f010109, i2);
                   uColorURLSpa.c(i2, R.anim.arg_RES_7f010112);
                   uColorURLSpa.g(obj.b);
                   uColorURLSpa.l(obj.c);
                   uColorURLSpa.i(new a(obj, uoa));
                   uColorURLSpa.m(true);
                   int i3 = matcher.start() + str4.length();
                   spannableStr.setSpan(uColorURLSpa, matcher.start(), i3, i1);
                }else {
                   spannableStr = spannableStr.replace(matcher.start(), matcher.end(), str);
                }
             }else {
                spannableStr = spannableStr.replace(matcher.start(), matcher.end(), str);
             }
             matcher = obj.g.matcher(spannableStr);
          }
       }
       return;
    }
}
