package com.kuaishou.android.model.mix.InteractStickerInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.InteractStickerInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.InteractStickerInfo;

public class InteractStickerInfo$$Parcelable$a implements Parcelable$Creator	// class@000ce5
{

    public void InteractStickerInfo$$Parcelable$a(){
       super();
    }
    public InteractStickerInfo$$Parcelable a(Parcel p0){
       return new InteractStickerInfo$$Parcelable(InteractStickerInfo$$Parcelable.read(p0, new a()));
    }
    public InteractStickerInfo$$Parcelable[] b(int p0){
       InteractStickerInfo$$Parcelable[] $ParcelableA = new InteractStickerInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
