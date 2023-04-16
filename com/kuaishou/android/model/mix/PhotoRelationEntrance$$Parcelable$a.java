package com.kuaishou.android.model.mix.PhotoRelationEntrance$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;

public class PhotoRelationEntrance$$Parcelable$a implements Parcelable$Creator	// class@000d5e
{

    public void PhotoRelationEntrance$$Parcelable$a(){
       super();
    }
    public PhotoRelationEntrance$$Parcelable a(Parcel p0){
       return new PhotoRelationEntrance$$Parcelable(PhotoRelationEntrance$$Parcelable.read(p0, new a()));
    }
    public PhotoRelationEntrance$$Parcelable[] b(int p0){
       PhotoRelationEntrance$$Parcelable[] $ParcelableA = new PhotoRelationEntrance$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
