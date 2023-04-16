package com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;

public class FeedBackInterestManagementEntrance$$Parcelable$a implements Parcelable$Creator	// class@000c72
{

    public void FeedBackInterestManagementEntrance$$Parcelable$a(){
       super();
    }
    public FeedBackInterestManagementEntrance$$Parcelable a(Parcel p0){
       return new FeedBackInterestManagementEntrance$$Parcelable(FeedBackInterestManagementEntrance$$Parcelable.read(p0, new a()));
    }
    public FeedBackInterestManagementEntrance$$Parcelable[] b(int p0){
       FeedBackInterestManagementEntrance$$Parcelable[] $ParcelableA = new FeedBackInterestManagementEntrance$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
