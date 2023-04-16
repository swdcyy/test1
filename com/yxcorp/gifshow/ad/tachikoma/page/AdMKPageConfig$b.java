package com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.net.Uri;
import java.lang.Integer;

public final class AdMKPageConfig$b implements Parcelable$Creator	// class@001835
{

    public void AdMKPageConfig$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKPageConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       Uri uri = p0.readParcelable(AdMKPageConfig.class.getClassLoader());
       Integer integer = (p0.readInt())? Integer.valueOf(p0.readInt()): null;
       boolean b = (p0.readInt())? true: false;
       return new AdMKPageConfig(uri, integer, b);
    }
    public final Object[] newArray(int p0){
       AdMKPageConfig[] uAdMKPageCon = new AdMKPageConfig[p0];
       return uAdMKPageCon;
    }
}
