package com.kuaishou.android.model.ads.ReplaceTemplateData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.ReplaceTemplateData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.ReplaceTemplateData;

public class ReplaceTemplateData$$Parcelable$a implements Parcelable$Creator	// class@000a71
{

    public void ReplaceTemplateData$$Parcelable$a(){
       super();
    }
    public ReplaceTemplateData$$Parcelable a(Parcel p0){
       return new ReplaceTemplateData$$Parcelable(ReplaceTemplateData$$Parcelable.read(p0, new a()));
    }
    public ReplaceTemplateData$$Parcelable[] b(int p0){
       ReplaceTemplateData$$Parcelable[] $ParcelableA = new ReplaceTemplateData$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
