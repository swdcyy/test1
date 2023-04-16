package com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem;

public class OperationBarInfo$RelatedVideoItem$$Parcelable$a implements Parcelable$Creator	// class@000c22
{

    public void OperationBarInfo$RelatedVideoItem$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new OperationBarInfo$RelatedVideoItem$$Parcelable(OperationBarInfo$RelatedVideoItem$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       OperationBarInfo$RelatedVideoItem$$Parcelable[] relatedVideo = new OperationBarInfo$RelatedVideoItem$$Parcelable[p0];
       return relatedVideo;
    }
}
