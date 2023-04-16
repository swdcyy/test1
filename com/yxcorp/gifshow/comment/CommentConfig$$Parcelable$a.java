package com.yxcorp.gifshow.comment.CommentConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.CommentConfig$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.CommentConfig;

public class CommentConfig$$Parcelable$a implements Parcelable$Creator	// class@00108c
{

    public void CommentConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentConfig$$Parcelable(CommentConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentConfig$$Parcelable[] $ParcelableA = new CommentConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
