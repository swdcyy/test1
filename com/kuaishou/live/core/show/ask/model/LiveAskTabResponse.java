package com.kuaishou.live.core.show.ask.model.LiveAskTabResponse;
import la6.b;
import java.io.Serializable;
import com.kuaishou.live.core.show.ask.model.LiveAskTabResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.ask.model.LiveAskTabResponse$LiveAskMaxLikeQuestion;

public final class LiveAskTabResponse implements b, Serializable	// class@0009d5
{
    public List mAskItemList;
    public int mFocusPosition;
    public boolean mLocked;
    public LiveAskTabResponse$LiveAskMaxLikeQuestion mMaxLikeQuestion;
    public static final LiveAskTabResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LiveAskTabResponse.Companion = new LiveAskTabResponse$a(null);
    }
    public void LiveAskTabResponse(){
       super();
    }
    public List getItems(){
       LiveAskTabResponse obj = PatchProxy.apply(null, this, LiveAskTabResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAskItemList;
       a.m(obj);
       return obj;
    }
    public final List getMAskItemList(){
       return this.mAskItemList;
    }
    public final int getMFocusPosition(){
       return this.mFocusPosition;
    }
    public final LiveAskTabResponse$LiveAskMaxLikeQuestion getMMaxLikeQuestion(){
       return this.mMaxLikeQuestion;
    }
    public boolean hasMore(){
       return false;
    }
    public final void setMAskItemList(List p0){
       this.mAskItemList = p0;
    }
    public final void setMFocusPosition(int p0){
       this.mFocusPosition = p0;
    }
    public final void setMMaxLikeQuestion(LiveAskTabResponse$LiveAskMaxLikeQuestion p0){
       this.mMaxLikeQuestion = p0;
    }
}
