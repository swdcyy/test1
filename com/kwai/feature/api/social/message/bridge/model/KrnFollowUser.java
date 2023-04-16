package com.kwai.feature.api.social.message.bridge.model.KrnFollowUser;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnFollowUser implements Serializable	// class@00113c
{
    public final String gender;
    public final String headUrl;
    public final String relation;
    public final String userAliasName;
    public final String userAliasNamePY;
    public final String userId;
    public final String userName;
    public final String userNamePY;

    public void KrnFollowUser(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       super();
       this.userId = p0;
       this.userName = p1;
       this.headUrl = p2;
       this.gender = p3;
       this.relation = p4;
       this.userNamePY = p5;
       this.userAliasName = p6;
       this.userAliasNamePY = p7;
    }
    public static KrnFollowUser copy$default(KrnFollowUser p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,int p9,Object p10){
       KrnFollowUser krnFollowUse = p0;
       int i = p9;
       KrnFollowUser userId = (i & 0x01)? krnFollowUse.userId: p1;
       KrnFollowUser userName = (i & 0x02)? krnFollowUse.userName: p2;
       KrnFollowUser headUrl = (i & 0x04)? krnFollowUse.headUrl: p3;
       KrnFollowUser gender = (i & 0x08)? krnFollowUse.gender: p4;
       KrnFollowUser relation = (i & 0x10)? krnFollowUse.relation: p5;
       KrnFollowUser userNamePY = (i & 0x20)? krnFollowUse.userNamePY: p6;
       KrnFollowUser userAliasNam = (i & 0x40)? krnFollowUse.userAliasName: p7;
       KrnFollowUser userAliasNam1 = (i & 0x0080)? krnFollowUse.userAliasNamePY: p8;
       return p0.copy(userId, userName, headUrl, gender, relation, userNamePY, userAliasNam, userAliasNam1);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.userName;
    }
    public final String component3(){
       return this.headUrl;
    }
    public final String component4(){
       return this.gender;
    }
    public final String component5(){
       return this.relation;
    }
    public final String component6(){
       return this.userNamePY;
    }
    public final String component7(){
       return this.userAliasName;
    }
    public final String component8(){
       return this.userAliasNamePY;
    }
    public final KrnFollowUser copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       Object obj;
       if (PatchProxy.isSupport(KrnFollowUser.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, KrnFollowUser.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KrnFollowUser krnFollowUse = new KrnFollowUser(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnFollowUser.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnFollowUser && (a.g(this.userId, p0.userId) && (a.g(this.userName, p0.userName) && (a.g(this.headUrl, p0.headUrl) && (a.g(this.gender, p0.gender) && (a.g(this.relation, p0.relation) && (a.g(this.userNamePY, p0.userNamePY) && (a.g(this.userAliasName, p0.userAliasName) && a.g(this.userAliasNamePY, p0.userAliasNamePY)))))))))) {
          return true;
       }
       return false;
    }
    public final String getGender(){
       return this.gender;
    }
    public final String getHeadUrl(){
       return this.headUrl;
    }
    public final String getRelation(){
       return this.relation;
    }
    public final String getUserAliasName(){
       return this.userAliasName;
    }
    public final String getUserAliasNamePY(){
       return this.userAliasNamePY;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public final String getUserNamePY(){
       return this.userNamePY;
    }
    public int hashCode(){
       KrnFollowUser obj = PatchProxy.apply(null, this, KrnFollowUser.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KrnFollowUser tuserName = this.userName;
       int i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.headUrl;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.gender;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.relation;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.userNamePY;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.userAliasName;
       i2 = (tuserName != null)? tuserName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserName = this.userAliasNamePY;
       if (tuserName != null) {
          i = tuserName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnFollowUser.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnFollowUser\(userId="+this.userId+", userName="+this.userName+", headUrl="+this.headUrl+", gender="+this.gender+", relation="+this.relation+", userNamePY="+this.userNamePY+", userAliasName="+this.userAliasName+", userAliasNamePY="+this.userAliasNamePY+"\)";
    }
}
