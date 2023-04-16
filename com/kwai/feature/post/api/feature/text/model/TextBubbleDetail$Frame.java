package com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Frame;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Frame$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class TextBubbleDetail$Frame implements Parcelable, Serializable	// class@0013cd
{
    public double endTime;
    public int mEnd;
    public int mStart;
    public double startTime;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       TextBubbleDetail$Frame.CREATOR = new TextBubbleDetail$Frame$a();
    }
    public void TextBubbleDetail$Frame(int p0,int p1){
       super();
       this.mStart = p0;
       this.mEnd = p1;
    }
    public void TextBubbleDetail$Frame(int p0,int p1,double p2,double p3){
       super(p0, p1);
       this.startTime = p2;
       this.endTime = p3;
    }
    public void TextBubbleDetail$Frame(Parcel p0){
       super();
       this.mStart = p0.readInt();
       this.mEnd = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextBubbleDetail$Frame.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextBubbleDetail$Frame.class, "1")) {
          return;
       }
       p0.writeInt(this.mStart);
       p0.writeInt(this.mEnd);
       return;
    }
}
