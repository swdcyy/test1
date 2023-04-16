package com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.vfc.model.VfcAction;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NonReceiveCouponDialog implements Serializable	// class@0015ba
{
    public final VfcAction action;
    public final String background;
    public final String btnBgImg;
    public final String btnText;
    public final String desc;
    public final String linkUrl;
    public final String shareObjectId;
    public final String title;
    public final String vUserId;
    public static final NonReceiveCouponDialog$a Companion;
    public static final long serialVersionUID;

    static {
       NonReceiveCouponDialog.Companion = new NonReceiveCouponDialog$a(null);
    }
    public void NonReceiveCouponDialog(String p0,String p1,String p2,String p3,String p4,String p5,VfcAction p6,String p7,String p8){
       a.p(p0, "btnText");
       a.p(p1, "desc");
       a.p(p6, "action");
       super();
       this.btnText = p0;
       this.desc = p1;
       this.linkUrl = p2;
       this.title = p3;
       this.background = p4;
       this.btnBgImg = p5;
       this.action = p6;
       this.vUserId = p7;
       this.shareObjectId = p8;
    }
    public static NonReceiveCouponDialog copy$default(NonReceiveCouponDialog p0,String p1,String p2,String p3,String p4,String p5,String p6,VfcAction p7,String p8,String p9,int p10,Object p11){
       NonReceiveCouponDialog nonReceiveCo = p0;
       int i = p10;
       NonReceiveCouponDialog btnText = (i & 0x01)? nonReceiveCo.btnText: p1;
       NonReceiveCouponDialog desc = (i & 0x02)? nonReceiveCo.desc: p2;
       NonReceiveCouponDialog linkUrl = (i & 0x04)? nonReceiveCo.linkUrl: p3;
       NonReceiveCouponDialog title = (i & 0x08)? nonReceiveCo.title: p4;
       NonReceiveCouponDialog background = (i & 0x10)? nonReceiveCo.background: p5;
       NonReceiveCouponDialog btnBgImg = (i & 0x20)? nonReceiveCo.btnBgImg: p6;
       NonReceiveCouponDialog action = (i & 0x40)? nonReceiveCo.action: p7;
       NonReceiveCouponDialog vUserId = (i & 0x0080)? nonReceiveCo.vUserId: p8;
       NonReceiveCouponDialog shareObjectI = (i & 0x0100)? nonReceiveCo.shareObjectId: p9;
       return p0.copy(btnText, desc, linkUrl, title, background, btnBgImg, action, vUserId, shareObjectI);
    }
    public final String component1(){
       return this.btnText;
    }
    public final String component2(){
       return this.desc;
    }
    public final String component3(){
       return this.linkUrl;
    }
    public final String component4(){
       return this.title;
    }
    public final String component5(){
       return this.background;
    }
    public final String component6(){
       return this.btnBgImg;
    }
    public final VfcAction component7(){
       return this.action;
    }
    public final String component8(){
       return this.vUserId;
    }
    public final String component9(){
       return this.shareObjectId;
    }
    public final NonReceiveCouponDialog copy(String p0,String p1,String p2,String p3,String p4,String p5,VfcAction p6,String p7,String p8){
       NonReceiveCouponDialog obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       if (PatchProxy.isSupport(NonReceiveCouponDialog.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = oobject2;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, NonReceiveCouponDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "btnText");
       a.p(p1, "desc");
       a.p(oobject2, "action");
       obj = new NonReceiveCouponDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NonReceiveCouponDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NonReceiveCouponDialog && (a.g(this.btnText, p0.btnText) && (a.g(this.desc, p0.desc) && (a.g(this.linkUrl, p0.linkUrl) && (a.g(this.title, p0.title) && (a.g(this.background, p0.background) && (a.g(this.btnBgImg, p0.btnBgImg) && (a.g(this.action, p0.action) && (a.g(this.vUserId, p0.vUserId) && a.g(this.shareObjectId, p0.shareObjectId))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NonReceiveCouponDialog obj = PatchProxy.apply(null, this, NonReceiveCouponDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.btnText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NonReceiveCouponDialog tdesc = this.desc;
       int i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.linkUrl;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.title;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.background;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.btnBgImg;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.action;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.vUserId;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.shareObjectId;
       if (tdesc != null) {
          i = tdesc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NonReceiveCouponDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NonReceiveCouponDialog\(btnText="+this.btnText+", desc="+this.desc+", linkUrl="+this.linkUrl+", title="+this.title+", background="+this.background+", btnBgImg="+this.btnBgImg+", action="+this.action+", vUserId="+this.vUserId+", shareObjectId="+this.shareObjectId+"\)";
    }
}
