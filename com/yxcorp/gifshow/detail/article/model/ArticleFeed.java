package com.yxcorp.gifshow.detail.article.model.ArticleFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.article.model.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import yp.q;
import com.yxcorp.gifshow.detail.article.model.a;
import ok.h;
import kp.w1;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.robust.PatchProxyResult;
import yw9.h;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class ArticleFeed extends BaseFeed	// class@001363
{
    public ArticleModel mArticleModel;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public PhotoMeta mPhotoMeta;
    public User mUser;
    public static final long serialVersionUID = 0x7f2dd74ec9108bad;

    public void ArticleFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.ARTICLE_FEED;
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, ArticleFeed.class, "2")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.ARTICLE_FEED, b.a);
       return;
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, ArticleFeed.class, "1")) {
          return;
       }
       q.d(ArticleFeed.class);
       return;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoid(null, null, ArticleFeed.class, "3")) {
          return;
       }
       w1.u(ArticleFeed.class, a.b);
       return;
    }
    public String getId(){
       return this.mPhotoMeta.mPhotoId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ArticleFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ArticleFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ArticleFeed.class, new h());
       }else {
          obj.put(ArticleFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleFeed.class, "4")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
