package com.yxcorp.gifshow.v3.editor.text.i0;
import java.lang.String;
import java.util.ArrayList;
import faa.a;
import java.lang.Object;
import q87.c;
import kuc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.InternalFeatureId;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.FeatureId$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import kotlin.jvm.internal.a;
import luc.a;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import d0c.d;
import java.util.Map;
import huc.d;
import orc.f;
import juc.e$a;
import qk.f;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import com.google.common.collect.Lists;
import h80.c;
import h80.k;
import h80.m;
import java.util.Iterator;
import android.util.Pair;
import huc.c;
import com.yxcorp.gifshow.v3.editor.text.c0;
import com.yxcorp.gifshow.v3.editor.text.h0;
import com.yxcorp.gifshow.v3.editor.text.g0;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.d0;
import ekd.q$b;
import ekd.q;
import huc.i;
import com.yxcorp.gifshow.v3.editor.text.e0;
import huc.j;
import com.yxcorp.gifshow.v3.editor.text.f0;
import huc.k;
import qe6.c;
import oa0.a;
import android.content.SharedPreferences;
import km8.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import huc.q;
import huc.h;
import huc.n;
import huc.e;
import huc.o;
import huc.f;
import huc.p;
import huc.g;
import huc.l;
import huc.m;
import huc.r;

public final class i0	// class@001459
{
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static List l;
    public static final o m;
    public static final o n;
    public static final o o;

