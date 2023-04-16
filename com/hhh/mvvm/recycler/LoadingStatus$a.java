package com.hhh.mvvm.recycler.LoadingStatus$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hhh.mvvm.recycler.LoadingStatus;

public final class LoadingStatus$a implements Parcelable$Creator	// class@000564
{

    public void LoadingStatus$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LoadingStatus(p0);
    }
    public Object[] newArray(int p0){
       LoadingStatus[] loadingStatu = new LoadingStatus[p0];
       return loadingStatu;
    }
}
