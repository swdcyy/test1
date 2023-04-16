package com.yxcorp.gifshow.relation.select.model.SelectUsersResponse$FriendsListResponse;
import java.io.Serializable;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SelectUsersResponse$FriendsListResponse implements Serializable	// class@0019a7
{
    public String section;
    public String sectionTitle;
    public int type;
    public User user;

    public void SelectUsersResponse$FriendsListResponse(int p0,String p1,String p2,User p3){
       a.p(p1, "sectionTitle");
       a.p(p2, "section");
       super();
       this.type = p0;
       this.sectionTitle = p1;
       this.section = p2;
       this.user = p3;
    }
    public void SelectUsersResponse$FriendsListResponse(int p0,String p1,String p2,User p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static SelectUsersResponse$FriendsListResponse copy$default(SelectUsersResponse$FriendsListResponse p0,int p1,String p2,String p3,User p4,int p5,Object p6){
       SelectUsersResponse$FriendsListResponse type;
       SelectUsersResponse$FriendsListResponse sectionTitle;
       SelectUsersResponse$FriendsListResponse section;
       SelectUsersResponse$FriendsListResponse user;
       if (p5 & 0x01) {
          type = p0.type;
       }
       if (p5 & 0x02) {
          sectionTitle = p0.sectionTitle;
       }
       if (p5 & 0x04) {
          section = p0.section;
       }
       if (p5 & 0x08) {
          user = p0.user;
       }
       return p0.copy(type, sectionTitle, section, user);
    }
    public final int component1(){
       return this.type;
    }
    public final String component2(){
       return this.sectionTitle;
    }
    public final String component3(){
       return this.section;
    }
    public final User component4(){
       return this.user;
    }
    public final SelectUsersResponse$FriendsListResponse copy(int p0,String p1,String p2,User p3){
       if (PatchProxy.isSupport(SelectUsersResponse$FriendsListResponse.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, SelectUsersResponse$FriendsListResponse.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "sectionTitle");
       a.p(p2, "section");
       return new SelectUsersResponse$FriendsListResponse(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersResponse$FriendsListResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SelectUsersResponse$FriendsListResponse && (this.type == p0.type && (a.g(this.sectionTitle, p0.sectionTitle) && (a.g(this.section, p0.section) && a.g(this.user, p0.user)))))) {
          return true;
       }
       return false;
    }
    public final String getSection(){
       return this.section;
    }
    public final String getSectionTitle(){
       return this.sectionTitle;
    }
    public final int getType(){
       return this.type;
    }
    public final User getUser(){
       return this.user;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SelectUsersResponse$FriendsListResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       SelectUsersResponse$FriendsListResponse tsectionTitl = this.sectionTitle;
       int i1 = 0;
       int i2 = (tsectionTitl != null)? tsectionTitl.hashCode(): 0;
       i = (i + i2) * 31;
       tsectionTitl = this.section;
       i2 = (tsectionTitl != null)? tsectionTitl.hashCode(): 0;
       i = (i + i2) * 31;
       tsectionTitl = this.user;
       if (tsectionTitl != null) {
          i1 = tsectionTitl.hashCode();
       }
       return (i + i1);
    }
    public final boolean isSection(){
       boolean b = (this.type == 2)? true: false;
       return b;
    }
    public final boolean isUser(){
       boolean b = true;
       if (this.type != b || this.user == null) {
          b = false;
       }
       return b;
    }
    public final void setSection(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersResponse$FriendsListResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.section = p0;
       return;
    }
    public final void setSectionTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersResponse$FriendsListResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.sectionTitle = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public final void setUser(User p0){
       this.user = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SelectUsersResponse$FriendsListResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FriendsListResponse\(type="+this.type+", sectionTitle="+this.sectionTitle+", section="+this.section+", user="+this.user+"\)";
    }
}
