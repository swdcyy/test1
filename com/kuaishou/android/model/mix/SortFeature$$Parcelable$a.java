package com.kuaishou.android.model.mix.SortFeature$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SortFeature$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SortFeature;

public class SortFeature$$Parcelable$a implements Parcelable$Creator	// class@000dfc
{

    public void SortFeature$$Parcelable$a(){
       super();
    }
    public SortFeature$$Parcelable a(Parcel p0){
       return new SortFeature$$Parcelable(SortFeature$$Parcelable.read(p0, new a()));
    }
    public SortFeature$$Parcelable[] b(int p0){
       SortFeature$$Parcelable[] $ParcelableA = new SortFeature$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
