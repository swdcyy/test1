package com.yxcorp.gifshow.model.EditInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.EditInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.EditInfo;

public class EditInfo$$Parcelable$a implements Parcelable$Creator	// class@001e03
{

    public void EditInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new EditInfo$$Parcelable(EditInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       EditInfo$$Parcelable[] $ParcelableA = new EditInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
