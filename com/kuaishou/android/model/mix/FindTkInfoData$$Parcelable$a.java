package com.kuaishou.android.model.mix.FindTkInfoData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FindTkInfoData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FindTkInfoData;

public class FindTkInfoData$$Parcelable$a implements Parcelable$Creator	// class@000c83
{

    public void FindTkInfoData$$Parcelable$a(){
       super();
    }
    public FindTkInfoData$$Parcelable a(Parcel p0){
       return new FindTkInfoData$$Parcelable(FindTkInfoData$$Parcelable.read(p0, new a()));
    }
    public FindTkInfoData$$Parcelable[] b(int p0){
       FindTkInfoData$$Parcelable[] $ParcelableA = new FindTkInfoData$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
