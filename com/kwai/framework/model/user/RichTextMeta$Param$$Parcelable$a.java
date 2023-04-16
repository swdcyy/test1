package com.kwai.framework.model.user.RichTextMeta$Param$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.RichTextMeta$Param$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.RichTextMeta$Param;

public class RichTextMeta$Param$$Parcelable$a implements Parcelable$Creator	// class@001723
{

    public void RichTextMeta$Param$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RichTextMeta$Param$$Parcelable(RichTextMeta$Param$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RichTextMeta$Param$$Parcelable[] param$$Parce = new RichTextMeta$Param$$Parcelable[p0];
       return param$$Parce;
    }
}
