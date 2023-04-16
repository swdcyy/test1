package com.yxcorp.gifshow.album.AlbumPerformanceOptOption$c;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption;

public final class AlbumPerformanceOptOption$c implements Parcelable$Creator	// class@0019c0
{

    public void AlbumPerformanceOptOption$c(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumPerformanceOptOption$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "in");
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       int i = p0.readInt();
       boolean b2 = (p0.readInt())? true: false;
       if (!p0.readInt()) {
          b = false;
       }
       return new AlbumPerformanceOptOption(b1, i, b2, b);
    }
    public final Object[] newArray(int p0){
       AlbumPerformanceOptOption[] uAlbumPerfor = new AlbumPerformanceOptOption[p0];
       return uAlbumPerfor;
    }
}
