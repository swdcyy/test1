package com.kuaishou.house.live.bottombar.HouseLiveIconMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage$a;
import nsd.u;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage$b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.bottombar.MessageButton;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import android.os.Parcel;

public final class HouseLiveIconMessage implements Serializable, Parcelable	// class@000764
{
    public String actionUrl;
    public MessageButton activeButton;
    public boolean isDynamicIcon;
    public String ksOrderId;
    public int liteSignalType;
    public int loopCount;
    public String lottieUrl;
    public int mInfoSource;
    public long serverTime;
    public int signalType;
    public String statisticsInfo;
    public int supportType;
    public static final Parcelable$Creator CREATOR;
    public static final HouseLiveIconMessage$a Companion;
    public static final long serialVersionUID;

    static {
       HouseLiveIconMessage.Companion = new HouseLiveIconMessage$a(null);
       HouseLiveIconMessage.CREATOR = new HouseLiveIconMessage$b();
    }
    public void HouseLiveIconMessage(){
       super();
       this.signalType = 1;
       this.liteSignalType = 1;
       this.ksOrderId = "";
       this.actionUrl = "";
       this.statisticsInfo = "";
       this.loopCount = -1;
       this.lottieUrl = "";
       this.mInfoSource = -1;
    }
    public static void getLiteSignalType$annotations(){
    }
    public static void getSignalType$annotations(){
    }
    public static void getSupportType$annotations(){
    }
    public static final HouseLiveIconMessage pbConvertToObject(LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HouseLiveIconMessage.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HouseLiveIconMessage.Companion.a(p0);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HouseLiveIconMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof HouseLiveIconMessage) {
          return false;
       }
       if (this.signalType != p0.signalType || (this.liteSignalType != p0.liteSignalType || (!a.g(this.actionUrl, p0.actionUrl) || (this.isDynamicIcon != p0.isDynamicIcon || (this.loopCount != p0.loopCount || !a.g(this.lottieUrl, p0.lottieUrl)))))) {
          b = false;
       }
       return b;
    }
    public final String getActionUrl(){
       return this.actionUrl;
    }
    public final MessageButton getActiveButton(){
       return this.activeButton;
    }
    public final String getKsOrderId(){
       return this.ksOrderId;
    }
    public final int getLiteSignalType(){
       return this.liteSignalType;
    }
    public final int getLoopCount(){
       return this.loopCount;
    }
    public final String getLottieUrl(){
       return this.lottieUrl;
    }
    public final int getMInfoSource(){
       return this.mInfoSource;
    }
    public final long getServerTime(){
       return this.serverTime;
    }
    public final int getSignalType(){
       return this.signalType;
    }
    public final String getStatisticsInfo(){
       return this.statisticsInfo;
    }
    public final int getSupportType(){
       return this.supportType;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, HouseLiveIconMessage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.signalType),Integer.valueOf(this.liteSignalType),this.actionUrl,Boolean.valueOf(this.isDynamicIcon),Integer.valueOf(this.loopCount),this.lottieUrl};
       return k.b(obj);
    }
    public final boolean isDynamicIcon(){
       return this.isDynamicIcon;
    }
    public final void setActionUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveIconMessage.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.actionUrl = p0;
       return;
    }
    public final void setActiveButton(MessageButton p0){
       this.activeButton = p0;
    }
    public final void setDynamicIcon(boolean p0){
       this.isDynamicIcon = p0;
    }
    public final void setKsOrderId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveIconMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ksOrderId = p0;
       return;
    }
    public final void setLiteSignalType(int p0){
       this.liteSignalType = p0;
    }
    public final void setLoopCount(int p0){
       this.loopCount = p0;
    }
    public final void setLottieUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveIconMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.lottieUrl = p0;
       return;
    }
    public final void setMInfoSource(int p0){
       this.mInfoSource = p0;
    }
    public final void setServerTime(long p0){
       this.serverTime = p0;
    }
    public final void setSignalType(int p0){
       this.signalType = p0;
    }
    public final void setStatisticsInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLiveIconMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.statisticsInfo = p0;
       return;
    }
    public final void setSupportType(int p0){
       this.supportType = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HouseLiveIconMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HouseLiveIconMessage.class, "7")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
