package gib.j;
import h16.n;
import gib.j$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import h16.m;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dc5.c;
import gib.j$b;
import java.lang.Runnable;
import t45.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import java.lang.StringBuilder;
import java.lang.Integer;
import h16.k;
import java.util.ArrayList;
import h16.g;
import kotlin.collections.CollectionsKt__CollectionsKt;
import h16.o;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import u0c.a;
import q0c.y1;
import u0c.b;
import gib.j$c;
import u4d.a;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import org.json.JSONArray;
import org.json.JSONObject;
import java.lang.Throwable;
import km8.b;
import java.util.Collection;
import trd.y;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.google.gson.JsonObject;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import gib.c;

public final class j implements n	// class@002af9
{
    public List a;
    public List b;
    public IMBeautifyResponse c;
    public BeautifyConfig d;
    public static final j$a e;

    static {
       j.e = new j$a(null);
    }
    public void j(){
       super();
    }
    public BeautifyConfig M1(int p0){
       return m.c(this, p0);
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       a.p(p0, "beautifyConfigs");
       if (p0.isEmpty()) {
          c.g("IMBeautyRepoV2", "saveConfigs configs is empty");
          return;
       }else {
          c.a(new j$b(this, p0));
          return;
       }
    }
    public List b(){
       return m.e(this);
    }
    public BeautifyConfig c(){
       return m.g(this);
    }
    public int d(){
       Object[] objArray1;
       BeautifySuiteInfo mId;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          List suiteInfoLis = obj.getSuiteInfoList();
          if (suiteInfoLis != null) {
             Iterator iterator = suiteInfoLis.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   objArray1 = iterator.next();
                   if (objArray1.isDefault == null) {
                      continue ;
                   }
                }else {
                   objArray1 = objArray;
                }
             label_0039 :
                StringBuilder str = "defaultConfigId ";
                if (objArray1 != null) {
                   objArray = Integer.valueOf(objArray1.mId);
                }
                c.g("IMBeautyRepoV2", str+objArray);
                mId = (objArray1 != null)? objArray1.mId: 30;
                break ;
             }
             return mId;
          }
       }
       objArray1 = objArray;
       goto label_0039 ;
    }
    public List e(){
       return m.f(this);
    }
    public k f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oj, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.w();
       ArrayList uArrayList = PatchProxy.apply(objArray, this, oj, "18");
       if (uArrayList != patchProxyRe) {
       }else {
          j tc = this.c;
          if (tc != null) {
             List beautifyGrou = tc.getBeautifyGroupInfoList();
             if (beautifyGrou != null) {
                uArrayList = new ArrayList();
                Iterator iterator = beautifyGrou.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   obj = (obj1.mId != 5)? 1: null;
                   if (obj) {
                      uArrayList.add(obj1);
                   }
                }
             }
          }
          uArrayList = CollectionsKt__CollectionsKt.E();
       }
       return new k(uArrayList);
    }
    public o g(){
       return m.b(this);
    }
    public MedicalBeautyConfig h(){
       return m.d(this);
    }
    public List i(){
       List list;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.a;
          if (obj != null) {
             list = a.a(obj);
             a.o(list, "BeautyDataManager.cloneConfigs\(default\)");
             this.a = objArray;
             return list;
          }else {
             list = this.r();
             y1 oy1 = y1.h();
             a.o(oy1, "BeautyVersionManager.instance\(\)");
             if (oy1.g() == 2) {
                this.x(list);
             }
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                Object obj2 = (obj1.mId == 30)? 1: null;
                if (obj2) {
                   objArray = obj1;
                   break ;
                }
             }
             if (objArray != null) {
                b.c(objArray);
             }
             return list;
          }
       }catch(java.io.IOException e0){
          c.c("IMBeautyRepoV2", "readDefaultConfigs error "+e0);
          return new ArrayList();
       }
    }
    public void j(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "7")) {
          return;
       }
       this.d = p0;
       c.a(new j$c(this, p0));
       return;
    }
    public boolean k(){
       return false;
    }
    public List l(){
       Object[] objArray1;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          List list = a.a(obj);
          this.b = objArray;
          a.o(list, "list");
          return list;
       }else {
          this.s();
          ArrayList uArrayList = new ArrayList();
          j ta = this.a;
          if (ta != null) {
             Iterator iterator = ta.iterator();
             while (iterator.hasNext()) {
                BeautifyConfig uBeautifyCon = iterator.next().clone();
                a.o(uBeautifyCon, "config");
                uArrayList.add(uBeautifyCon);
             }
          }
          String str = a.a.getString("im_beautify_configs_v2", "");
          JSONArray jSONArray = (str == null || !str.length())? 1: null;
          if (!jSONArray) {
             try{
                jSONArray = new JSONArray(str);
                int i = jSONArray.length();
                int i1 = 0;
                while (i1 < i) {
                   JSONObject jSONObject = jSONArray.getJSONObject(i1);
                   int intx = jSONObject.getInt("id");
                   if (intx != -1) {
                      Iterator iterator1 = uArrayList.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            objArray1 = iterator1.next();
                            Object obj1 = (objArray1.mId == intx)? 1: null;
                            if (!obj1) {
                               continue ;
                            }
                         }else {
                            objArray1 = objArray;
                         }
                         if (objArray1 != null) {
                            a.o(jSONObject, "jsonObject");
                            this.t(jSONObject, objArray1);
                         }
                      }
                   }
                   i1 = i1 + 1;
                }
             }catch(java.lang.Exception e1){
                c.d("IMBeautyRepoV2", "readLastConfigs error", e1);
             }
          }
       }
    }
    public void m(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "8")) {
          return;
       }
       a.p(p0, "list");
       this.b = p0;
       return;
    }
    public void n(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       a.p(p0, "list");
       this.a = p0;
       return;
    }
    public void o(){
       this.a = null;
       this.b = null;
    }
    public BeautifyConfig p(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          return this.d;
       }
       this.s();
       obj = a.a.getString(b.d("user")+"last_im_beautify_config_v2", "");
       JSONObject jSONObject = (obj == null || !obj.length())? 1: null;
       if (!jSONObject) {
          jSONObject = new JSONObject(obj);
          int intx = jSONObject.getInt("id");
          j ta = this.a;
          if (ta != null) {
             Iterator iterator = ta.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                Object obj2 = (obj1.mId == intx)? 1: null;
                if (obj2) {
                   objArray = obj1;
                   break ;
                }
             }
             if (objArray != null) {
                BeautifyConfig uBeautifyCon = objArray.clone();
                if (uBeautifyCon != null) {
                   a.o(uBeautifyCon, "it");
                   this.t(jSONObject, uBeautifyCon);
                   this.d = uBeautifyCon;
                }
             }
          }
       }
    label_0090 :
       return this.d;
    }
    public List q(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.r();
       }catch(java.lang.Exception e0){
          c.c("IMBeautyRepoV2", "readOriginDefaultConfigs error "+e0);
          return new ArrayList();
       }
    }
    public final List r(){
       Object[] objArray1;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.w();
       obj = this.c;
       List suiteInfoLis = (obj != null)? obj.getSuiteInfoList(): objArray;
       String str = (suiteInfoLis == null || suiteInfoLis.isEmpty())? 1: null;
       if (str) {
          c.g("IMBeautyRepoV2", "buildDefaultConfigList empty");
          return CollectionsKt__CollectionsKt.E();
       }else {
          obj = this.c;
          a.m(obj);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = obj.getBeautifyGroupInfoList().iterator();
          while (iterator.hasNext()) {
             y.q0(uArrayList, iterator.next().mItemIds);
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             Integer integer = iterator1.next();
             j tc = this.c;
             a.m(tc);
             Iterator iterator2 = tc.getBeautifyItemInfoList().iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   objArray1 = iterator2.next();
                   BeautyFilterItem mId = objArray1.mId;
                   Object obj1 = (integer != null && mId == integer.intValue())? 1: null;
                   if (!obj1) {
                      continue ;
                   }
                }else {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   uArrayList1.add(objArray1);
                }else {
                   continue ;
                }
             }
          }
          suiteInfoLis = CollectionsKt___CollectionsKt.J5(uArrayList1);
          ArrayList uArrayList2 = new ArrayList();
          j tc1 = this.c;
          a.m(tc1);
          Iterator iterator3 = tc1.getBeautifyItemInfoList().iterator();
          while (iterator3.hasNext()) {
             BeautyFilterItem uBeautyFilte = iterator3.next();
             if (!suiteInfoLis.contains(uBeautyFilte)) {
                suiteInfoLis.add(uBeautyFilte);
                if (uBeautyFilte.mHidden == null) {
                   uArrayList2.add(Integer.valueOf(uBeautyFilte.mId));
                }
             }
          }
          tc1 = this.c;
          a.m(tc1);
          List suiteInfoLis1 = tc1.getSuiteInfoList();
          ArrayList uArrayList3 = new ArrayList(u.Y(suiteInfoLis1, 10));
          iterator3 = suiteInfoLis1.iterator();
          while (iterator3.hasNext()) {
             BeautifyConfig uBeautifyCon = BeautyDataHelper.d.c(iterator3.next(), suiteInfoLis);
             uBeautifyCon.mUnSupportItemList.addAll(uArrayList2);
             uArrayList3.add(uBeautifyCon);
          }
          return CollectionsKt___CollectionsKt.J5(uArrayList3);
       }
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, j.class, "14")) {
          return;
       }
       if (this.a == null) {
          this.a = this.i();
       }
       return;
    }
    public final void t(JSONObject p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "12")) {
          return;
       }
       BeautifyConfig.diffToFull(p0, p1);
       return;
    }
    public final JsonObject u(BeautifyConfig p0){
       BeautifyConfig obj = PatchProxy.applyOneRefs(p0, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.mId;
          if (obj == -1) {
             JsonElement jsonElement = a.a.x(p0);
             a.o(jsonElement, "Gsons.KWAI_GSON.toJsonTree\(userConfig\)");
             return jsonElement.r();
          }else {
             obj = this.v(obj);
             if (obj != null) {
                return p0.fullToDiff(obj);
             }
          }
       }catch(java.lang.Exception e3){
          c.c("IMBeautyRepoV2", "fullToDiff error : "+e3);
       }
       return null;
    }
    public final BeautifyConfig v(int p0){
       Iterator obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.s();
       oj = this.a;
       BeautifyConfig uBeautifyCon = null;
       if (oj != null) {
          obj = oj.iterator();
          while (obj.hasNext()) {
             Object obj1 = obj.next();
             Object obj2 = (p0 == obj1.mId)? 1: null;
             if (obj2) {
                uBeautifyCon = obj1;
                break ;
             }
          }
       }
       return uBeautifyCon;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, j.class, "17")) {
          return;
       }
       if (this.c == null) {
          IMBeautifyResponse iMBeautifyRe = c.a();
          this.c = iMBeautifyRe;
          if (iMBeautifyRe != null) {
             this.m(this.l());
          }
       }
       return;
    }
    public final void x(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "10")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          BeautifyConfig uBeautifyCon = iterator.next();
          int i = 0;
          switch (uBeautifyCon.mId){
              case 31:
                BeautyFilterItem.setFilterValue(uBeautifyCon, 15.00f, i);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 40.00f, 1);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 56.00f, 10);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 55.00f, 11);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 40.00f, 12);
                break;
              case 32:
                BeautyFilterItem.setFilterValue(uBeautifyCon, 50.00f, 1);
                float f = 0;
                BeautyFilterItem.setFilterValue(uBeautifyCon, f, 42);
                BeautyFilterItem.setFilterValue(uBeautifyCon, f, 32);
                BeautyFilterItem.setFilterValue(uBeautifyCon, f, 31);
                BeautyFilterItem.setFilterValue(uBeautifyCon, f, 3);
                break;
              case '!':
                BeautyFilterItem.setFilterValue(uBeautifyCon, 60.00f, 1);
                BeautyFilterItem.setFilterValue(uBeautifyCon, 35.00f, i);
                break;
              case '"':
                BeautyFilterItem.setFilterValue(uBeautifyCon, 40.00f, 1);
                break;
              default:
          }
       }
       return;
    }
}
