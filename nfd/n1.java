package nfd.n1;
import java.lang.Object;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.SuggestItem;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import nfd.r3;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.lang.Short;
import android.text.style.ForegroundColorSpan;
import java.util.Collection;
import ekd.q;
import com.search.common.entity.SearchBaseItem;
import android.app.Activity;
import com.yxcorp.plugin.search.b;
import sy5.a;
import java.lang.Boolean;
import x6d.e;
import gbd.i;
import com.google.gson.JsonObject;
import qed.a;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fg6.a;
import nfd.n1$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import uy5.a;
import java.lang.Throwable;
import q87.c;
import x6d.f;
import java.lang.Number;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.yxcorp.plugin.search.SearchPage;
import nfd.n1$b;
import java.lang.Enum;
import com.yxcorp.plugin.search.sugpage.SuggestFragment;
import androidx.fragment.app.Fragment;
import nfd.l;
import wkd.b;
import kcd.g;
import kcd.h;
import nfd.s1;
import il8.c;
import nfd.j2;
import el8.c;
import nfd.s0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.fragment.SearchBaseHomeAndSugFragment;
import com.yxcorp.plugin.search.SearchMode;
import java.util.Objects;

public class n1	// class@001de4
{
    public static String a;

    public void n1(){
       super();
    }
    public static void a(TextView p0,SuggestItem p1,int p2,String p3,String p4){
       n1 on1 = n1.class;
       if (PatchProxy.isSupport(on1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, on1, "10")) {
             return;
          }
       }
       n1.b(p0, p1, p2, p3, p4, "");
       return;
    }
    public static void b(TextView p0,SuggestItem p1,int p2,String p3,String p4,String p5){
       int s1;
       int i3;
       SpannableString spannableStr;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       n1 on1 = n1.class;
       int i = 2;
       SpannableString obj = null;
       int i1 = 0;
       int i2 = 1;
       if (PatchProxy.isSupport(on1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, on1, "11")) {
             return;
          }
       }
       int s = short.class;
       if (PatchProxy.isSupport(r3.class)) {
          s1 = s;
          Object obj1 = PatchProxy.applyFourRefs(Integer.valueOf(p2), p3, p4, p5, null, r3.class, "34");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(!TextUtils.x(p5)){
             i3 = p5.length();
             spannableStr = new SpannableString(oobject4+oobject2);
          }else {
             spannableStr = new SpannableString(oobject2);
             i3 = 0;
          }
          if (!TextUtils.x(p4)) {
             int i4 = p4.length();
             int i5 = p3.length();
             int i6 = i4 + 1;
             int i7 = i5 + 1;
             int[] ointArray = new int[i];
             ointArray[i2] = i7;
             ointArray[i1] = i6;
             short[][] oshortArray = Array.newInstance(s1, ointArray);
             int[] ointArray1 = new int[i];
             ointArray1[i2] = i7;
             ointArray1[i1] = i6;
             short[][] oshortArray1 = Array.newInstance(s1, ointArray1);
             i7 = 0;
             while (i7 <= i4) {
                i = 0;
                while (i <= i5) {
                   if (!i7 || !i) {
                      oshortArray[i7][i] = 0;
                   }else {
                      s1 = i7 - 1;
                      i2 = i - 1;
                      if (r3.f(oobject3.charAt(s1), oobject2.charAt(i2))) {
                         s1 = oshortArray[s1][i2] + 1;
                         oshortArray[i7][i] = (short)s1;
                      }else if(oshortArray[s1][i] >= oshortArray[i7][i2]){
                         oshortArray[i7][i] = oshortArray[s1][i];
                         oshortArray1[i7][i] = 1;
                      }else {
                         oshortArray[i7][i] = oshortArray[i7][i2];
                         oshortArray1[i7][i] = -1;
                      }
                      s1 = 0;
                   }
                   i = i + 1;
                   oobject3 = p4;
                   i2 = 1;
                }
                i7 = i7 + 1;
                oobject3 = p4;
                i2 = 1;
             }
             s1 = 0;
             ArrayList uArrayList = new ArrayList();
             r3.v(oshortArray1, i4, i5, uArrayList);
             if (!uArrayList.isEmpty()) {
                i1 = 0;
                while (i1 < uArrayList.size()) {
                   char c = oobject2.charAt(uArrayList.get(i1).shortValue());
                   i5 = s1;
                   while (true) {
                      if (i5 < p3.length()) {
                         if (r3.f(oobject2.charAt(i5), c)) {
                            s = i3 + i5;
                            int i8 = s + 1;
                            spannableStr.setSpan(new ForegroundColorSpan(p2), s, i8, 17);
                            i5 = i5 + 1;
                            s1 = i5;
                         label_0167 :
                            i1 = i1 + 1;
                         }else {
                            i5 = i5 + 1;
                         }
                      }else {
                         i6 = p2;
                         goto label_0167 ;
                      }
                   }
                }
                obj = spannableStr;
             }
          }
          obj = null;
       }else {
          s1 = s;
          goto label_005f ;
       }
       if (obj == null) {
          oobject.setText(oobject4+oobject2);
       }else {
          oobject1.mIsHighLight = true;
          oobject.setText(obj);
       }
       return;
    }
    public static void c(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n1.class, "8")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       int i = 0;
       while (i < p0.size()) {
          if (p0.get(i) instanceof SearchBaseItem) {
             p0.get(i).mSessionId = p1;
          }
          i = i + 1;
       }
       return;
    }
    public static a d(Activity p0,b p1){
       boolean b;
       p1 = PatchProxy.applyTwoRefs(p0, p1, null, n1.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       p1 = PatchProxy.applyOneRefs(p0, null, n1.class, "9");
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else if(p0 instanceof e && p0.i1()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return a.k();
       }else {
          return n1.e(i.f(p0), i.e(p0), null);
       }
    }
    public static a e(String p0,JsonObject p1,String p2){
       String str;
       Map a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, n1.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.k();
       obj.e("kwaiSource", p0);
       if (TextUtils.x(p2)) {
          p2 = "0";
       }
       obj.e("refreshStrategyType", p2);
       obj.h(p1);
       Object[] objArray = null;
       HashMap hashMap = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          a = a.a;
          if (a != null && !a.isEmpty()) {
             Iterator iterator = a.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (TextUtils.x(uEntry.getKey())) {
                   continue ;
                }
                hashMap.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          if (!TextUtils.x(a.b)) {
             hashMap.put("path", a.b);
          }
          a.a = objArray;
          a.b = objArray;
       }
       try{
          str = a.a.r(hashMap, new n1$a().getType());
       }catch(java.lang.Exception e7){
          a.C().e("SearchHomeUtil", "the process of jsonString is wrong", e7);
       }
       obj.h(a.a.h(str, JsonObject.class));
       return obj;
    }
    public static String f(Activity p0){
       n1 on1 = n1.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, on1, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = PatchProxy.applyTwoRefs(p0, null, null, on1, "2");
       if (str != PatchProxyResult.class) {
       }else {
          str = n1.d(p0, null).i();
       }
       return str;
    }
    public static int g(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n1.i(p0).mPageSource;
    }
    public static SearchSceneSource h(SearchPage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return SearchSceneSource.UNKNOWN;
       }
       switch (n1$b.a[p0.ordinal()]){
           case 1:
             return SearchSceneSource.LIVE_STREAM;
           case 2:
             return SearchSceneSource.FEED_PAGE;
           case 3:
             return SearchSceneSource.IMAGE_PAGE;
           case 4:
             return SearchSceneSource.GOODS_PAGE;
           case 5:
             return SearchSceneSource.USER_PAGE;
           case 6:
             return SearchSceneSource.MUSIC_PAGE;
           case 7:
           case 8:
             return SearchSceneSource.TAG;
           case 9:
             return SearchSceneSource.IM_GROUP_PAGE;
           case 10:
             return SearchSceneSource.NEWEST;
           default:
             return SearchSceneSource.UNKNOWN;
       }
    }
    public static SearchSceneSource i(f p0){
       SearchPage searchPage = null;
       Object obj = PatchProxy.applyOneRefs(p0, searchPage, n1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          searchPage = p0.a();
       }
       return n1.h(searchPage);
    }
    public static void j(SuggestFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n1.class, "15")) {
          return;
       }
       Fragment parentFragme = p0.getParentFragment();
       if (parentFragme instanceof l) {
          parentFragme.xa();
       }
       return;
    }
    public static boolean k(){
       Object obj = PatchProxy.apply(null, null, n1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(0x546f6ee8).a("SEARCH_HOME_PAGE").D != null && s1.b())? true: false;
       return b;
    }
    public static boolean l(b p0,Fragment p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, n1.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       c uoc = j2.c(p1);
       boolean b = false;
       if (uoc == null) {
          return b;
       }
       s0 d = uoc.a().d;
       BaseFragment uBaseFragmen = uoc.b();
       if (d != null && uBaseFragmen instanceof SearchBaseHomeAndSugFragment) {
          b uob = (d == SearchMode.MIDDLE_SUGGEST || d == SearchMode.MIDDLE_HOME)? 1: null;
          uBaseFragmen = (uob && (uBaseFragmen.hh().H).equals("USER_TAG_SEARCH"))? 1: 0;
          if (uob) {
             Objects.requireNonNull(p0);
             obj = PatchProxy.apply(obj, p0, b.class, "5");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(p0.a() != null && p0.a() != SearchPage.AGGREGATE){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                b1 = 1;
             label_007e :
                if (!uBaseFragmen && !b1) {
                   b = true;
                }
             }
          }
          b1 = 0;
          goto label_007e ;
       }
    label_0083 :
       return b;
    }
}
