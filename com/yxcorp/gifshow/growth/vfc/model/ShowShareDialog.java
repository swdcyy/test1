package com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.growth.vfc.model.VfcInviteSelectorType;
import com.yxcorp.gifshow.growth.vfc.model.NormalInviteInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ShowShareDialog implements Serializable	// class@0015c2
{
    public final String background;
    public final String btnBgImg;
    public final String btnText;
    public final String couponBg;
    public final String couponFg;
    public final List couponList;
    public final String headImg;
    public final VfcInviteSelectorType inviteSelector;
    public final String logTracker;
    public final NormalInviteInfo normalInviteInfo;
    public final String ruleLink;
    public final String ruleName;
    public final String scrollShadow;
    public final String shareObjectId;
    public final String title;
    public final String tokenExtParams;
    public final String topShadow;
    public static final ShowShareDialog$a Companion;
    public static final long serialVersionUID;

    static {
       ShowShareDialog.Companion = new ShowShareDialog$a(null);
    }
    public void ShowShareDialog(String p0,String p1,String p2,String p3,String p4,String p5,String p6,List p7,String p8,VfcInviteSelectorType p9,NormalInviteInfo p10,String p11,String p12,String p13,String p14,String p15,String p16){
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       Object obj9 = p11;
       Object obj10 = p12;
       Object obj11 = p13;
       Object obj12 = p14;
       Object obj13 = p15;
       Object obj14 = p16;
       a.p(obj, "background");
       a.p(obj1, "scrollShadow");
       a.p(obj2, "topShadow");
       a.p(obj3, "couponBg");
       a.p(obj4, "couponFg");
       a.p(obj5, "btnBgImg");
       a.p(obj6, "btnText");
       a.p(obj7, "couponList");
       a.p(obj8, "headImg");
       a.p(obj9, "ruleLink");
       a.p(obj10, "ruleName");
       a.p(obj11, "shareObjectId");
       a.p(obj12, "title");
       a.p(obj13, "logTracker");
       a.p(obj14, "tokenExtParams");
       super();
       Object obj15 = this;
       obj15.background = obj;
       obj15.scrollShadow = obj1;
       obj15.topShadow = obj2;
       obj15.couponBg = obj3;
       obj15.couponFg = obj4;
       obj15.btnBgImg = obj5;
       obj15.btnText = obj6;
       obj15.couponList = obj7;
       obj15.headImg = obj8;
       obj15.inviteSelector = p9;
       obj15.normalInviteInfo = p10;
       obj15.ruleLink = obj9;
       obj15.ruleName = obj10;
       obj15.shareObjectId = obj11;
       obj15.title = obj12;
       obj15.logTracker = obj13;
       obj15.tokenExtParams = obj14;
    }
    public static ShowShareDialog copy$default(ShowShareDialog p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,List p8,String p9,VfcInviteSelectorType p10,NormalInviteInfo p11,String p12,String p13,String p14,String p15,String p16,String p17,int p18,Object p19){
       int i1;
       ShowShareDialog showShareDia = p0;
       int i = p18;
       ShowShareDialog background = (i & 0x01)? showShareDia.background: p1;
       ShowShareDialog scrollShadow = (i & 0x02)? showShareDia.scrollShadow: p2;
       ShowShareDialog topShadow = (i & 0x04)? showShareDia.topShadow: p3;
       ShowShareDialog couponBg = (i & 0x08)? showShareDia.couponBg: p4;
       ShowShareDialog couponFg = (i & 0x10)? showShareDia.couponFg: p5;
       ShowShareDialog btnBgImg = (i & 0x20)? showShareDia.btnBgImg: p6;
       ShowShareDialog btnText = (i & 0x40)? showShareDia.btnText: p7;
       ShowShareDialog couponList = (i & 0x0080)? showShareDia.couponList: p8;
       ShowShareDialog headImg = (i & 0x0100)? showShareDia.headImg: p9;
       ShowShareDialog inviteSelect = (i & 0x0200)? showShareDia.inviteSelector: p10;
       ShowShareDialog normalInvite = (i & 0x0400)? showShareDia.normalInviteInfo: p11;
       ShowShareDialog ruleLink = (i & 0x0800)? showShareDia.ruleLink: p12;
       ShowShareDialog ruleName = (i & 0x1000)? showShareDia.ruleName: p13;
       ShowShareDialog shareObjectI = (i & 0x2000)? showShareDia.shareObjectId: p14;
       ShowShareDialog showShareDia1 = shareObjectI;
       shareObjectI = (i & 0x4000)? showShareDia.title: p15;
       ShowShareDialog showShareDia2 = shareObjectI;
       shareObjectI = (i & 0x8000)? showShareDia.logTracker: p16;
       ShowShareDialog tokenExtPara = (i & 0x10000)? showShareDia.tokenExtParams: p17;
       return p0.copy(background, scrollShadow, topShadow, couponBg, couponFg, btnBgImg, btnText, couponList, headImg, inviteSelect, normalInvite, ruleLink, ruleName, showShareDia1, showShareDia2, shareObjectI, tokenExtPara);
    }
    public final String component1(){
       return this.background;
    }
    public final VfcInviteSelectorType component10(){
       return this.inviteSelector;
    }
    public final NormalInviteInfo component11(){
       return this.normalInviteInfo;
    }
    public final String component12(){
       return this.ruleLink;
    }
    public final String component13(){
       return this.ruleName;
    }
    public final String component14(){
       return this.shareObjectId;
    }
    public final String component15(){
       return this.title;
    }
    public final String component16(){
       return this.logTracker;
    }
    public final String component17(){
       return this.tokenExtParams;
    }
    public final String component2(){
       return this.scrollShadow;
    }
    public final String component3(){
       return this.topShadow;
    }
    public final String component4(){
       return this.couponBg;
    }
    public final String component5(){
       return this.couponFg;
    }
    public final String component6(){
       return this.btnBgImg;
    }
    public final String component7(){
       return this.btnText;
    }
    public final List component8(){
       return this.couponList;
    }
    public final String component9(){
       return this.headImg;
    }
    public final ShowShareDialog copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,List p7,String p8,VfcInviteSelectorType p9,NormalInviteInfo p10,String p11,String p12,String p13,String p14,String p15,String p16){
       ShowShareDialog obj;
       Object this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       object oobject7 = p7;
       object oobject8 = p8;
       object oobject9 = p11;
       object oobject10 = p12;
       object oobject11 = p13;
       object oobject12 = p14;
       object oobject13 = p15;
       object oobject14 = p16;
       if (PatchProxy.isSupport(ShowShareDialog.class)) {
          Object[] objArray = new Object[17];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = oobject7;
          objArray[8] = oobject8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = oobject9;
          objArray[12] = oobject10;
          objArray[13] = oobject11;
          objArray[14] = oobject12;
          objArray[15] = oobject13;
          objArray[16] = oobject14;
          obj = PatchProxy.apply(objArray, this, ShowShareDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "background");
       a.p(oobject1, "scrollShadow");
       a.p(oobject2, "topShadow");
       a.p(oobject3, "couponBg");
       a.p(oobject4, "couponFg");
       a.p(oobject5, "btnBgImg");
       a.p(oobject6, "btnText");
       a.p(oobject7, "couponList");
       a.p(oobject8, "headImg");
       a.p(oobject9, "ruleLink");
       a.p(oobject10, "ruleName");
       a.p(oobject11, "shareObjectId");
       this = p14;
       a.p(this, "title");
       a.p(p15, "logTracker");
       a.p(p16, "tokenExtParams");
       obj = new ShowShareDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, this, p15, p16);
       return v18;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShowShareDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ShowShareDialog && (a.g(this.background, p0.background) && (a.g(this.scrollShadow, p0.scrollShadow) && (a.g(this.topShadow, p0.topShadow) && (a.g(this.couponBg, p0.couponBg) && (a.g(this.couponFg, p0.couponFg) && (a.g(this.btnBgImg, p0.btnBgImg) && (a.g(this.btnText, p0.btnText) && (a.g(this.couponList, p0.couponList) && (a.g(this.headImg, p0.headImg) && (a.g(this.inviteSelector, p0.inviteSelector) && (a.g(this.normalInviteInfo, p0.normalInviteInfo) && (a.g(this.ruleLink, p0.ruleLink) && (a.g(this.ruleName, p0.ruleName) && (a.g(this.shareObjectId, p0.shareObjectId) && (a.g(this.title, p0.title) && (a.g(this.logTracker, p0.logTracker) && a.g(this.tokenExtParams, p0.tokenExtParams))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ShowShareDialog obj = PatchProxy.apply(null, this, ShowShareDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.background;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ShowShareDialog tscrollShado = this.scrollShadow;
       int i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.topShadow;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.couponBg;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.couponFg;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.btnBgImg;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.btnText;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.couponList;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.headImg;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.inviteSelector;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.normalInviteInfo;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.ruleLink;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.ruleName;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.shareObjectId;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.title;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.logTracker;
       i2 = (tscrollShado != null)? tscrollShado.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tscrollShado = this.tokenExtParams;
       if (tscrollShado != null) {
          i = tscrollShado.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShowShareDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShowShareDialog\(background="+this.background+", scrollShadow="+this.scrollShadow+", topShadow="+this.topShadow+", couponBg="+this.couponBg+", couponFg="+this.couponFg+", btnBgImg="+this.btnBgImg+", btnText="+this.btnText+", couponList="+this.couponList+", headImg="+this.headImg+", inviteSelector="+this.inviteSelector+", normalInviteInfo="+this.normalInviteInfo+", ruleLink="+this.ruleLink+", ruleName="+this.ruleName+", shareObjectId="+this.shareObjectId+", title="+this.title+", logTracker="+this.logTracker+", tokenExtParams="+this.tokenExtParams+"\)";
    }
}
