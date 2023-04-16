package com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData;
import java.io.Serializable;
import com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData$a;
import nsd.u;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RelayStickerUIData implements Serializable	// class@001204
{
    public final float alpha;
    public final boolean initFromDraft;
    public int invitedFriendsCount;
    public boolean isInEditMode;
    public boolean isRelayTitleEditable;
    public int pageSource;
    public final long relatedPostCount;
    public final ArrayList relatedUserInfoList;
    public final String title;
    public static final RelayStickerUIData$a Companion;

    static {
       RelayStickerUIData.Companion = new RelayStickerUIData$a(null);
    }
    public void RelayStickerUIData(String p0,long p1,ArrayList p2,int p3,boolean p4,boolean p5,float p6,int p7,boolean p8){
       a.p(p0, "title");
       a.p(p2, "relatedUserInfoList");
       super();
       this.title = p0;
       this.relatedPostCount = p1;
       this.relatedUserInfoList = p2;
       this.pageSource = p3;
       this.isInEditMode = p4;
       this.isRelayTitleEditable = p5;
       this.alpha = p6;
       this.invitedFriendsCount = p7;
       this.initFromDraft = p8;
    }
    public void RelayStickerUIData(String p0,long p1,ArrayList p2,int p3,boolean p4,boolean p5,float p6,int p7,boolean p8,int p9,u p10){
       int i = p9;
       int i1 = (i & 0x08)? 1: p3;
       boolean b = (i & 0x10)? false: p4;
       boolean b1 = (i & 0x20)? true: p5;
       float f = (i & 0x40)? 0x3f800000: p6;
       int i2 = (i & 0x0080)? 0: p7;
       boolean b2 = (i & 0x0100)? false: p8;
       super(p0, p1, p2, i1, b, b1, f, i2, b2);
       return;
    }
    public static RelayStickerUIData copy$default(RelayStickerUIData p0,String p1,long p2,ArrayList p3,int p4,boolean p5,boolean p6,float p7,int p8,boolean p9,int p10,Object p11){
       RelayStickerUIData relaySticker = p0;
       int i = p10;
       RelayStickerUIData title = (i & 0x01)? relaySticker.title: p1;
       RelayStickerUIData relatedPostC = (i & 0x02)? relaySticker.relatedPostCount: p2;
       RelayStickerUIData relatedUserI = (i & 0x04)? relaySticker.relatedUserInfoList: p3;
       RelayStickerUIData pageSource = (i & 0x08)? relaySticker.pageSource: p4;
       RelayStickerUIData isInEditMode = (i & 0x10)? relaySticker.isInEditMode: p5;
       RelayStickerUIData isRelayTitle = (i & 0x20)? relaySticker.isRelayTitleEditable: p6;
       RelayStickerUIData alpha = (i & 0x40)? relaySticker.alpha: p7;
       RelayStickerUIData invitedFrien = (i & 0x0080)? relaySticker.invitedFriendsCount: p8;
       RelayStickerUIData initFromDraf = (i & 0x0100)? relaySticker.initFromDraft: p9;
       return p0.copy(title, relatedPostC, relatedUserI, pageSource, isInEditMode, isRelayTitle, alpha, invitedFrien, initFromDraf);
    }
    public final String component1(){
       return this.title;
    }
    public final long component2(){
       return this.relatedPostCount;
    }
    public final ArrayList component3(){
       return this.relatedUserInfoList;
    }
    public final int component4(){
       return this.pageSource;
    }
    public final boolean component5(){
       return this.isInEditMode;
    }
    public final boolean component6(){
       return this.isRelayTitleEditable;
    }
    public final float component7(){
       return this.alpha;
    }
    public final int component8(){
       return this.invitedFriendsCount;
    }
    public final boolean component9(){
       return this.initFromDraft;
    }
    public final RelayStickerUIData copy(String p0,long p1,ArrayList p2,int p3,boolean p4,boolean p5,float p6,int p7,boolean p8){
       RelayStickerUIData obj;
       object oobject = p0;
       object oobject1 = p2;
       if (PatchProxy.isSupport(RelayStickerUIData.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = Long.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, RelayStickerUIData.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "title");
       a.p(oobject1, "relatedUserInfoList");
       obj = new RelayStickerUIData(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RelayStickerUIData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RelayStickerUIData && (a.g(this.title, p0.title) && (!this.relatedPostCount - p0.relatedPostCount && (a.g(this.relatedUserInfoList, p0.relatedUserInfoList) && (this.pageSource == p0.pageSource && (this.isInEditMode == p0.isInEditMode && (this.isRelayTitleEditable == p0.isRelayTitleEditable && (!Float.compare(this.alpha, p0.alpha) && (this.invitedFriendsCount == p0.invitedFriendsCount && this.initFromDraft == p0.initFromDraft)))))))))) {
          return true;
       }
       return false;
    }
    public final float getAlpha(){
       return this.alpha;
    }
    public final boolean getInitFromDraft(){
       return this.initFromDraft;
    }
    public final int getInvitedFriendsCount(){
       return this.invitedFriendsCount;
    }
    public final int getPageSource(){
       return this.pageSource;
    }
    public final long getRelatedPostCount(){
       return this.relatedPostCount;
    }
    public final ArrayList getRelatedUserInfoList(){
       return this.relatedUserInfoList;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       RelayStickerUIData obj = PatchProxy.apply(null, this, RelayStickerUIData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       RelayStickerUIData trelatedPost = this.relatedPostCount;
       i1 = ((i1 * 31) + (int)(trelatedPost ^ (trelatedPost >> 32))) * 31;
       trelatedPost = this.relatedUserInfoList;
       if (trelatedPost != null) {
          i = trelatedPost.hashCode();
       }
       i1 = (((i1 + i) * 31) + this.pageSource) * 31;
       RelayStickerUIData tisInEditMod = this.isInEditMode;
       int i2 = 1;
       if (tisInEditMod != null) {
          tisInEditMod = 1;
       }
       i1 = (i1 + tisInEditMod) * 31;
       tisInEditMod = this.isRelayTitleEditable;
       if (tisInEditMod != null) {
          i = 1;
       }
       i1 = (((((i1 + i) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.invitedFriendsCount) * 31;
       tisInEditMod = this.initFromDraft;
       if (tisInEditMod == null) {
          i2 = tisInEditMod;
       }
       return (i1 + i2);
    }
    public final boolean isInEditMode(){
       return this.isInEditMode;
    }
    public final boolean isRelayTitleEditable(){
       return this.isRelayTitleEditable;
    }
    public final void setInEditMode(boolean p0){
       this.isInEditMode = p0;
    }
    public final void setInvitedFriendsCount(int p0){
       this.invitedFriendsCount = p0;
    }
    public final void setPageSource(int p0){
       this.pageSource = p0;
    }
    public final void setRelayTitleEditable(boolean p0){
       this.isRelayTitleEditable = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RelayStickerUIData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "title = "+this.title+", relatedPostCount = "+this.relatedPostCount+", relatedUserInfoList size = "+this.relatedUserInfoList.size()+", pageSource = "+this.pageSource+", isInEditMode = "+this.isInEditMode+", "+"isRelayTitleEditable = "+this.isRelayTitleEditable+", alpha = "+this.alpha+", invitedFriendsCount = "+this.invitedFriendsCount+", initFromDraft = "+this.initFromDraft;
    }
}
