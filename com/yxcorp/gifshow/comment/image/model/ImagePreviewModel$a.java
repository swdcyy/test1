package com.yxcorp.gifshow.comment.image.model.ImagePreviewModel$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.image.model.ImagePreviewModel;

public class ImagePreviewModel$a implements Parcelable$Creator	// class@0010d3
{

    public void ImagePreviewModel$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ImagePreviewModel imagePreview = PatchProxy.applyOneRefs(p0, this, ImagePreviewModel$a.class, "1");
       if (imagePreview != PatchProxyResult.class) {
       }else {
          imagePreview = new ImagePreviewModel(p0);
       }
       return imagePreview;
    }
    public Object[] newArray(int p0){
       ImagePreviewModel[] imagePreview = new ImagePreviewModel[p0];
       return imagePreview;
    }
}
