package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$a;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;
import android.content.Context;
import yt6.a;

public final class CompressAndEncodePluginImpl$a implements EditorSDKSoLoader$Handler	// class@000d39
{
    public static final CompressAndEncodePluginImpl$a a;

    static {
       CompressAndEncodePluginImpl$a.a = new CompressAndEncodePluginImpl$a();
    }
    public void CompressAndEncodePluginImpl$a(){
       super();
    }
    public final void loadLibrary(String p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, CompressAndEncodePluginImpl$a.class, "1");
       if (b) {
          return;
       }
       b.b(p0);
       return;
    }
    public void setContext(Context p0){
       a.a(this, p0);
    }
}
