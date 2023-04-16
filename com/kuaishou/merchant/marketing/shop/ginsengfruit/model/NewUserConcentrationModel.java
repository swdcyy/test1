package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.NewUserConcentrationModel;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.NewUserConcentrationModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NewUserConcentrationModel implements Serializable	// class@001be7
{
    public String activityId;
    public String activityJumpUrl;
    public String anchorApplyJumpUrl;
    public int concentration;
    public String concentrationDesc;
    public int currentNewCount;
    public long endTimeMillis;
    public long expandTimeMillis;
    public String grantActivityJumpUrl;
    public boolean hasApplied;
    public boolean hasRights;
    public boolean hasUnderwayActivity;
    public int newCount;
    public int pullNewCount;
    public boolean remind;
    public String remindText;
    public static final NewUserConcentrationModel$a Companion;
    public static final long serialVersionUID;

    static {
       NewUserConcentrationModel.Companion = new NewUserConcentrationModel$a(null);
    }
    public void NewUserConcentrationModel(){
       super(null, null, 0, null, null, 0, false, false, 0, 0, false, false, 0, null, 0, null, 0xffff, null);
    }
    public void NewUserConcentrationModel(String p0,String p1,int p2,String p3,String p4,long p5,boolean p6,boolean p7,int p8,int p9,boolean p10,boolean p11,int p12,String p13,long p14,String p15){
       int i = this;
       super();
       i.activityId = p0;
       i.activityJumpUrl = p1;
       i.concentration = p2;
       i.concentrationDesc = p3;
       i.remindText = p4;
       i.endTimeMillis = p5;
       i.hasRights = p6;
       i.hasUnderwayActivity = p7;
       i.newCount = p8;
       i.pullNewCount = p9;
       i.remind = p10;
       i.hasApplied = p11;
       i.currentNewCount = p12;
       i.anchorApplyJumpUrl = p13;
       i.expandTimeMillis = p14;
       i.grantActivityJumpUrl = p15;
    }
    public void NewUserConcentrationModel(String p0,String p1,int p2,String p3,String p4,long p5,boolean p6,boolean p7,int p8,int p9,boolean p10,boolean p11,int p12,String p13,long p14,String p15,int p16,u p17){
       int i11;
       int i = p16;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       String str2 = (i & 0x02)? str: p1;
       int i1 = (i & 0x04)? 0: p2;
       String str3 = (i & 0x08)? str: p3;
       String str4 = (i & 0x10)? str: p4;
       int i2 = (i & 0x20)? 0: p5;
       int i3 = (i & 0x40)? 0: p6;
       int i4 = (i & 0x0080)? 0: p7;
       int i5 = (i & 0x0100)? 0: p8;
       int i6 = (i & 0x0200)? 0: p9;
       int i7 = (i & 0x0400)? 0: p10;
       int i8 = (i & 0x0800)? 0: p11;
       int i9 = (i & 0x1000)? 0: p12;
       String str5 = str;
       str = (i & 0x2000)? str5: p13;
       String str6 = str;
       int i10 = (i & 0x4000)? 0: p14;
       String str7 = (i & 0x8000)? str5: p15;
       super(str1, str2, i1, str3, str4, i2, i3, i4, i5, i6, i7, i8, i9, str6, i10, str7);
       return;
    }
    public static NewUserConcentrationModel copy$default(NewUserConcentrationModel p0,String p1,String p2,int p3,String p4,String p5,long p6,boolean p7,boolean p8,int p9,int p10,boolean p11,boolean p12,int p13,String p14,long p15,String p16,int p17,Object p18){
       int i1;
       int i2;
       NewUserConcentrationModel newUserConce = p0;
       int i = p17;
       NewUserConcentrationModel activityId = (i & 0x01)? newUserConce.activityId: p1;
       NewUserConcentrationModel activityJump = (i & 0x02)? newUserConce.activityJumpUrl: p2;
       NewUserConcentrationModel concentratio = (i & 0x04)? newUserConce.concentration: p3;
       NewUserConcentrationModel concentratio1 = (i & 0x08)? newUserConce.concentrationDesc: p4;
       NewUserConcentrationModel remindText = (i & 0x10)? newUserConce.remindText: p5;
       NewUserConcentrationModel endTimeMilli = (i & 0x20)? newUserConce.endTimeMillis: p6;
       NewUserConcentrationModel hasRights = (i & 0x40)? newUserConce.hasRights: p7;
       NewUserConcentrationModel hasUnderwayA = (i & 0x0080)? newUserConce.hasUnderwayActivity: p8;
       NewUserConcentrationModel newCount = (i & 0x0100)? newUserConce.newCount: p9;
       NewUserConcentrationModel pullNewCount = (i & 0x0200)? newUserConce.pullNewCount: p10;
       NewUserConcentrationModel remind = (i & 0x0400)? newUserConce.remind: p11;
       NewUserConcentrationModel hasApplied = (i & 0x0800)? newUserConce.hasApplied: p12;
       NewUserConcentrationModel currentNewCo = (i & 0x1000)? newUserConce.currentNewCount: p13;
       NewUserConcentrationModel newUserConce1 = currentNewCo;
       currentNewCo = (i & 0x2000)? newUserConce.anchorApplyJumpUrl: p14;
       NewUserConcentrationModel newUserConce2 = currentNewCo;
       NewUserConcentrationModel newUserConce3 = hasApplied;
       hasApplied = (i & 0x4000)? newUserConce.expandTimeMillis: p15;
       NewUserConcentrationModel grantActivit = (i & 0x8000)? newUserConce.grantActivityJumpUrl: p16;
       return p0.copy(activityId, activityJump, concentratio, concentratio1, remindText, endTimeMilli, hasRights, hasUnderwayA, newCount, pullNewCount, remind, newUserConce3, newUserConce1, newUserConce2, hasApplied, grantActivit);
    }
    public final String component1(){
       return this.activityId;
    }
    public final int component10(){
       return this.pullNewCount;
    }
    public final boolean component11(){
       return this.remind;
    }
    public final boolean component12(){
       return this.hasApplied;
    }
    public final int component13(){
       return this.currentNewCount;
    }
    public final String component14(){
       return this.anchorApplyJumpUrl;
    }
    public final long component15(){
       return this.expandTimeMillis;
    }
    public final String component16(){
       return this.grantActivityJumpUrl;
    }
    public final String component2(){
       return this.activityJumpUrl;
    }
    public final int component3(){
       return this.concentration;
    }
    public final String component4(){
       return this.concentrationDesc;
    }
    public final String component5(){
       return this.remindText;
    }
    public final long component6(){
       return this.endTimeMillis;
    }
    public final boolean component7(){
       return this.hasRights;
    }
    public final boolean component8(){
       return this.hasUnderwayActivity;
    }
    public final int component9(){
       return this.newCount;
    }
    public final NewUserConcentrationModel copy(String p0,String p1,int p2,String p3,String p4,long p5,boolean p6,boolean p7,int p8,int p9,boolean p10,boolean p11,int p12,String p13,long p14,String p15){
       Object obj;
       if (PatchProxy.isSupport(NewUserConcentrationModel.class)) {
          Object[] objArray = new Object[16];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Long.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          objArray[12] = Integer.valueOf(p12);
          objArray[13] = p13;
          objArray[14] = Long.valueOf(p14);
          objArray[15] = p15;
          obj = PatchProxy.apply(objArray, this, NewUserConcentrationModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       NewUserConcentrationModel newUserConce = new NewUserConcentrationModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewUserConcentrationModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NewUserConcentrationModel && (a.g(this.activityId, p0.activityId) && (a.g(this.activityJumpUrl, p0.activityJumpUrl) && (this.concentration == p0.concentration && (a.g(this.concentrationDesc, p0.concentrationDesc) && (a.g(this.remindText, p0.remindText) && (!this.endTimeMillis - p0.endTimeMillis && (this.hasRights == p0.hasRights && (this.hasUnderwayActivity == p0.hasUnderwayActivity && (this.newCount == p0.newCount && (this.pullNewCount == p0.pullNewCount && (this.remind == p0.remind && (this.hasApplied == p0.hasApplied && (this.currentNewCount == p0.currentNewCount && (a.g(this.anchorApplyJumpUrl, p0.anchorApplyJumpUrl) && (!this.expandTimeMillis - p0.expandTimeMillis && a.g(this.grantActivityJumpUrl, p0.grantActivityJumpUrl)))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final String getActivityJumpUrl(){
       return this.activityJumpUrl;
    }
    public final String getAnchorApplyJumpUrl(){
       return this.anchorApplyJumpUrl;
    }
    public final int getConcentration(){
       return this.concentration;
    }
    public final String getConcentrationDesc(){
       return this.concentrationDesc;
    }
    public final int getCurrentNewCount(){
       return this.currentNewCount;
    }
    public final long getEndTimeMillis(){
       return this.endTimeMillis;
    }
    public final long getExpandTimeMillis(){
       return this.expandTimeMillis;
    }
    public final String getGrantActivityJumpUrl(){
       return this.grantActivityJumpUrl;
    }
    public final boolean getHasApplied(){
       return this.hasApplied;
    }
    public final boolean getHasRights(){
       return this.hasRights;
    }
    public final boolean getHasUnderwayActivity(){
       return this.hasUnderwayActivity;
    }
    public final int getNewCount(){
       return this.newCount;
    }
    public final int getPullNewCount(){
       return this.pullNewCount;
    }
    public final boolean getRemind(){
       return this.remind;
    }
    public final String getRemindText(){
       return this.remindText;
    }
    public int hashCode(){
       NewUserConcentrationModel obj = PatchProxy.apply(null, this, NewUserConcentrationModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.activityId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NewUserConcentrationModel tactivityJum = this.activityJumpUrl;
       int i2 = (tactivityJum != null)? tactivityJum.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.concentration) * 31;
       tactivityJum = this.concentrationDesc;
       i2 = (tactivityJum != null)? tactivityJum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tactivityJum = this.remindText;
       i2 = (tactivityJum != null)? tactivityJum.hashCode(): 0;
       tactivityJum = this.endTimeMillis;
       long l = 32;
       i1 = (((i1 + i2) * 31) + (int)(tactivityJum ^ (tactivityJum >> l))) * 31;
       tactivityJum = this.hasRights;
       int i3 = 1;
       if (tactivityJum != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tactivityJum = this.hasUnderwayActivity;
       if (tactivityJum != null) {
          i2 = 1;
       }
       i1 = (((((i1 + i2) * 31) + this.newCount) * 31) + this.pullNewCount) * 31;
       tactivityJum = this.remind;
       if (tactivityJum != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tactivityJum = this.hasApplied;
       if (tactivityJum == null) {
          i3 = tactivityJum;
       }
       i1 = (((i1 + i3) * 31) + this.currentNewCount) * 31;
       tactivityJum = this.anchorApplyJumpUrl;
       i2 = (tactivityJum != null)? tactivityJum.hashCode(): 0;
       tactivityJum = this.expandTimeMillis;
       i1 = (((i1 + i2) * 31) + (int)(tactivityJum ^ (tactivityJum >> l))) * 31;
       tactivityJum = this.grantActivityJumpUrl;
       if (tactivityJum != null) {
          i = tactivityJum.hashCode();
       }
       return (i1 + i);
    }
    public final void setActivityId(String p0){
       this.activityId = p0;
    }
    public final void setActivityJumpUrl(String p0){
       this.activityJumpUrl = p0;
    }
    public final void setAnchorApplyJumpUrl(String p0){
       this.anchorApplyJumpUrl = p0;
    }
    public final void setConcentration(int p0){
       this.concentration = p0;
    }
    public final void setConcentrationDesc(String p0){
       this.concentrationDesc = p0;
    }
    public final void setCurrentNewCount(int p0){
       this.currentNewCount = p0;
    }
    public final void setEndTimeMillis(long p0){
       this.endTimeMillis = p0;
    }
    public final void setExpandTimeMillis(long p0){
       this.expandTimeMillis = p0;
    }
    public final void setGrantActivityJumpUrl(String p0){
       this.grantActivityJumpUrl = p0;
    }
    public final void setHasApplied(boolean p0){
       this.hasApplied = p0;
    }
    public final void setHasRights(boolean p0){
       this.hasRights = p0;
    }
    public final void setHasUnderwayActivity(boolean p0){
       this.hasUnderwayActivity = p0;
    }
    public final void setNewCount(int p0){
       this.newCount = p0;
    }
    public final void setPullNewCount(int p0){
       this.pullNewCount = p0;
    }
    public final void setRemind(boolean p0){
       this.remind = p0;
    }
    public final void setRemindText(String p0){
       this.remindText = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NewUserConcentrationModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NewUserConcentrationModel\(activityId="+this.activityId+", activityJumpUrl="+this.activityJumpUrl+", concentration="+this.concentration+", concentrationDesc="+this.concentrationDesc+", remindText="+this.remindText+", endTimeMillis="+this.endTimeMillis+", hasRights="+this.hasRights+", hasUnderwayActivity="+this.hasUnderwayActivity+", newCount="+this.newCount+", pullNewCount="+this.pullNewCount+", remind="+this.remind+", hasApplied="+this.hasApplied+", currentNewCount="+this.currentNewCount+", anchorApplyJumpUrl="+this.anchorApplyJumpUrl+", expandTimeMillis="+this.expandTimeMillis+", grantActivityJumpUrl="+this.grantActivityJumpUrl+"\)";
    }
}
