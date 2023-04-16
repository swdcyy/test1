package com.kuaishou.growth.pendant.model.EntranceParam;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.EntranceParam$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.growth.pendant.model.PendantPositionPercent;
import com.kuaishou.growth.pendant.model.PendantExpandButtonConfig;
import com.kuaishou.growth.pendant.model.PendantClickEventConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EntranceParam implements Serializable	// class@000665
{
    public boolean isRepeat;
    public String mAnimPrefix;
    public String mAnimZipUrl;
    public int mAnimationFrameMicroseconds;
    public PendantClickEventConfig mClickEventConfig;
    public PendantExpandButtonConfig mExpandButtonConfig;
    public String mIconUrl;
    public int mWidgetHeight;
    public PendantPositionPercent mWidgetInitialPosition;
    public int mWidgetWidth;
    public static final EntranceParam$a Companion;
    public static final long serialVersionUID;

    static {
       EntranceParam.Companion = new EntranceParam$a(null);
    }
    public void EntranceParam(String p0,int p1,String p2,boolean p3,String p4,int p5,int p6,PendantPositionPercent p7,PendantExpandButtonConfig p8,PendantClickEventConfig p9){
       super();
       this.mAnimZipUrl = p0;
       this.mAnimationFrameMicroseconds = p1;
       this.mAnimPrefix = p2;
       this.isRepeat = p3;
       this.mIconUrl = p4;
       this.mWidgetWidth = p5;
       this.mWidgetHeight = p6;
       this.mWidgetInitialPosition = p7;
       this.mExpandButtonConfig = p8;
       this.mClickEventConfig = p9;
    }
    public void EntranceParam(String p0,int p1,String p2,boolean p3,String p4,int p5,int p6,PendantPositionPercent p7,PendantExpandButtonConfig p8,PendantClickEventConfig p9,int p10,u p11){
       int i = p10;
       String str = (i & 0x01)? null: p0;
       String str1 = (i & 0x04)? null: p2;
       boolean b = (i & 0x08)? false: p3;
       String str2 = (i & 0x10)? null: p4;
       PendantPositionPercent pendantPosit = (i & 0x0080)? null: p7;
       PendantExpandButtonConfig pendantExpan = (i & 0x0100)? null: p8;
       PendantClickEventConfig pendantClick = (i & 0x0200)? null: p9;
       super(str, p1, str1, b, str2, p5, p6, pendantPosit, pendantExpan, pendantClick);
       return;
    }
    public static EntranceParam copy$default(EntranceParam p0,String p1,int p2,String p3,boolean p4,String p5,int p6,int p7,PendantPositionPercent p8,PendantExpandButtonConfig p9,PendantClickEventConfig p10,int p11,Object p12){
       EntranceParam uEntrancePar = p0;
       int i = p11;
       EntranceParam mAnimZipUrl = (i & 0x01)? uEntrancePar.mAnimZipUrl: p1;
       EntranceParam mAnimationFr = (i & 0x02)? uEntrancePar.mAnimationFrameMicroseconds: p2;
       EntranceParam mAnimPrefix = (i & 0x04)? uEntrancePar.mAnimPrefix: p3;
       EntranceParam isRepeat = (i & 0x08)? uEntrancePar.isRepeat: p4;
       EntranceParam mIconUrl = (i & 0x10)? uEntrancePar.mIconUrl: p5;
       EntranceParam mWidgetWidth = (i & 0x20)? uEntrancePar.mWidgetWidth: p6;
       EntranceParam mWidgetHeigh = (i & 0x40)? uEntrancePar.mWidgetHeight: p7;
       EntranceParam mWidgetIniti = (i & 0x0080)? uEntrancePar.mWidgetInitialPosition: p8;
       EntranceParam mExpandButto = (i & 0x0100)? uEntrancePar.mExpandButtonConfig: p9;
       EntranceParam mClickEventC = (i & 0x0200)? uEntrancePar.mClickEventConfig: p10;
       return p0.copy(mAnimZipUrl, mAnimationFr, mAnimPrefix, isRepeat, mIconUrl, mWidgetWidth, mWidgetHeigh, mWidgetIniti, mExpandButto, mClickEventC);
    }
    public final String component1(){
       return this.mAnimZipUrl;
    }
    public final PendantClickEventConfig component10(){
       return this.mClickEventConfig;
    }
    public final int component2(){
       return this.mAnimationFrameMicroseconds;
    }
    public final String component3(){
       return this.mAnimPrefix;
    }
    public final boolean component4(){
       return this.isRepeat;
    }
    public final String component5(){
       return this.mIconUrl;
    }
    public final int component6(){
       return this.mWidgetWidth;
    }
    public final int component7(){
       return this.mWidgetHeight;
    }
    public final PendantPositionPercent component8(){
       return this.mWidgetInitialPosition;
    }
    public final PendantExpandButtonConfig component9(){
       return this.mExpandButtonConfig;
    }
    public final EntranceParam copy(String p0,int p1,String p2,boolean p3,String p4,int p5,int p6,PendantPositionPercent p7,PendantExpandButtonConfig p8,PendantClickEventConfig p9){
       Object obj;
       if (PatchProxy.isSupport(EntranceParam.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          obj = PatchProxy.apply(objArray, this, EntranceParam.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       EntranceParam uEntrancePar = new EntranceParam(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EntranceParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EntranceParam && (a.g(this.mAnimZipUrl, p0.mAnimZipUrl) && (this.mAnimationFrameMicroseconds == p0.mAnimationFrameMicroseconds && (a.g(this.mAnimPrefix, p0.mAnimPrefix) && (this.isRepeat == p0.isRepeat && (a.g(this.mIconUrl, p0.mIconUrl) && (this.mWidgetWidth == p0.mWidgetWidth && (this.mWidgetHeight == p0.mWidgetHeight && (a.g(this.mWidgetInitialPosition, p0.mWidgetInitialPosition) && (a.g(this.mExpandButtonConfig, p0.mExpandButtonConfig) && a.g(this.mClickEventConfig, p0.mClickEventConfig)))))))))))) {
          return true;
       }
       return false;
    }
    public final String getMAnimPrefix(){
       return this.mAnimPrefix;
    }
    public final String getMAnimZipUrl(){
       return this.mAnimZipUrl;
    }
    public final int getMAnimationFrameMicroseconds(){
       return this.mAnimationFrameMicroseconds;
    }
    public final PendantClickEventConfig getMClickEventConfig(){
       return this.mClickEventConfig;
    }
    public final PendantExpandButtonConfig getMExpandButtonConfig(){
       return this.mExpandButtonConfig;
    }
    public final String getMIconUrl(){
       return this.mIconUrl;
    }
    public final int getMWidgetHeight(){
       return this.mWidgetHeight;
    }
    public final PendantPositionPercent getMWidgetInitialPosition(){
       return this.mWidgetInitialPosition;
    }
    public final int getMWidgetWidth(){
       return this.mWidgetWidth;
    }
    public int hashCode(){
       EntranceParam obj = PatchProxy.apply(null, this, EntranceParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mAnimZipUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.mAnimationFrameMicroseconds) * 31;
       EntranceParam tmAnimPrefix = this.mAnimPrefix;
       int i2 = (tmAnimPrefix != null)? tmAnimPrefix.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmAnimPrefix = this.isRepeat;
       if (tmAnimPrefix != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmAnimPrefix = this.mIconUrl;
       i2 = (tmAnimPrefix != null)? tmAnimPrefix.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.mWidgetWidth) * 31) + this.mWidgetHeight) * 31;
       tmAnimPrefix = this.mWidgetInitialPosition;
       i2 = (tmAnimPrefix != null)? tmAnimPrefix.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmAnimPrefix = this.mExpandButtonConfig;
       i2 = (tmAnimPrefix != null)? tmAnimPrefix.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmAnimPrefix = this.mClickEventConfig;
       if (tmAnimPrefix != null) {
          i = tmAnimPrefix.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isRepeat(){
       return this.isRepeat;
    }
    public final void setMAnimPrefix(String p0){
       this.mAnimPrefix = p0;
    }
    public final void setMAnimZipUrl(String p0){
       this.mAnimZipUrl = p0;
    }
    public final void setMAnimationFrameMicroseconds(int p0){
       this.mAnimationFrameMicroseconds = p0;
    }
    public final void setMClickEventConfig(PendantClickEventConfig p0){
       this.mClickEventConfig = p0;
    }
    public final void setMExpandButtonConfig(PendantExpandButtonConfig p0){
       this.mExpandButtonConfig = p0;
    }
    public final void setMIconUrl(String p0){
       this.mIconUrl = p0;
    }
    public final void setMWidgetHeight(int p0){
       this.mWidgetHeight = p0;
    }
    public final void setMWidgetInitialPosition(PendantPositionPercent p0){
       this.mWidgetInitialPosition = p0;
    }
    public final void setMWidgetWidth(int p0){
       this.mWidgetWidth = p0;
    }
    public final void setRepeat(boolean p0){
       this.isRepeat = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EntranceParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EntranceParam\(mAnimZipUrl="+this.mAnimZipUrl+", mAnimationFrameMicroseconds="+this.mAnimationFrameMicroseconds+", mAnimPrefix="+this.mAnimPrefix+", isRepeat="+this.isRepeat+", mIconUrl="+this.mIconUrl+", mWidgetWidth="+this.mWidgetWidth+", mWidgetHeight="+this.mWidgetHeight+", mWidgetInitialPosition="+this.mWidgetInitialPosition+", mExpandButtonConfig="+this.mExpandButtonConfig+", mClickEventConfig="+this.mClickEventConfig+"\)";
    }
}
