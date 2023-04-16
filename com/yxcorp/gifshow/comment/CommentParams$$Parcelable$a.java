package com.yxcorp.gifshow.comment.CommentParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.CommentParams$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.CommentParams;

public class CommentParams$$Parcelable$a implements Parcelable$Creator	// class@001092
{

    public void CommentParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentParams$$Parcelable(CommentParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentParams$$Parcelable[] $ParcelableA = new CommentParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
