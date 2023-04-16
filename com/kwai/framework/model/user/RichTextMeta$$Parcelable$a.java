package com.kwai.framework.model.user.RichTextMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.RichTextMeta;

public class RichTextMeta$$Parcelable$a implements Parcelable$Creator	// class@001721
{

    public void RichTextMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RichTextMeta$$Parcelable(RichTextMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RichTextMeta$$Parcelable[] $ParcelableA = new RichTextMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
