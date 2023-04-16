package com.kwai.feature.api.corona.player.model.PausePageState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.corona.player.model.PausePageState;
import java.io.Serializable;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Bitmap;

public final class PausePageState$a implements Parcelable$Creator	// class@000e26
{

    public void PausePageState$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PausePageState$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       boolean b = (p0.readInt())? true: false;
       QPhoto qPhoto = p0.readSerializable();
       Bitmap uBitmap = (p0.readInt())? Bitmap.CREATOR.createFromParcel(p0): null;
       return new PausePageState(b, qPhoto, uBitmap);
    }
    public final Object[] newArray(int p0){
       PausePageState[] pausePageSta = new PausePageState[p0];
       return pausePageSta;
    }
}
