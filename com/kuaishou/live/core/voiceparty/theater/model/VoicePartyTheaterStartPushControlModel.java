package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterStartPushControlModel;
import java.io.Serializable;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class VoicePartyTheaterStartPushControlModel implements Serializable	// class@00197b
{
    public final int autoOpenMicDialog;
    public int autoOpenMicDialogSource;
    public final int switchPortraitFullScreen;

    public void VoicePartyTheaterStartPushControlModel(int p0,int p1,int p2){
       super();
       this.switchPortraitFullScreen = p0;
       this.autoOpenMicDialog = p1;
       this.autoOpenMicDialogSource = p2;
    }
    public void VoicePartyTheaterStartPushControlModel(int p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = 5;
       }
       super(p0, p1, p2);
       return;
    }
    public static VoicePartyTheaterStartPushControlModel copy$default(VoicePartyTheaterStartPushControlModel p0,int p1,int p2,int p3,int p4,Object p5){
       VoicePartyTheaterStartPushControlModel switchPortra;
       VoicePartyTheaterStartPushControlModel autoOpenMicD;
       VoicePartyTheaterStartPushControlModel autoOpenMicD1;
       if (p4 & 0x01) {
          switchPortra = p0.switchPortraitFullScreen;
       }
       if (p4 & 0x02) {
          autoOpenMicD = p0.autoOpenMicDialog;
       }
       if (p4 & 0x04) {
          autoOpenMicD1 = p0.autoOpenMicDialogSource;
       }
       return p0.copy(switchPortra, autoOpenMicD, autoOpenMicD1);
    }
    public final int component1(){
       return this.switchPortraitFullScreen;
    }
    public final int component2(){
       return this.autoOpenMicDialog;
    }
    public final int component3(){
       return this.autoOpenMicDialogSource;
    }
    public final VoicePartyTheaterStartPushControlModel copy(int p0,int p1,int p2){
       if (PatchProxy.isSupport(VoicePartyTheaterStartPushControlModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, VoicePartyTheaterStartPushControlModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new VoicePartyTheaterStartPushControlModel(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof VoicePartyTheaterStartPushControlModel && (this.switchPortraitFullScreen == p0.switchPortraitFullScreen && (this.autoOpenMicDialog == p0.autoOpenMicDialog && this.autoOpenMicDialogSource == p0.autoOpenMicDialogSource)))) {
          return true;
       }
       return false;
    }
    public final int getAutoOpenMicDialog(){
       return this.autoOpenMicDialog;
    }
    public final int getAutoOpenMicDialogSource(){
       return this.autoOpenMicDialogSource;
    }
    public final int getSwitchPortraitFullScreen(){
       return this.switchPortraitFullScreen;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterStartPushControlModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((this.switchPortraitFullScreen * 31) + this.autoOpenMicDialog) * 31) + this.autoOpenMicDialogSource);
    }
    public final boolean isAutoOpenMicDialog(){
       boolean b = true;
       if (this.autoOpenMicDialog == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean isSwitchPortraitFullScreen(){
       boolean b = true;
       if (this.switchPortraitFullScreen == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void setAutoOpenMicDialogSource(int p0){
       this.autoOpenMicDialogSource = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterStartPushControlModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyTheaterStartPushControlModel\(switchPortraitFullScreen="+this.switchPortraitFullScreen+", autoOpenMicDialog="+this.autoOpenMicDialog+", autoOpenMicDialogSource="+this.autoOpenMicDialogSource+"\)";
    }
}
