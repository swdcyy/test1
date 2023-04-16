package com.kuaishou.android.model.music.Music$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.music.Music$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.music.Music;

public class Music$$Parcelable$a implements Parcelable$Creator	// class@000e4f
{

    public void Music$$Parcelable$a(){
       super();
    }
    public Music$$Parcelable a(Parcel p0){
       return new Music$$Parcelable(Music$$Parcelable.read(p0, new a()));
    }
    public Music$$Parcelable[] b(int p0){
       Music$$Parcelable[] $ParcelableA = new Music$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
