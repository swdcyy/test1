package com.yxcorp.gifshow.prettify.beauty.z;
import h16.n;
import java.lang.Object;
import u0c.c;
import java.lang.String;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import q0c.e2;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.util.Iterator;
import j8c.a;
import w46.b;
import q0c.g2;
import java.lang.Runnable;
import t45.c;
import h16.m;
import java.lang.Number;
import h80.j;
import h80.k;
import h16.k;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import h16.o;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import u0c.a;
import q0c.f2;
import java.util.Collection;
import ekd.q;
import oe6.e;
import android.content.SharedPreferences;
import fg6.a;
import com.yxcorp.gifshow.prettify.beauty.RecordBeautyRepo$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.ArrayList;
import u0c.b;
import v0c.a;
import com.kwai.feature.post.api.componet.prettify.beauty.util.BeautifyConfigDeserializeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import q0c.d2;
import ok.h;
import com.google.common.collect.Lists;
import q0c.y1;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;

public class z implements n	// class@00112b
{
    public List a;
    public List b;
    public o c;
    public PostBeautifyResponse d;
    public static List e;
    public static List f;

    public void z(){
       super();
       this.c = new c("record", true, true);
    }
    public BeautifyConfig M1(int p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oz, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.i(), new e2(p0)).orNull();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "8")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().isNewBeautySuite()) {
                break ;
             }
          }else {
             c.a(new g2(p0));
             return;
          }
       }
       Object[] objArray = new Object[0];
       a.D().t("RecordBeautyRepo", "ignore wrong data version", objArray);
       return;
    }
    public List b(){
       return m.e(this);
    }
    public BeautifyConfig c(){
       return m.g(this);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (k.d() != null) {
          return k.d().d();
       }
       return 3;
    }
    public List e(){
       return m.f(this);
    }
    public k f(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, z.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = BeautyDataHelper.d.h();
       }
       z td = this.d;
       if (td != null) {
          objArray = td.mBeautifyGroupInfoList;
       }
       return new k(objArray);
    }
    public o g(){
       return this.c;
    }
    public MedicalBeautyConfig h(){
       return m.d(this);
    }
    public List i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z oz = z.class;
       Object obj = PatchProxy.apply(null, this, oz, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       List list = PatchProxy.apply(null, this, oz, "1");
       if (list != patchProxyRe) {
       }else {
          List e = z.e;
          if (e != null) {
             list = a.a(e);
             z.e = null;
          }else if(this.a != null){
             list = a.a(this.a);
             this.a = null;
          }else {
             list = this.r();
          }
       }
       return list;
    }
    public void j(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "9")) {
          return;
       }
       c.a(new f2(p0));
       return;
    }
    public boolean k(){
       return m.i(this);
    }
    public List l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z oz = z.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, oz, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       List list = PatchProxy.apply(objArray, this, oz, "4");
       if (list != patchProxyRe) {
       }else if(z.f != null){
          list = a.a(z.f);
          z.f = objArray;
       }else if(!q.f(this.b)){
          list = a.a(this.b);
          this.b = objArray;
       }else {
          List list1 = a.a.i(e.a.getString("beautify_configs", ""), new RecordBeautyRepo$1(this).getType());
          if (q.f(list1)) {
             list = new ArrayList();
          }else {
             obj = new ArrayList();
             b.b(obj, this.i());
             a.a(list1, obj);
             this.s(list1, obj);
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                BeautifyConfig uBeautifyCon = iterator.next();
                BeautifyConfig uBeautifyCon1 = b.a(list1, uBeautifyCon.mId);
                if (uBeautifyCon1 != null) {
                   uBeautifyCon.copyFilterValue(uBeautifyCon1);
                }
             }
             list = obj;
          }
       }
       return list;
    }
    public void m(List p0){
       z.f = p0;
    }
    public void n(List p0){
       z.e = p0;
    }
    public void o(){
       z.e = null;
       z.f = null;
    }
    public BeautifyConfig p(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, z.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a.getString("last_beautify_config", "");
       List list = this.i();
       if (!q.f(list)) {
          BeautifyConfig uBeautifyCon = a.a.h(obj, BeautifyConfig.class);
          if (uBeautifyCon != null) {
             uBeautifyCon.copyConfigInfo(b.a(list, uBeautifyCon.mId));
          }
          objArray = uBeautifyCon;
       }
       return objArray;
    }
    public List q(){
       Object obj = PatchProxy.apply(null, this, z.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.d() != null && !k.d().e()) {
          return new ArrayList();
       }
       return this.r();
    }
    public final List r(){
       z obj = PatchProxy.apply(null, this, z.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = BeautyDataHelper.d.h();
       }
       obj = this.d;
       if (obj == null || q.f(obj.mRecordSuiteInfoList)) {
          return new ArrayList();
       }else {
          return Lists.c(y.x(this.d.mRecordSuiteInfoList, new d2(this)));
       }
    }
    public final void s(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z.class, "11")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             BeautifyConfig uBeautifyCon = iterator.next();
             BeautifyConfig uBeautifyCon1 = b.a(p1, uBeautifyCon.mId);
             if (uBeautifyCon1 == null || (!PatchProxy.applyVoidTwoRefs(uBeautifyCon, uBeautifyCon1, this, z.class, "12") && (uBeautifyCon.mIsV4Down != null && !y1.h().j()))) {
                int i = 12;
                if (!BeautyFilterItem.getFilterValue(uBeautifyCon, i)) {
                   BeautyFilterItem.copyBeautyItemValue(uBeautifyCon1, uBeautifyCon, i);
                }
                i = 13;
                if (!BeautyFilterItem.getFilterValue(uBeautifyCon, i)) {
                   BeautyFilterItem.copyBeautyItemValue(uBeautifyCon1, uBeautifyCon, i);
                }
                i = 14;
                if (!BeautyFilterItem.getFilterValue(uBeautifyCon, i)) {
                   BeautyFilterItem.copyBeautyItemValue(uBeautifyCon1, uBeautifyCon, i);
                }
                uBeautifyCon.mIsV4Down = false;
             }
          }
       }
       return;
    }
}
