package com.kuaishou.live.core.show.photoalbum.cropper.CropImageOptions$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageOptions;

public class CropImageOptions$a implements Parcelable$Creator	// class@000d55
{

    public void CropImageOptions$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       CropImageOptions uCropImageOp = PatchProxy.applyOneRefs(p0, this, CropImageOptions$a.class, "1");
       if (uCropImageOp != PatchProxyResult.class) {
       }else {
          uCropImageOp = new CropImageOptions(p0);
       }
       return uCropImageOp;
    }
    public Object[] newArray(int p0){
       CropImageOptions[] uCropImageOp = new CropImageOptions[p0];
       return uCropImageOp;
    }
}
