package com.google.android.material.internal.ParcelableSparseArray$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.internal.ParcelableSparseArray;
import java.lang.ClassLoader;

public final class ParcelableSparseArray$a implements Parcelable$ClassLoaderCreator	// class@0016a0
{

    public void ParcelableSparseArray$a(){
       super();
    }
    public ParcelableSparseArray a(Parcel p0){
       return new ParcelableSparseArray(p0, null);
    }
    public ParcelableSparseArray b(Parcel p0,ClassLoader p1){
       return new ParcelableSparseArray(p0, p1);
    }
    public ParcelableSparseArray[] c(int p0){
       ParcelableSparseArray[] parcelableSp = new ParcelableSparseArray[p0];
       return parcelableSp;
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
