package com.kwai.yoda.session.logger.webviewload.XCacheInfo;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;

public final class XCacheInfo	// class@0012e4
{
    public CopyOnWriteArrayList a;
    public List b;
    public Long blinkInjectedEnd;
    public Boolean blinkSupport;
    public Long blinkSupportEt;
    public Long blinkSupportSt;
    public List bothInterceptBlinkUrls;
    public List c;
    public String cancelReason;
    public Long configInitTime;
    public CopyOnWriteArrayList d;
    public String e;
    public Boolean enablePreConnect;
    public String entry;
    public Set f;
    public Set g;
    public Map h;
    public Boolean hitDnsResolve;
    public Boolean hostPreConnected;
    public CopyOnWriteArrayList i;
    public Integer injectCodeCacheCount;
    public Set injectCodeCacheErrors;
    public Integer injectUrlsCount;
    public Integer injectUrlsJsCount;
    public String[] injectedCodeCacheUrls;
    public Integer injectedCodeCacheUrlsCount;
    public String[] injectedResourceUrls;
    public Integer injectedResourceUrlsCount;
    public Set j;
    public ConcurrentHashMap k;
    public Long ksPreConnectEt;
    public Integer ksPreConnectHostCount;
    public CopyOnWriteArraySet ksPreConnectHostList;
    public Boolean ksPreConnectResult;
    public Long ksPreConnectSt;
    public Integer ksPreConnectUsedHostCount;
    public List ksPreConnectUsedHostInfoList;
    public Integer ksPreConnectUsedUrlCount;
    public Integer ksResolveDNSHostCount;
    public CopyOnWriteArraySet ksResolveDNSHostList;
    public CopyOnWriteArraySet l;
    public CopyOnWriteArraySet m;
    public String mainDocCancelReason;
    public Long mainRenderFrameCreatedTime;
    public Boolean noSwitchConfig;
    public String[] notInjectedResourceUrls;
    public Integer notInjectedResourceUrlsCount;
    public Boolean offlineEnable;
    public PreConnectDomInfo preConnectDomInfo;
    public Long prepareHeadEnd;
    public Integer prepareInjectUrlsCount;
    public Long prepareRequestEnd;
    public Long prepareStart;
    public Integer prepareStatus;
    public Long prepareThreadEnd;
    public boolean requestBridgeCalled;
    public List requestBridgeInfo;
    public Integer resourceLoadBlinkCount;
    public List resourceLoadList;
    public Integer resourceLoadSystemCount;
    public List resourceReceivedResponseInfoList;
    public List resourceRunInfoList;
    public Integer resourceUrlsCount;
    public Long stableConfigInitTime;

    public void XCacheInfo(){
       super();
       Long longx = Long.valueOf(-1);
       this.stableConfigInitTime = longx;
       this.configInitTime = longx;
       this.prepareStart = longx;
       this.prepareThreadEnd = longx;
       this.prepareHeadEnd = longx;
       this.prepareRequestEnd = longx;
       this.prepareStatus = Integer.valueOf(-1);
       this.a = new CopyOnWriteArrayList();
       this.d = new CopyOnWriteArrayList();
       this.f = new CopyOnWriteArraySet();
       this.g = new CopyOnWriteArraySet();
       this.i = new CopyOnWriteArrayList();
       this.j = new CopyOnWriteArraySet();
       this.injectCodeCacheErrors = new CopyOnWriteArraySet();
       Boolean fALSE = Boolean.FALSE;
       this.hitDnsResolve = fALSE;
       this.enablePreConnect = fALSE;
       this.hostPreConnected = fALSE;
       this.requestBridgeInfo = new ArrayList();
       this.k = new ConcurrentHashMap();
       this.l = new CopyOnWriteArraySet();
       this.m = new CopyOnWriteArraySet();
    }
    public final String a(){
       return this.e;
    }
    public final CopyOnWriteArrayList b(){
       return this.i;
    }
    public final void c(String p0){
       this.e = p0;
    }
}
