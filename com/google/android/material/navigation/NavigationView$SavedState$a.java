package com.google.android.material.navigation.NavigationView$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.navigation.NavigationView$SavedState;
import java.lang.ClassLoader;

public final class NavigationView$SavedState$a implements Parcelable$ClassLoaderCreator	// class@0016a5
{

    public void NavigationView$SavedState$a(){
       super();
    }
    public NavigationView$SavedState a(Parcel p0){
       return new NavigationView$SavedState(p0, null);
    }
    public NavigationView$SavedState b(Parcel p0,ClassLoader p1){
       return new NavigationView$SavedState(p0, p1);
    }
    public NavigationView$SavedState[] c(int p0){
       NavigationView$SavedState[] savedStateAr = new NavigationView$SavedState[p0];
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
