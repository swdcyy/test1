package com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage$a;
import nsd.u;
import com.kuaishou.live.locallife.model.LocalLifeLiveIconMessage$b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.locallife.model.MessageButton;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button;
import kotlin.jvm.internal.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import qrd.l1;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import android.os.Parcel;

public final class LocalLifeLiveIconMessage implements Serializable, Parcelable	// class@000c37
{
    public String actionUrl;
    public MessageButton activeButton;
    public boolean isDynamicIcon;
    public String ksOrderId;
    public int loopCount;
    public String lottieUrl;
    public long serverTime;
    public int signalType;
    public String statisticsInfo;
    public int supportType;
    public static final Parcelable$Creator CREATOR;
    public static final LocalLifeLiveIconMessage$a Companion;

    static {
       LocalLifeLiveIconMessage.Companion = new LocalLifeLiveIconMessage$a(null);
       LocalLifeLiveIconMessage.CREATOR = new LocalLifeLiveIconMessage$b();
    }
    public void LocalLifeLiveIconMessage(){
       super();
       this.signalType = 1;
       this.ksOrderId = "";
       this.actionUrl = "";
       this.statisticsInfo = "";
       this.loopCount = -1;
       this.lottieUrl = "";
    }
    public static void getSignalType$annotations(){
    }
    public static void getSupportType$annotations(){
    }
    public static final LocalLifeLiveIconMessage pbConvertToObject(LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       LocalLifeLiveIconMessage$a obj1 = PatchProxy.applyOneRefs(p0, obj, LocalLifeLiveIconMessage.class, "8");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = LocalLifeLiveIconMessage.Companion;
       Objects.requireNonNull(obj1);
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button obj2 = PatchProxy.applyOneRefs(p0, obj1, LocalLifeLiveIconMessage$a.class, "1");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(p0 != null){
          obj = new LocalLifeLiveIconMessage();
          if (p0.activeButton != null) {
             MessageButton messageButto = new MessageButton();
             messageButto.setButtonType(p0.activeButton.buttonType);
             obj2 = p0.activeButton.name;
             a.o(obj2, "pb.activeButton.name");
             messageButto.setName(obj2);
             obj2 = p0.activeButton.link;
             a.o(obj2, "pb.activeButton.link");
             messageButto.setLink(obj2);
             obj2 = p0.activeButton.desc;
             a.o(obj2, "pb.activeButton.desc");
             messageButto.setDesc(obj2);
             messageButto.setIcon(e0.i(p0.activeButton.icon));
             messageButto.setIconV2(e0.i(p0.activeButton.iconV2));
             obj.setActiveButton(messageButto);
          }
          obj.setSignalType(p0.signalType);
          LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState ksOrderId = p0.ksOrderId;
          a.o(ksOrderId, "pb.ksOrderId");
          obj.setKsOrderId(ksOrderId);
          ksOrderId = p0.actionUrl;
          a.o(ksOrderId, "pb.actionUrl");
          obj.setActionUrl(ksOrderId);
          obj.setSupportType(p0.supportType);
          ksOrderId = p0.statisticsInfo;
          a.o(ksOrderId, "pb.statisticsInfo");
          obj.setStatisticsInfo(ksOrderId);
          obj.setDynamicIcon(p0.isDynamicIcon);
          obj.setLoopCount(p0.loopCount);
          ksOrderId = p0.lottieUrl;
          a.o(ksOrderId, "pb.lottieUrl");
          obj.setLottieUrl(ksOrderId);
          obj.setServerTime(p0.serverTime);
       }
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalLifeLiveIconMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof LocalLifeLiveIconMessage) {
          return false;
       }
       if (this.signalType != p0.signalType || (!a.g(this.actionUrl, p0.actionUrl) || (this.isDynamicIcon != p0.isDynamicIcon || (this.loopCount != p0.loopCount || !a.g(this.lottieUrl, p0.lottieUrl))))) {
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
    public final int getLoopCount(){
       return this.loopCount;
    }
    public final String getLottieUrl(){
       return this.lottieUrl;
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
       Object[] obj = PatchProxy.apply(null, this, LocalLifeLiveIconMessage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.signalType),this.actionUrl,Boolean.valueOf(this.isDynamicIcon),Integer.valueOf(this.loopCount),this.lottieUrl};
       return k.b(obj);
    }
    public final boolean isDynamicIcon(){
       return this.isDynamicIcon;
    }
    public final void setActionUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveIconMessage.class, "2")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveIconMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ksOrderId = p0;
       return;
    }
    public final void setLoopCount(int p0){
       this.loopCount = p0;
    }
    public final void setLottieUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveIconMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.lottieUrl = p0;
       return;
    }
    public final void setServerTime(long p0){
       this.serverTime = p0;
    }
    public final void setSignalType(int p0){
       this.signalType = p0;
    }
    public final void setStatisticsInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeLiveIconMessage.class, "3")) {
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
       if (PatchProxy.isSupport(LocalLifeLiveIconMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LocalLifeLiveIconMessage.class, "7")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
