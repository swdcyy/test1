package com.kuaishou.live.common.core.component.gift.domain.effect.bean.AllGiftsAckData;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AllGiftsAckData implements Serializable	// class@001198
{
    public final List giftList;

    public void AllGiftsAckData(){
       super(null, 1, null);
    }
    public void AllGiftsAckData(List p0){
       a.p(p0, "giftList");
       super();
       this.giftList = p0;
    }
    public void AllGiftsAckData(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       super(p0);
       return;
    }
    public static AllGiftsAckData copy$default(AllGiftsAckData p0,List p1,int p2,Object p3){
       AllGiftsAckData giftList;
       if (p2 & 0x01) {
          giftList = p0.giftList;
       }
       return p0.copy(giftList);
    }
    public final List component1(){
       return this.giftList;
    }
    public final AllGiftsAckData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AllGiftsAckData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "giftList");
       return new AllGiftsAckData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AllGiftsAckData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AllGiftsAckData && a.g(this.giftList, p0.giftList))) {
          return true;
       }
       return false;
    }
    public final List getGiftList(){
       return this.giftList;
    }
    public int hashCode(){
       AllGiftsAckData obj = PatchProxy.apply(null, this, AllGiftsAckData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AllGiftsAckData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AllGiftsAckData\(giftList="+this.giftList+"\)";
    }
}
