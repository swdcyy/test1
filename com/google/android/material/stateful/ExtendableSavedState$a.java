package com.google.android.material.stateful.ExtendableSavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.ClassLoader;

public final class ExtendableSavedState$a implements Parcelable$ClassLoaderCreator	// class@0016af
{

    public void ExtendableSavedState$a(){
       super();
    }
    public ExtendableSavedState a(Parcel p0){
       return new ExtendableSavedState(p0, null, null);
    }
    public ExtendableSavedState b(Parcel p0,ClassLoader p1){
       return new ExtendableSavedState(p0, p1, null);
    }
    public ExtendableSavedState[] c(int p0){
       ExtendableSavedState[] uExtendableS = new ExtendableSavedState[p0];
       return uExtendableS;
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
