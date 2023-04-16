package com.kuaishou.gifshow.kuaishan.network.KSTemplateFriendVideoListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import kotlin.jvm.internal.a;

public final class KSTemplateFriendVideoListResponse implements CursorResponse, Serializable	// class@001a9c
{
    public List mKSFeedPhotoList;
    public String mPcursor;
    public int mResult;

    public void KSTemplateFriendVideoListResponse(){
       super();
       this.mKSFeedPhotoList = new ArrayList();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mKSFeedPhotoList;
    }
    public final List getMKSFeedPhotoList(){
       return this.mKSFeedPhotoList;
    }
    public final String getMPcursor(){
       return this.mPcursor;
    }
    public final int getMResult(){
       return this.mResult;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, KSTemplateFriendVideoListResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
    public final void setMKSFeedPhotoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTemplateFriendVideoListResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mKSFeedPhotoList = p0;
       return;
    }
    public final void setMPcursor(String p0){
       this.mPcursor = p0;
    }
    public final void setMResult(int p0){
       this.mResult = p0;
    }
}
