package com.kuaishou.android.model.mix.TagItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.TagItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.TagItem;

public class TagItem$$Parcelable$a implements Parcelable$Creator	// class@000e11
{

    public void TagItem$$Parcelable$a(){
       super();
    }
    public TagItem$$Parcelable a(Parcel p0){
       return new TagItem$$Parcelable(TagItem$$Parcelable.read(p0, new a()));
    }
    public TagItem$$Parcelable[] b(int p0){
       TagItem$$Parcelable[] $ParcelableA = new TagItem$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
