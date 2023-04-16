package com.yxcorp.gifshow.comment.CommentPageListConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.CommentPageListConfig$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.CommentPageListConfig;

public class CommentPageListConfig$$Parcelable$a implements Parcelable$Creator	// class@00108f
{

    public void CommentPageListConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentPageListConfig$$Parcelable(CommentPageListConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentPageListConfig$$Parcelable[] $ParcelableA = new CommentPageListConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
