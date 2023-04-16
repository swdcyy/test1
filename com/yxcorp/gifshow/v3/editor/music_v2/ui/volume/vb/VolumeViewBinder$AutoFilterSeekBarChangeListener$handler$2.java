package com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2 extends Lambda implements a	// class@0010f1
{
    public static final VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2 INSTANCE;

    static {
       VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.INSTANCE = new VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2();
    }
    public void VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
