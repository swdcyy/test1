package com.kwai.feature.api.social.message.bridge.model.MemberSection;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MemberSection implements Serializable	// class@001141
{
    public final int b;
    public final List memberList;
    public final String text;

    public void MemberSection(int p0,String p1,List p2){
       a.p(p1, "text");
       a.p(p2, "memberList");
       super();
       this.b = p0;
       this.text = p1;
       this.memberList = p2;
    }
    public static MemberSection copy$default(MemberSection p0,int p1,String p2,List p3,int p4,Object p5){
       MemberSection b;
       MemberSection text;
       MemberSection memberList;
       if (p4 & 0x01) {
          b = p0.b;
       }
       if (p4 & 0x02) {
          text = p0.text;
       }
       if (p4 & 0x04) {
          memberList = p0.memberList;
       }
       return p0.copy(b, text, memberList);
    }
    public final int component1(){
       return this.b;
    }
    public final String component2(){
       return this.text;
    }
    public final List component3(){
       return this.memberList;
    }
    public final MemberSection copy(int p0,String p1,List p2){
       if (PatchProxy.isSupport(MemberSection.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, MemberSection.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "text");
       a.p(p2, "memberList");
       return new MemberSection(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemberSection.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemberSection && (this.b == p0.b && (a.g(this.text, p0.text) && a.g(this.memberList, p0.memberList))))) {
          return true;
       }
       return false;
    }
    public final List getMemberList(){
       return this.memberList;
    }
    public final int getRole(){
       return this.b;
    }
    public final String getText(){
       return this.text;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MemberSection.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.b * 31;
       MemberSection ttext = this.text;
       int i1 = 0;
       int i2 = (ttext != null)? ttext.hashCode(): 0;
       i = (i + i2) * 31;
       ttext = this.memberList;
       if (ttext != null) {
          i1 = ttext.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemberSection.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MemberSection\(role="+this.b+", text="+this.text+", memberList="+this.memberList+"\)";
    }
}
