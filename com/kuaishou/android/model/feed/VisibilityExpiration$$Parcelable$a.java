package com.kuaishou.android.model.feed.VisibilityExpiration$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.VisibilityExpiration$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.VisibilityExpiration;

public class VisibilityExpiration$$Parcelable$a implements Parcelable$Creator	// class@000b7b
{

    public void VisibilityExpiration$$Parcelable$a(){
       super();
    }
    public VisibilityExpiration$$Parcelable a(Parcel p0){
       return new VisibilityExpiration$$Parcelable(VisibilityExpiration$$Parcelable.read(p0, new a()));
    }
    public VisibilityExpiration$$Parcelable[] b(int p0){
       VisibilityExpiration$$Parcelable[] $ParcelableA = new VisibilityExpiration$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
