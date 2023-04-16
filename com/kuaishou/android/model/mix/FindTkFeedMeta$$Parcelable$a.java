package com.kuaishou.android.model.mix.FindTkFeedMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FindTkFeedMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FindTkFeedMeta;

public class FindTkFeedMeta$$Parcelable$a implements Parcelable$Creator	// class@000c80
{

    public void FindTkFeedMeta$$Parcelable$a(){
       super();
    }
    public FindTkFeedMeta$$Parcelable a(Parcel p0){
       return new FindTkFeedMeta$$Parcelable(FindTkFeedMeta$$Parcelable.read(p0, new a()));
    }
    public FindTkFeedMeta$$Parcelable[] b(int p0){
       FindTkFeedMeta$$Parcelable[] $ParcelableA = new FindTkFeedMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
