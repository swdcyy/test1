package com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$PreloadState;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem;
import qsd.d;
import java.util.Collection;
import java.lang.Integer;
import java.util.Map;
import java.lang.Boolean;
import fg6.a;
import qkd.c;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.beauty.util.BeautifyConfigDeserializeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$b;
import com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse;
import sq.a;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$c;
import com.google.gson.JsonObject;
import java.lang.Enum;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.feature.post.api.startup.PostBeautyConfig;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper$d;
import java.lang.Runnable;
import t45.c;
import p1c.a;
import p1c.d;
import q0c.y1;
import brd.t;
import t45.d;
import brd.z;
import r0c.c;
import erd.g;
import r0c.d;
import r0c.e;
import crd.b;
import h16.g;

public final class BeautyDataHelper	// class@001105
{
    public static PostBeautifyResponse a;
    public static LiveBeautifyResponse b;
    public static BeautyDataHelper$PreloadState c;
    public static final BeautyDataHelper d;

    static {
       BeautyDataHelper.d = new BeautyDataHelper();
       BeautyDataHelper.c = BeautyDataHelper$PreloadState.NOT_START;
    }
    public void BeautyDataHelper(){
       super();
    }
    public static final PostBeautifyResponse a(BeautyDataHelper p0){
       return BeautyDataHelper.a;
    }
    public static final void b(BeautyDataHelper p0,BeautyDataHelper$PreloadState p1){
       BeautyDataHelper.c = p1;
    }
    public final BeautifyConfig c(BeautifySuiteInfo p0,List p1){
       BeautifyConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, BeautyDataHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "suiteInfo");
       obj = new BeautifyConfig();
       obj.mId = p0.mId;
       obj.mName = p0.mName;
       obj.mNameResKey = p0.mNameResKey;
       obj.mIconResKey = p0.mIconResKey;
       obj.mIconUrl = p0.mIconUrl;
       obj.mIconCDNUrls = p0.mIconCdnUrls;
       obj.mResourcePathKey = p0.mResourcePathKey;
       obj.mLoggerName = p0.mLogName;
       obj.mUnSupportItemList = Lists.c(p0.mUnSupportBeautifyList);
       obj.mItemNameStyle = p0.mItemNameStyle;
       obj.mBeautifyTagInfo = p0.mBeautifyTagInfo;
       BeautifySuiteInfo mIntensity = p0.mIntensity;
       obj.mIntensity = mIntensity;
       obj.mDefaultIntensity = mIntensity;
       obj.mPassThroughParams = p0.mPassThroughParams;
       if (p1 != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             BeautyFilterItem uBeautyFilte = iterator.next().clone();
             if (uBeautyFilte != null) {
                uArrayList.add(uBeautyFilte);
             }
          }
          obj.mBeautyFilterItemList = uArrayList;
       }
       Object[] objArray = new Object[0];
       p3.D().w("BeautyDataHelper", "parse suite default : "+p0.mId, objArray);
       Iterator iterator1 = p0.mBeautifyItems.iterator();
       while (iterator1.hasNext()) {
          BeautifySuiteInfo$BeautifyItem uBeautifyIte = iterator1.next();
          float f = uBeautifyIte.mBeautifyIntensity * 100.00f;
          f = f * 100.00f;
          f = (float)d.H0(f) / 100.00f;
          BeautyFilterItem.setFilterValue(obj, f, uBeautifyIte.mBeautifyItemId, 0);
          BeautyFilterItem beautifyItem = obj.getBeautifyItemById(uBeautifyIte.mBeautifyItemId);
          if (beautifyItem != null) {
             BeautifySuiteInfo$BeautifyItem mMinValue = uBeautifyIte.mMinValue;
             if (mMinValue - 1) {
                beautifyItem.mMinValue = mMinValue;
             }
             mMinValue = uBeautifyIte.mMaxValue;
             if (mMinValue - Float.MAX_VALUE) {
                beautifyItem.mMaxValue = mMinValue;
             }
          }
          BeautifySuiteInfo$BeautifyItem mIntensityLi = uBeautifyIte.mIntensityList;
          BeautifyConfig uBeautifyCon = (mIntensityLi == null || mIntensityLi.isEmpty())? 1: null;
          if (!uBeautifyCon) {
             uBeautifyCon = obj.mBeautyFilterItemIntensityMap;
             a.o(uBeautifyCon, "this.mBeautyFilterItemIntensityMap");
             uBeautifyCon.put(Integer.valueOf(uBeautifyIte.mBeautifyItemId), new ArrayList(uBeautifyIte.mIntensityList));
          }
       }
       return obj;
    }
    public final boolean d(){
       Object[] objArray = null;
       PostBeautifyResponse obj = PatchProxy.apply(objArray, this, BeautyDataHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h();
       if (obj != null) {
          objArray = obj.mMedicalBeautyConfig;
       }
       boolean b = (objArray != null)? true: false;
       return b;
    }
    public final List e(){
       ArrayList obj = PatchProxy.apply(null, this, BeautyDataHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ArrayList();
          List list = a.a.i(c.m("beauty_parts"), new BeautyDataHelper$a().getType());
          if (list != null) {
             List list1 = list;
          }
       }catch(java.lang.Exception e1){
          PostUtils.D("BeautyDataHelper", "parse default beautifyItem failed", new BeautifyConfigDeserializeException("", e1));
       }
       return obj;
    }
    public final PostBeautifyResponse f(){
       PostBeautifyResponse obj = PatchProxy.apply(null, this, BeautyDataHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.i(c.m("post_beauty"), new BeautyDataHelper$b().getType());
          if (obj != null) {
             obj.mBeautifyItemInfoList = this.e();
          }
          if (obj != null) {
             PostBeautifyResponse mBeautifyIte = obj.mBeautifyItemInfoList;
             a.o(mBeautifyIte, "it.mBeautifyItemInfoList");
             PostBeautifyResponse mBeautifyGro = obj.mBeautifyGroupInfoList;
             a.o(mBeautifyGro, "it.mBeautifyGroupInfoList");
             BeautyDataHelper.d.k(mBeautifyIte, mBeautifyGro);
          }
          Object[] objArray = new Object[0];
          p3.D().w("BeautyDataHelper", "get post beautify data from default json", objArray);
          return obj;
       }catch(java.lang.Exception e1){
          PostUtils.D("BeautyDataHelper", "parse default post json failed", new BeautifyConfigDeserializeException("", e1));
          return null;
       }
    }
    public final LiveBeautifyResponse g(){
       Object[] objArray;
       LiveBeautifyResponse liveBeautify;
       Throwable throwable;
       LiveBeautifyResponse obj = PatchProxy.apply(null, this, BeautyDataHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       String str = "BeautyDataHelper";
       if (BeautyDataHelper.b != null) {
          objArray = new Object[i];
          p3.D().w(str, "get live beautify data from memory cache", objArray);
          return BeautyDataHelper.b;
       }else {
          obj = a.d(LiveBeautifyResponse.class);
          if (obj != null) {
             objArray = new Object[i];
             p3.D().w(str, "get live beautify data from server cache", objArray);
             BeautyDataHelper.b = obj;
             return obj;
          }else {
             try{
                liveBeautify = a.a.i(c.m("live_beauty"), new BeautyDataHelper$c().getType());
                if (liveBeautify != null) {
                   liveBeautify.mBeautifyItemInfoList = this.e();
                }
                objArray = new Object[i];
                p3.D().w(str, "get live beautify data from default json", objArray);
             label_0078 :
                if (liveBeautify != null) {
                   LiveBeautifyResponse mBeautifyIte = liveBeautify.mBeautifyItemInfoList;
                   a.o(mBeautifyIte, "it.mBeautifyItemInfoList");
                   LiveBeautifyResponse mBeautifyGro = liveBeautify.mBeautifyGroupInfoList;
                   a.o(mBeautifyGro, "it.mBeautifyGroupInfoList");
                   BeautyDataHelper.d.k(mBeautifyIte, mBeautifyGro);
                   BeautyDataHelper.b = liveBeautify;
                }
                return liveBeautify;
             }catch(java.lang.Exception e1){
                liveBeautify = obj;
                throwable = e1;
             }catch(java.lang.Exception e0){
             }
             PostUtils.D(str, "parse default live json failed", new BeautifyConfigDeserializeException("", throwable));
             goto label_0078 ;
          }
       }
    }
    public final PostBeautifyResponse h(){
       Object[] objArray;
       PostBeautifyResponse obj = PatchProxy.apply(null, this, BeautyDataHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (BeautyDataHelper.a != null) {
          objArray = new Object[i];
          p3.D().w("BeautyDataHelper", "get post beautify data from memory cache", objArray);
          return BeautyDataHelper.a;
       }else {
          obj = a.g(PostBeautifyResponse.class);
          if (obj != null) {
             objArray = new Object[i];
             p3.D().w("BeautyDataHelper", "get post beautify data from server cache", objArray);
             BeautyDataHelper.a = obj;
             return obj;
          }else {
             BeautyDataHelper.a = this.f();
             return BeautyDataHelper.a;
          }
       }
    }
    public final void i(String p0){
       PostBeautifyResponse a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyDataHelper.class, "2")) {
          return;
       }
       a.p(p0, "bizName");
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("bizName", p0);
       jsonObject.c0("state", BeautyDataHelper.c.name());
       jsonObject.a0("localVersion", Integer.valueOf(a.h()));
       a = BeautyDataHelper.a;
       a = (a != null)? a.mVersion: -1;
       jsonObject.a0("memoryVersion", Integer.valueOf(a));
       PostUtils.x("PREFETCH_BEAUTY_CONFIG", jsonObject.toString());
       return;
    }
    public final void j(PostBeautyConfig p0){
       String str2;
       int i1;
       BeautyDataHelper uBeautyDataH = BeautyDataHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBeautyDataH, "1")) {
          return;
       }
       int i = a.h();
       String str = a.e();
       a.o(str, "DefaultPreferenceHelper.¡­tBeautifyLastAppVersion\(\)");
       String str1 = a.f();
       a.o(str1, "DefaultPreferenceHelper.¡­tPostBeautifyLastUserId\(\)");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       if (qCurrentUser == null || !qCurrentUser.isValidUser()) {
          str2 = "";
       }else {
          str2 = qCurrentUser.getId();
          a.o(str2, "user.id");
       }
       if (p0 != null && (p0.mBeautyResponseVersion <= i && (!TextUtils.equals(str, a.m) || !TextUtils.equals(str1, str2)))) {
          BeautyDataHelper.c = BeautyDataHelper$PreloadState.SERVER_REQUESTING;
          p3 op3 = p3.D();
          StringBuilder str3 = "start sync post beauty data, "+i+" :";
          p0 = (p0 != null)? p0.mBeautyResponseVersion: -1;
          Object[] objArray = new Object[0];
          op3.w("BeautyDataHelper", str3+p0+"last app "+"lastAppVersion "+str+", current : "+a.m+"lastUserId "+str1+" ,current: "+str2, objArray);
          if (!PatchProxy.isSupport(uBeautyDataH) || !PatchProxy.applyVoidTwoRefs(str2, Integer.valueOf(i), this, uBeautyDataH, "3")) {
             Object[] objArray1 = new Object[0];
             p3.D().w("BeautyDataHelper", "syncPostBeautifyData start", objArray1);
             y1 oy1 = y1.h();
             a.o(oy1, "BeautyVersionManager.instance\(\)");
             d.a().f(oy1.b(), i, 2).observeOn(d.a).doOnNext(c.b).observeOn(d.c).subscribe(new d(str2), e.b);
          }
       }else {
          Object[] objArray2 = new Object[0];
          p3.D().w("BeautyDataHelper", "server version not update : "+i, objArray2);
          BeautyDataHelper.c = BeautyDataHelper$PreloadState.LOCAL_REQUESTING;
          c.a(BeautyDataHelper$d.b);
       }
       return;
    }
    public final void k(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautyDataHelper.class, "11")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          Iterator iterator1 = og.mItemIds.iterator();
          while (iterator1.hasNext()) {
             Integer integer = iterator1.next();
             Iterator iterator2 = p0.iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   BeautyFilterItem uBeautyFilte = iterator2.next();
                   int itemId = uBeautyFilte.getItemId();
                   if (integer != null && itemId == integer.intValue()) {
                      uBeautyFilte.mBeautifyGroupInfo = og;
                   }
                }else {
                   continue ;
                }
             }
             return;
          }
       }
    }
}
