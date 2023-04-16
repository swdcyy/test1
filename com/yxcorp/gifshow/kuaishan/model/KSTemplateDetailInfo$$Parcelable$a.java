package com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public class KSTemplateDetailInfo$$Parcelable$a implements Parcelable$Creator	// class@001a02
{

    public void KSTemplateDetailInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new KSTemplateDetailInfo$$Parcelable(KSTemplateDetailInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       KSTemplateDetailInfo$$Parcelable[] $ParcelableA = new KSTemplateDetailInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
