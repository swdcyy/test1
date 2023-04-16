package com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Frame$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Frame;

public class TextBubbleDetail$Frame$a implements Parcelable$Creator	// class@0013cc
{

    public void TextBubbleDetail$Frame$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       TextBubbleDetail$Frame uFrame = PatchProxy.applyOneRefs(p0, this, TextBubbleDetail$Frame$a.class, "1");
       if (uFrame != PatchProxyResult.class) {
       }else {
          uFrame = new TextBubbleDetail$Frame(p0);
       }
       return uFrame;
    }
    public Object[] newArray(int p0){
       TextBubbleDetail$Frame[] uFrameArray = new TextBubbleDetail$Frame[p0];
       return uFrameArray;
    }
}
