package com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewRealTimeFeedInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.live.preview.item.model.LivePreviewGeneralModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Iterable;
import qk.m;
import zk3.a;
import ok.o;
import com.google.common.base.Optional;

public class LivePreviewRealTimeFeedInfoResponse implements Serializable	// class@000def
{
    public List mLivePreviewGeneralModels;
    public List mLiveStreamModels;
    public LivePreviewPendantInfo mPendantInfo;
    public static final long serialVersionUID = 0x16445fd8faf2a90e;

    public void LivePreviewRealTimeFeedInfoResponse(){
       super();
    }
    public LiveStreamModel getFirstLiveStreamModel(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LivePreviewRealTimeFeedInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mLiveStreamModels)) {
          return objArray;
       }
       return this.mLiveStreamModels.get(0);
    }
    public LivePreviewGeneralModel getLivePreViewGeneralModel(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewRealTimeFeedInfoResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0) || q.f(this.mLivePreviewGeneralModels)) {
          return null;
       }
       return m.s(this.mLivePreviewGeneralModels).r(new a(p0)).orNull();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewRealTimeFeedInfoResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mLiveStreamModels)) {
          return "LiveStreamModels is empty!";
       }
       return this.mLiveStreamModels.toString();
    }
}
