package com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;

public class LiveAdNeoParam$TaskInfoParam$$Parcelable$a implements Parcelable$Creator	// class@000865
{

    public void LiveAdNeoParam$TaskInfoParam$$Parcelable$a(){
       super();
    }
    public LiveAdNeoParam$TaskInfoParam$$Parcelable a(Parcel p0){
       return new LiveAdNeoParam$TaskInfoParam$$Parcelable(LiveAdNeoParam$TaskInfoParam$$Parcelable.read(p0, new a()));
    }
    public LiveAdNeoParam$TaskInfoParam$$Parcelable[] b(int p0){
       LiveAdNeoParam$TaskInfoParam$$Parcelable[] taskInfoPara = new LiveAdNeoParam$TaskInfoParam$$Parcelable[p0];
       return taskInfoPara;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
