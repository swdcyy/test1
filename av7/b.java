package av7.b;
import android.app.Application;
import o56.a;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import av7.a;
import java.util.Comparator;
import java.util.Collections;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Integer;
import android.text.SpannableString;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.n0;
import android.text.style.ForegroundColorSpan;
import lnc.a1;
import ekd.f0;
import java.util.Iterator;
import ekd.f0$a;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import lu7.f;
import k75.b;

public final class b	// class@00037f
{
    public static final String a;
    public static final String b;

    static {
       b.a = a.b().getString(0x7f10460d);
       b.b = a.b().getString(0x7f101078);
    }
    public void b(){
       super();
    }
    public static List a(List p0,List p1,HashMap p2,ArrayList p3,boolean p4){
       Object[] objArray;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       int i = 5;
       int i1 = 4;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[i1] = Boolean.valueOf(p4);
          Object obj = PatchProxy.apply(objArray, null, uob, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{p0,p1,null,p2,p3,Boolean.valueOf(p4)};
          Object obj1 = PatchProxy.apply(objArray, null, uob, "2");
          if (obj1 != patchProxyRe) {
             p0 = obj1;
          }else {
          label_0052 :
             p2.clear();
             if (!q.f(p0) || !q.f(p1)) {
                if (!q.f(p0)) {
                   Collections.sort(p0, a.b);
                   ContactTargetItem uContactTarg = p0.get(0);
                   b = (!q.f(p1) || !q.f(null))? true: false;
                   uContactTarg.mShowTitle = b;
                }
                if (!q.f(null)) {
                   p0.addAll(0, null);
                }
                if (!q.f(p1)) {
                   p0.addAll(0, p1);
                }
                p2.put(p0.get(0).mFirstLetter, Integer.valueOf(0));
                if (p3 != null && p3.contains(p0.get(0).mId)) {
                   p1.mDisableSelected = true;
                }
                int i2 = p0.size();
                int i3 = 1;
                while (i3 < i2) {
                   if (p3 != null && p3.contains(p0.get(i3).mId)) {
                      p0.get(i3).mDisableSelected = true;
                   }
                   int i4 = i3 - 1;
                   if (!(p0.get(i3).mFirstLetter).equals(p0.get(i4).mFirstLetter)) {
                      if (p4) {
                         p0.get(i4).mLastItem = true;
                         p0.get(i3).mShowLetter = true;
                      }else {
                         p0.get(i4).mLastItem = false;
                         p0.get(i3).mShowLetter = false;
                      }
                      p2.put(p0.get(i3).mFirstLetter, Integer.valueOf(i3));
                   }else {
                      p0.get(i3).mShowLetter = false;
                      p0.get(i4).mLastItem = false;
                   }
                   i3 = i3 + 1;
                }
                i2.mLastItem = true;
                i2.mShowLetter = p4;
             }
          }
       }else {
          goto label_0052 ;
       }
       return p0;
    }
    public static SpannableString b(String p0,String p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       StringBuilder obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "7");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          obj1 = n0.d(p1);
          String str = n0.d(p0);
          if (obj1.contains(str)) {
             SpannableString spannableStr = new SpannableString(p1);
             i = obj1.indexOf(str);
             spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f061e92)), i, (p0.length() + i), 33);
             return spannableStr;
          }else if((f0.d(p1)).contains(str)){
             SpannableString spannableStr1 = PatchProxy.applyTwoRefs(p1, str, obj, uob, "8");
             if (spannableStr1 != patchProxyRe) {
             }else {
                spannableStr1 = new SpannableString(p1);
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = f0.c().b(p1).iterator();
                while (iterator.hasNext()) {
                   f0$a uoa = iterator.next();
                   if (uoa.a == 2) {
                      uArrayList.add(n0.d(uoa.c));
                   }else {
                      uArrayList.add(n0.d(uoa.b));
                   }
                }
                i = uArrayList.size();
                int i1 = 0;
                int i2 = 0;
                while (true) {
                   if (i2 < i) {
                      obj1 = "";
                      for (int i3 = i2; i3 < i; i3 = i3 + 1) {
                         obj1 = obj1+uArrayList.get(i3);
                      }
                      if ((obj1).startsWith(str)) {
                         int i4 = i2;
                         i3 = 0;
                         while (i4 < i) {
                            i3 = i3 + (uArrayList.get(i4)).length();
                            if (i3 >= str.length()) {
                               i1 = i4 + 1;
                               break ;
                            }
                            i4 = i4 + 1;
                         }
                         i = i1;
                         i1 = i2;
                      label_00e3 :
                         spannableStr1.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f061e92)), i1, i, 33);
                      }else {
                         i2 = i2 + 1;
                      }
                   }else {
                      i = 0;
                      goto label_00e3 ;
                   }
                }
             }
             return spannableStr1;
          }
       }
       return obj;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length()) {
          p0 = p0.toUpperCase();
          char c = p0.charAt(0);
          if (c >= 'A' && c <= 'Z') {
             return p0;
          }
       }
       return "#";
    }
    public static ContactTargetItem d(User p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       ContactTargetItem obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.FALSE, obj, uob, "4");
          if (obj != patchProxyRe) {
          }else if(PatchProxy.isSupport(uob)){
             Boolean fALSE = Boolean.FALSE;
             Object obj2 = PatchProxy.applyThreeRefs(p0, fALSE, fALSE, null, b.class, "5");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }
          }
          ContactTargetItem uContactTarg = new ContactTargetItem();
          uContactTarg.mId = p0.getId();
          uContactTarg.mType = 0;
          uContactTarg.mUser = p0;
          uContactTarg.mRelationType = p0.mRelation;
          obj1 = "";
          String str = (TextUtils.x(f.a(p0)))? obj1: n0.d((f.a(p0)).trim());
          uContactTarg.mAliasName = str;
          if (!TextUtils.x(p0.getName())) {
             obj1 = n0.d((p0.getName()).trim());
          }
          uContactTarg.mName = obj1;
          uContactTarg.mAliasNamePinyin = b.a(uContactTarg.mAliasName);
          uContactTarg.mNamePinyin = b.a(uContactTarg.mName);
          int i = 1;
          if (!TextUtils.x(uContactTarg.mAliasNamePinyin)) {
             uContactTarg.mFirstLetter = b.c((uContactTarg.mAliasNamePinyin).substring(0, i));
          }else if(!TextUtils.x(uContactTarg.mNamePinyin)){
             uContactTarg.mFirstLetter = b.c((uContactTarg.mNamePinyin).substring(0, i));
          }else {
             uContactTarg.mFirstLetter = "#";
          }
          obj = uContactTarg;
       }else {
          goto label_0024 ;
       }
       return obj;
    }
}
