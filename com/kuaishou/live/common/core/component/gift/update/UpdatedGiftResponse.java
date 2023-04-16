package com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.io.Serializable;
import la6.b;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UpdatedGiftResponse implements Serializable, b	// class@001327
{
    public List giftList;
    public int slideDuration;
    public static final UpdatedGiftResponse$a Companion;
    public static final long serialVersionUID;

    static {
       UpdatedGiftResponse.Companion = new UpdatedGiftResponse$a(null);
    }
    public void UpdatedGiftResponse(){
       super(0, null, 3, null);
    }
    public void UpdatedGiftResponse(int p0,List p1){
       a.p(p1, "giftList");
       super();
       this.slideDuration = p0;
       this.giftList = p1;
    }
    public void UpdatedGiftResponse(int p0,List p1,int p2,u p3){
       ArrayList uArrayList;
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          uArrayList = new ArrayList();
       }
       super(p0, uArrayList);
       return;
    }
    public static UpdatedGiftResponse copy$default(UpdatedGiftResponse p0,int p1,List p2,int p3,Object p4){
       UpdatedGiftResponse slideDuratio;
       UpdatedGiftResponse giftList;
       if (p3 & 0x01) {
          slideDuratio = p0.slideDuration;
       }
       if (p3 & 0x02) {
          giftList = p0.giftList;
       }
       return p0.copy(slideDuratio, giftList);
    }
    public final int component1(){
       return this.slideDuration;
    }
    public final List component2(){
       return this.giftList;
    }
    public final UpdatedGiftResponse copy(int p0,List p1){
       if (PatchProxy.isSupport(UpdatedGiftResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, UpdatedGiftResponse.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "giftList");
       return new UpdatedGiftResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UpdatedGiftResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UpdatedGiftResponse && (this.slideDuration == p0.slideDuration && a.g(this.giftList, p0.giftList)))) {
          return true;
       }
       return false;
    }
    public final List getGiftList(){
       return this.giftList;
    }
    public List getItems(){
       return this.giftList;
    }
    public final int getSlideDuration(){
       return this.slideDuration;
    }
    public boolean hasMore(){
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UpdatedGiftResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.slideDuration * 31;
       UpdatedGiftResponse tgiftList = this.giftList;
       int i1 = (tgiftList != null)? tgiftList.hashCode(): 0;
       return (i + i1);
    }
    public final void setGiftList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpdatedGiftResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.giftList = p0;
       return;
    }
    public final void setSlideDuration(int p0){
       this.slideDuration = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UpdatedGiftResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UpdatedGiftResponse\(slideDuration="+this.slideDuration+", giftList="+this.giftList+"\)";
    }
}