    static {
       a a;
       String str = "kwai_food";
       String[] stringArray = new String[]{str,"edit_pinkalbum_bubbles_title","edit_greenalbum_bubbles_title","edit_yellowalbum_bubbles_title"};
       i0.a = stringArray;
       String str1 = "shadow_01";
       String[] stringArray1 = new String[]{str1};
       i0.b = stringArray1;
       stringArray1 = new String[]{str};
       i0.c = stringArray1;
       stringArray1 = new String[]{str};
       i0.d = stringArray1;
       String str2 = "20221116_year";
       String[] stringArray2 = new String[]{str2,"20211206_annual_album_watch","edit_pinkalbum_bubbles_title","edit_greenalbum_bubbles_title","edit_yellowalbum_bubbles_title"};
       i0.e = stringArray2;
       String[] stringArray3 = new String[]{"edit_pinkalbum_bubbles_title","edit_greenalbum_bubbles_title","edit_yellowalbum_bubbles_title"};
       i0.f = stringArray3;
       ArrayList uArrayList = new ArrayList();
       i0.g = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       i0.h = uArrayList1;
       ArrayList uArrayList2 = new ArrayList();
       i0.i = uArrayList2;
       i0.j = new ArrayList();
       ArrayList uArrayList3 = new ArrayList();
       i0.k = uArrayList3;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditTextManager", "static start", objArray);
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, null, uoa, "8")) {
       }else {
          Object[] objArray4 = new Object[i];
          a.D().w("DrawerParamHelper", "initHardCodeDrawerFactory", objArray4);
          a = a.a;
          InternalFeatureId tEXT_SHADOW_ = InternalFeatureId.TEXT_SHADOW_01;
          Objects.requireNonNull(a);
          GeneratedMessageLite generatedMes = PatchProxy.applyOneRefs(tEXT_SHADOW_, a, uoa, "7");
          if (generatedMes != PatchProxyResult.class) {
          }else {
             FeatureId$b uob1 = FeatureId.newBuilder();
             uob1.b(tEXT_SHADOW_);
             GeneratedMessageLite generatedMes1 = uob1.build();
             a.o(generatedMes1, "FeatureId.newBuilder\(\).s¡­ternal\(featureId\).build\(\)");
             generatedMes = generatedMes1;
          }
          if (!PatchProxy.applyVoidTwoRefs(str1, generatedMes, a, uoa, "6")) {
             Map map = d.o();
             a.o(map, "EditTextIdHelper.getTextIdEditTextFactoryMap\(\)");
             map.put(str1, new a(a.a(str1), a.b(str1), null));
             f a1 = f.a;
             a.o(a1, "TextIdFeatureIdConverter.TEXT_ID_FEATURE_ID_MAP");
             a1.put(str1, generatedMes);
          }
       }
       if (!PatchProxy.applyVoid(null, null, e$a.class, "1")) {
          Object[] objArray3 = new Object[0];
          a.D().w("TextKwaiFoodDrawer", "init", objArray3);
          d.o().put(str, e$a.a);
          FeatureId$b uob = FeatureId.newBuilder();
          uob.b(InternalFeatureId.TEXT_KWAI_FOOD_EGG);
          f.a.put(str, uob.build());
       }
       if (!a.t().d("enableKwaiFoodCover", false)) {
          uArrayList2.add(str);
       }
       uArrayList3.addAll(Arrays.asList(stringArray3));
       uArrayList3.add(str2);
       uArrayList3.add("20211206_annual_album_watch");
       str = String.class;
       if (!PatchProxy.applyVoid(null, null, i0.class, "2")) {
          Object[] objArray2 = new Object[0];
          a.D().w("EditTextManager", "loadOfflineTextId", objArray2);
          String str3 = "";
          uArrayList.addAll(Lists.e((f.b("enableDeleteCoverBubbleADR2", str, str3)).split(",")));
          uArrayList1.addAll(Lists.e((f.b("enableDeleteTextBubbleADR2", str, str3)).split(",")));
       }
       c uoc = k.a();
       if (uoc != null) {
          i0.l = uoc.b().h;
          m g = uoc.b().g;
          if (g != null) {
             Iterator iterator = g.iterator();
             while (iterator.hasNext()) {
                Pair pair = iterator.next();
                d.o().put(pair.first, pair.second);
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditTextManager", "static end", objArray1);
       i0.m = c0.b;
       i0.n = h0.b;
       i0.o = g0.b;
    }
    public void i0(){
       super();
    }
    public static List a(){
       Object obj = PatchProxy.apply(null, null, i0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(i0.k);
    }
    public static List b(int p0){
       ArrayList obj;
       String[] d;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oi0, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getAllNewTextList tabFlag:"+p0, objArray);
       obj = new ArrayList();
       boolean b = i0.i(p0);
       c uoc = k.a();
       if (uoc == null) {
          d = (b)? i0.d: i0.c;
       }else {
          m f = uoc.b().f;
          if (f == null) {
             d = (b)? i0.d: i0.c;
          }else {
             d = f;
          }
       }
       obj.addAll(Arrays.asList(i0.b));
       obj.addAll(d.l(p0));
       obj.addAll(Arrays.asList(d));
       return obj;
    }
    public static List c(){
       ArrayList obj = PatchProxy.apply(null, null, i0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getAllOuterTextIdList", objArray);
       obj = new ArrayList();
       obj.addAll(Arrays.asList(i0.b));
       obj.addAll(d.k());
       obj.addAll(Arrays.asList(i0.a));
       return obj;
    }
    public static List d(boolean p0,List p1){
       List obj;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, oi0, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i0.c();
       q.c(obj, d0.a);
       q.c(obj, new i(p0));
       List list = i0.b(1);
       q.c(list, e0.a);
       q.c(list, new j(p0));
       ArrayList uArrayList = Lists.e(i0.e);
       q.c(uArrayList, f0.a);
       q.c(uArrayList, new k(p0));
       obj.removeAll(uArrayList);
       obj.removeAll(list);
       ArrayList uArrayList1 = new ArrayList(uArrayList);
       list.removeAll(uArrayList);
       uArrayList1.addAll(list);
       uArrayList1.addAll(obj);
       uArrayList1.removeAll(p1);
       return i0.h(uArrayList1);
    }
    public static Pair e(boolean p0,int p1){
       ArrayList obj1;
       Type d1;
       String str;
       i0 oi0 = i0.class;
       ArrayList obj = null;
       if (PatchProxy.isSupport(oi0)) {
          obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), obj, oi0, "10");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getSubtitleShowingSortedTextIdList tabFlag:"+p1+",isLogin:"+p0, objArray);
       obj1 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       if (i0.i(p1)) {
          d1 = c.d1;
          str = a.a.getString("cover_bubble_sequence_v2", "[]");
          if (str != null && str != "") {
             obj = b.a(str, d1);
          }
       }else if(PostExperimentUtils.j1()){
          d1 = c.d1;
          str = a.a.getString("new_text_bubble_sequence_v2", "[]");
          if (str != null && str != "") {
             obj = b.a(str, d1);
          }
       }else {
       label_008c :
          obj = new ArrayList();
          if (!q.f(uArrayList)) {
             obj.addAll(uArrayList);
          }else {
             obj.addAll(obj1);
          }
          q.c(obj1, new q(p1));
          q.c(obj1, new h(p0));
          if (!q.f(uArrayList)) {
             ArrayList uArrayList1 = new ArrayList(uArrayList);
             uArrayList1.removeAll(obj1);
             ArrayList uArrayList2 = new ArrayList(obj1);
             uArrayList2.removeAll(uArrayList);
             uArrayList.removeAll(uArrayList1);
             uArrayList.addAll(uArrayList2);
             obj1 = uArrayList;
          }
          Object[] objArray1 = new Object[0];
          a.D().s("EditTextManager", "result size: "+obj1.size(), objArray1);
          return new Pair(i0.h(obj1), obj);
       }
       uArrayList = obj;
       goto label_008c ;
    }
    public static Pair f(boolean p0,int p1,List p2){
       String obj;
       Type d1;
       ArrayList uArrayList2;
       if (PatchProxy.isSupport(i0.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, null, i0.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = i0.i(p1);
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getSubtitleShowingSortedTextIdList tabFlag:"+p1+",isFromCover:"+b+",isLogin:"+p0, objArray);
       List list = i0.c();
       q.c(list, new n(p1));
       q.c(list, new e(p0));
       List list1 = i0.b(p1);
       q.c(list1, new o(p1));
       q.c(list1, new f(p0));
       ArrayList uArrayList = Lists.e(i0.e);
       q.c(uArrayList, new p(p1));
       q.c(uArrayList, new g(p0));
       ArrayList uArrayList1 = new ArrayList();
       String str = "";
       if (b) {
          d1 = c.d1;
          obj = a.a.getString("cover_bubble_outer_sequence", "[]");
          if (obj == null || obj == str) {
          label_00b2 :
             uArrayList1 = null;
          }else {
             uArrayList1 = b.a(obj, d1);
          }
       }else if(PostExperimentUtils.j1()){
          d1 = c.d1;
          obj = a.a.getString("new_text_bubble_outer_sequence_v2", "[]");
          if (obj == null || obj == str) {
             goto label_00b2 ;
          }else {
             uArrayList1 = b.a(obj, d1);
          }
       }
       if (!q.f(uArrayList1)) {
          Iterator iterator = i0.b(p1).iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (uArrayList1.contains(obj)) {
                list1.remove(obj);
             }
          }
          uArrayList2 = new ArrayList(uArrayList1);
          uArrayList2.removeAll(list);
          ArrayList uArrayList3 = new ArrayList(list);
          uArrayList3.removeAll(uArrayList1);
          uArrayList1.removeAll(uArrayList2);
          uArrayList1.addAll(uArrayList3);
          list = uArrayList1;
       }
       list.removeAll(uArrayList);
       list.removeAll(list1);
       uArrayList1 = new ArrayList(uArrayList);
       list1.removeAll(uArrayList);
       uArrayList1.addAll(list1);
       uArrayList1.addAll(list);
       uArrayList1.removeAll(p2);
       uArrayList2 = new ArrayList(uArrayList1);
       uArrayList2.removeAll(uArrayList);
       return new Pair(i0.h(uArrayList1), uArrayList2);
    }
    public static List g(boolean p0,boolean p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), null, i0.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getSubtitleShowingSortedTextIdList tabFlag:"+p2+",ktvMode:"+p0+",isLogin:"+p1, objArray);
       ArrayList uArrayList = PatchProxy.apply(null, null, oi0, "4");
       if (uArrayList != patchProxyRe) {
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("EditTextManager", "getSubtitleTextIdList", objArray1);
          uArrayList = new ArrayList();
          uArrayList.addAll(Arrays.asList(i0.b));
          uArrayList.addAll(d.l(256));
          uArrayList.addAll(new ArrayList(Arrays.asList(i0.a)));
       }
       q.c(uArrayList, new l(p2));
       if (p0) {
          q.c(uArrayList, new m(p2));
       }
       q.c(uArrayList, new r(p1));
       return uArrayList;
    }
    public static List h(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, i0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!obj.contains(str)) {
             obj.add(str);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextManager", "getTextIdListWithoutRepeat: origin size = "+p0.size()+", result size = "+obj.size(), objArray);
       return obj;
    }
    public static boolean i(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
}
