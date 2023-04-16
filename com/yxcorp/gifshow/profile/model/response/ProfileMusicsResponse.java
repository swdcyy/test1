package com.yxcorp.gifshow.profile.model.response.ProfileMusicsResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class ProfileMusicsResponse implements CursorResponse, Serializable	// class@0013eb
{
    public String mCursor;
    public String mMusicianCenterUrl;
    public List mMusics;

    public void ProfileMusicsResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mMusics;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ProfileMusicsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
