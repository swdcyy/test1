package com.yxcorp.gifshow.widget.d;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.List;
import lnc.c0$a;
import android.text.style.ImageSpan;
import com.yxcorp.gifshow.util.ColorURLSpan;
import androidx.emoji.text.EmojiSpan;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import lu7.f;
import lnc.c0;
import java.lang.StringBuilder;
import java.util.Map;
import com.kuaishou.android.model.mix.AtUserItem;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$TYPE;
import nsd.u;
import com.yxcorp.gifshow.widget.d$c;
import wh5.c;
import org.json.JSONObject;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONException;
import java.net.URLEncoder;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler$a;
import rkd.b;
import com.yxcorp.utility.TextUtils;
import tyc.h;
import android.view.View$OnClickListener;
import tyc.i;
import android.view.View$OnLongClickListener;
import tyc.j;
import java.lang.Integer;
import android.text.style.StyleSpan;
import java.io.UnsupportedEncodingException;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.widget.d$a;

public class d	// class@00196f
{
    public int a;
    public int b;
    public KSTextDisplayHandler$a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public QComment g;
    public int h;
    public final List i;
    public Map j;
    public d$a k;
    public d$b l;
    public View$OnClickListener m;
    public static final Pattern n;

    static {
       d.n = Pattern.compile("\(@[^@]+?\)\\\(O\(\\d+\)\\\)");
    }
    public void d(){
       super();
       this.f = true;
       this.h = 0;
       this.i = new ArrayList();
       this.j = new HashMap();
    }
    public void a(Spannable p0){
       int len;
       int i;
       d a;
       c0$a uoa1;
       JSONObject jSONObject;
       d c;
       AtUserItem uAtUserItem;
       AtUserItem currentLivin;
       int i3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d.class, "1")) {
          return;
       }
       Matcher matcher = d.n.matcher(obj1);
       obj.i.clear();
       try{
          while (matcher.find()) {
             if (obj1.getSpans(matcher.start(), matcher.end(), c0$a.class).length > 0) {
                continue ;
             }else {
                ImageSpan[] spans = obj1.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
                if (spans != null && spans.length > 0) {
                   len = spans.length;
                   for (i = 0; i < len; i = i + 1) {
                      obj1.removeSpan(spans[i]);
                   }
                }
                ColorURLSpan[] spans1 = obj1.getSpans(matcher.start(), matcher.end(), ColorURLSpan.class);
                if (spans1 != null && spans1.length > 0) {
                   len = spans1.length;
                   for (i = 0; i < len; i = i + 1) {
                      obj1.removeSpan(spans1[i]);
                   }
                }
                EmojiSpan[] spans2 = obj1.getSpans(matcher.start(), matcher.end(), EmojiSpan.class);
                if (spans2 != null && spans2.length > 0) {
                   len = spans2.length;
                   for (i = 0; i < len; i = i + 1) {
                      obj1.removeSpan(spans2[i]);
                   }
                }
                String str = matcher.group();
                i = 1;
                String str1 = matcher.group(i);
                String str2 = matcher.group(2);
                User user = new User(str2, str1, "U", null, null);
                obj.i.add(v6);
                int i1 = 17;
                String str3 = null;
                if (obj.d != null && f.i(v6)) {
                   str1 = f.d(str2, str1);
                   a = obj.a;
                   if (a == null) {
                      a = ColorURLSpan.u;
                   }
                   c0$a uoa = c0.a(str, str1, a, obj.b);
                   obj1.setSpan(uoa, matcher.start(), matcher.end(), i1);
                   uoa1 = uoa;
                }else {
                   str1 = "\(O"+str2+"\)";
                   if (obj.e != null) {
                      uAtUserItem = obj.j.get(v6.getId());
                      AtUserItem uAtUserItem1 = (uAtUserItem != null)? uAtUserItem.isCurrentLiving: false;
                      RoundIconTagSpan roundIconTag = new RoundIconTagSpan(RoundIconTagSpan$TYPE.AT, uAtUserItem1, 0, 0, 0, false, 0, false, false, 0, 0, 0, 0, false, false, 0, 0, 0x1fffc, null);
                      i3 = matcher.end() - str1.length();
                      obj1.setSpan(v2, matcher.start(), i3, 33);
                   }
                   int i4 = matcher.end() - str1.length();
                   obj1.setSpan(new d$c(), i4, matcher.end(), 33);
                   uoa1 = str3;
                }
                if (!c.f()) {
                   continue ;
                }else {
                   try{
                      jSONObject = new JSONObject(a.a.q(v6));
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                      jSONObject = str3;
                   }
                   str1 = (jSONObject != null)? jSONObject.toString(): "";
                   str1 = URLEncoder.encode(str1, "UTF-8");
                   c = obj.c;
                   str = (c != null)? c.a(str, v6): str3;
                   if (str != null && str.contains("{user_id}")) {
                      str3 = str.replace("{user_id}", v6.getId());
                   }
                   str = (obj.d != null)? f.a(v6): v6.getName();
                   StringBuilder str4 = "";
                   String str5 = (b.g())? "ks://profileTablet/": "ks://profile/";
                   str1 = str4+str5+v6.getId()+"?user="+str1;
                   if (obj.e != null) {
                      uAtUserItem = obj.j.get(v6.getId());
                      if (uAtUserItem != null && (uAtUserItem.isCurrentLiving != null && !TextUtils.x(uAtUserItem.currentLivingUrl))) {
                         currentLivin = uAtUserItem.currentLivingUrl;
                      }
                   }
                   ColorURLSpan uColorURLSpa = new ColorURLSpan(currentLivin, str3, str);
                   int i2 = 0x7f0100e5;
                   uColorURLSpa.d(R.anim.arg_RES_7f010109, i2);
                   uColorURLSpa.c(i2, R.anim.arg_RES_7f010112);
                   uColorURLSpa.m(i);
                   uColorURLSpa.g(obj.a);
                   uColorURLSpa.l(obj.b);
                   uColorURLSpa.h(str2);
                   uColorURLSpa.f(obj.f);
                   d g = obj.g;
                   if (g != null) {
                      uColorURLSpa.l = g;
                   }
                   uColorURLSpa.i(new h(obj, uoa1, uColorURLSpa, v6));
                   if (obj.l != null) {
                      uColorURLSpa.j(new i(obj, str));
                   }
                   obj1.setSpan(uColorURLSpa, matcher.start(), matcher.end(), i1);
                   g = obj.h;
                   i2 = matcher.start();
                   i3 = matcher.end();
                   if (PatchProxy.isSupport(j.class) && (!PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(g), Integer.valueOf(i2), Integer.valueOf(i3), null, j.class, "1") && g != null)) {
                      obj1.setSpan(new StyleSpan(g), i2, i3, 33);
                   }
                }
             }
          }
       }catch(java.io.UnsupportedEncodingException e0){
          Log.d("@", "UEE: "+e0.getMessage());
       }
       return;
    }
    public d b(KSTextDisplayHandler$a p0){
       this.c = p0;
       return this;
    }
    public d c(d$a p0){
       this.k = p0;
       return this;
    }
    public void d(boolean p0){
       this.f = p0;
    }
    public d e(boolean p0){
       this.d = p0;
       return this;
    }
    public d f(int p0){
       this.a = p0;
       return this;
    }
    public d g(int p0){
       this.b = p0;
       return this;
    }
    public d h(int p0){
       this.h = p0;
       return this;
    }
}
