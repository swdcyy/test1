package com.yxcorp.gifshow.prettify.beauty.a0;
import h16.n;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import h16.m;
import java.util.List;
import h16.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import h16.o;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import j8c.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import w46.b;
import q0c.p2;
import java.lang.Iterable;
import ok.h;
import qk.y;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import u0c.a;
import bn8.a;
import java.util.Iterator;

public class a0 implements n	// class@0010f8
{
    public PostBeautifyResponse a;
    public static List b;

    public void a0(){
       super();
    }
    public BeautifyConfig M1(int p0){
       return m.c(this, p0);
    }
    public void a(List p0){
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
       Object obj = PatchProxy.apply(objArray, this, a0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = BeautyDataHelper.d.h();
       }
       a0 ta = this.a;
       if (ta != null) {
          objArray = ta.mBeautifyGroupInfoList;
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
       Object[] objArray1;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, uoa0, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a0.b;
       if (obj != null) {
          objArray1 = new Object[0];
          a.D().y("WhatsUpBeautyRepo", "readDefaultConfigs use cache", objArray1);
       }else {
          Object[] objArray2 = new Object[0];
          a.D().y("WhatsUpBeautyRepo", "read from server", objArray2);
          Object obj1 = PatchProxy.apply(objArray, this, uoa0, "5");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(this.a == null){
             this.a = BeautyDataHelper.d.h();
          }
          a0 ta = this.a;
          if (ta == null || q.f(ta.mWhatsUpSuiteInfoList)) {
             objArray1 = new Object[0];
             a.D().t("WhatsUpBeautyRepo", "server data is null", objArray1);
             PostBeautifyResponse postBeautify = BeautyDataHelper.d.f();
             this.a = postBeautify;
             if (postBeautify == null || q.f(postBeautify.mWhatsUpSuiteInfoList)) {
                objArray1 = new Object[0];
                a.D().t("WhatsUpBeautyRepo", "asset data is null", objArray1);
                uArrayList = new ArrayList();
             label_0093 :
                ArrayList uArrayList1 = uArrayList;
             }
          }
          uArrayList = Lists.c(y.x(this.a.mWhatsUpSuiteInfoList, new p2(this)));
          goto label_0093 ;
          a0.b = obj;
       }
       return a.a(obj);
    }
    public void j(BeautifyConfig p0){
    }
    public boolean k(){
       return m.i(this);
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, a0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i();
    }
    public void m(List p0){
    }
    public void n(List p0){
    }
    public void o(){
       a0.b = null;
    }
    public BeautifyConfig p(){
       Object[] objArray;
       BeautifyConfig uBeautifyCon;
       Iterator obj = PatchProxy.apply(null, this, a0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (a.i()) {
          objArray = new Object[i];
          a.D().y("WhatsUpBeautyRepo", "last config is off, return null", objArray);
          return null;
       }else {
          obj = this.i().iterator();
          while (true) {
             if (obj.hasNext()) {
                uBeautifyCon = obj.next();
                if (uBeautifyCon.mId != -1) {
                   break ;
                }
             }else {
                objArray = new Object[i];
                a.D().y("WhatsUpBeautyRepo", "configs is empty, return null", objArray);
                return null;
             }
          }
          return uBeautifyCon;
       }
    }
    public List q(){
       Object obj = PatchProxy.apply(null, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i();
    }
}
