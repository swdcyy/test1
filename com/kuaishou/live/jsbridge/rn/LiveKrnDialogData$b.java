package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

public final class LiveKrnDialogData$b implements Parcelable$Creator	// class@001d2a
{

    public void LiveKrnDialogData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       LinkedHashMap linkedHashMa;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogData$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       Uri uri = p0.readParcelable(LiveKrnDialogData.class.getClassLoader());
       if (p0.readInt()) {
          int i = p0.readInt();
          linkedHashMa = new LinkedHashMap(i);
          for (; i; i = i - 1) {
             linkedHashMa.put(p0.readString(), p0.readString());
          }
       }else {
          linkedHashMa = null;
       }
       return new LiveKrnDialogData(uri, linkedHashMa);
    }
    public final Object[] newArray(int p0){
       LiveKrnDialogData[] liveKrnDialo = new LiveKrnDialogData[p0];
       return liveKrnDialo;
    }
}
