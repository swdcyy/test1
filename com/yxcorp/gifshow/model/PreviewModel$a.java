package com.yxcorp.gifshow.model.PreviewModel$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.PreviewModel;

public class PreviewModel$a implements Parcelable$Creator	// class@001e78
{

    public void PreviewModel$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       PreviewModel previewModel = PatchProxy.applyOneRefs(p0, this, PreviewModel$a.class, "1");
       if (previewModel != PatchProxyResult.class) {
       }else {
          previewModel = new PreviewModel(p0);
       }
       return previewModel;
    }
    public Object[] newArray(int p0){
       PreviewModel[] previewModel = new PreviewModel[p0];
       return previewModel;
    }
}
