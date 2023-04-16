package com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a;
import java.lang.Object;
import android.os.Parcel;

public class BottomNavigationPresenter$SavedState implements Parcelable	// class@001649
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomNavigationPresenter$SavedState.CREATOR = new BottomNavigationPresenter$SavedState$a();
    }
    public void BottomNavigationPresenter$SavedState(){
       super();
    }
    public void BottomNavigationPresenter$SavedState(Parcel p0){
       super();
       this.b = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
    }
}
