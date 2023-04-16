package com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo;
import h16.n;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import h16.m;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$b;
import java.lang.Runnable;
import t45.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import h16.k;
import h16.o;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import u0c.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$c;
import dc5.c;
import u4d.a;
import android.content.SharedPreferences;
import fg6.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyRepo$readCustomConfigs$customList$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import u0c.b;
import v0c.a;
import java.lang.StringBuilder;
import km8.b;
import java.lang.System;
import trd.u;
import com.google.common.collect.Lists;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.math.BigDecimal;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import q0c.y1;
import gib.c;

public final class IMBeautyRepo implements n	// class@001daf
{
    public List a;
    public List b;
    public IMBeautifyResponse c;
    public static final IMBeautyRepo$a d;

    static {
       IMBeautyRepo.d = new IMBeautyRepo$a(null);
    }
    public void IMBeautyRepo(){
       super();
    }
    public BeautifyConfig M1(int p0){
       return m.c(this, p0);
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyRepo.class, "11")) {
          return;
       }
       a.p(p0, "configs");
       c.a(new IMBeautyRepo$b(p0));
       return;
    }
    public List b(){
       return m.e(this);
    }
    public BeautifyConfig c(){
       return m.g(this);
    }
    public int d(){
       Object[] objArray = null;
       IMBeautyRepo obj = PatchProxy.apply(objArray, this, IMBeautyRepo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj != null) {
          List oldSuiteInfo = obj.getOldSuiteInfoList();
          if (oldSuiteInfo != null) {
             Iterator iterator = oldSuiteInfo.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   if (obj1.isDefault != null) {
                      objArray = obj1;
                   }
                }
             }
          }
       }
       BeautifySuiteInfo mId = (objArray != null)? objArray.mId: -1;
       return mId;
    }
    public List e(){
       return m.f(this);
    }
    public k f(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, IMBeautyRepo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.t();
       IMBeautyRepo tc = this.c;
       if (tc != null) {
          objArray = tc.getBeautifyGroupInfoList();
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
       IMBeautyRepo obj = PatchProxy.apply(null, this, IMBeautyRepo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return this.r();
       }
       List list = a.a(obj);
       a.o(list, "BeautyDataManager.cloneConfigs\(default\)");
       this.a = null;
       return list;
    }
    public void j(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyRepo.class, "12")) {
          return;
       }
       c.a(new IMBeautyRepo$c(p0));
       return;
    }
    public boolean k(){
       return false;
    }
    public List l(){
       Object[] objArray = null;
       IMBeautyRepo obj = PatchProxy.apply(objArray, this, IMBeautyRepo.class, "6");
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
          c.g("IMBeautyRepo", "readCustomConfigs");
          String str = a.a.getString("im_beautify_configs", "");
          if (str == null) {
             str = "";
          }
          List list1 = a.a.i(str, new IMBeautyRepo$readCustomConfigs$customList$1().getType());
          ArrayList uArrayList = (list1 == null || list1.isEmpty())? 1: null;
          if (uArrayList) {
             return CollectionsKt__CollectionsKt.E();
          }else {
             uArrayList = new ArrayList();
             b.b(uArrayList, this.i());
             a.a(list1, uArrayList);
             this.s(list1, uArrayList);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                BeautifyConfig uBeautifyCon = iterator.next();
                BeautifyConfig uBeautifyCon1 = b.a(list1, uBeautifyCon.mId);
                if (uBeautifyCon1 != null) {
                   uBeautifyCon.copyFilterValue(uBeautifyCon1);
                }
             }
             return uArrayList;
          }
       }
    }
    public void m(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyRepo.class, "2")) {
          return;
       }
       a.p(p0, "list");
       this.b = p0;
       return;
    }
    public void n(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyRepo.class, "1")) {
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
       String obj = PatchProxy.apply(objArray, this, IMBeautyRepo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.getString(b.d("user")+"last_im_beautify_config", "");
       List list = this.i();
       if (list.isEmpty() ^ 0x01) {
          BeautifyConfig uBeautifyCon = a.a.h(obj, BeautifyConfig.class);
          if (uBeautifyCon != null) {
             uBeautifyCon.copyConfigInfo(b.a(list, uBeautifyCon.mId));
          }
          objArray = uBeautifyCon;
       }
       return objArray;
    }
    public List q(){
       Object obj = PatchProxy.apply(null, this, IMBeautyRepo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r();
    }
    public final List r(){
       ArrayList uArrayList;
       IMBeautyRepo c;
       BeautyFilterItem uBeautyFilte;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       IMBeautyRepo obj1 = PatchProxy.apply(objArray, obj, IMBeautyRepo.class, "9");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       this.t();
       obj1 = obj.c;
       if (obj1 != null && obj1 != null) {
          List oldSuiteInfo = obj1.getOldSuiteInfoList();
          if (oldSuiteInfo != null && (oldSuiteInfo.isEmpty() ^ 1) == 1) {
             long l = System.currentTimeMillis();
             obj1 = obj.c;
             if (obj1 != null) {
                oldSuiteInfo = obj1.getOldSuiteInfoList();
                if (oldSuiteInfo != null) {
                   uArrayList = new ArrayList(u.Y(oldSuiteInfo, 10));
                   Iterator iterator = oldSuiteInfo.iterator();
                   while (iterator.hasNext()) {
                      BeautifySuiteInfo uBeautifySui = iterator.next();
                      c = obj.c;
                      List beautifyItem = (c != null)? c.getBeautifyItemInfoList(): objArray;
                      BeautifyConfig uBeautifyCon = PatchProxy.applyTwoRefs(uBeautifySui, beautifyItem, obj, IMBeautyRepo.class, "15");
                      if (uBeautifyCon != patchProxyRe) {
                      }else {
                         uBeautifyCon = new BeautifyConfig();
                         uBeautifyCon.mId = uBeautifySui.mId;
                         uBeautifyCon.mName = uBeautifySui.mName;
                         uBeautifyCon.mNameResKey = uBeautifySui.mNameResKey;
                         uBeautifyCon.mIconResKey = uBeautifySui.mIconResKey;
                         uBeautifyCon.mIconUrl = uBeautifySui.mIconUrl;
                         uBeautifyCon.mIconCDNUrls = uBeautifySui.mIconCdnUrls;
                         uBeautifyCon.mResourcePathKey = uBeautifySui.mResourcePathKey;
                         uBeautifyCon.mLoggerName = uBeautifySui.mLogName;
                         uBeautifyCon.mUnSupportItemList = Lists.c(uBeautifySui.mUnSupportBeautifyList);
                         uBeautifyCon.mItemNameStyle = uBeautifySui.mItemNameStyle;
                         uBeautifyCon.mBeautifyTagInfo = uBeautifySui.mBeautifyTagInfo;
                         BeautifySuiteInfo mIntensity = uBeautifySui.mIntensity;
                         uBeautifyCon.mIntensity = mIntensity;
                         uBeautifyCon.mDefaultIntensity = mIntensity;
                         uBeautifyCon.mPassThroughParams = uBeautifySui.mPassThroughParams;
                         if (beautifyItem != null) {
                            ArrayList uArrayList1 = new ArrayList();
                            Iterator iterator1 = beautifyItem.iterator();
                            while (iterator1.hasNext()) {
                               uBeautyFilte = iterator1.next().clone();
                               if (uBeautyFilte != null) {
                                  uArrayList1.add(uBeautyFilte);
                               }
                            }
                            uBeautifyCon.mBeautyFilterItemList = uArrayList1;
                         }
                         c.g("IMBeautyRepo", "parse suite default : "+uBeautifySui.mId);
                         BigDecimal uBigDecimal = new BigDecimal(100);
                         Iterator iterator2 = uBeautifySui.mBeautifyItems.iterator();
                         while (iterator2.hasNext()) {
                            BeautifySuiteInfo$BeautifyItem uBeautifyIte = iterator2.next();
                            boolean b = false;
                            BeautyFilterItem.setFilterValue(uBeautifyCon, new BigDecimal(String.valueOf(uBeautifyIte.mBeautifyIntensity)).multiply(uBigDecimal).floatValue(), uBeautifyIte.mBeautifyItemId, b);
                            uBeautyFilte = uBeautifyCon.getBeautifyItemById(uBeautifyIte.mBeautifyItemId);
                            if (uBeautyFilte != null) {
                               BeautifySuiteInfo$BeautifyItem mMinValue = uBeautifyIte.mMinValue;
                               if (mMinValue - 1) {
                                  uBeautyFilte.mMinValue = mMinValue;
                               }
                               mMinValue = uBeautifyIte.mMaxValue;
                               if (mMinValue - Float.MAX_VALUE) {
                                  uBeautyFilte.mMaxValue = mMinValue;
                               }
                            }
                            BeautifySuiteInfo$BeautifyItem mIntensityLi = uBeautifyIte.mIntensityList;
                            if (mIntensityLi == null || mIntensityLi.isEmpty()) {
                               b = true;
                            }
                            if (!b) {
                               BeautifyConfig mBeautyFilte = uBeautifyCon.mBeautyFilterItemIntensityMap;
                               a.o(mBeautyFilte, "this.mBeautyFilterItemIntensityMap");
                               uBeautifyIte = uBeautifyIte.mIntensityList;
                               a.o(uBeautifyIte, "beautifyItem.mIntensityList");
                               mBeautyFilte.put(Integer.valueOf(uBeautifyIte.mBeautifyItemId), CollectionsKt___CollectionsKt.J5(uBeautifyIte));
                            }
                            b = false;
                         }
                      }
                      uArrayList.add(uBeautifyCon);
                      objArray = false;
                   }
                   c.g("IMBeautyRepo", "getDefaultConfigListFromServer cost "+(System.currentTimeMillis() - l)+' ');
                   return uArrayList;
                }
             }
             uArrayList = CollectionsKt__CollectionsKt.E();
             goto label_0167 ;
          }
       }
       c.g("IMBeautyRepo", "getDefaultConfigListFromServer empty 2");
       return CollectionsKt__CollectionsKt.E();
    }
    public final void s(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMBeautyRepo.class, "7")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             BeautifyConfig uBeautifyCon = iterator.next();
             BeautifyConfig uBeautifyCon1 = b.a(p1, uBeautifyCon.mId);
             if (uBeautifyCon1 != null) {
                a.o(uBeautifyCon1, "it");
                if (!PatchProxy.applyVoidTwoRefs(uBeautifyCon, uBeautifyCon1, this, IMBeautyRepo.class, "8") && uBeautifyCon.mIsV4Down != null) {
                   y1 oy1 = y1.h();
                   a.o(oy1, "BeautyVersionManager.instance\(\)");
                   if (!oy1.j()) {
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
          }
       }
       return;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, IMBeautyRepo.class, "14")) {
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
}
