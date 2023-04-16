package com.yxcorp.gifshow.detail.article.model.ArticleFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.article.model.ArticleFeed;

public class ArticleFeed$$Parcelable$a implements Parcelable$Creator	// class@001361
{

    public void ArticleFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ArticleFeed$$Parcelable(ArticleFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ArticleFeed$$Parcelable[] $ParcelableA = new ArticleFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}
