package com.yxcorp.gifshow.model.Image$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.Image;

public class Image$a implements Parcelable$Creator	// class@001e27
{

    public void Image$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       Image image = PatchProxy.applyOneRefs(p0, this, Image$a.class, "1");
       if (image != PatchProxyResult.class) {
       }else {
          image = new Image(p0);
       }
       return image;
    }
    public Object[] newArray(int p0){
       Image[] imageArray = new Image[p0];
       return imageArray;
    }
}
