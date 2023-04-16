package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.MixLottieCardData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.MixLottieCardData$a;
import nsd.u;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MixLottieCardData implements Serializable	// class@0015e4
{
    public final String actionBar;
    public final String afterReceiveActionbar;
    public final String date;
    public final String desc;
    public final String name;
    public final String price;
    public final Integer receiveStatus;
    public final String requestData;
    public final String title;
    public static final MixLottieCardData$a Companion;
    public static final long serialVersionUID;

    static {
       MixLottieCardData.Companion = new MixLottieCardData$a(null);
    }
    public void MixLottieCardData(String p0,String p1,String p2,String p3,String p4,String p5,Integer p6,String p7,String p8){
       super();
       this.title = p0;
       this.price = p1;
       this.name = p2;
       this.desc = p3;
       this.date = p4;
       this.actionBar = p5;
       this.receiveStatus = p6;
       this.afterReceiveActionbar = p7;
       this.requestData = p8;
    }
    public static MixLottieCardData copy$default(MixLottieCardData p0,String p1,String p2,String p3,String p4,String p5,String p6,Integer p7,String p8,String p9,int p10,Object p11){
       MixLottieCardData mixLottieCar = p0;
       int i = p10;
       MixLottieCardData title = (i & 0x01)? mixLottieCar.title: p1;
       MixLottieCardData price = (i & 0x02)? mixLottieCar.price: p2;
       MixLottieCardData name = (i & 0x04)? mixLottieCar.name: p3;
       MixLottieCardData desc = (i & 0x08)? mixLottieCar.desc: p4;
       MixLottieCardData date = (i & 0x10)? mixLottieCar.date: p5;
       MixLottieCardData actionBar = (i & 0x20)? mixLottieCar.actionBar: p6;
       MixLottieCardData receiveStatu = (i & 0x40)? mixLottieCar.receiveStatus: p7;
       MixLottieCardData afterReceive = (i & 0x0080)? mixLottieCar.afterReceiveActionbar: p8;
       MixLottieCardData requestData = (i & 0x0100)? mixLottieCar.requestData: p9;
       return p0.copy(title, price, name, desc, date, actionBar, receiveStatu, afterReceive, requestData);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.price;
    }
    public final String component3(){
       return this.name;
    }
    public final String component4(){
       return this.desc;
    }
    public final String component5(){
       return this.date;
    }
    public final String component6(){
       return this.actionBar;
    }
    public final Integer component7(){
       return this.receiveStatus;
    }
    public final String component8(){
       return this.afterReceiveActionbar;
    }
    public final String component9(){
       return this.requestData;
    }
    public final MixLottieCardData copy(String p0,String p1,String p2,String p3,String p4,String p5,Integer p6,String p7,String p8){
       Object obj;
       if (PatchProxy.isSupport(MixLottieCardData.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, MixLottieCardData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       MixLottieCardData mixLottieCar = new MixLottieCardData(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MixLottieCardData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MixLottieCardData && (a.g(this.title, p0.title) && (a.g(this.price, p0.price) && (a.g(this.name, p0.name) && (a.g(this.desc, p0.desc) && (a.g(this.date, p0.date) && (a.g(this.actionBar, p0.actionBar) && (a.g(this.receiveStatus, p0.receiveStatus) && (a.g(this.afterReceiveActionbar, p0.afterReceiveActionbar) && a.g(this.requestData, p0.requestData))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MixLottieCardData obj = PatchProxy.apply(null, this, MixLottieCardData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MixLottieCardData tprice = this.price;
       int i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.name;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.desc;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.date;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.actionBar;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.receiveStatus;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.afterReceiveActionbar;
       i2 = (tprice != null)? tprice.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprice = this.requestData;
       if (tprice != null) {
          i = tprice.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MixLottieCardData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MixLottieCardData\(title="+this.title+", price="+this.price+", name="+this.name+", desc="+this.desc+", date="+this.date+", actionBar="+this.actionBar+", receiveStatus="+this.receiveStatus+", afterReceiveActionbar="+this.afterReceiveActionbar+", requestData="+this.requestData+"\)";
    }
}
