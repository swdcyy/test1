package com.beloo.widget.chipslayoutmanager.ParcelableContainer$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.beloo.widget.chipslayoutmanager.ParcelableContainer;

public final class ParcelableContainer$a implements Parcelable$Creator	// class@000f04
{

    public void ParcelableContainer$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ParcelableContainer(p0);
    }
    public Object[] newArray(int p0){
       ParcelableContainer[] parcelableCo = new ParcelableContainer[p0];
       return parcelableCo;
    }
}
