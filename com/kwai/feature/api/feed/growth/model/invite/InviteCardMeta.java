package com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta;
import java.io.Serializable;
import com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta$a;
import nsd.u;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class InviteCardMeta implements Serializable	// class@000eda
{
    public final String bgm;
    public final String id;
    public final JsonObject reportInfo;
    public final String tkBundleId;
    public final JsonObject tkData;
    public final int tkMinVer;
    public static final InviteCardMeta$a Companion;
    public static final long serialVersionUID;

    static {
       InviteCardMeta.Companion = new InviteCardMeta$a(null);
    }
    public void InviteCardMeta(){
       super(null, 0, null, null, null, null, 63, null);
    }
    public void InviteCardMeta(String p0,int p1,String p2,JsonObject p3,String p4,JsonObject p5){
       a.p(p0, "tkBundleId");
       a.p(p2, "bgm");
       a.p(p4, "id");
       a.p(p5, "reportInfo");
       super();
       this.tkBundleId = p0;
       this.tkMinVer = p1;
       this.bgm = p2;
       this.tkData = p3;
       this.id = p4;
       this.reportInfo = p5;
    }
    public void InviteCardMeta(String p0,int p1,String p2,JsonObject p3,String p4,JsonObject p5,int p6,u p7){
       String str = "";
       String str1 = (p6 & 0x01)? str: p0;
       int i = (p6 & 0x02)? -1: p1;
       String str2 = (p6 & 0x04)? str: p2;
       if (p6 & 0x08) {
          p3 = null;
       }
       JsonObject jsonObject = p3;
       if (!(p6 & 0x10)) {
          str = p4;
       }
       if (p6 & 0x20) {
          p5 = new JsonObject();
       }
       super(str1, i, str2, jsonObject, str, p5);
       return;
    }
    public static InviteCardMeta copy$default(InviteCardMeta p0,String p1,int p2,String p3,JsonObject p4,String p5,JsonObject p6,int p7,Object p8){
       InviteCardMeta tkBundleId;
       InviteCardMeta tkMinVer;
       InviteCardMeta bgm;
       InviteCardMeta tkData;
       InviteCardMeta id;
       InviteCardMeta reportInfo;
       if (p7 & 0x01) {
          tkBundleId = p0.tkBundleId;
       }
       if (p7 & 0x02) {
          tkMinVer = p0.tkMinVer;
       }
       p8 = tkMinVer;
       if (p7 & 0x04) {
          bgm = p0.bgm;
       }
       InviteCardMeta inviteCardMe = bgm;
       if (p7 & 0x08) {
          tkData = p0.tkData;
       }
       InviteCardMeta inviteCardMe1 = tkData;
       if (p7 & 0x10) {
          id = p0.id;
       }
       InviteCardMeta inviteCardMe2 = id;
       if (p7 & 0x20) {
          reportInfo = p0.reportInfo;
       }
       return p0.copy(tkBundleId, p8, inviteCardMe, inviteCardMe1, inviteCardMe2, reportInfo);
    }
    public final String component1(){
       return this.tkBundleId;
    }
    public final int component2(){
       return this.tkMinVer;
    }
    public final String component3(){
       return this.bgm;
    }
    public final JsonObject component4(){
       return this.tkData;
    }
    public final String component5(){
       return this.id;
    }
    public final JsonObject component6(){
       return this.reportInfo;
    }
    public final InviteCardMeta copy(String p0,int p1,String p2,JsonObject p3,String p4,JsonObject p5){
       Object obj;
       if (PatchProxy.isSupport(InviteCardMeta.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, InviteCardMeta.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "tkBundleId");
       a.p(p2, "bgm");
       a.p(p4, "id");
       a.p(p5, "reportInfo");
       InviteCardMeta inviteCardMe = new InviteCardMeta(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InviteCardMeta.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof InviteCardMeta && (a.g(this.tkBundleId, p0.tkBundleId) && (this.tkMinVer == p0.tkMinVer && (a.g(this.bgm, p0.bgm) && (a.g(this.tkData, p0.tkData) && (a.g(this.id, p0.id) && a.g(this.reportInfo, p0.reportInfo)))))))) {
          return true;
       }
       return false;
    }
    public final String getBgm(){
       return this.bgm;
    }
    public final String getId(){
       return this.id;
    }
    public final JsonObject getReportInfo(){
       return this.reportInfo;
    }
    public final String getTkBundleId(){
       return this.tkBundleId;
    }
    public final JsonObject getTkData(){
       return this.tkData;
    }
    public final int getTkMinVer(){
       return this.tkMinVer;
    }
    public int hashCode(){
       InviteCardMeta obj = PatchProxy.apply(null, this, InviteCardMeta.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tkBundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.tkMinVer) * 31;
       InviteCardMeta tbgm = this.bgm;
       int i2 = (tbgm != null)? tbgm.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbgm = this.tkData;
       i2 = (tbgm != null)? tbgm.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbgm = this.id;
       i2 = (tbgm != null)? tbgm.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbgm = this.reportInfo;
       if (tbgm != null) {
          i = tbgm.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InviteCardMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InviteCardMeta\(tkBundleId="+this.tkBundleId+", tkMinVer="+this.tkMinVer+", bgm="+this.bgm+", tkData="+this.tkData+", id="+this.id+", reportInfo="+this.reportInfo+"\)";
    }
}
