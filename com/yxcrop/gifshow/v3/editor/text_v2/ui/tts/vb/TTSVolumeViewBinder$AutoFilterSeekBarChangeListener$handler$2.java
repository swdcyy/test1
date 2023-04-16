package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2 extends Lambda implements a	// class@000b66
{
    public static final TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2 INSTANCE;

    static {
       TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.INSTANCE = new TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2();
    }
    public void TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
