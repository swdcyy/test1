package com.yxcorp.gifshow.bottom.sheet.BottomSheetParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;

public class BottomSheetParams$$Parcelable$a implements Parcelable$Creator	// class@001c5f
{

    public void BottomSheetParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BottomSheetParams$$Parcelable(BottomSheetParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BottomSheetParams$$Parcelable[] $ParcelableA = new BottomSheetParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
