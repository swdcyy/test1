package com.beloo.widget.chipslayoutmanager.ParcelableContainer;
import android.os.Parcelable;
import com.beloo.widget.chipslayoutmanager.ParcelableContainer$a;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.Integer;
import android.os.Parcel;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import android.os.Parcelable$Creator;
import com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer;
import java.lang.ClassLoader;
import java.lang.Class;

public class ParcelableContainer implements Parcelable	// class@000f05
{
    public AnchorViewState b;
    public SparseArray c;
    public SparseArray d;
    public int e;
    public static final Parcelable$Creator CREATOR;

    static {
       ParcelableContainer.CREATOR = new ParcelableContainer$a();
    }
    public void ParcelableContainer(){
       super();
       this.c = new SparseArray();
       SparseArray sparseArray = new SparseArray();
       this.d = sparseArray;
       Integer integer = Integer.valueOf(0);
       sparseArray.put(1, integer);
       this.d.put(2, integer);
    }
    public void ParcelableContainer(Parcel p0){
       super();
       this.c = new SparseArray();
       this.d = new SparseArray();
       this.b = AnchorViewState.CREATOR.createFromParcel(p0);
       this.c = p0.readSparseArray(CacheParcelableContainer.class.getClassLoader());
       this.d = p0.readSparseArray(Integer.class.getClassLoader());
       this.e = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       this.b.writeToParcel(p0, p1);
       p0.writeSparseArray(this.c);
       p0.writeSparseArray(this.d);
       p0.writeInt(this.e);
    }
}
