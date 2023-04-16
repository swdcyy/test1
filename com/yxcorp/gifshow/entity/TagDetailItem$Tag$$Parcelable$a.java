package com.yxcorp.gifshow.entity.TagDetailItem$Tag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.TagDetailItem$Tag;

public class TagDetailItem$Tag$$Parcelable$a implements Parcelable$Creator	// class@000d7a
{

    public void TagDetailItem$Tag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagDetailItem$Tag$$Parcelable(TagDetailItem$Tag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagDetailItem$Tag$$Parcelable[] tag$$Parcela = new TagDetailItem$Tag$$Parcelable[p0];
       return tag$$Parcela;
    }
}
