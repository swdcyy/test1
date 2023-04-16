package com.kwai.framework.model.live.LiveAdminPrivilege$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.live.LiveAdminPrivilege$$Parcelable;
import xwd.a;
import com.kwai.framework.model.live.LiveAdminPrivilege;

public class LiveAdminPrivilege$$Parcelable$a implements Parcelable$Creator	// class@0016be
{

    public void LiveAdminPrivilege$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveAdminPrivilege$$Parcelable(LiveAdminPrivilege$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveAdminPrivilege$$Parcelable[] $ParcelableA = new LiveAdminPrivilege$$Parcelable[p0];
       return $ParcelableA;
    }
}
