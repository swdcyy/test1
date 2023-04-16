package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DrawResult;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DrawResult$a;
import nsd.u;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV1;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DrawResult implements Serializable	// class@001be5
{
    public long activityEndTime;
    public DialogConfigV1 dialogConfigV1;
    public DialogConfigV2 dialogConfigV2;
    public int dialogDelayTime;
    public boolean hasLotteryResult;
    public boolean lotteryResult;
    public boolean oldUserCanBuy;
    public boolean prioritySwitch;
    public int receiveStatus;
    public boolean showDialogV2;
    public static final DrawResult$a Companion;
    public static final long serialVersionUID;

    static {
       DrawResult.Companion = new DrawResult$a(null);
    }
    public void DrawResult(DialogConfigV1 p0,DialogConfigV2 p1,boolean p2,boolean p3,int p4,boolean p5,int p6,boolean p7,long p8,boolean p9){
       super();
       this.dialogConfigV1 = p0;
       this.dialogConfigV2 = p1;
       this.hasLotteryResult = p2;
       this.lotteryResult = p3;
       this.receiveStatus = p4;
       this.oldUserCanBuy = p5;
       this.dialogDelayTime = p6;
       this.showDialogV2 = p7;
       this.activityEndTime = p8;
       this.prioritySwitch = p9;
    }
    public void DrawResult(DialogConfigV1 p0,DialogConfigV2 p1,boolean p2,boolean p3,int p4,boolean p5,int p6,boolean p7,long p8,boolean p9,int p10,u p11){
       int i = p10;
       boolean b = (i & 0x04)? false: p2;
       boolean b1 = (i & 0x08)? false: p3;
       int i1 = (i & 0x10)? 0: p4;
       boolean b2 = (i & 0x20)? false: p5;
       int i2 = (i & 0x40)? 0: p6;
       boolean b3 = (i & 0x0080)? false: p7;
       long l = (i & 0x0100)? 0: p8;
       boolean b4 = (i & 0x0200)? false: p9;
       super(p0, p1, b, b1, i1, b2, i2, b3, l, b4);
       return;
    }
    public static DrawResult copy$default(DrawResult p0,DialogConfigV1 p1,DialogConfigV2 p2,boolean p3,boolean p4,int p5,boolean p6,int p7,boolean p8,long p9,boolean p10,int p11,Object p12){
       DrawResult uDrawResult = p0;
       int i = p11;
       DrawResult dialogConfig = (i & 0x01)? uDrawResult.dialogConfigV1: p1;
       DrawResult dialogConfig1 = (i & 0x02)? uDrawResult.dialogConfigV2: p2;
       DrawResult hasLotteryRe = (i & 0x04)? uDrawResult.hasLotteryResult: p3;
       DrawResult lotteryResul = (i & 0x08)? uDrawResult.lotteryResult: p4;
       DrawResult receiveStatu = (i & 0x10)? uDrawResult.receiveStatus: p5;
       DrawResult oldUserCanBu = (i & 0x20)? uDrawResult.oldUserCanBuy: p6;
       DrawResult dialogDelayT = (i & 0x40)? uDrawResult.dialogDelayTime: p7;
       DrawResult showDialogV2 = (i & 0x0080)? uDrawResult.showDialogV2: p8;
       DrawResult activityEndT = (i & 0x0100)? uDrawResult.activityEndTime: p9;
       DrawResult prioritySwit = (i & 0x0200)? uDrawResult.prioritySwitch: p10;
       return p0.copy(dialogConfig, dialogConfig1, hasLotteryRe, lotteryResul, receiveStatu, oldUserCanBu, dialogDelayT, showDialogV2, activityEndT, prioritySwit);
    }
    public final DialogConfigV1 component1(){
       return this.dialogConfigV1;
    }
    public final boolean component10(){
       return this.prioritySwitch;
    }
    public final DialogConfigV2 component2(){
       return this.dialogConfigV2;
    }
    public final boolean component3(){
       return this.hasLotteryResult;
    }
    public final boolean component4(){
       return this.lotteryResult;
    }
    public final int component5(){
       return this.receiveStatus;
    }
    public final boolean component6(){
       return this.oldUserCanBuy;
    }
    public final int component7(){
       return this.dialogDelayTime;
    }
    public final boolean component8(){
       return this.showDialogV2;
    }
    public final long component9(){
       return this.activityEndTime;
    }
    public final DrawResult copy(DialogConfigV1 p0,DialogConfigV2 p1,boolean p2,boolean p3,int p4,boolean p5,int p6,boolean p7,long p8,boolean p9){
       Object obj;
       if (PatchProxy.isSupport(DrawResult.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Long.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          obj = PatchProxy.apply(objArray, this, DrawResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       DrawResult uDrawResult = new DrawResult(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DrawResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DrawResult && (a.g(this.dialogConfigV1, p0.dialogConfigV1) && (a.g(this.dialogConfigV2, p0.dialogConfigV2) && (this.hasLotteryResult == p0.hasLotteryResult && (this.lotteryResult == p0.lotteryResult && (this.receiveStatus == p0.receiveStatus && (this.oldUserCanBuy == p0.oldUserCanBuy && (this.dialogDelayTime == p0.dialogDelayTime && (this.showDialogV2 == p0.showDialogV2 && (!this.activityEndTime - p0.activityEndTime && this.prioritySwitch == p0.prioritySwitch))))))))))) {
          return true;
       }
       return false;
    }
    public final long getActivityEndTime(){
       return this.activityEndTime;
    }
    public final DialogConfigV1 getDialogConfigV1(){
       return this.dialogConfigV1;
    }
    public final DialogConfigV2 getDialogConfigV2(){
       return this.dialogConfigV2;
    }
    public final int getDialogDelayTime(){
       return this.dialogDelayTime;
    }
    public final boolean getHasLotteryResult(){
       return this.hasLotteryResult;
    }
    public final boolean getLotteryResult(){
       return this.lotteryResult;
    }
    public final boolean getOldUserCanBuy(){
       return this.oldUserCanBuy;
    }
    public final boolean getPrioritySwitch(){
       return this.prioritySwitch;
    }
    public final int getReceiveStatus(){
       return this.receiveStatus;
    }
    public final boolean getShowDialogV2(){
       return this.showDialogV2;
    }
    public int hashCode(){
       DrawResult obj = PatchProxy.apply(null, this, DrawResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dialogConfigV1;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DrawResult tdialogConfi = this.dialogConfigV2;
       if (tdialogConfi != null) {
          i = tdialogConfi.hashCode();
       }
       i1 = (i1 + i) * 31;
       DrawResult thasLotteryR = this.hasLotteryResult;
       int i2 = 1;
       if (thasLotteryR != null) {
          thasLotteryR = 1;
       }
       i1 = (i1 + thasLotteryR) * 31;
       thasLotteryR = this.lotteryResult;
       if (thasLotteryR != null) {
          i = 1;
       }
       i1 = (((i1 + i) * 31) + this.receiveStatus) * 31;
       thasLotteryR = this.oldUserCanBuy;
       if (thasLotteryR != null) {
          i = 1;
       }
       i1 = (((i1 + i) * 31) + this.dialogDelayTime) * 31;
       thasLotteryR = this.showDialogV2;
       if (thasLotteryR != null) {
          i = 1;
       }
       DrawResult tactivityEnd = this.activityEndTime;
       i1 = (((i1 + i) * 31) + (int)(tactivityEnd ^ (tactivityEnd >> 32))) * 31;
       thasLotteryR = this.prioritySwitch;
       if (thasLotteryR == null) {
          i2 = thasLotteryR;
       }
       return (i1 + i2);
    }
    public final void setActivityEndTime(long p0){
       this.activityEndTime = p0;
    }
    public final void setDialogConfigV1(DialogConfigV1 p0){
       this.dialogConfigV1 = p0;
    }
    public final void setDialogConfigV2(DialogConfigV2 p0){
       this.dialogConfigV2 = p0;
    }
    public final void setDialogDelayTime(int p0){
       this.dialogDelayTime = p0;
    }
    public final void setHasLotteryResult(boolean p0){
       this.hasLotteryResult = p0;
    }
    public final void setLotteryResult(boolean p0){
       this.lotteryResult = p0;
    }
    public final void setOldUserCanBuy(boolean p0){
       this.oldUserCanBuy = p0;
    }
    public final void setPrioritySwitch(boolean p0){
       this.prioritySwitch = p0;
    }
    public final void setReceiveStatus(int p0){
       this.receiveStatus = p0;
    }
    public final void setShowDialogV2(boolean p0){
       this.showDialogV2 = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DrawResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DrawResult\(dialogConfigV1="+this.dialogConfigV1+", dialogConfigV2="+this.dialogConfigV2+", hasLotteryResult="+this.hasLotteryResult+", lotteryResult="+this.lotteryResult+", receiveStatus="+this.receiveStatus+", oldUserCanBuy="+this.oldUserCanBuy+", dialogDelayTime="+this.dialogDelayTime+", showDialogV2="+this.showDialogV2+", activityEndTime="+this.activityEndTime+", prioritySwitch="+this.prioritySwitch+"\)";
    }
}
