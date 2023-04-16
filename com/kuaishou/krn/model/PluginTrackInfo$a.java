package com.kuaishou.krn.model.PluginTrackInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.model.PluginTrackInfo;

public final class PluginTrackInfo$a implements Parcelable$Creator	// class@000907
{

    public void PluginTrackInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginTrackInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       PluginTrackInfo pluginTrackI = (p0.readInt())? new PluginTrackInfo(): null;
       return pluginTrackI;
    }
    public final Object[] newArray(int p0){
       PluginTrackInfo[] pluginTrackI = new PluginTrackInfo[p0];
       return pluginTrackI;
    }
}
