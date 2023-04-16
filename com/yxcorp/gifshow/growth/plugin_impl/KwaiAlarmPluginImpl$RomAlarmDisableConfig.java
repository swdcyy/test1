package com.yxcorp.gifshow.growth.plugin_impl.KwaiAlarmPluginImpl$RomAlarmDisableConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.plugin_impl.KwaiAlarmPluginImpl$RomAlarmDisableConfig$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class KwaiAlarmPluginImpl$RomAlarmDisableConfig implements Serializable	// class@001475
{
    public boolean isAllRom;
    public boolean isAllVersion;
    public String romName;
    public int type;
    public ArrayList versions;
    public static final KwaiAlarmPluginImpl$RomAlarmDisableConfig$a Companion;

    static {
       KwaiAlarmPluginImpl$RomAlarmDisableConfig.Companion = new KwaiAlarmPluginImpl$RomAlarmDisableConfig$a(null);
    }
    public void KwaiAlarmPluginImpl$RomAlarmDisableConfig(){
       super();
       this.romName = "";
       this.type = -1;
       this.versions = new ArrayList();
    }
    public void KwaiAlarmPluginImpl$RomAlarmDisableConfig(int p0,ArrayList p1,boolean p2){
       a.p(p1, "versions");
       super();
       this.type = p0;
       this.isAllRom = true;
       this.versions = p1;
       this.isAllVersion = p2;
    }
    public void KwaiAlarmPluginImpl$RomAlarmDisableConfig(int p0,ArrayList p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = new ArrayList();
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public void KwaiAlarmPluginImpl$RomAlarmDisableConfig(String p0,int p1,ArrayList p2,boolean p3){
       a.p(p0, "name");
       a.p(p2, "versions");
       super();
       this.romName = p0;
       this.type = p1;
       this.versions = p2;
       this.isAllVersion = p3;
    }
    public void KwaiAlarmPluginImpl$RomAlarmDisableConfig(String p0,int p1,ArrayList p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = new ArrayList();
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getRomName(){
       return this.romName;
    }
    public final int getType(){
       return this.type;
    }
    public final ArrayList getVersions(){
       return this.versions;
    }
    public final boolean isAllRom(){
       return this.isAllRom;
    }
    public final boolean isAllVersion(){
       return this.isAllVersion;
    }
    public final void setAllRom(boolean p0){
       this.isAllRom = p0;
    }
    public final void setAllVersion(boolean p0){
       this.isAllVersion = p0;
    }
    public final void setRomName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAlarmPluginImpl$RomAlarmDisableConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.romName = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public final void setVersions(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAlarmPluginImpl$RomAlarmDisableConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.versions = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiAlarmPluginImpl$RomAlarmDisableConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "romeName = "+this.romName+"; isAllRom = "+this.isAllRom+"; type = "+this.type+"; isAllVersion = "+this.isAllVersion+"; versions = "+this.versions;
    }
}
