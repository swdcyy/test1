package com.yxcorp.gifshow.growth.vfc.model.NormalInviteInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.vfc.model.NormalInviteInfo$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NormalInviteInfo implements Serializable	// class@0015bc
{
    public final List inviteList;
    public final String subTitle;
    public final int totalInviteCount;
    public static final NormalInviteInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NormalInviteInfo.Companion = new NormalInviteInfo$a(null);
    }
    public void NormalInviteInfo(List p0,String p1,int p2){
       a.p(p0, "inviteList");
       a.p(p1, "subTitle");
       super();
       this.inviteList = p0;
       this.subTitle = p1;
       this.totalInviteCount = p2;
    }
    public static NormalInviteInfo copy$default(NormalInviteInfo p0,List p1,String p2,int p3,int p4,Object p5){
       NormalInviteInfo inviteList;
       NormalInviteInfo subTitle;
       NormalInviteInfo totalInviteC;
       if (p4 & 0x01) {
          inviteList = p0.inviteList;
       }
       if (p4 & 0x02) {
          subTitle = p0.subTitle;
       }
       if (p4 & 0x04) {
          totalInviteC = p0.totalInviteCount;
       }
       return p0.copy(inviteList, subTitle, totalInviteC);
    }
    public final List component1(){
       return this.inviteList;
    }
    public final String component2(){
       return this.subTitle;
    }
    public final int component3(){
       return this.totalInviteCount;
    }
    public final NormalInviteInfo copy(List p0,String p1,int p2){
       if (PatchProxy.isSupport(NormalInviteInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NormalInviteInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "inviteList");
       a.p(p1, "subTitle");
       return new NormalInviteInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NormalInviteInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NormalInviteInfo && (a.g(this.inviteList, p0.inviteList) && (a.g(this.subTitle, p0.subTitle) && this.totalInviteCount == p0.totalInviteCount)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NormalInviteInfo obj = PatchProxy.apply(null, this, NormalInviteInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.inviteList;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NormalInviteInfo tsubTitle = this.subTitle;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       return (((i1 + i) * 31) + this.totalInviteCount);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NormalInviteInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NormalInviteInfo\(inviteList="+this.inviteList+", subTitle="+this.subTitle+", totalInviteCount="+this.totalInviteCount+"\)";
    }
}
