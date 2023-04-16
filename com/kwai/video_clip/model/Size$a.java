package com.kwai.video_clip.model.Size$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video_clip.model.Size;

public final class Size$a implements Parcelable$Creator	// class@001101
{

    public void Size$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       Size size = PatchProxy.applyOneRefs(p0, this, Size$a.class, "1");
       if (size != PatchProxyResult.class) {
       }else {
          size = new Size(p0);
       }
       return size;
    }
    public Object[] newArray(int p0){
       Size[] sizeArray = new Size[p0];
       return sizeArray;
    }
}
