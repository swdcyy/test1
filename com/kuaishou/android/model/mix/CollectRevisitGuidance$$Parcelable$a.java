package com.kuaishou.android.model.mix.CollectRevisitGuidance$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CollectRevisitGuidance$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CollectRevisitGuidance;

public class CollectRevisitGuidance$$Parcelable$a implements Parcelable$Creator	// class@000bf1
{

    public void CollectRevisitGuidance$$Parcelable$a(){
       super();
    }
    public CollectRevisitGuidance$$Parcelable a(Parcel p0){
       return new CollectRevisitGuidance$$Parcelable(CollectRevisitGuidance$$Parcelable.read(p0, new a()));
    }
    public CollectRevisitGuidance$$Parcelable[] b(int p0){
       CollectRevisitGuidance$$Parcelable[] $ParcelableA = new CollectRevisitGuidance$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
