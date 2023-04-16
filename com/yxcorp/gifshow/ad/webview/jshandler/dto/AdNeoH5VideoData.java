package com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData$adInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.AdNeoInfo;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.Base64;
import fg6.a;
import ok.c;
import java.nio.charset.Charset;
import com.google.gson.Gson;
import java.lang.Throwable;
import yx.j0;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AdNeoH5VideoData implements Serializable	// class@0018fd
{
    public final int action;
    public final p adInfo$delegate;
    public final String neoParams;
    public final String sessionId;
    public static final AdNeoH5VideoData$a Companion;
    public static final long serialVersionUID;

    static {
       AdNeoH5VideoData.Companion = new AdNeoH5VideoData$a(null);
    }
    public void AdNeoH5VideoData(){
       super(0, null, null, 7, null);
    }
    public void AdNeoH5VideoData(int p0,String p1,String p2){
       super();
       this.action = p0;
       this.sessionId = p1;
       this.neoParams = p2;
       this.adInfo$delegate = s.c(new AdNeoH5VideoData$adInfo$2(this));
    }
    public void AdNeoH5VideoData(int p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static AdNeoH5VideoData copy$default(AdNeoH5VideoData p0,int p1,String p2,String p3,int p4,Object p5){
       AdNeoH5VideoData action;
       AdNeoH5VideoData sessionId;
       AdNeoH5VideoData neoParams;
       if (p4 & 0x01) {
          action = p0.action;
       }
       if (p4 & 0x02) {
          sessionId = p0.sessionId;
       }
       if (p4 & 0x04) {
          neoParams = p0.neoParams;
       }
       return p0.copy(action, sessionId, neoParams);
    }
    public final boolean checkAdInfo(){
       boolean b;
       AdNeoInfo obj = PatchProxy.apply(null, this, AdNeoH5VideoData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getAdInfo() != null) {
          obj = this.getAdInfo();
          a.m(obj);
          if (obj.mPageId > 0) {
             obj = this.getAdInfo();
             a.m(obj);
             if (obj.mSubPageId > 0) {
                b = true;
             label_0039 :
                return b;
             }
          }
       }
       b = false;
       goto label_0039 ;
    }
    public final int component1(){
       return this.action;
    }
    public final String component2(){
       return this.sessionId;
    }
    public final String component3(){
       return this.neoParams;
    }
    public final AdNeoH5VideoData copy(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AdNeoH5VideoData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, AdNeoH5VideoData.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new AdNeoH5VideoData(p0, p1, p2);
    }
    public final AdNeoInfo decodeNeoParams(){
       byte[] obj = PatchProxy.apply(null, this, AdNeoH5VideoData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.neoParams)) {
          return null;
       }
       obj = Base64.decode(this.neoParams, 8);
       a.o(obj, "bytes");
       Charset c = c.c;
       a.o(c, "Charsets.UTF_8");
       String str = new String(obj, c);
       return a.a.h(str, AdNeoInfo.class);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdNeoH5VideoData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AdNeoH5VideoData && (this.action == p0.action && (a.g(this.sessionId, p0.sessionId) && a.g(this.neoParams, p0.neoParams))))) {
          return true;
       }
       return false;
    }
    public final int getAction(){
       return this.action;
    }
    public final AdNeoInfo getAdInfo(){
       Object obj = PatchProxy.apply(null, this, AdNeoH5VideoData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.adInfo$delegate.getValue();
    }
    public final String getNeoParams(){
       return this.neoParams;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, AdNeoH5VideoData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.action * 31;
       AdNeoH5VideoData tsessionId = this.sessionId;
       int i1 = 0;
       int i2 = (tsessionId != null)? tsessionId.hashCode(): 0;
       i = (i + i2) * 31;
       tsessionId = this.neoParams;
       if (tsessionId != null) {
          i1 = tsessionId.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdNeoH5VideoData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdNeoH5VideoData\(action="+this.action+", sessionId="+this.sessionId+", neoParams="+this.neoParams+"\)";
    }
}
