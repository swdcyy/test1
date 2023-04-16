package com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo;
import java.io.Serializable;
import com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo implements Serializable	// class@000a2d
{
    public List headUrls;
    public String userId;
    public String userName;
    public static final LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.Companion = new LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a(null);
    }
    public void LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo(String p0,String p1,List p2){
       a.p(p0, "userId");
       a.p(p1, "userName");
       a.p(p2, "headUrls");
       super();
       this.userId = p0;
       this.userName = p1;
       this.headUrls = p2;
    }
    public static LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo copy$default(LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo p0,String p1,String p2,List p3,int p4,Object p5){
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo userId;
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo userName;
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo headUrls;
       if (p4 & 0x01) {
          userId = p0.userId;
       }
       if (p4 & 0x02) {
          userName = p0.userName;
       }
       if (p4 & 0x04) {
          headUrls = p0.headUrls;
       }
       return p0.copy(userId, userName, headUrls);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.userName;
    }
    public final List component3(){
       return this.headUrls;
    }
    public final LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo copy(String p0,String p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       a.p(p1, "userName");
       a.p(p2, "headUrls");
       return new LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo && (a.g(this.userId, p0.userId) && (a.g(this.userName, p0.userName) && a.g(this.headUrls, p0.headUrls))))) {
          return true;
       }
       return false;
    }
    public final List getHeadUrls(){
       return this.headUrls;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public int hashCode(){
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo obj = PatchProxy.apply(null, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo tuserName = this.userName;
       int i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.headUrls;
       if (tuserName != null) {
          i = tuserName.hashCode();
       }
       return (i1 + i);
    }
    public final void setHeadUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.headUrls = p0;
       return;
    }
    public final void setUserId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.userId = p0;
       return;
    }
    public final void setUserName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.userName = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnUserInfo\(userId="+this.userId+", userName="+this.userName+", headUrls="+this.headUrls+"\)";
    }
}
