package com.yxcorp.gifshow.relation.select.search.SearchUsersResponse;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SearchUsersResponse implements Serializable	// class@0019bf
{
    public String mCursor;
    public List mList;
    public String mUssid;

    public void SearchUsersResponse(String p0,List p1,String p2){
       a.p(p0, "mCursor");
       a.p(p1, "mList");
       a.p(p2, "mUssid");
       super();
       this.mCursor = p0;
       this.mList = p1;
       this.mUssid = p2;
    }
    public static SearchUsersResponse copy$default(SearchUsersResponse p0,String p1,List p2,String p3,int p4,Object p5){
       SearchUsersResponse mCursor;
       SearchUsersResponse mList;
       SearchUsersResponse mUssid;
       if (p4 & 0x01) {
          mCursor = p0.mCursor;
       }
       if (p4 & 0x02) {
          mList = p0.mList;
       }
       if (p4 & 0x04) {
          mUssid = p0.mUssid;
       }
       return p0.copy(mCursor, mList, mUssid);
    }
    public final String component1(){
       return this.mCursor;
    }
    public final List component2(){
       return this.mList;
    }
    public final String component3(){
       return this.mUssid;
    }
    public final SearchUsersResponse copy(String p0,List p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchUsersResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mCursor");
       a.p(p1, "mList");
       a.p(p2, "mUssid");
       return new SearchUsersResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchUsersResponse.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SearchUsersResponse && (a.g(this.mCursor, p0.mCursor) && (a.g(this.mList, p0.mList) && a.g(this.mUssid, p0.mUssid))))) {
          return true;
       }
       return false;
    }
    public final String getMCursor(){
       return this.mCursor;
    }
    public final List getMList(){
       return this.mList;
    }
    public final String getMUssid(){
       return this.mUssid;
    }
    public final boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, SearchUsersResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public int hashCode(){
       SearchUsersResponse obj = PatchProxy.apply(null, this, SearchUsersResponse.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCursor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SearchUsersResponse tmList = this.mList;
       int i2 = (tmList != null)? tmList.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmList = this.mUssid;
       if (tmList != null) {
          i = tmList.hashCode();
       }
       return (i1 + i);
    }
    public final void setMCursor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchUsersResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCursor = p0;
       return;
    }
    public final void setMList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchUsersResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mList = p0;
       return;
    }
    public final void setMUssid(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchUsersResponse.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mUssid = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SearchUsersResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SearchUsersResponse\(mCursor="+this.mCursor+", mList="+this.mList+", mUssid="+this.mUssid+"\)";
    }
}
