package com.yxcorp.gifshow.detail.article.model.ArticleFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoMeta$$Parcelable;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kwai.component.feedstaggercard.model.ArticleModel;
import com.kwai.component.feedstaggercard.model.ArticleModel$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class ArticleFeed$$Parcelable implements Parcelable, d	// class@001362
{
    public ArticleFeed articleFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ArticleFeed$$Parcelable.CREATOR = new ArticleFeed$$Parcelable$a();
    }
    public void ArticleFeed$$Parcelable(ArticleFeed p0){
       super();
       this.articleFeed$$0 = p0;
    }
    public static ArticleFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ArticleFeed uArticleFeed = new ArticleFeed();
          p1.f(p1.g(), uArticleFeed);
          uArticleFeed.mUser = new a().c(p0);
          uArticleFeed.mPhotoMeta = PhotoMeta$$Parcelable.read(p0, p1);
          uArticleFeed.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          uArticleFeed.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uArticleFeed.mArticleModel = ArticleModel$$Parcelable.read(p0, p1);
          uArticleFeed.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uArticleFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uArticleFeed, "dataMap", new c().d(p0));
          p1.f(i, uArticleFeed);
          return uArticleFeed;
       }
    }
    public static void write(ArticleFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          PhotoMeta$$Parcelable.write(p0.mPhotoMeta, p1, p2, p3);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          ArticleModel$$Parcelable.write(p0.mArticleModel, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ArticleFeed getParcel(){
       return this.articleFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ArticleFeed$$Parcelable.write(this.articleFeed$$0, p0, p1, new a());
    }
}
