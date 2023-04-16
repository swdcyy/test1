package com.kwai.yoda.YodaInitConfig;
import java.lang.Object;
import com.kwai.yoda.YodaInitConfig$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ub7.f;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import com.kwai.yoda.b;
import com.kwai.yoda.c;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;

public class YodaInitConfig	// class@001165
{
    public int mBackButtonDrawable;
    public int mCloseButtonDrawable;
    public boolean mColdStartRequest;
    public int mCustomButtonDrawable;
    public f mDebugToolEnableSupplier;
    public List mDegradeCookieHosts;
    public Map mDegradeJsBridgeApiMap;
    public c mDocumentCookieProcessor;
    public f mEnableOfflinePackage;
    public f mEnableSetLLToCookie;
    public f mEnableSetLocationToCookie;
    public f mErrorReportJsEnable;
    public f mGlobalCookieHosts;
    public f mGlobalJsBridgeApiMap;
    public c mHttpOnlyCookieProcessor;
    public f mLocalAppConfigSupplier;
    public f mNetworkScoreSupplier;
    public b mNewClassMethodProvider;
    public boolean mPreInitSpringYoda;
    public f mRenderUrlBlackList;
    public f mRequestConfigTimeIntervalSupplier;
    public int mShareButtonDrawable;

    public void YodaInitConfig(){
       super();
    }
    public void YodaInitConfig(YodaInitConfig$a p0){
       super();
       if (p0 == null) {
          return;
       }
       this.mRequestConfigTimeIntervalSupplier = p0.a;
       this.mNetworkScoreSupplier = p0.b;
       this.mShareButtonDrawable = p0.c;
       this.mBackButtonDrawable = p0.d;
       this.mCloseButtonDrawable = p0.e;
       this.mCustomButtonDrawable = p0.f;
       this.mGlobalCookieHosts = p0.g;
       this.mGlobalJsBridgeApiMap = p0.h;
       this.mDegradeCookieHosts = p0.i;
       this.mDegradeJsBridgeApiMap = p0.j;
       this.mErrorReportJsEnable = p0.k;
       this.mDocumentCookieProcessor = p0.l;
       this.mHttpOnlyCookieProcessor = p0.m;
       this.mRenderUrlBlackList = p0.o;
       this.mPreInitSpringYoda = p0.p;
       this.mColdStartRequest = p0.q;
       this.mLocalAppConfigSupplier = p0.s;
       this.mDebugToolEnableSupplier = p0.r;
       this.mEnableSetLocationToCookie = p0.t;
       this.mEnableSetLLToCookie = p0.u;
       this.mEnableOfflinePackage = p0.v;
       this.mNewClassMethodProvider = p0.w;
       return;
    }
    public boolean enableOfflinePackage(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableOfflinePackage;
       if (obj == null) {
          return true;
       }
       return obj.get().booleanValue();
    }
    public boolean enableSetLLToCookie(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableSetLLToCookie;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public boolean enableSetLocationToCookie(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableSetLocationToCookie;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public int getBackButtonDrawable(){
       return this.mBackButtonDrawable;
    }
    public int getCloseButtonDrawable(){
       return this.mCloseButtonDrawable;
    }
    public int getCustomButtonDrawable(){
       return this.mCustomButtonDrawable;
    }
    public List getDegradeCookieHosts(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDegradeCookieHosts;
       if (obj != null) {
          return obj;
       }
       return Collections.emptyList();
    }
    public Map getDegradeJsBridgeApiMap(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDegradeJsBridgeApiMap;
       if (obj != null) {
          return obj;
       }
       return Collections.emptyMap();
    }
    public f getGlobalCookieHosts(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mGlobalCookieHosts;
       if (obj != null) {
          return obj;
       }
       return b.a;
    }
    public f getGlobalJsBridgeApiMap(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mGlobalJsBridgeApiMap;
       if (obj != null) {
          return obj;
       }
       return c.a;
    }
    public f getLocalAppConfigSupplier(){
       return this.mLocalAppConfigSupplier;
    }
    public Integer getNetworkScore(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mNetworkScoreSupplier;
       if (obj != null) {
          return obj.get();
       }
       return Integer.valueOf(-1);
    }
    public Map getRenderUrlBlackList(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRenderUrlBlackList;
       if (obj == null) {
          return null;
       }
       return obj.get();
    }
    public long getRequestConfigTimeInterval(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mRequestConfigTimeIntervalSupplier;
       long l = (obj != null && obj.get() != null)? this.mRequestConfigTimeIntervalSupplier.get().longValue(): 0;
       return l;
    }
    public int getShareButtonDrawable(){
       return this.mShareButtonDrawable;
    }
    public boolean isColdStartRequest(){
       return this.mColdStartRequest;
    }
    public boolean isDebugToolEnable(){
       Object obj = PatchProxy.apply(null, this, YodaInitConfig.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.mDebugToolEnableSupplier.get();
       }
       return obj.booleanValue();
    }
    public boolean isErrorReportJsEnable(){
       YodaInitConfig obj = PatchProxy.apply(null, this, YodaInitConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mErrorReportJsEnable;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public boolean isPreInitSpringYoda(){
       return this.mPreInitSpringYoda;
    }
    public boolean isSyncCookieEnable(){
       return false;
    }
}
