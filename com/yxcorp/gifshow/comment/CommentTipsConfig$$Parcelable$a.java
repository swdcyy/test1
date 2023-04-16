package com.yxcorp.gifshow.comment.CommentTipsConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.CommentTipsConfig$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.CommentTipsConfig;

public class CommentTipsConfig$$Parcelable$a implements Parcelable$Creator	// class@001095
{

    public void CommentTipsConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentTipsConfig$$Parcelable(CommentTipsConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentTipsConfig$$Parcelable[] $ParcelableA = new CommentTipsConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
