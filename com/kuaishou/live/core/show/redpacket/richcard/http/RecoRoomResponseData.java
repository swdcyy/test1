package com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponseData;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomResponseData$a;
import nsd.u;
import java.util.Map;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class RecoRoomResponseData implements Serializable	// class@000f8f
{
    public final int code;
    public final Map paramsMap;
    public final RecoRoomInfo[] redPackList;
    public static final RecoRoomResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       RecoRoomResponseData.Companion = new RecoRoomResponseData$a(null);
    }
    public void RecoRoomResponseData(int p0,Map p1,RecoRoomInfo[] p2){
       super();
       this.code = p0;
       this.paramsMap = p1;
       this.redPackList = p2;
    }
    public static RecoRoomResponseData copy$default(RecoRoomResponseData p0,int p1,Map p2,RecoRoomInfo[] p3,int p4,Object p5){
       RecoRoomResponseData code;
       RecoRoomResponseData paramsMap;
       RecoRoomResponseData redPackList;
       if (p4 & 0x01) {
          code = p0.code;
       }
       if (p4 & 0x02) {
          paramsMap = p0.paramsMap;
       }
       if (p4 & 0x04) {
          redPackList = p0.redPackList;
       }
       return p0.copy(code, paramsMap, redPackList);
    }
    public final int component1(){
       return this.code;
    }
    public final Map component2(){
       return this.paramsMap;
    }
    public final RecoRoomInfo[] component3(){
       return this.redPackList;
    }
    public final RecoRoomResponseData copy(int p0,Map p1,RecoRoomInfo[] p2){
       if (PatchProxy.isSupport(RecoRoomResponseData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, RecoRoomResponseData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new RecoRoomResponseData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoRoomResponseData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RecoRoomResponseData && (this.code == p0.code && (a.g(this.paramsMap, p0.paramsMap) && a.g(this.redPackList, p0.redPackList))))) {
          return true;
       }
       return false;
    }
    public final int getCode(){
       return this.code;
    }
    public final Map getParamsMap(){
       return this.paramsMap;
    }
    public final RecoRoomInfo[] getRedPackList(){
       return this.redPackList;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RecoRoomResponseData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       RecoRoomResponseData tparamsMap = this.paramsMap;
       int i1 = 0;
       int i2 = (tparamsMap != null)? tparamsMap.hashCode(): 0;
       i = (i + i2) * 31;
       tparamsMap = this.redPackList;
       if (tparamsMap != null) {
          i1 = Arrays.hashCode(tparamsMap);
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecoRoomResponseData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecoRoomResponseData\(code="+this.code+", paramsMap="+this.paramsMap+", redPackList="+Arrays.toString(this.redPackList)+"\)";
    }
}
