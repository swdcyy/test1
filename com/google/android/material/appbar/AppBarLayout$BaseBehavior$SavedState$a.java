package com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import java.lang.ClassLoader;

public final class AppBarLayout$BaseBehavior$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00160b
{

    public void AppBarLayout$BaseBehavior$SavedState$a(){
       super();
    }
    public AppBarLayout$BaseBehavior$SavedState a(Parcel p0){
       return new AppBarLayout$BaseBehavior$SavedState(p0, null);
    }
    public AppBarLayout$BaseBehavior$SavedState b(Parcel p0,ClassLoader p1){
       return new AppBarLayout$BaseBehavior$SavedState(p0, p1);
    }
    public AppBarLayout$BaseBehavior$SavedState[] c(int p0){
       AppBarLayout$BaseBehavior$SavedState[] uBaseBehavio = new AppBarLayout$BaseBehavior$SavedState[p0];
       return uBaseBehavio;
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
