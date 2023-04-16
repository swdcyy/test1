package com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Set;
import h16.b;
import java.lang.Iterable;
import ok.o;
import qk.y;
import h16.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Map$Entry;
import java.lang.StringBuilder;

public class BeautifyConfig implements Serializable, Cloneable	// class@0012c7
{
    public boolean isDefault;
    public BeautifyTagInfo mBeautifyTagInfo;
    public Map mBeautyFilterItemIntensityMap;
    public List mBeautyFilterItemList;
    public Map mBeautyFilterItemMap;
    public String mBrightItem;
    public float mDefaultIntensity;
    public Map mDeformConfigMap;
    public List mIconCDNUrls;
    public int mIconResId;
    public String mIconResKey;
    public String mIconUrl;
    public int mId;
    public float mIntensity;
    public boolean mIsRecoConfig;
    public boolean mIsV4Down;
    public ItemNameStyle mItemNameStyle;
    public String mLoggerName;
    public String mName;
    public int mNameResId;
    public String mNameResKey;
    public String mPassThroughParams;
    public String mResourcePathKey;
    public Map mSmoothSkinConfigMap;
    public List mUnSupportItemList;
    public boolean mUseQuickBeauty;
    public int mVersion;
    public static final long serialVersionUID = 0x1;

    public void BeautifyConfig(){
       super();
       this.mName = "";
       this.mNameResKey = "";
       this.mIconUrl = "";
       this.mIconResKey = "";
       this.mIconResId = 0;
       this.isDefault = false;
       this.mIconCDNUrls = null;
       this.mPassThroughParams = "";
       this.mUnSupportItemList = new ArrayList();
       this.mBeautyFilterItemList = new ArrayList();
       this.mBeautyFilterItemMap = new HashMap();
       this.mIsRecoConfig = false;
       this.mIsV4Down = false;
       this.mVersion = 2;
       this.mId = -1;
       this.mIntensity = 0;
       this.mDefaultIntensity = 0;
       this.mBeautyFilterItemIntensityMap = new HashMap();
       this.mSmoothSkinConfigMap = new ConcurrentHashMap();
       this.mDeformConfigMap = new ConcurrentHashMap();
       this.mBrightItem = "";
       this.mUseQuickBeauty = false;
    }
    public static void diffToFull(JSONObject p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BeautifyConfig.class, "9")) {
          return;
       }
       BeautifyConfig uBeautifyCon = a.a.h(p0.toString(), BeautifyConfig.class);
       p1.mDeformConfigMap.putAll(uBeautifyCon.mDeformConfigMap);
       p1.mSmoothSkinConfigMap.putAll(uBeautifyCon.mSmoothSkinConfigMap);
       return;
    }
    public final boolean a(float p0,float p1){
       if (PatchProxy.isSupport(BeautifyConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BeautifyConfig.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (Math.abs((p0 - p1)) - 0x3c23d70a < 0)? true: false;
       return b;
    }
    public BeautifyConfig clone(){
       BeautifyConfig obj = PatchProxy.apply(null, this, BeautifyConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.mId = this.mId;
          ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
          obj.mDeformConfigMap = uConcurrentH;
          uConcurrentH.putAll(this.mDeformConfigMap);
          uConcurrentH = new ConcurrentHashMap();
          obj.mSmoothSkinConfigMap = uConcurrentH;
          uConcurrentH.putAll(this.mSmoothSkinConfigMap);
          obj.mBeautyFilterItemIntensityMap.putAll(this.mBeautyFilterItemIntensityMap);
          obj.mIsV4Down = this.mIsV4Down;
          obj.mVersion = this.mVersion;
          obj.mNameResKey = this.mNameResKey;
          obj.mName = this.mName;
          obj.mNameResId = this.mNameResId;
          obj.mIconUrl = this.mIconUrl;
          obj.mIconCDNUrls = this.mIconCDNUrls;
          obj.mIconResKey = this.mIconResKey;
          obj.mIconResId = this.mIconResId;
          obj.mBeautifyTagInfo = this.mBeautifyTagInfo;
          obj.mResourcePathKey = this.mResourcePathKey;
          obj.mUnSupportItemList = this.mUnSupportItemList;
          obj.mItemNameStyle = this.mItemNameStyle;
          obj.mIntensity = this.mIntensity;
          obj.mPassThroughParams = this.mPassThroughParams;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public void copyConfigInfo(BeautifyConfig p0){
       if (p0 == null) {
          return;
       }
       this.mBeautyFilterItemIntensityMap = p0.mBeautyFilterItemIntensityMap;
       this.mBeautyFilterItemList = p0.mBeautyFilterItemList;
       this.mBeautyFilterItemMap = p0.mBeautyFilterItemMap;
       this.mUnSupportItemList = p0.mUnSupportItemList;
       this.mResourcePathKey = p0.mResourcePathKey;
       this.mBeautifyTagInfo = p0.mBeautifyTagInfo;
       this.mName = p0.mName;
       this.mLoggerName = p0.mLoggerName;
       this.mNameResKey = p0.mNameResKey;
       this.mNameResId = p0.mNameResId;
       this.mIconCDNUrls = p0.mIconCDNUrls;
       this.mIconUrl = p0.mIconUrl;
       this.mIconResKey = p0.mIconResKey;
       this.mIconResId = p0.mIconResId;
       this.isDefault = p0.isDefault;
       this.mItemNameStyle = p0.mItemNameStyle;
       this.mIsRecoConfig = p0.mIsRecoConfig;
       this.mPassThroughParams = p0.mPassThroughParams;
       return;
    }
    public void copyFilterValue(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautifyConfig.class, "4")) {
          return;
       }
       if (p0 != null && p0 != this) {
          this.mBrightItem = p0.mBrightItem;
          this.mDeformConfigMap.clear();
          this.mDeformConfigMap.putAll(p0.mDeformConfigMap);
          this.mSmoothSkinConfigMap.clear();
          this.mSmoothSkinConfigMap.putAll(p0.mSmoothSkinConfigMap);
          this.mIntensity = p0.mIntensity;
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautifyConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof BeautifyConfig) {
          return super.equals(p0);
       }
       boolean b = (this.mDeformConfigMap.equals(p0.mDeformConfigMap) && this.mSmoothSkinConfigMap.equals(p0.mSmoothSkinConfigMap))? true: false;
       return b;
    }
    public JsonObject fullToDiff(BeautifyConfig p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, BeautifyConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.x(this).r();
       y.b(p0.mSmoothSkinConfigMap.entrySet(), new b(this, obj.e0("smoothSkin").r()));
       y.b(p0.mDeformConfigMap.entrySet(), new c(this, obj.e0("faceDeform").r()));
       return obj;
    }
    public BeautyFilterItem getBeautifyItemById(int p0){
       Iterator obj;
       if (PatchProxy.isSupport(BeautifyConfig.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BeautifyConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mBeautyFilterItemMap.isEmpty()) {
          obj = this.mBeautyFilterItemList.iterator();
          while (obj.hasNext()) {
             BeautyFilterItem uBeautyFilte = obj.next();
             this.mBeautyFilterItemMap.put(Integer.valueOf(uBeautyFilte.mId), uBeautyFilte);
          }
       }
       return this.mBeautyFilterItemMap.get(Integer.valueOf(p0));
    }
    public boolean hasNeedToDropFpsItemEffect(List p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, BeautifyConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p0)) {
          return false;
       }
       obj = this.mBeautyFilterItemList.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          BeautyFilterItem uBeautyFilte = obj.next();
          if (uBeautyFilte != null && (p0.contains(Integer.valueOf(uBeautyFilte.mId)) && BeautyFilterItem.getFilterValue(this, uBeautyFilte) - null)) {
             break ;
          }
       }
       return true;
    }
    public boolean isEfficacious(){
       Iterator obj = PatchProxy.apply(null, this, BeautifyConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mSmoothSkinConfigMap.entrySet().iterator();
       while (true) {
          if (obj.hasNext()) {
             if (obj.next().getValue().floatValue()) {
                return true;
             }
             continue ;
          }else {
             obj = this.mDeformConfigMap.entrySet().iterator();
             while (true) {
                if (obj.hasNext()) {
                   if (obj.next().getValue().floatValue()) {
                      return true;
                   }
                   continue ;
                }else {
                }
             }
          }
       }
       return false;
    }
    public boolean isNewBeautySuite(){
       BeautifyConfig tmId = this.mId;
       boolean b = (tmId >= 30 && tmId <= 34)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BeautifyConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BeautifyConfig{mIsV4Down="+this.mIsV4Down+", mVersion="+this.mVersion+", mId="+this.mId+", mSmoothSkinConfigMap="+this.mSmoothSkinConfigMap+", mDeformConfigMap="+this.mDeformConfigMap+", mBrightItem=\'"+this.mBrightItem+", mUseQuickBeauty="+this.mUseQuickBeauty+'}';
    }
}
