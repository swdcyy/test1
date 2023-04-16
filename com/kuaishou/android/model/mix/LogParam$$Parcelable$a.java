package com.kuaishou.android.model.mix.LogParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.LogParam$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.LogParam;

public class LogParam$$Parcelable$a implements Parcelable$Creator	// class@000d10
{

    public void LogParam$$Parcelable$a(){
       super();
    }
    public LogParam$$Parcelable a(Parcel p0){
       return new LogParam$$Parcelable(LogParam$$Parcelable.read(p0, new a()));
    }
    public LogParam$$Parcelable[] b(int p0){
       LogParam$$Parcelable[] $ParcelableA = new LogParam$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
