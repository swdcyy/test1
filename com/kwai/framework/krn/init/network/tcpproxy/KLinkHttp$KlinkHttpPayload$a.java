package com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$a;
import com.kwai.framework.krn.init.network.tcpproxy.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload;
import com.google.protobuf.GeneratedMessageLite;
import z86.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;
import com.google.protobuf.ByteString;
import java.lang.Number;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;

public final class KLinkHttp$KlinkHttpPayload$a extends GeneratedMessageLite$Builder implements a	// class@0015f3
{

    public void KLinkHttp$KlinkHttpPayload$a(){
       super(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE);
    }
    public void KLinkHttp$KlinkHttpPayload$a(a p0){
       super(KLinkHttp$KlinkHttpPayload.DEFAULT_INSTANCE);
    }
    public KLinkHttp$KlinkHttpPayload$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KLinkHttp$KlinkHttpPayload$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.addHttpHeaderKeys(p0);
       return this;
    }
    public KLinkHttp$KlinkHttpPayload$a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KLinkHttp$KlinkHttpPayload$a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.addHttpHeaderValues(p0);
       return this;
    }
    public KLinkHttp$KlinkHttpPayload$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KLinkHttp$KlinkHttpPayload$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setHttpUrl(p0);
       return this;
    }
    public KLinkHttp$KlinkHttpPayload$a d(KLinkHttp$KlinkHttpPayload$Method p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KLinkHttp$KlinkHttpPayload$a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setMethod(p0);
       return this;
    }
    public ByteString getHttpBody(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getHttpBody();
    }
    public int getHttpCode(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getHttpCode();
    }
    public String getHttpHeaderKeys(int p0){
       if (PatchProxy.isSupport(KLinkHttp$KlinkHttpPayload$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KLinkHttp$KlinkHttpPayload$a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getHttpHeaderKeys(p0);
    }
    public ByteString getHttpHeaderKeysBytes(int p0){
       if (PatchProxy.isSupport(KLinkHttp$KlinkHttpPayload$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KLinkHttp$KlinkHttpPayload$a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getHttpHeaderKeysBytes(p0);
    }
    public int getHttpHeaderKeysCount(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getHttpHeaderKeysCount();
    }
    public List getHttpHeaderKeysList(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getHttpHeaderKeysList());
    }
    public String getHttpHeaderValues(int p0){
       if (PatchProxy.isSupport(KLinkHttp$KlinkHttpPayload$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KLinkHttp$KlinkHttpPayload$a.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getHttpHeaderValues(p0);
    }
    public ByteString getHttpHeaderValuesBytes(int p0){
       if (PatchProxy.isSupport(KLinkHttp$KlinkHttpPayload$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KLinkHttp$KlinkHttpPayload$a.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getHttpHeaderValuesBytes(p0);
    }
    public int getHttpHeaderValuesCount(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getHttpHeaderValuesCount();
    }
    public List getHttpHeaderValuesList(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getHttpHeaderValuesList());
    }
    public String getHttpUrl(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getHttpUrl();
    }
    public ByteString getHttpUrlBytes(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getHttpUrlBytes();
    }
    public KLinkHttp$KlinkHttpPayload$Method getMethod(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMethod();
    }
    public int getMethodValue(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getMethodValue();
    }
}
