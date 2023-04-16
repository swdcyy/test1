package com.google.android.material.bottomappbar.BottomAppBar$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import java.lang.ClassLoader;

public final class BottomAppBar$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00163b
{

    public void BottomAppBar$SavedState$a(){
       super();
    }
    public BottomAppBar$SavedState a(Parcel p0){
       return new BottomAppBar$SavedState(p0, null);
    }
    public BottomAppBar$SavedState b(Parcel p0,ClassLoader p1){
       return new BottomAppBar$SavedState(p0, p1);
    }
    public BottomAppBar$SavedState[] c(int p0){
       BottomAppBar$SavedState[] savedStateAr = new BottomAppBar$SavedState[p0];
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
