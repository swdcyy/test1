package com.kuaishou.android.model.feed.StagFactorykscomponentsfeedmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import com.kuaishou.android.model.feed.VisibilityExpiration$TypeAdapter;
import com.kuaishou.android.model.feed.LiveInfo;
import com.kuaishou.android.model.feed.LiveInfo$TypeAdapter;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$TypeAdapter;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import com.kuaishou.android.model.feed.LiveCoverAnnex$TypeAdapter;
import com.kuaishou.android.model.feed.LiveComment;
import com.kuaishou.android.model.feed.LiveComment$TypeAdapter;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$TypeAdapter;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$IconUrl$TypeAdapter;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter;

public final class StagFactorykscomponentsfeedmodel implements j	// class@000b6e
{

    public void StagFactorykscomponentsfeedmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeedmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == VisibilityExpiration.class) {
          return new VisibilityExpiration$TypeAdapter(p0);
       }
       if (rawType == LiveInfo.class) {
          return new LiveInfo$TypeAdapter(p0);
       }
       if (rawType == LiveCoverAnnexWrapper.class) {
          return new LiveCoverAnnexWrapper$TypeAdapter(p0);
       }
       if (rawType == LiveCoverAnnex.class) {
          return new LiveCoverAnnex$TypeAdapter(p0);
       }
       if (rawType == LiveComment.class) {
          return new LiveComment$TypeAdapter(p0);
       }
       if (rawType == LiveAuthorHeadIdentityTag.class) {
          return new LiveAuthorHeadIdentityTag$TypeAdapter(p0);
       }
       if (rawType == ContentAggregateWeakFeed$IconUrl.class) {
          return new ContentAggregateWeakFeed$IconUrl$TypeAdapter(p0);
       }
       if (rawType == ContentAggregateWeakFeed$AggregateContentInfo.class) {
          return new ContentAggregateWeakFeed$AggregateContentInfo$TypeAdapter(p0);
       }
       return null;
    }
}
