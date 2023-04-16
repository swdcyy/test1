package com.yxcorp.gifshow.relation.select.model.SelectUsersResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.relation.select.model.SelectUsersResponse$a;
import nsd.u;
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

public final class SelectUsersResponse implements Serializable	// class@0019a9
{
    public SelectUsersConfigParams mConfig;
    public String mCursor;
    public List mList;
    public static final SelectUsersResponse$a Companion;

    static {
       SelectUsersResponse.Companion = new SelectUsersResponse$a(null);
    }
    public void SelectUsersResponse(String p0,List p1,SelectUsersConfigParams p2){
       a.p(p0, "mCursor");
       a.p(p1, "mList");
       a.p(p2, "mConfig");
       super();
       this.mCursor = p0;
       this.mList = p1;
       this.mConfig = p2;
    }
    public static SelectUsersResponse copy$default(SelectUsersResponse p0,String p1,List p2,SelectUsersConfigParams p3,int p4,Object p5){
       SelectUsersResponse mCursor;
       SelectUsersResponse mList;
       SelectUsersResponse mConfig;
       if (p4 & 0x01) {
          mCursor = p0.mCursor;
       }
       if (p4 & 0x02) {
          mList = p0.mList;
       }
       if (p4 & 0x04) {
          mConfig = p0.mConfig;
       }
       return p0.copy(mCursor, mList, mConfig);
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
    public final SelectUsersResponse copy(String p0,List p1,SelectUsersConfigParams p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SelectUsersResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mCursor");
       a.p(p1, "mList");
       a.p(p2, "mConfig");
       return new SelectUsersResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersResponse.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SelectUsersResponse && (a.g(this.mCursor, p0.mCursor) && (a.g(this.mList, p0.mList) && a.g(this.mConfig, p0.mConfig))))) {
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
    public final List getMList(){
       return this.mList;
    }
    public final boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, SelectUsersResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public int hashCode(){
       SelectUsersResponse obj = PatchProxy.apply(null, this, SelectUsersResponse.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCursor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SelectUsersResponse tmList = this.mList;
       int i2 = (tmList != null)? tmList.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmList = this.mConfig;
       if (tmList != null) {
          i = tmList.hashCode();
       }
       return (i1 + i);
    }
    public final void setMConfig(SelectUsersConfigParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersResponse.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mConfig = p0;
       return;
    }
    public final void setMCursor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCursor = p0;
       return;
    }
    public final void setMList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mList = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SelectUsersResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SelectUsersResponse\(mCursor="+this.mCursor+", mList="+this.mList+", mConfig="+this.mConfig+"\)";
    }
}
