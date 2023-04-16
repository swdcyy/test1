package com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble$$Parcelable$a;
import com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class XBlockBubbleConfig$XBlockBubble$$Parcelable implements Parcelable, d	// class@001648
{
    public XBlockBubbleConfig$XBlockBubble xBlockBubble$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       XBlockBubbleConfig$XBlockBubble$$Parcelable.CREATOR = new XBlockBubbleConfig$XBlockBubble$$Parcelable$a();
    }
    public void XBlockBubbleConfig$XBlockBubble$$Parcelable(XBlockBubbleConfig$XBlockBubble p0){
       super();
       this.xBlockBubble$$0 = p0;
    }
    public static XBlockBubbleConfig$XBlockBubble read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          XBlockBubbleConfig$XBlockBubble xBlockBubble = new XBlockBubbleConfig$XBlockBubble();
          p1.f(p1.g(), xBlockBubble);
          xBlockBubble.mContent = p0.readString();
          xBlockBubble.mVersion = p0.readInt();
          xBlockBubble.mId = p0.readInt();
          xBlockBubble.mSubTabId = p0.readString();
          p1.f(i, xBlockBubble);
          return xBlockBubble;
       }
    }
    public static void write(XBlockBubbleConfig$XBlockBubble p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeInt(p0.mVersion);
          p1.writeInt(p0.mId);
          p1.writeString(p0.mSubTabId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public XBlockBubbleConfig$XBlockBubble getParcel(){
       return this.xBlockBubble$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       XBlockBubbleConfig$XBlockBubble$$Parcelable.write(this.xBlockBubble$$0, p0, p1, new a());
    }
}
