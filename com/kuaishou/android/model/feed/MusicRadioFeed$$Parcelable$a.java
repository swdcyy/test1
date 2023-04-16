package com.kuaishou.android.model.feed.MusicRadioFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.MusicRadioFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.MusicRadioFeed;

public class MusicRadioFeed$$Parcelable$a implements Parcelable$Creator	// class@000b23
{

    public void MusicRadioFeed$$Parcelable$a(){
       super();
    }
    public MusicRadioFeed$$Parcelable a(Parcel p0){
       return new MusicRadioFeed$$Parcelable(MusicRadioFeed$$Parcelable.read(p0, new a()));
    }
    public MusicRadioFeed$$Parcelable[] b(int p0){
       MusicRadioFeed$$Parcelable[] $ParcelableA = new MusicRadioFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
