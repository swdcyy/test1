package com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.LiveAdNeoParam;

public class LiveAdNeoParam$$Parcelable$a implements Parcelable$Creator	// class@00085d
{

    public void LiveAdNeoParam$$Parcelable$a(){
       super();
    }
    public LiveAdNeoParam$$Parcelable a(Parcel p0){
       return new LiveAdNeoParam$$Parcelable(LiveAdNeoParam$$Parcelable.read(p0, new a()));
    }
    public LiveAdNeoParam$$Parcelable[] b(int p0){
       LiveAdNeoParam$$Parcelable[] $ParcelableA = new LiveAdNeoParam$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
