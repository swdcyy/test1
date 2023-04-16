package com.yxcorp.gifshow.profile.status.model.HistoryStatusResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import java.util.List;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class HistoryStatusResponse implements Serializable, CursorResponse	// class@0015b5
{
    public String mCursor;
    public List mItems;
    public ProfileStatusInfo mProfileStatusInfo;

    public void HistoryStatusResponse(){
       super(null, null, null, 7, null);
    }
    public void HistoryStatusResponse(ProfileStatusInfo p0,List p1,String p2){
       a.p(p1, "mItems");
       super();
       this.mProfileStatusInfo = p0;
       this.mItems = p1;
       this.mCursor = p2;
    }
    public void HistoryStatusResponse(ProfileStatusInfo p0,List p1,String p2,int p3,u p4){
       ArrayList uArrayList;
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          uArrayList = new ArrayList();
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, uArrayList, p2);
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public final String getMCursor(){
       return this.mCursor;
    }
    public final List getMItems(){
       return this.mItems;
    }
    public final ProfileStatusInfo getMProfileStatusInfo(){
       return this.mProfileStatusInfo;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, HistoryStatusResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public final void setMCursor(String p0){
       this.mCursor = p0;
    }
    public final void setMItems(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HistoryStatusResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mItems = p0;
       return;
    }
    public final void setMProfileStatusInfo(ProfileStatusInfo p0){
       this.mProfileStatusInfo = p0;
    }
}
