package com.kwai.video.clipkit.ClipKitUtils$1;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rg.d;
import yt6.a;

public final class ClipKitUtils$1 implements EditorSDKSoLoader$Handler	// class@001a2e
{
    public final Context val$context;

    public void ClipKitUtils$1(Context p0){
       this.val$context = p0;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipKitUtils$1.class, "1")) {
          return;
       }
       d.a(this.val$context.getApplicationContext(), p0);
       return;
    }
    public void setContext(Context p0){
       a.a(this, p0);
    }
}
