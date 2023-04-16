package com.kuaishou.android.model.mix.CommentMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CommentMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CommentMeta;

public class CommentMeta$$Parcelable$a implements Parcelable$Creator	// class@000bff
{

    public void CommentMeta$$Parcelable$a(){
       super();
    }
    public CommentMeta$$Parcelable a(Parcel p0){
       return new CommentMeta$$Parcelable(CommentMeta$$Parcelable.read(p0, new a()));
    }
    public CommentMeta$$Parcelable[] b(int p0){
       CommentMeta$$Parcelable[] $ParcelableA = new CommentMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
