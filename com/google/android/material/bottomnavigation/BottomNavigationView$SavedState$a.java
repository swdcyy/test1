package com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;
import java.lang.ClassLoader;

public final class BottomNavigationView$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00164b
{

    public void BottomNavigationView$SavedState$a(){
       super();
    }
    public BottomNavigationView$SavedState a(Parcel p0){
       return new BottomNavigationView$SavedState(p0, null);
    }
    public BottomNavigationView$SavedState b(Parcel p0,ClassLoader p1){
       return new BottomNavigationView$SavedState(p0, p1);
    }
    public BottomNavigationView$SavedState[] c(int p0){
       BottomNavigationView$SavedState[] savedStateAr = new BottomNavigationView$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.b(p0, p1);
    }
    public Object[] newArray(int p0){
       return this.c(p0);
    }
}
