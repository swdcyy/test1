package com.yxcorp.gifshow.comment.model.CommentGuide$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.model.CommentGuide$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.model.CommentGuide;

public class CommentGuide$$Parcelable$a implements Parcelable$Creator	// class@0010e3
{

    public void CommentGuide$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentGuide$$Parcelable(CommentGuide$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentGuide$$Parcelable[] $ParcelableA = new CommentGuide$$Parcelable[p0];
       return $ParcelableA;
    }
}
