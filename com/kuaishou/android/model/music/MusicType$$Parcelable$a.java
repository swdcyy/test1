package com.kuaishou.android.model.music.MusicType$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.MusicType$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.MusicType;

public class MusicType$$Parcelable$a implements Parcelable$Creator	// class@000e7f
{

    public void MusicType$$Parcelable$a(){
       super();
    }
    public MusicType$$Parcelable a(Parcel p0){
       return new MusicType$$Parcelable(MusicType$$Parcelable.read(p0, new a()));
    }
    public MusicType$$Parcelable[] b(int p0){
       MusicType$$Parcelable[] $ParcelableA = new MusicType$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
