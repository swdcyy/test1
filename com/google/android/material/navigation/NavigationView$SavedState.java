package com.google.android.material.navigation.NavigationView$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.navigation.NavigationView$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Bundle;
import android.os.Parcelable;

public class NavigationView$SavedState extends AbsSavedState	// class@0016a6
{
    public Bundle d;
    public static final Parcelable$Creator CREATOR;

    static {
       NavigationView$SavedState.CREATOR = new NavigationView$SavedState$a();
    }
    public void NavigationView$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readBundle(p1);
    }
    public void NavigationView$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeBundle(this.d);
    }
}
