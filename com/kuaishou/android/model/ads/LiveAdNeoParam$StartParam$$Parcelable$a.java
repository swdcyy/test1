package com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam;

public class LiveAdNeoParam$StartParam$$Parcelable$a implements Parcelable$Creator	// class@000862
{

    public void LiveAdNeoParam$StartParam$$Parcelable$a(){
       super();
    }
    public LiveAdNeoParam$StartParam$$Parcelable a(Parcel p0){
       return new LiveAdNeoParam$StartParam$$Parcelable(LiveAdNeoParam$StartParam$$Parcelable.read(p0, new a()));
    }
    public LiveAdNeoParam$StartParam$$Parcelable[] b(int p0){
       LiveAdNeoParam$StartParam$$Parcelable[] startParam$$ = new LiveAdNeoParam$StartParam$$Parcelable[p0];
       return startParam$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
