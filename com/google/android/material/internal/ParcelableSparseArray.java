package com.google.android.material.internal.ParcelableSparseArray;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Object;

public class ParcelableSparseArray extends SparseArray implements Parcelable	// class@0016a1
{
    public static final Parcelable$Creator CREATOR;

    static {
       ParcelableSparseArray.CREATOR = new ParcelableSparseArray$a();
    }
    public void ParcelableSparseArray(){
       super();
    }
    public void ParcelableSparseArray(Parcel p0,ClassLoader p1){
       super();
       int i = p0.readInt();
       int[] ointArray = new int[i];
       p0.readIntArray(ointArray);
       Parcelable[] parcelableAr = p0.readParcelableArray(p1);
       for (int i1 = 0; i1 < i; i1++) {
          this.put(ointArray[i1], parcelableAr[i1]);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       int i = this.size();
       int[] ointArray = new int[i];
       Parcelable[] parcelableAr = new Parcelable[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ointArray[i1] = this.keyAt(i1);
          parcelableAr[i1] = this.valueAt(i1);
       }
       p0.writeInt(i);
       p0.writeIntArray(ointArray);
       p0.writeParcelableArray(parcelableAr, p1);
       return;
    }
}
