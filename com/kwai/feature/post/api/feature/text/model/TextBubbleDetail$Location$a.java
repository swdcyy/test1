package com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location;

public class TextBubbleDetail$Location$a implements Parcelable$Creator	// class@0013ce
{

    public void TextBubbleDetail$Location$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       TextBubbleDetail$Location location = PatchProxy.applyOneRefs(p0, this, TextBubbleDetail$Location$a.class, "1");
       if (location != PatchProxyResult.class) {
       }else {
          location = new TextBubbleDetail$Location(p0);
       }
       return location;
    }
    public Object[] newArray(int p0){
       TextBubbleDetail$Location[] locationArra = new TextBubbleDetail$Location[p0];
       return locationArra;
    }
}
