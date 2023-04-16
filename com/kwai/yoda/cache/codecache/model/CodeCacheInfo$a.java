package com.kwai.yoda.cache.codecache.model.CodeCacheInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo;

public final class CodeCacheInfo$a implements Parcelable$Creator	// class@0011a7
{

    public void CodeCacheInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CodeCacheInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "in");
       return new CodeCacheInfo(p0.readString(), p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       CodeCacheInfo[] uCodeCacheIn = new CodeCacheInfo[p0];
       return uCodeCacheIn;
    }
}
