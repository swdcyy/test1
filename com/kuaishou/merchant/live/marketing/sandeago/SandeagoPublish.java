package com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.live.basic.common.sandeabiz.SandeBizPublishException;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemResponseModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import fg6.a;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel$InputFormat;
import com.google.gson.Gson;
import n64.d0;
import java.lang.Long;
import ot3.p0;
import lnc.a1;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRuleConfig$StockConfig;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import j14.c;
import java.lang.StringBuilder;
import com.kuaishou.merchant.api.live.sandeabiz.model.SandeagoCategoryItemModel;
import com.kuaishou.merchant.live.marketing.sandeago.model.MultiSkuModel;
import com.kuaishou.merchant.live.marketing.sandeago.model.MultiSkuModel$MultiSkuPublishModel;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.lang.Number;

public class SandeagoPublish extends DefaultObservable	// class@001a36
{
    public int SANDEAGO_TYPE_NORMAL;
    public int SANDEAGO_TYPE_POINTER;
    public String mAuditId;
    public Map mFilledProperties;
    public File mImageFile;
    public String mImageId;
    public String mImageUrl;
    public boolean mIsMultiSku;
    public String mLastServerTitle;
    public List mMultiSkuList;
    public UserInfo mPointerUser;
    public long mPriceCent;
    public String mPriceText;
    public Map mPropertyOptions;
    public List mSelectCategoryList;
    public Map mServiceMap;
    public String mSkuCode;
    public long mStock;
    public SandeagoRuleConfig$StockConfig mStockConfig;
    public String mStockText;
    public String mTitle;
    public String mTitlePrefix;
    public static final long serialVersionUID = 0x2f3b6e18491be773;

