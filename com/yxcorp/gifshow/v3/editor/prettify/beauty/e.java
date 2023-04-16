package com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import h16.n;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import skd.a;
import q0c.y1;
import l0c.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import ssc.j;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import ssc.l;
import java.lang.Runnable;
import t45.c;
import h16.m;
import h16.k;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import h16.o;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import u0c.a;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import q0c.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import ssc.m;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.beauty.util.BeautifyConfigDeserializeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import u0c.b;
import v0c.a;
import faa.a;
import q87.c;
import com.google.common.collect.ImmutableBiMap$a;
import com.google.common.collect.ImmutableBiMap;
import java.lang.Boolean;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import com.google.common.collect.ImmutableMap;
import ssc.k;
import java.lang.Number;

public class e implements n	// class@001156
{
    public a a;
    public BeautifyConfig b;
    public List c;
    public ImmutableBiMap d;
    public c e;
    public PostBeautifyResponse f;
    public Boolean g;
    public static List h;
    public static List i;

    public void e(){
       super();
       this.a = a.b(a.a().a(), "edit_beautify_configs");
       this.e = y1.h().f();
    }
    public BeautifyConfig M1(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.i(), new j(p0)).orNull();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       c.a(new l(this, p0));
       return;
    }
    public List b(){
       return m.e(this);
    }
    public BeautifyConfig c(){
       return m.g(this);
    }
    public int d(){
       return -1;
    }
    public List e(){
       return m.f(this);
    }
    public k f(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = BeautyDataHelper.d.h();
       }
       e tf = this.f;
       if (tf != null) {
          objArray = tf.mBeautifyGroupInfoList;
       }
       return new k(objArray);
    }
    public o g(){
       return m.b(this);
    }
    public MedicalBeautyConfig h(){
       return m.d(this);
    }
    public List i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, uoe, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e.h;
       if (obj != null) {
          e.h = objArray;
          return a.a(obj);
       }else {
          ArrayList uArrayList = PatchProxy.apply(objArray, this, uoe, "14");
          if (uArrayList != patchProxyRe) {
          }else if(this.f == null){
             this.f = BeautyDataHelper.d.h();
          }
          ArrayList uArrayList1 = new ArrayList();
          uoe = this.f;
          if (uoe != null && !q.f(uoe.mEditSuiteInfoList)) {
             uArrayList1 = new ArrayList();
             Iterator iterator = this.f.mEditSuiteInfoList.iterator();
             while (iterator.hasNext()) {
                uArrayList1.add(BeautyDataHelper.d.c(iterator.next(), this.f.mBeautifyItemInfoList));
             }
          }
          uArrayList = uArrayList1;
          if (!this.e.c()) {
             c.c(uArrayList);
          }
          return uArrayList;
       }
    }
    public void j(BeautifyConfig p0){
    }
    public boolean k(){
       return m.i(this);
    }
    public List l(){
       BeautifyConfig uBeautifyCon1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, uoe, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, uoe, "8");
       if (obj != patchProxyRe) {
       }else {
          List i = e.i;
          if (i != null) {
             obj = a.a(i);
             e.i = objArray;
          }else {
             String str = this.a.getString("custom_beauty_list", objArray);
             obj = (!TextUtils.x(str))? a.a.i(str, new m(this).getType()): objArray;
          }
       }
       ArrayList uArrayList = new ArrayList();
       b.b(uArrayList, this.i());
       a.a(obj, uArrayList);
       if (!this.e.c()) {
          c.c(obj);
       }
       if (!q.f(obj)) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             BeautifyConfig uBeautifyCon = iterator.next();
             uBeautifyCon1 = b.a(obj, uBeautifyCon.mId);
             if (uBeautifyCon1 != null) {
                uBeautifyCon.copyFilterValue(uBeautifyCon1);
             }
          }
       }
       this.c = uArrayList;
       if (this.d == null && !PatchProxy.applyVoid(objArray, this, uoe, "9")) {
          Object[] objArray1 = new Object[0];
          a.D().w("EditBeautyRepo", "initFeatureIdArray", objArray1);
          ImmutableBiMap$a uoa = ImmutableBiMap.builder();
          Iterator iterator1 = this.c.iterator();
          while (iterator1.hasNext()) {
             uBeautifyCon1 = iterator1.next().mId;
             if (uBeautifyCon1 != 1) {
                if (uBeautifyCon1 != 2) {
                   if (uBeautifyCon1 != 3) {
                      if (uBeautifyCon1 != 4) {
                         if (uBeautifyCon1 != 5) {
                            uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x6979));
                         }else {
                            uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x697e));
                         }
                      }else {
                         uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x697d));
                      }
                   }else {
                      uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x697c));
                   }
                }else {
                   uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x697b));
                }
             }else {
                uoa.i(Integer.valueOf(uBeautifyCon1), Integer.valueOf(0x697a));
             }
          }
          this.d = uoa.h();
       }
       if (!PatchProxy.applyVoidOneRefs(uArrayList, this, uoe, "2")) {
          uoe = this.g;
          if (uoe != null && uoe.booleanValue()) {
             objArray = new Object[0];
             a.D().w("EditBeautyRepo", "Handle no category for edit beauty one shot", objArray);
             BeautifyConfig uBeautifyCon2 = b.a(uArrayList, 2);
             if (uBeautifyCon2 != null) {
                uBeautifyCon2.copyFilterValue(new BeautifyConfig());
             }
          }
       }
       return q.b(uArrayList);
    }
    public void m(List p0){
       e.i = p0;
    }
    public void n(List p0){
       e.h = p0;
    }
    public void o(){
       e.h = null;
       e.i = null;
    }
    public BeautifyConfig p(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.e.c()) {
          obj = this.b;
          if (!PatchProxy.applyVoidOneRefs(obj, objArray, c.class, "5") && obj != null) {
             BeautyFilterItem.setFilterValue(obj, 0, 30);
          }
       }
       return this.b;
    }
    public List q(){
       return m.h(this);
    }
    public BeautifyConfig r(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoe = this.d;
       p0 = (uoe != null && uoe.containsValue(Integer.valueOf(p0)))? this.d.inverse().get(Integer.valueOf(p0)).intValue(): -1;
       uoe = this.c;
       BeautifyConfig uBeautifyCon = (uoe != null)? y.y(uoe, new k(p0)).orNull(): null;
       return uBeautifyCon;
    }
    public int s(BeautifyConfig p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = (obj != null && obj.containsKey(Integer.valueOf(p0.mId)))? this.d.get(Integer.valueOf(p0.mId)).intValue(): 0x6979;
       return i;
    }
    public void t(BeautifyConfig p0){
       this.b = p0;
    }
}
