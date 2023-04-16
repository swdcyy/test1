package com.kuaishou.android.model.feed.FindTkFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.FindTkFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.FindTkFeed;

public class FindTkFeed$$Parcelable$a implements Parcelable$Creator	// class@000ae6
{

    public void FindTkFeed$$Parcelable$a(){
       super();
    }
    public FindTkFeed$$Parcelable a(Parcel p0){
       return new FindTkFeed$$Parcelable(FindTkFeed$$Parcelable.read(p0, new a()));
    }
    public FindTkFeed$$Parcelable[] b(int p0){
       FindTkFeed$$Parcelable[] $ParcelableA = new FindTkFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
