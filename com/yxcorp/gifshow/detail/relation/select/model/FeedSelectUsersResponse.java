package com.yxcorp.gifshow.detail.relation.select.model.FeedSelectUsersResponse;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeedSelectUsersResponse implements Serializable	// class@001701
{
    public SelectUsersConfigParams mConfig;
    public String mCursor;
    public List mLastestAtUsers;
    public List mList;

    public void FeedSelectUsersResponse(String p0,List p1,SelectUsersConfigParams p2,List p3){
       a.p(p0, "mCursor");
       a.p(p2, "mConfig");
       super();
       this.mCursor = p0;
       this.mList = p1;
       this.mConfig = p2;
       this.mLastestAtUsers = p3;
    }
    public static FeedSelectUsersResponse copy$default(FeedSelectUsersResponse p0,String p1,List p2,SelectUsersConfigParams p3,List p4,int p5,Object p6){
       FeedSelectUsersResponse mCursor;
       FeedSelectUsersResponse mList;
       FeedSelectUsersResponse mConfig;
       FeedSelectUsersResponse mLastestAtUs;
       if (p5 & 0x01) {
          mCursor = p0.mCursor;
       }
       if (p5 & 0x02) {
          mList = p0.mList;
       }
       if (p5 & 0x04) {
          mConfig = p0.mConfig;
       }
       if (p5 & 0x08) {
          mLastestAtUs = p0.mLastestAtUsers;
       }
       return p0.copy(mCursor, mList, mConfig, mLastestAtUs);
    }
    public final String component1(){
       return this.mCursor;
    }
    public final List component2(){
       return this.mList;
    }
    public final SelectUsersConfigParams component3(){
       return this.mConfig;
    }
    public final List component4(){
       return this.mLastestAtUsers;
    }
    public final FeedSelectUsersResponse copy(String p0,List p1,SelectUsersConfigParams p2,List p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FeedSelectUsersResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mCursor");
       a.p(p2, "mConfig");
       return new FeedSelectUsersResponse(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedSelectUsersResponse.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeedSelectUsersResponse && (a.g(this.mCursor, p0.mCursor) && (a.g(this.mList, p0.mList) && (a.g(this.mConfig, p0.mConfig) && a.g(this.mLastestAtUsers, p0.mLastestAtUsers)))))) {
          return true;
       }
       return false;
    }
    public final SelectUsersConfigParams getMConfig(){
       return this.mConfig;
    }
    public final String getMCursor(){
       return this.mCursor;
    }
    public final List getMLastestAtUsers(){
       return this.mLastestAtUsers;
    }
    public final List getMList(){
       return this.mList;
    }
    public final boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FeedSelectUsersResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public int hashCode(){
       FeedSelectUsersResponse obj = PatchProxy.apply(null, this, FeedSelectUsersResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCursor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FeedSelectUsersResponse tmList = this.mList;
       int i2 = (tmList != null)? tmList.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmList = this.mConfig;
       i2 = (tmList != null)? tmList.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmList = this.mLastestAtUsers;
       if (tmList != null) {
          i = tmList.hashCode();
       }
       return (i1 + i);
    }
    public final void setMConfig(SelectUsersConfigParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedSelectUsersResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mConfig = p0;
       return;
    }
    public final void setMCursor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedSelectUsersResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCursor = p0;
       return;
    }
    public final void setMLastestAtUsers(List p0){
       this.mLastestAtUsers = p0;
    }
    public final void setMList(List p0){
       this.mList = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeedSelectUsersResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeedSelectUsersResponse\(mCursor="+this.mCursor+", mList="+this.mList+", mConfig="+this.mConfig+", mLastestAtUsers="+this.mLastestAtUsers+"\)";
    }
}
