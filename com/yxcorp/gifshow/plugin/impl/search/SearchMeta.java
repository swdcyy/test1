package com.yxcorp.gifshow.plugin.impl.search.SearchMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import fa6.e;
import fa6.b;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class SearchMeta implements Serializable	// class@000fd6
{
    public String mCollectionId;
    public SearchCollectionModel mCollectionMeta;
    public String mHotTrendingId;
    public String mProviderId;
    public boolean noOverridePhotoId;
    public static final long serialVersionUID = 0xa32980f05eea88d4;

    public void SearchMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, SearchMeta.class, "1")) {
          return;
       }
       c a = c.a;
       e uoe = new e(SearchMeta.class, "", "searchMeta");
       uoe.a(null);
       a.e(VideoFeed.class, uoe);
       uoe = new e(SearchMeta.class, "", "searchMeta");
       uoe.a(null);
       a.e(ImageFeed.class, uoe);
       uoe = new e(SearchMeta.class, "", "searchMeta");
       uoe.a(null);
       a.e(LiveStreamFeed.class, uoe);
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, SearchMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mCollectionId)) {
          return "";
       }
       return this.mCollectionId+"#";
    }
}
