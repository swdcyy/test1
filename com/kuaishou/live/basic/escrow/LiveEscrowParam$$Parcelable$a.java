package com.kuaishou.live.basic.escrow.LiveEscrowParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.basic.escrow.LiveEscrowParam$$Parcelable;
import xwd.a;
import com.kuaishou.live.basic.escrow.LiveEscrowParam;

public class LiveEscrowParam$$Parcelable$a implements Parcelable$Creator	// class@000cc8
{

    public void LiveEscrowParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveEscrowParam$$Parcelable(LiveEscrowParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveEscrowParam$$Parcelable[] $ParcelableA = new LiveEscrowParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
