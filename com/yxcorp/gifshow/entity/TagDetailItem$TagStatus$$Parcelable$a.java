package com.yxcorp.gifshow.entity.TagDetailItem$TagStatus$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.TagDetailItem$TagStatus;

public class TagDetailItem$TagStatus$$Parcelable$a implements Parcelable$Creator	// class@000d7d
{

    public void TagDetailItem$TagStatus$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagDetailItem$TagStatus$$Parcelable(TagDetailItem$TagStatus$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagDetailItem$TagStatus$$Parcelable[] tagStatus$$P = new TagDetailItem$TagStatus$$Parcelable[p0];
       return tagStatus$$P;
    }
}
