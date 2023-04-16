package com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$PageInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$TabStyles;
import java.util.Iterator;

public class LiveMerchantHalfMixContainerTabParams implements Serializable	// class@00164c
{
    public List mContainers;
    public int mSelectTabIndex;
    public LiveMerchantHalfMixContainerTabParams$TabStyles mTabStyles;
    public static final long serialVersionUID = 0xb562ae53696f5ceb;

    public void LiveMerchantHalfMixContainerTabParams(){
       super();
    }
    public static boolean isTabParamsValid(LiveMerchantHalfMixContainerTabParams p0){
       HashMap hashMap;
       LiveMerchantHalfMixContainerTabParams$PageInfo pageInfo;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveMerchantHalfMixContainerTabParams.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       if (p0 == null) {
          a.g(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabParams", "mTabParams is null");
          return false;
       }else if(p0.mTabStyles == null){
          hashMap = new HashMap();
          hashMap.put("LiveMerchantHalfMixContainerTabParams", p0.toString());
          a.p(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabParams", "mTabStyles is null", hashMap);
          return false;
       }else if(q.f(p0.mContainers)){
          hashMap = new HashMap();
          hashMap.put("LiveMerchantHalfMixContainerTabParams", p0.toString());
          a.p(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabParams", "params.mContainers is empty", hashMap);
          return false;
       }else if(p0.mContainers.size() < 2 || p0.mContainers.size() > 3){
          hashMap = new HashMap();
          hashMap.put("LiveMerchantHalfMixContainerTabParams", p0.toString());
          a.p(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabParams", "params.mContainers size is "+p0.mContainers.size()+" not in [2,3]", hashMap);
          return false;
       }else {
          int i = 0;
          while (true) {
             boolean b = true;
             if (i >= p0.mContainers.size()) {
                return b;
             }
             pageInfo = p0.mContainers.get(i);
             Object obj2 = PatchProxy.applyOneRefs(pageInfo, obj, LiveMerchantHalfMixContainerTabParams.class, "2");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else if(pageInfo != null && !TextUtils.isEmpty(pageInfo.mUrl)){
                b = false;
             }
             b1 = b;
             if (!b1) {
                break ;
             }else {
                i = i + 1;
             }
          }
          hashMap = new HashMap();
          hashMap.put("LiveMerchantHalfMixContainerTabParams", p0.toString());
          a.p(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabParams", "pageInfo.url is null", hashMap);
          return false;
       }
    }
    public boolean needSwitchSelectTab(){
       int i;
       LiveMerchantHalfMixContainerTabParams obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mSelectTabIndex;
       boolean b = false;
       if (obj > null) {
          LiveMerchantHalfMixContainerTabParams tmContainers = this.mContainers;
          tmContainers = (tmContainers == null)? 0: tmContainers.size();
          if (obj < tmContainers) {
             b = true;
          }
       }
       return b;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LiveMerchantHalfMixContainerTabParams.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "LiveMerchantHalfMixContainerTabParams{mTabStyles=";
       LiveMerchantHalfMixContainerTabParams tmTabStyles = this.mTabStyles;
       String str = "";
       String str1 = (tmTabStyles == null)? str: tmTabStyles.toString();
       obj = obj+str1+", mContainers=";
       Iterator obj1 = PatchProxy.apply(objArray, this, LiveMerchantHalfMixContainerTabParams.class, "4");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else if(q.f(this.mContainers)){
          StringBuilder str2 = "";
          obj1 = this.mContainers.iterator();
          while (obj1.hasNext()) {
             LiveMerchantHalfMixContainerTabParams$PageInfo pageInfo = obj1.next();
             if (pageInfo == null) {
                str2 = str2+"null\n";
             }else {
                str2 = str2+pageInfo.toString()+"\n";
             }
          }
          str = str2;
       }
       return obj+str+'}';
    }
}
