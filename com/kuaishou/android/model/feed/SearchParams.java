package com.kuaishou.android.model.feed.SearchParams;
import java.io.Serializable;
import com.kuaishou.android.model.feed.SearchParams$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.VideoFeed;
import da6.c;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;

public class SearchParams implements Serializable	// class@000b6d
{
    public FeedLogCtx mCollectionFeedLogCtx;
    public String mContentName;
    public String mExtparam;
    public FeedLogCtx mKBoxFeedLogCtx;
    public String mLiveGuidePopup;
    public String mPhotoId;
    public int mSearchPosition;
    public String mSearchSessionId;
    public String mSearchType;
    public String mSourceType;
    public static final long serialVersionUID = 0x5127ae8f3a1c8091;

    public void SearchParams(SearchParams$a p0){
       super();
       this.mSearchType = p0.a;
       this.mSearchPosition = p0.b;
       this.mSearchSessionId = p0.c;
       this.mPhotoId = p0.d;
       this.mSourceType = p0.e;
       this.mContentName = p0.f;
       this.mCollectionFeedLogCtx = p0.h;
       this.mKBoxFeedLogCtx = p0.i;
    }
    public static SearchParams getSearchParams(BaseFeed p0){
       SearchParams extra;
       SearchParams searchParams = null;
       Object obj = PatchProxy.applyOneRefs(p0, searchParams, SearchParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof VideoFeed) {
          extra = p0.getExtra("SEARCH_PARAMS");
       }else if(p0 instanceof ImageFeed){
          extra = p0.getExtra("SEARCH_PARAMS");
       }else if(p0 instanceof LiveStreamFeed){
          extra = p0.getExtra("SEARCH_PARAMS");
       }else {
          extra = searchParams;
       }
       if (extra != null && !TextUtils.x(extra.mSearchSessionId)) {
          searchParams = extra;
       }
       return searchParams;
    }
    public static SearchParams$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, SearchParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchParams$a();
    }
    public final void a(JsonObject p0,String p1,int p2){
       if (PatchProxy.isSupport(SearchParams.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SearchParams.class, "5")) {
          return;
       }
       p0.a0(p1, Integer.valueOf(p2));
       return;
    }
    public final void b(JsonObject p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SearchParams.class, "4")) {
          return;
       }
       if (!TextUtils.x(p2)) {
          p0.c0(p1, p2);
       }
       return;
    }
    public String toLoggerString(){
       JsonObject obj = PatchProxy.apply(null, this, SearchParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       this.a(obj, "pos", this.mSearchPosition);
       this.b(obj, "photo_id", this.mPhotoId);
       this.b(obj, "type", this.mSearchType);
       this.b(obj, "source_type", this.mSourceType);
       this.b(obj, "content", this.mContentName);
       return obj.toString();
    }
}
