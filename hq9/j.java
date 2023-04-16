package hq9.j;
import com.gifshow.twitter.widget.Extractor;
import hq9.j$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import uq9.f;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import gq9.a;
import uq9.n;
import fm5.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.corona.model.CoronaTvFilm;
import ul5.c;
import com.yxcorp.utility.TextUtils;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import lnc.a1;
import uq9.m;
import java.lang.Integer;
import tl5.b;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import cq9.a;
import q87.c;

public class j	// class@00270c
{
    public final String a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final CharacterStyle i;
    public final int j;
    public final int k;
    public final boolean l;
    public static Extractor m;

    static {
       j.m = new Extractor();
    }
    public void j(j$a p0){
       super();
       this.a = p0.a;
       this.e = p0.e;
       this.b = p0.b;
       this.d = p0.c;
       this.c = p0.d;
       this.l = p0.k;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.k = p0.l;
       this.j = p0.j;
    }
    public static String b(String p0){
       String str1;
       Pair obj = PatchProxy.applyOneRefs(p0, null, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.d(p0).first;
       Pair second = f.d(p0).second;
       String str = "@";
       if (!obj.contains(str)) {
          if (obj.isEmpty()) {
             str1 = "#"+second;
          }
          return obj;
       }else {
          str1 = obj.replace(str, "#");
          Pair first = f.d(str1).first;
          obj = f.d(str1).second;
          if (!first.isEmpty()) {
             return first;
          }
          second = (!second.isEmpty())? "#"+second: str+obj;
          return second;
       }
    }
    public static String e(QPhoto p0,boolean p1){
       String obj1;
       String str1;
       String str2;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] obj = null;
       if (PatchProxy.isSupport(oj)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, oj, "11");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (a.j(p0)) {
          return n.c(p0);
       }else if(PatchProxy.isSupport(oj)){
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, oj, "12");
          if (obj1 != patchProxyRe) {
          }else {
          label_003b :
             String str = "";
             if (!a.A(p0) && (!f.v(p0) && (f.l(p0) || f.m(p0)))) {
                CoronaTvFilm obj2 = PatchProxy.applyOneRefs(p0, obj, oj, "13");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = PatchProxy.applyOneRefs(p0, obj, a.class, "22");
                   obj1 = 2;
                   if (obj2 != patchProxyRe) {
                   }else if(p0 != null){
                      obj2 = a.l(p0);
                      str1 = a.b(p0);
                      if (TextUtils.x(obj2)) {
                         obj2 = str1;
                      }else if(TextUtils.x(str1)){
                         Object[] objArray2 = new Object[obj1];
                         objArray2[0] = obj2;
                         objArray2[1] = str1;
                         obj2 = String.format("%s %s", Arrays.copyOf(objArray2, obj1));
                         a.o(obj2, "java.lang.String.format\(format, *args\)");
                      }
                   }else {
                      obj2 = str;
                   }
                   str1 = a.a(p0);
                   if (f.l(p0) || f.m(p0)) {
                      obj2 = PatchProxy.applyOneRefs(p0, obj, m.class, "3");
                      if (obj2 != patchProxyRe) {
                      }else {
                         a.p(p0, "photo");
                         obj2 = c.g(p0.getEntity());
                         if (obj2 != null) {
                            obj2 = obj2.mName;
                            if (obj2 != null) {
                               str = obj2;
                            }
                         }
                         obj2 = str;
                      }
                      obj = new Object[]{Integer.valueOf(m.j(p0))};
                      str2 = String.format(a1.p(R.string.arg_RES_7f104672), obj);
                   }else if(f.v(p0)){
                      Object[] objArray1 = new Object[]{Integer.valueOf(m.u(p0))};
                      obj2 = String.format(a1.p(R.string.arg_RES_7f104672), objArray1);
                      str2 = m.t(p0);
                   }else {
                      str2 = str1;
                   }
                   if (TextUtils.x(obj2)) {
                      obj2 = str2;
                   }else if(TextUtils.x(str2)){
                      if (f.l(p0) || f.m(p0)) {
                         objArray = new Object[obj1];
                         objArray[0] = obj2;
                         objArray[1] = str2;
                         obj2 = String.format("%s %s", objArray);
                      }else {
                         objArray = new Object[obj1];
                         objArray[0] = obj2;
                         objArray[1] = str2;
                         obj2 = String.format("%s | %s", objArray);
                      }
                   }
                }
                obj1 = j.b(obj2);
             }else {
                CoronaTvFilm uCoronaTvFil = c.g(p0.mEntity);
                if (f.t(p0) || (f.s(p0) && uCoronaTvFil != null)) {
                   uCoronaTvFil = uCoronaTvFil.mName;
                   if (!TextUtils.x(uCoronaTvFil)) {
                      obj1 = j.b(uCoronaTvFil);
                   }
                }
                String str3 = n.e(p0);
                if (!TextUtils.x(str3)) {
                   obj1 = j.b(str3);
                }else {
                   f uof = f.class;
                   if (PatchProxy.isSupport(uof)) {
                      str3 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, uof, "1");
                      if (str3 != patchProxyRe) {
                      label_00a7 :
                         if (!TextUtils.x(str3)) {
                            obj1 = j.b(str3);
                         }else {
                            obj1 = "...";
                         }
                      }
                   }
                   str3 = f.b(p0.getCaption(), p1, str);
                   goto label_00a7 ;
                }
             }
          }
       }else {
          goto label_003b ;
       }
       return obj1;
    }
    public static String g(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, null, j.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       p0 = f.b(p0, false, "");
       obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != patchProxyRe) {
       }else {
          obj = b.c(p0);
       }
       p0 = "|";
       if (obj.contains(p0) && (obj.trim()).endsWith(p0)) {
          obj = (obj.replace(p0, "")).trim();
       }else {
          p0 = "£ü";
          if (obj.contains(p0) && (obj.trim()).endsWith(p0)) {
             obj = (obj.replace(p0, "")).trim();
          }
       }
       return obj;
    }
    public final SpannableStringBuilder a(String p0){
       SpannableStringBuilder obj = PatchProxy.applyOneRefs(p0, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       if (!TextUtils.x(p0) && this.i != null) {
          obj.append("¡¡");
          obj.append(p0);
          obj.setSpan(this.i, 0, 1, 33);
       }else {
          obj.append(p0);
       }
       return obj;
    }
    public final SpannableStringBuilder c(SpannableStringBuilder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = n.f(this.c, this.b, p0);
       while (i > this.d) {
          i = (p0.toString()).indexOf("...");
          int i1 = i - 1;
          if (i1 <= 0) {
             break ;
          }else {
             p0 = p0.replace(i1, i, "");
             i = n.f(this.c, this.b, p0);
          }
       }
       return p0;
    }
    public final String d(){
       String obj = PatchProxy.apply(null, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.h))? "¡¡": " "+this.h;
       return obj;
    }
    public CharSequence f(){
       StringBuilder str1;
       j e;
       SpannableStringBuilder spannableStr;
       int i1;
       Object obj = this;
       j oj = j.class;
       Object[] objArray = null;
       j obj1 = PatchProxy.apply(objArray, obj, oj, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("CoronaCommonTitleHandler", "---------handleFeedTitleByOldRule: mTitleType\(0 normal 3 serial\) "+obj.k, objArray1);
       obj1 = obj.k;
       String str = "...";
       if (obj1 == null) {
          str1 = PatchProxy.apply(objArray, obj, oj, "10");
          if (str1 != PatchProxyResult.class) {
          }else {
             boolean b = n.a(obj.a);
             if (obj.l == null || !b) {
                str = obj.a;
             }
             boolean b1 = TextUtils.x(obj.f);
             if (TextUtils.x(obj.e) && b1) {
                str1 = str;
             }else if(b1){
                e = obj.e;
             }else {
                e = obj.f;
             }
             if (n.f(obj.c, obj.b, e) != obj.d) {
                if (e.endsWith("\n")) {
                   if (!b) {
                      str1 = e+str;
                   }
                }else if(b){
                   str1 = e+"\n"+str;
                }
             }
             str1 = e;
          }
          return j.b(str1.toString());
       }else {
          String str2 = "";
          if (obj1 == 1) {
             Object obj2 = PatchProxy.apply(objArray, obj, oj, "3");
             if (obj2 != PatchProxyResult.class) {
                str2 = obj2;
             }else {
                e = obj.c;
                if (e != null && obj.d != null) {
                   int i = e - obj.j;
                   String str3 = this.d();
                   String str4 = (TextUtils.x(obj.f))? str: (obj.f).replace("\n", str2);
                   if (obj.d > 1 && n.f(obj.c, obj.b, str4+str3) <= obj.d) {
                      if (PatchProxy.isSupport(oj)) {
                         spannableStr = PatchProxy.applyThreeRefs(str4, str3, Integer.valueOf(i), this, j.class, "6");
                         if (spannableStr != PatchProxyResult.class) {
                         label_0120 :
                            str2 = spannableStr;
                         }
                      }
                      str1 = str4+str3;
                      i1 = n.f(i, obj.b, str1);
                      StringBuilder str5 = "";
                      while (i1 > 1) {
                         i1 = str1.length() - 1;
                         str5.insert(0, str1.substring(i1));
                         i1 = str1.length() - 1;
                         str1 = str1.substring(0, i1);
                         i1 = n.f(i, obj.b, str1);
                      }
                      i1 = n.f(obj.c, obj.b, str5);
                      int i2 = obj.d - 1;
                      if (i1 > i2) {
                         i2 = str5.lastIndexOf(str3);
                         str5.replace((i2 - 1), i2, str);
                      }
                      i2 = obj.d - 1;
                      while (i1 > i2) {
                         i1 = str5.lastIndexOf(str);
                         i2 = i1 - 1;
                         str5.replace(i2, i1, str2);
                         i1 = n.f(obj.c, obj.b, str5);
                      }
                      spannableStr = obj.c(obj.a(str1+"\n"+str5));
                      goto label_0120 ;
                   }else if(obj.d == 1){
                      i = obj.c;
                   }
                   if (PatchProxy.isSupport(oj)) {
                      str1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), str4, obj, oj, "4");
                      if (str1 != PatchProxyResult.class) {
                      label_021d :
                         str2 = obj.a(str1+str3);
                         if (obj.d != 1) {
                            str2 = obj.c(str2);
                         }
                      }
                   }
                   str1 = this.d();
                   i1 = n.f(i, obj.b, str4+str1);
                   if (i1 > obj.d) {
                      while (i1 > obj.d) {
                         i1 = str4.length() - 1;
                         if (i1 <= 0) {
                            break ;
                         }
                         i1 = str4.length() - 1;
                         str4 = str4.substring(0, i1);
                         i1 = n.f(i, obj.b, str4+str+str1);
                      }
                      str4 = str4+str;
                   }
                   str1 = str4;
                   goto label_021d ;
                }
             }
             return j.b(str2.toString());
          }else if(obj1 == 3){
             str1 = PatchProxy.apply(objArray, obj, oj, "2");
             if (str1 != PatchProxyResult.class) {
             }else {
                str1 = "";
                if (!TextUtils.x(obj.g)) {
                   str1 = str1+obj.g;
                }
                if (!TextUtils.x(obj.f)) {
                   str1 = str1+obj.f;
                }else if(!TextUtils.x(obj.e)){
                   str1 = str1+obj.e;
                }else if(!TextUtils.x(obj.a)){
                   str1 = str1+obj.a;
                }else if(TextUtils.x(obj.h) && (!TextUtils.x(obj.g) && (obj.g).contains(" | "))){
                   str1 = (str1).replace(" | ", str2);
                }else {
                   str1 = str1+str;
                }
                if (!TextUtils.x(obj.h)) {
                   str1 = str1+" "+obj.h;
                }
                str1 = str1;
             }
             return str1;
          }else {
             return str2;
          }
       }
    }
}
