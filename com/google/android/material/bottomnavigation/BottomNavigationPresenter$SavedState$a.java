package com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;

public final class BottomNavigationPresenter$SavedState$a implements Parcelable$Creator	// class@001648
{

    public void BottomNavigationPresenter$SavedState$a(){
       super();
    }
    public BottomNavigationPresenter$SavedState a(Parcel p0){
       return new BottomNavigationPresenter$SavedState(p0);
    }
    public BottomNavigationPresenter$SavedState[] b(int p0){
       BottomNavigationPresenter$SavedState[] savedStateAr = new BottomNavigationPresenter$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