    public void SandeagoPublish(){
       super();
       this.SANDEAGO_TYPE_NORMAL = 0;
       this.SANDEAGO_TYPE_POINTER = 1;
       this.mMultiSkuList = new ArrayList();
       this.mServiceMap = new HashMap();
    }
    public void checkCategoryList(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "8")) {
          return;
       }
       if (!q.f(this.mSelectCategoryList)) {
          return;
       }
       throw new SandeBizPublishException(0x7f104383);
    }
    public void checkInputPropertyValid(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "18")) {
          return;
       }
       SandeagoPublish tmFilledProp = this.mFilledProperties;
       if (tmFilledProp != null && this.mPropertyOptions != null) {
          Iterator iterator = tmFilledProp.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             SandeagoPropertyItemResponseModel value = uEntry.getValue();
             if (TextUtils.equals("TEXT", value.mInputType)) {
                SandeagoPropertyItemModel mInputConfig = this.mPropertyOptions.get(uEntry.getKey()).mInputConfig;
                if (mInputConfig != null) {
                   SandeagoPropertyItemModel$InputFormat inputFormat = a.a.c(mInputConfig.get("inputFormat"), SandeagoPropertyItemModel$InputFormat.class);
                   if (d0.c(value.mPropValue, inputFormat)) {
                   }else {
                      throw new SandeBizPublishException(inputFormat.mMessage);
                   }
                }
             }
          }
       }
       return;
    }
    public void checkMultiSku(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "13")) {
          return;
       }
       if (this.isMultiSkuEmpty()) {
          throw new SandeBizPublishException(0x7f104355);
       }
       if (!this.isMultiSkuNameAvailable()) {
          throw new SandeBizPublishException(0x7f10437a);
       }
       if (this.isMultiSkuStockAvailable()) {
          return;
       }
       throw new SandeBizPublishException(0x7f104378);
    }
    public void checkPrice(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "10")) {
          return;
       }
       this.checkPrice(100, 0x989680);
       return;
    }
    public void checkPrice(long p0,long p1){
       if (PatchProxy.isSupport(SandeagoPublish.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, SandeagoPublish.class, "11")) {
          return;
       }
       SandeagoPublish tmPriceCent = this.mPriceCent;
       if (tmPriceCent - p0 < 0) {
          throw new SandeBizPublishException(a1.r(0x7f104344, p0.m(p0)));
       }
       if (tmPriceCent - p1 <= 0) {
          return;
       }
       throw new SandeBizPublishException(a1.r(0x7f104343, p0.m(p1)));
    }
    public void checkProperty(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "17")) {
          return;
       }
       if (this.isPropertyFilledOrNoProperty()) {
          return;
       }
       throw new SandeBizPublishException(0x7f10436e);
    }
    public void checkStock(){
       SandeagoPublish tmStock;
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "12")) {
          return;
       }
       SandeagoPublish tmStockConfi = this.mStockConfig;
       SandeagoPublish sandeagoPubl = 1;
       if (tmStockConfi != null) {
          tmStock = this.mStock;
          if (tmStock - tmStockConfi.mStockLimit > 0 || tmStock - sandeagoPubl < 0) {
             throw new SandeBizPublishException(this.mStockConfig.mStockAlert);
          }
       }else {
          tmStock = this.mStock;
          if (tmStock - 200 > 0 || tmStock - sandeagoPubl < 0) {
             throw new SandeBizPublishException(0x7f10437f);
          }
       }
       return;
    }
    public void checkTitle(){
       if (PatchProxy.applyVoid(null, this, SandeagoPublish.class, "9")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mTitle)) {
          return;
       }
       throw new SandeBizPublishException(0x7f104380);
    }
    public String getCategoryId(){
       Object obj = PatchProxy.apply(null, this, SandeagoPublish.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.d(this.mSelectCategoryList);
    }
    public String getCategoryIds(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SandeagoPublish obj = PatchProxy.apply(objArray, this, SandeagoPublish.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mSelectCategoryList;
       String str = PatchProxy.applyOneRefs(obj, objArray, c.class, "6");
       if (str != patchProxyRe) {
       }else if(q.f(obj)){
          str = "";
       }else {
          StringBuilder str1 = "";
          int i = 0;
          while (i < obj.size()) {
             str1 = str1+obj.get(i).mCategoryName;
             int i1 = obj.size() - 1;
             if (i < i1) {
                str1 = str1+"/";
             }
             i = i + 1;
          }
          str = str1;
       }
       return str;
    }
    public String getMultiSkuList(){
       ArrayList obj = PatchProxy.apply(null, this, SandeagoPublish.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mIsMultiSku == null) {
          return "";
       }
       obj = new ArrayList();
       Iterator iterator = this.mMultiSkuList.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().getPublishModel());
       }
       return a.a.q(obj);
    }
    public int getPointerMode(){
       SandeagoPublish tSANDEAGO_TY = (this.mPointerUser != null)? this.SANDEAGO_TYPE_POINTER: this.SANDEAGO_TYPE_NORMAL;
       return tSANDEAGO_TY;
    }
    public String getPointerUserId(){
       SandeagoPublish tmPointerUse = this.mPointerUser;
       UserInfo mId = (tmPointerUse != null)? tmPointerUse.mId: null;
       return mId;
    }
    public boolean isMultiSkuEmpty(){
       Iterator obj = PatchProxy.apply(null, this, SandeagoPublish.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsMultiSku != null) {
          obj = this.mMultiSkuList.iterator();
          while (obj.hasNext()) {
             if (obj.next().isEmpty()) {
                return true;
             }
          }
       }
       return false;
    }
    public boolean isMultiSkuNameAvailable(){
       Iterator obj = PatchProxy.apply(null, this, SandeagoPublish.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsMultiSku != null) {
          obj = this.mMultiSkuList.iterator();
          while (obj.hasNext()) {
             if (!obj.next().isSkuNameAvailable()) {
                return false;
             }
          }
       }
       return true;
    }
    public boolean isMultiSkuStockAvailable(){
       Iterator obj = PatchProxy.apply(null, this, SandeagoPublish.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsMultiSku != null) {
          obj = this.mMultiSkuList.iterator();
          while (obj.hasNext()) {
             if (!obj.next().isSkuStockAvailable()) {
                return false;
             }
          }
       }
       return true;
    }
    public boolean isPropertyFilledOrNoProperty(){
       Iterator obj = PatchProxy.apply(null, this, SandeagoPublish.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.h(this.mPropertyOptions)) {
          return true;
       }
       obj = this.mPropertyOptions.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          Map$Entry uEntry = obj.next();
          SandeagoPropertyItemModel value = uEntry.getValue();
          if (value.mRequired != null && value.mPreConstraint == null) {
             SandeagoPublish tmFilledProp = this.mFilledProperties;
             if (tmFilledProp != null) {
                SandeagoPropertyItemResponseModel sandeagoProp = tmFilledProp.get(uEntry.getKey());
                if (sandeagoProp != null && !TextUtils.isEmpty(sandeagoProp.mPropValue)) {
                }
             }
             break ;
          }
       }
       return false;
    }
    public boolean isSelectCategory(){
       Object obj = PatchProxy.apply(null, this, SandeagoPublish.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mSelectCategoryList) ^ 0x01);
    }
    public void setPriceCent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SandeagoPublish.class, "2")) {
          return;
       }
       this.mPriceText = p0;
       if (TextUtils.isEmpty(p0)) {
          this.mPriceCent = 0;
          return;
       }else {
          try{
             this.mPriceCent = p0.p(p0);
          }catch(java.lang.Exception e0){
             a.g(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoPublish", "setPriceCent");
             this.mPriceCent = 0;
          }
          return;
       }
    }
    public void setStock(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SandeagoPublish.class, "3")) {
          return;
       }
       this.mStockText = p0;
       if (TextUtils.isEmpty(p0)) {
          this.mStock = 0;
          return;
       }else {
          try{
             this.mStock = Long.parseLong(p0);
          }catch(java.lang.Exception e0){
             a.g(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoPublish", "setStock");
             this.mStock = 0;
          }
          return;
       }
    }
    public void setStockConfig(SandeagoRuleConfig$StockConfig p0){
       this.mStockConfig = p0;
    }
    public long updateTotalStock(){
       Object obj = PatchProxy.apply(null, this, SandeagoPublish.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (this.mIsMultiSku != null) {
          Iterator iterator = this.mMultiSkuList.iterator();
          while (iterator.hasNext()) {
             l = l + iterator.next().getSkuStock();
          }
       }
       this.mStock = l;
       return l;
    }
}
