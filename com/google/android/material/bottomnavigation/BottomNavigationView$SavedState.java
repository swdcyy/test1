package com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.os.Bundle;

public class BottomNavigationView$SavedState extends AbsSavedState	// class@00164c
{
    public Bundle d;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomNavigationView$SavedState.CREATOR = new BottomNavigationView$SavedState$a();
    }
    public void BottomNavigationView$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.b(p0, p1);
    }
    public void BottomNavigationView$SavedState(Parcelable p0){
       super(p0);
    }
    public final void b(Parcel p0,ClassLoader p1){
       this.d = p0.readBundle(p1);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeBundle(this.d);
    }
}
