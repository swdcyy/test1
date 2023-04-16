package com.kuaishou.model.CategoryFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.model.CategoryFeed$$Parcelable;
import xwd.a;
import com.kuaishou.model.CategoryFeed;

public class CategoryFeed$$Parcelable$a implements Parcelable$Creator	// class@000a10
{

    public void CategoryFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CategoryFeed$$Parcelable(CategoryFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CategoryFeed$$Parcelable[] $ParcelableA = new CategoryFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}
