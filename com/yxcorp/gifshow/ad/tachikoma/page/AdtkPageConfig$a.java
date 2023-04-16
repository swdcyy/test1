package com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;

public final class AdtkPageConfig$a implements Parcelable$Creator	// class@001844
{

    public void AdtkPageConfig$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdtkPageConfig$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       AdtkPageConfig uAdtkPageCon = new AdtkPageConfig(p0.readFloat(), p0.readString(), p0.readInt(), p0.readString(), p0.readFloat());
       return obj;
    }
    public final Object[] newArray(int p0){
       AdtkPageConfig[] uAdtkPageCon = new AdtkPageConfig[p0];
       return uAdtkPageCon;
    }
}
