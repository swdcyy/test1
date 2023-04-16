package com.kwai.feature.api.social.message.bridge.model.KrnUserInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import com.kwai.framework.model.user.UserVerifiedDetail;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnUserInfo implements Serializable	// class@00113f
{
    public final boolean blocked;
    public final String gender;
    public final String headUrl;
    public final List headUrls;
    public final int officialAccountType;
    public final int relationType;
    public final String tag;
    public final String userId;
    public String userName;
    public final UserVerifiedDetail verifiedDetail;

    public void KrnUserInfo(){
       super(null, null, null, null, null, null, 0, 0, false, null, 1023, null);
    }
    public void KrnUserInfo(String p0,String p1,String p2,String p3,List p4,UserVerifiedDetail p5,int p6,int p7,boolean p8,String p9){
       a.p(p0, "userId");
       a.p(p1, "userName");
       a.p(p2, "gender");
       a.p(p3, "headUrl");
       a.p(p9, "tag");
       super();
       this.userId = p0;
       this.userName = p1;
       this.gender = p2;
       this.headUrl = p3;
       this.headUrls = p4;
       this.verifiedDetail = p5;
       this.relationType = p6;
       this.officialAccountType = p7;
       this.blocked = p8;
       this.tag = p9;
    }
    public void KrnUserInfo(String p0,String p1,String p2,String p3,List p4,UserVerifiedDetail p5,int p6,int p7,boolean p8,String p9,int p10,u p11){
       int i = p10;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       String str2 = (i & 0x02)? str: p1;
       String str3 = (i & 0x04)? str: p2;
       String str4 = (i & 0x08)? str: p3;
       List list = (i & 0x10)? CollectionsKt__CollectionsKt.E(): p4;
       int i1 = (i & 0x20)? 0: p5;
       int i2 = 0;
       int i3 = (i & 0x40)? 0: p6;
       int i4 = (i & 0x0080)? 0: p7;
       if (!(i & 0x0100)) {
          i2 = p8;
       }
       if (!(i & 0x0200)) {
          str = p9;
       }
       super(str1, str2, str3, str4, list, i1, i3, i4, i2, str);
       return;
    }
    public static KrnUserInfo copy$default(KrnUserInfo p0,String p1,String p2,String p3,String p4,List p5,UserVerifiedDetail p6,int p7,int p8,boolean p9,String p10,int p11,Object p12){
       KrnUserInfo krnUserInfo = p0;
       int i = p11;
       KrnUserInfo userId = (i & 0x01)? krnUserInfo.userId: p1;
       KrnUserInfo userName = (i & 0x02)? krnUserInfo.userName: p2;
       KrnUserInfo gender = (i & 0x04)? krnUserInfo.gender: p3;
       KrnUserInfo headUrl = (i & 0x08)? krnUserInfo.headUrl: p4;
       KrnUserInfo headUrls = (i & 0x10)? krnUserInfo.headUrls: p5;
       KrnUserInfo verifiedDeta = (i & 0x20)? krnUserInfo.verifiedDetail: p6;
       KrnUserInfo relationType = (i & 0x40)? krnUserInfo.relationType: p7;
       KrnUserInfo officialAcco = (i & 0x0080)? krnUserInfo.officialAccountType: p8;
       KrnUserInfo blocked = (i & 0x0100)? krnUserInfo.blocked: p9;
       KrnUserInfo tag = (i & 0x0200)? krnUserInfo.tag: p10;
       return p0.copy(userId, userName, gender, headUrl, headUrls, verifiedDeta, relationType, officialAcco, blocked, tag);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component10(){
       return this.tag;
    }
    public final String component2(){
       return this.userName;
    }
    public final String component3(){
       return this.gender;
    }
    public final String component4(){
       return this.headUrl;
    }
    public final List component5(){
       return this.headUrls;
    }
    public final UserVerifiedDetail component6(){
       return this.verifiedDetail;
    }
    public final int component7(){
       return this.relationType;
    }
    public final int component8(){
       return this.officialAccountType;
    }
    public final boolean component9(){
       return this.blocked;
    }
    public final KrnUserInfo copy(String p0,String p1,String p2,String p3,List p4,UserVerifiedDetail p5,int p6,int p7,boolean p8,String p9){
       KrnUserInfo obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p9;
       if (PatchProxy.isSupport(KrnUserInfo.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject4;
          obj = PatchProxy.apply(objArray, this, KrnUserInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "userId");
       a.p(p1, "userName");
       a.p(oobject2, "gender");
       a.p(oobject3, "headUrl");
       a.p(oobject4, "tag");
       obj = new KrnUserInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnUserInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnUserInfo && (a.g(this.userId, p0.userId) && (a.g(this.userName, p0.userName) && (a.g(this.gender, p0.gender) && (a.g(this.headUrl, p0.headUrl) && (a.g(this.headUrls, p0.headUrls) && (a.g(this.verifiedDetail, p0.verifiedDetail) && (this.relationType == p0.relationType && (this.officialAccountType == p0.officialAccountType && (this.blocked == p0.blocked && a.g(this.tag, p0.tag)))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getBlocked(){
       return this.blocked;
    }
    public final String getGender(){
       return this.gender;
    }
    public final String getHeadUrl(){
       return this.headUrl;
    }
    public final List getHeadUrls(){
       return this.headUrls;
    }
    public final int getOfficialAccountType(){
       return this.officialAccountType;
    }
    public final int getRelationType(){
       return this.relationType;
    }
    public final String getTag(){
       return this.tag;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public final UserVerifiedDetail getVerifiedDetail(){
       return this.verifiedDetail;
    }
    public int hashCode(){
       KrnUserInfo obj = PatchProxy.apply(null, this, KrnUserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KrnUserInfo tuserName = this.userName;
       int i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.gender;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.headUrl;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.headUrls;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.verifiedDetail;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.relationType) * 31) + this.officialAccountType) * 31;
       tuserName = this.blocked;
       if (tuserName != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tuserName = this.tag;
       if (tuserName != null) {
          i = tuserName.hashCode();
       }
       return (i1 + i);
    }
    public final void setUserName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.userName = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnUserInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnUserInfo\(userId="+this.userId+", userName="+this.userName+", gender="+this.gender+", headUrl="+this.headUrl+", headUrls="+this.headUrls+", verifiedDetail="+this.verifiedDetail+", relationType="+this.relationType+", officialAccountType="+this.officialAccountType+", blocked="+this.blocked+", tag="+this.tag+"\)";
    }
}
