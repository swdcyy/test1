package com.yxcorp.gifshow.model.Image;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.model.Image$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;

public class Image implements Serializable, Parcelable	// class@001e28
{
    public String mFormat;
    public int mHeight;
    public List mUrls;
    public int mWidth;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       Image.CREATOR = new Image$a();
    }
    public void Image(){
       super();
    }
    public void Image(Parcel p0){
       super();
       this.mFormat = p0.readString();
       this.mUrls = p0.createStringArrayList();
       this.mHeight = p0.readInt();
       this.mWidth = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(Image.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Image.class, "1")) {
          return;
       }
       p0.writeString(this.mFormat);
       p0.writeStringList(this.mUrls);
       p0.writeInt(this.mHeight);
       p0.writeInt(this.mWidth);
       return;
    }
}
