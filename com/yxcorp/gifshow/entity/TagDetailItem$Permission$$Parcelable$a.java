package com.yxcorp.gifshow.entity.TagDetailItem$Permission$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.TagDetailItem$Permission$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.TagDetailItem$Permission;

public class TagDetailItem$Permission$$Parcelable$a implements Parcelable$Creator	// class@000d77
{

    public void TagDetailItem$Permission$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagDetailItem$Permission$$Parcelable(TagDetailItem$Permission$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagDetailItem$Permission$$Parcelable[] permission$$ = new TagDetailItem$Permission$$Parcelable[p0];
       return permission$$;
    }
}
