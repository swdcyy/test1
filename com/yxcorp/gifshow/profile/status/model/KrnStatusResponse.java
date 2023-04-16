package com.yxcorp.gifshow.profile.status.model.KrnStatusResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import kotlin.jvm.internal.a;

public final class KrnStatusResponse implements Serializable, CursorResponse	// class@0015b6
{
    public final String mCursor;
    public List mItems;
    public final String mListType;
    public ProfileStatusInfo mProfileStatusInfo;

    public void KrnStatusResponse(){
       super();
       this.mItems = new ArrayList();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public final String getListType(){
       return this.mListType;
    }
    public final List getMItems(){
       return this.mItems;
    }
    public final String getMListType(){
       return this.mListType;
    }
    public final ProfileStatusInfo getMProfileStatusInfo(){
       return this.mProfileStatusInfo;
    }
    public final ProfileStatusInfo getProfileStatusInfo(){
       return this.mProfileStatusInfo;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, KrnStatusResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public final void setMItems(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnStatusResponse.class, "1")) {
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
