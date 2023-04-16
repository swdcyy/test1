package com.yxcorp.gifshow.prettify.makeup.i;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t16.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.yxcorp.gifshow.prettify.makeup.d;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.util.HashMap;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.prettify.makeup.i$c;
import l16.b;
import java.lang.Boolean;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.framework.abtest.f;
import xyb.a;
import q87.c;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.p3;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.yxcorp.gifshow.prettify.makeup.i$b;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Float;
import java.util.Map;
import tkd.b;
import tkd.d;
import t5b.a;
import z3b.a;
import ixc.c;
import z3b.f;
import f1c.q;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$DownloadID;
import java.lang.Enum;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import com.yxcorp.gifshow.prettify.makeup.i$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import boc.e;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;

public class i	// class@001185
{
    public static final LinkedList a;
    public static final Map b;
    public static final Map c;

    static {
       i.a = new LinkedList();
       i.b = new ConcurrentHashMap();
       i.c = new ConcurrentHashMap();
    }
    public void i(){
       super();
    }
    public static void a(MakeupKey p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "20")) {
          return;
       }
       i.b(new a(), p0);
       return;
    }
    public static void b(a p0,MakeupKey p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       String str = "21";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, str)) {
          return;
       }
       m om1 = d.a().b(p1);
       if (!om1.l()) {
          return;
       }
       ArrayList uArrayList = PatchProxy.apply(null, om1, om, str);
       if (uArrayList != patchProxyRe) {
       }else {
          m c1 = om1.c;
          uArrayList = (c1 == null)? new ArrayList(): c1.getAutoDownloadSuites();
       }
       ArrayList uArrayList1 = PatchProxy.apply(null, om1, om, "22");
       if (uArrayList1 != patchProxyRe) {
       }else {
          m c = om1.c;
          uArrayList1 = (c == null)? new ArrayList(): c.getAutoDownloadMaterials();
       }
       if (q.f(uArrayList) && q.f(uArrayList1)) {
          return;
       }else {
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             MakeupSuite makeupSuite = iterator.next();
             m obj = PatchProxy.applyOneRefs(makeupSuite, om1, om, "23");
             if (obj != patchProxyRe) {
             }else {
                obj = om1.c;
                obj = (obj == null)? null: obj.getPresetMaterials(makeupSuite);
             }
             if (q.f(obj)) {
                continue ;
             }
             uArrayList2.addAll(obj);
          }
          if (!uArrayList2.isEmpty()) {
             uArrayList1.addAll(0, uArrayList2);
          }
          HashMap hashMap = new HashMap();
          Iterator iterator1 = uArrayList1.iterator();
          while (iterator1.hasNext()) {
             MakeupMaterial makeupMateri = iterator1.next();
             if (!i.n(makeupMateri)) {
                hashMap.put(makeupMateri.mId, makeupMateri);
                if (hashMap.size() == 20) {
                   break ;
                }
             }
          }
          if (hashMap.isEmpty()) {
             return;
          }else {
             i.a.addAll(hashMap.values());
             i.c(p0);
             return;
          }
       }
    }
    public static void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "22")) {
          return;
       }
       if (!i.a.size()) {
          return;
       }
       i.h(p0, new i$c(p0));
       return;
    }
    public static boolean d(){
       a obj = PatchProxy.apply(null, null, i.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = 1;
       obj = (a.a().c() && l.c("enable_cancle_makeup_pre_download", false))? 1: f.a("enableMakeupPreDownload");
       if (obj) {
          objArray = new Object[false];
          a.D().w("MakeupDownloadHelper", "Don\'t need makeup pre download because of ABTest!", objArray);
          return false;
       }else {
          boolean b = p0.F(a.a().a());
          boolean b1 = (PostUtils.o() - (long)PostUtils.a > 0)? true: false;
          Object[] objArray1 = new Object[false];
          p3.D().w("MakeupDownloadHelper", "canAutoDownloadMakeup\(\) isWifi="+b+" enoughSpace="+b1, objArray1);
          if (!b || !b1) {
             objArray = false;
          }
          return objArray;
       }
    }
    public static void e(a p0,String p1,List p2,int p3,b p4,boolean p5){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, oi, "15")) {
             return;
          }
       }
       i = p2.size();
       MakeupMaterial makeupMateri = p2.get(p3);
       if (makeupMateri == null) {
          if (p4 != null) {
             p4.onError();
          }
          return;
       }else {
          i.a.addFirst(makeupMateri);
          i$b uob = new i$b(p3, i, p1, p4, p0, p2, p5);
          i.h(p0, makeupMateri);
          return;
       }
    }
    public static void f(a p0,MakeupSuite p1,boolean p2,List p3,b p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oi, "7")) {
             return;
          }
       }
       i.g(p0, p1, p2, p3, p4, true);
       return;
    }
    public static void g(a p0,MakeupSuite p1,boolean p2,List p3,b p4,boolean p5){
       int i;
       i oi = i.class;
       i = 0;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, oi, "6")) {
             return;
          }
       }
       if (p1 != null && !p1.isEmpty()) {
          a uoa = a.D();
          StringBuilder str = "Download suite "+p1.mId+" "+p2+"---";
          int i1 = (p3 == null)? 0: p3.size();
          Object[] objArray1 = new Object[i];
          uoa.w("MakeupDownloadHelper", str+i1, objArray1);
          String uniqueIdenti = p1.getUniqueIdentifier();
          if (p2) {
             i.b.put(uniqueIdenti, Float.valueOf(0));
             List selectedMate = p1.getSelectedMaterials();
             if (!q.f(selectedMate)) {
                i.e(p0, uniqueIdenti, selectedMate, 0, p4, p5);
             }else if(p4 != null){
                p4.onError();
             }
          }else {
             i.b.remove(uniqueIdenti);
          }
          i.i(p0, uniqueIdenti, p3, p4);
       }
       return;
    }
    public static void h(a p0,b p1){
       MakeupMaterial makeupMateri;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "17")) {
          return;
       }
       try{
          makeupMateri = i.a.pollFirst();
       }catch(java.lang.Exception e0){
       }
       if (makeupMateri == null) {
          p1.onError();
          return;
       }else if(i.n(makeupMateri)){
          p1.onComplete();
          return;
       }else if(PatchProxy.applyVoidThreeRefs(p0, makeupMateri, p1, null, i.class, "18")){
          f[] uofArray = new f[]{new q(p1)};
          d.a(0x3bf0d115).H0().a(p0.a(), p0.b(), makeupMateri, uofArray);
       }
       return;
    }
    public static void i(a p0,String p1,List p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, i.class, "10")) {
          return;
       }
       if (q.f(p2)) {
          i.c.remove(p1);
          Object[] objArray = new Object[0];
          a.D().w("MakeupDownloadHelper", "no makeup categories : "+p1, objArray);
          return;
       }else {
          i.c.put(p1, Float.valueOf(0));
          ResourceDownloadProgressHelper.d().a(p0, ResourceDownloadProgressHelper$DownloadID.MAKEUP_DOWNLOAD_ID.name()+p1, p2, new i$a(p1, p3));
          return;
       }
    }
    public static List j(){
       ArrayList obj = PatchProxy.apply(null, null, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(e.c);
       obj.add(e.B);
       obj.add(e.D);
       obj.add(e.E);
       obj.add(e.K);
       obj.add(e.F);
       obj.add(e.G);
       obj.add(e.e);
       obj.add(e.m);
       obj.add(e.l);
       return obj;
    }
    public static List k(MakeupItem p0){
       List obj = PatchProxy.applyOneRefs(p0, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i.l(i.j());
       if (p0 == null) {
          return obj;
       }
       obj.addAll(i.l(i.m(p0)));
       return obj;
    }
    public static List l(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!p.h(uob)) {
                obj.add(uob);
             }
          }
       }
       return obj;
    }
    public static List m(MakeupItem p0){
       ArrayList uArrayList;
       List obj = null;
       List obj1 = PatchProxy.applyOneRefs(p0, obj, i.class, "13");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!MakeupItem.isValid(p0)) {
          return obj;
       }
       obj1 = MagicEmojiResourceHelper.w(p0.mPassThroughParams.mYModels);
       if (obj1 == null) {
          uArrayList = new ArrayList();
       }
       if (!p0 instanceof MakeupSuite) {
          return uArrayList;
       }else {
          List selectedMate = p0.getSelectedMaterials();
          if (q.f(selectedMate)) {
             return uArrayList;
          }else {
             Iterator iterator = selectedMate.iterator();
             while (iterator.hasNext()) {
                obj = i.m(iterator.next());
                if (q.f(obj)) {
                   continue ;
                }
                uArrayList.addAll(obj);
             }
             return uArrayList;
          }
       }
    }
    public static boolean n(MakeupMaterial p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (d.a(0x3bf0d115).Mk(p0) ^ 0x01);
    }
    public static boolean o(MakeupSuite p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, oi, "4");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, oi, "14");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(p0 == null || !p0.isValid()){
          obj = p0.getSelectedMaterials();
       }
       if (q.f(obj)) {
          return true;
       }else {
          Iterator iterator = obj.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return true;
             }
             if (!i.n(iterator.next())) {
                break ;
             }
          }
          return false;
       }
    }
    public static boolean p(MakeupItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return q.f(i.k(p0));
    }
    public static void q(String p0,b p1){
       int i;
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "12")) {
          return;
       }
       i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupDownloadHelper", "onMakeUpItemComplete : "+p0+"--"+p1, objArray);
       if (p1 == null) {
          return;
       }
       Map b = i.b;
       if (b.containsKey(p0)) {
          Map c = i.c;
          if (c.containsKey(p0)) {
             float f = c.get(p0).floatValue();
             float f1 = b.get(p0).floatValue();
             a uoa = 0x3f800000;
             if (!f - uoa && !f1 - uoa) {
                objArray1 = new Object[i];
                a.D().w("MakeupDownloadHelper", p0+"onMakeUpItemTotalComplete ", objArray1);
                p1.onComplete();
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w("MakeupDownloadHelper", p0+"onMakeUpItemProgress : "+f+"---"+f1, objArray2);
                p1.onProgress((((f * 3.00f) / 4.00f) + (f1 / 4.00f)));
             }
          }else if(b.containsKey(p0) || i.c.containsKey(p0)){
             objArray1 = new Object[i];
             a.D().w("MakeupDownloadHelper", p0+"onComplete : ", objArray1);
             p1.onComplete();
          }
       }else {
          goto label_00b2 ;
       }
       return;
    }
    public static void r(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "11")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       Map b = i.b;
       if (b.containsKey(p0)) {
          Map c = i.c;
          if (c.containsKey(p0)) {
             p1.onProgress((((c.get(p0).floatValue() * 3.00f) / 4.00f) + (b.get(p0).floatValue() / 4.00f)));
          }else if(b.containsKey(p0)){
             p1.onProgress(b.get(p0).floatValue());
          }else {
             b = i.c;
             if (b.containsKey(p0)) {
                p1.onProgress(b.get(p0).floatValue());
             }
          }
       }else {
          goto label_0040 ;
       }
       return;
    }
}
