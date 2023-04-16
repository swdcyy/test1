package com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import java.io.Serializable;
import java.lang.String;
import com.kwai.framework.model.user.UserStatus;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileStatusInfo implements Serializable	// class@0012d7
{
    public long heightRadio;
    public List mMoodFollowers;
    public String mMoodFollowingCount;
    public String mMoodFollowingText;
    public boolean mShowLikeBubble;
    public UserStatus mUserStatus;

    public void ProfileStatusInfo(){
       super(null, null, 0, false, null, null, 63, null);
    }
    public void ProfileStatusInfo(String p0,String p1,long p2,boolean p3,UserStatus p4,List p5){
       super();
       this.mMoodFollowingText = p0;
       this.mMoodFollowingCount = p1;
       this.heightRadio = p2;
       this.mShowLikeBubble = p3;
       this.mUserStatus = p4;
       this.mMoodFollowers = p5;
    }
    public void ProfileStatusInfo(String p0,String p1,long p2,boolean p3,UserStatus p4,List p5,int p6,u p7){
       int i = (p6 & 0x01)? 0: p0;
       int i1 = (p6 & 0x02)? 0: p1;
       if (p6 & 0x04) {
          p2 = 0;
       }
       long l = p2;
       int i2 = (p6 & 0x08)? 0: p3;
       int i3 = (p6 & 0x10)? 0: p4;
       List list = (p6 & 0x20)? null: p5;
       super(i, i1, l, i2, i3, list);
       return;
    }
    public static ProfileStatusInfo copy$default(ProfileStatusInfo p0,String p1,String p2,long p3,boolean p4,UserStatus p5,List p6,int p7,Object p8){
       ProfileStatusInfo mMoodFollowi;
       ProfileStatusInfo mMoodFollowi1;
       ProfileStatusInfo heightRadio;
       ProfileStatusInfo mShowLikeBub;
       ProfileStatusInfo mUserStatus;
       ProfileStatusInfo mMoodFollowe;
       if (p7 & 0x01) {
          mMoodFollowi = p0.mMoodFollowingText;
       }
       if (p7 & 0x02) {
          mMoodFollowi1 = p0.mMoodFollowingCount;
       }
       p8 = mMoodFollowi1;
       if (p7 & 0x04) {
          heightRadio = p0.heightRadio;
       }
       ProfileStatusInfo profileStatu = heightRadio;
       if (p7 & 0x08) {
          mShowLikeBub = p0.mShowLikeBubble;
       }
       ProfileStatusInfo profileStatu1 = mShowLikeBub;
       if (p7 & 0x10) {
          mUserStatus = p0.mUserStatus;
       }
       ProfileStatusInfo profileStatu2 = mUserStatus;
       if (p7 & 0x20) {
          mMoodFollowe = p0.mMoodFollowers;
       }
       return p0.copy(mMoodFollowi, p8, profileStatu, profileStatu1, profileStatu2, mMoodFollowe);
    }
    public final String component1(){
       return this.mMoodFollowingText;
    }
    public final String component2(){
       return this.mMoodFollowingCount;
    }
    public final long component3(){
       return this.heightRadio;
    }
    public final boolean component4(){
       return this.mShowLikeBubble;
    }
    public final UserStatus component5(){
       return this.mUserStatus;
    }
    public final List component6(){
       return this.mMoodFollowers;
    }
    public final ProfileStatusInfo copy(String p0,String p1,long p2,boolean p3,UserStatus p4,List p5){
       Object obj;
       if (PatchProxy.isSupport(ProfileStatusInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, this, ProfileStatusInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       ProfileStatusInfo profileStatu = new ProfileStatusInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileStatusInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileStatusInfo && (a.g(this.mMoodFollowingText, p0.mMoodFollowingText) && (a.g(this.mMoodFollowingCount, p0.mMoodFollowingCount) && (!this.heightRadio - p0.heightRadio && (this.mShowLikeBubble == p0.mShowLikeBubble && (a.g(this.mUserStatus, p0.mUserStatus) && a.g(this.mMoodFollowers, p0.mMoodFollowers)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ProfileStatusInfo obj = PatchProxy.apply(null, this, ProfileStatusInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMoodFollowingText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ProfileStatusInfo tmMoodFollow = this.mMoodFollowingCount;
       int i2 = (tmMoodFollow != null)? tmMoodFollow.hashCode(): 0;
       tmMoodFollow = this.heightRadio;
       i1 = (((i1 + i2) * 31) + (int)(tmMoodFollow ^ (tmMoodFollow >> 32))) * 31;
       tmMoodFollow = this.mShowLikeBubble;
       if (tmMoodFollow != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmMoodFollow = this.mUserStatus;
       i2 = (tmMoodFollow != null)? tmMoodFollow.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmMoodFollow = this.mMoodFollowers;
       if (tmMoodFollow != null) {
          i = tmMoodFollow.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileStatusInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileStatusInfo\(mMoodFollowingText="+this.mMoodFollowingText+", mMoodFollowingCount="+this.mMoodFollowingCount+", heightRadio="+this.heightRadio+", mShowLikeBubble="+this.mShowLikeBubble+", mUserStatus="+this.mUserStatus+", mMoodFollowers="+this.mMoodFollowers+"\)";
    }
}
