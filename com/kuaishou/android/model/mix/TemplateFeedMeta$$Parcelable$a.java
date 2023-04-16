package com.kuaishou.android.model.mix.TemplateFeedMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.TemplateFeedMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.TemplateFeedMeta;

public class TemplateFeedMeta$$Parcelable$a implements Parcelable$Creator	// class@000e19
{

    public void TemplateFeedMeta$$Parcelable$a(){
       super();
    }
    public TemplateFeedMeta$$Parcelable a(Parcel p0){
       return new TemplateFeedMeta$$Parcelable(TemplateFeedMeta$$Parcelable.read(p0, new a()));
    }
    public TemplateFeedMeta$$Parcelable[] b(int p0){
       TemplateFeedMeta$$Parcelable[] $ParcelableA = new TemplateFeedMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
