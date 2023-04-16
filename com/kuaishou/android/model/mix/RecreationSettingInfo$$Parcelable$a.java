package com.kuaishou.android.model.mix.RecreationSettingInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.RecreationSettingInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.RecreationSettingInfo;

public class RecreationSettingInfo$$Parcelable$a implements Parcelable$Creator	// class@000de3
{

    public void RecreationSettingInfo$$Parcelable$a(){
       super();
    }
    public RecreationSettingInfo$$Parcelable a(Parcel p0){
       return new RecreationSettingInfo$$Parcelable(RecreationSettingInfo$$Parcelable.read(p0, new a()));
    }
    public RecreationSettingInfo$$Parcelable[] b(int p0){
       RecreationSettingInfo$$Parcelable[] $ParcelableA = new RecreationSettingInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
