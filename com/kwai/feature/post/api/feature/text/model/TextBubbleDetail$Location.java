package com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Location$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class TextBubbleDetail$Location implements Parcelable, Serializable	// class@0013cf
{
    public float mX;
    public float mY;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       TextBubbleDetail$Location.CREATOR = new TextBubbleDetail$Location$a();
    }
    public void TextBubbleDetail$Location(float p0,float p1){
       super();
       this.mX = p0;
       this.mY = p1;
    }
    public void TextBubbleDetail$Location(Parcel p0){
       super();
       this.mX = p0.readFloat();
       this.mY = p0.readFloat();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextBubbleDetail$Location.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextBubbleDetail$Location.class, "1")) {
          return;
       }
       p0.writeFloat(this.mX);
       p0.writeFloat(this.mY);
       return;
    }
}
