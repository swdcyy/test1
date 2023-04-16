package com.kwai.feature.api.social.message.bridge.model.MemberInfo;
import java.io.Serializable;
import java.lang.String;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import com.kwai.feature.api.social.message.bridge.model.ActivityTag;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MemberInfo implements Serializable	// class@001140
{
    public final boolean enableDelete;
    public final String groupNickName;
    public String nickName;
    public final int role;
    public String showName;
    public final ActivityTag tag;
    public final String userId;
    public UserSimpleInfo userInfo;
    public UserVerifiedDetail verifiedDetail;

    public void MemberInfo(String p0,String p1,String p2,String p3,UserSimpleInfo p4,boolean p5,ActivityTag p6,int p7,UserVerifiedDetail p8){
       a.p(p0, "userId");
       super();
       this.userId = p0;
       this.showName = p1;
       this.nickName = p2;
       this.groupNickName = p3;
       this.userInfo = p4;
       this.enableDelete = p5;
       this.tag = p6;
       this.role = p7;
       this.verifiedDetail = p8;
    }
    public void MemberInfo(String p0,String p1,String p2,String p3,UserSimpleInfo p4,boolean p5,ActivityTag p6,int p7,UserVerifiedDetail p8,int p9,u p10){
       UserVerifiedDetail userVerified = (p9 & 0x0100)? null: p8;
       super(p0, p1, p2, p3, p4, p5, p6, p7, userVerified);
       return;
    }
    public static MemberInfo copy$default(MemberInfo p0,String p1,String p2,String p3,String p4,UserSimpleInfo p5,boolean p6,ActivityTag p7,int p8,UserVerifiedDetail p9,int p10,Object p11){
       MemberInfo memberInfo = p0;
       int i = p10;
       MemberInfo userId = (i & 0x01)? memberInfo.userId: p1;
       MemberInfo showName = (i & 0x02)? memberInfo.showName: p2;
       MemberInfo nickName = (i & 0x04)? memberInfo.nickName: p3;
       MemberInfo groupNickNam = (i & 0x08)? memberInfo.groupNickName: p4;
       MemberInfo userInfo = (i & 0x10)? memberInfo.userInfo: p5;
       MemberInfo enableDelete = (i & 0x20)? memberInfo.enableDelete: p6;
       MemberInfo tag = (i & 0x40)? memberInfo.tag: p7;
       MemberInfo role = (i & 0x0080)? memberInfo.role: p8;
       MemberInfo verifiedDeta = (i & 0x0100)? memberInfo.verifiedDetail: p9;
       return p0.copy(userId, showName, nickName, groupNickNam, userInfo, enableDelete, tag, role, verifiedDeta);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.showName;
    }
    public final String component3(){
       return this.nickName;
    }
    public final String component4(){
       return this.groupNickName;
    }
    public final UserSimpleInfo component5(){
       return this.userInfo;
    }
    public final boolean component6(){
       return this.enableDelete;
    }
    public final ActivityTag component7(){
       return this.tag;
    }
    public final int component8(){
       return this.role;
    }
    public final UserVerifiedDetail component9(){
       return this.verifiedDetail;
    }
    public final MemberInfo copy(String p0,String p1,String p2,String p3,UserSimpleInfo p4,boolean p5,ActivityTag p6,int p7,UserVerifiedDetail p8){
       MemberInfo obj;
       object oobject = p0;
       if (PatchProxy.isSupport(MemberInfo.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, MemberInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "userId");
       obj = new MemberInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemberInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemberInfo && (a.g(this.userId, p0.userId) && (a.g(this.showName, p0.showName) && (a.g(this.nickName, p0.nickName) && (a.g(this.groupNickName, p0.groupNickName) && (a.g(this.userInfo, p0.userInfo) && (this.enableDelete == p0.enableDelete && (a.g(this.tag, p0.tag) && (this.role == p0.role && a.g(this.verifiedDetail, p0.verifiedDetail))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getEnableDelete(){
       return this.enableDelete;
    }
    public final String getGroupNickName(){
       return this.groupNickName;
    }
    public final String getNickName(){
       return this.nickName;
    }
    public final int getRole(){
       return this.role;
    }
    public final String getShowName(){
       return this.showName;
    }
    public final ActivityTag getTag(){
       return this.tag;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final UserSimpleInfo getUserInfo(){
       return this.userInfo;
    }
    public final UserVerifiedDetail getVerifiedDetail(){
       return this.verifiedDetail;
    }
    public int hashCode(){
       MemberInfo obj = PatchProxy.apply(null, this, MemberInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MemberInfo tshowName = this.showName;
       int i2 = (tshowName != null)? tshowName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshowName = this.nickName;
       i2 = (tshowName != null)? tshowName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshowName = this.groupNickName;
       i2 = (tshowName != null)? tshowName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshowName = this.userInfo;
       i2 = (tshowName != null)? tshowName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshowName = this.enableDelete;
       if (tshowName != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tshowName = this.tag;
       i2 = (tshowName != null)? tshowName.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.role) * 31;
       tshowName = this.verifiedDetail;
       if (tshowName != null) {
          i = tshowName.hashCode();
       }
       return (i1 + i);
    }
    public final void setNickName(String p0){
       this.nickName = p0;
    }
    public final void setShowName(String p0){
       this.showName = p0;
    }
    public final void setUserInfo(UserSimpleInfo p0){
       this.userInfo = p0;
    }
    public final void setVerifiedDetail(UserVerifiedDetail p0){
       this.verifiedDetail = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemberInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MemberInfo\(userId="+this.userId+", showName="+this.showName+", nickName="+this.nickName+", groupNickName="+this.groupNickName+", userInfo="+this.userInfo+", enableDelete="+this.enableDelete+", tag="+this.tag+", role="+this.role+", verifiedDetail="+this.verifiedDetail+"\)";
    }
}
