package ai9.l;
import aj9.f;
import ai9.p;
import java.lang.Object;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import com.kwai.camerasdk.video.VideoFrame;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import android.graphics.Bitmap;
import com.kwai.camerasdk.DaenerysUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;

public final class l implements f	// class@0000d4
{
    public final p a;

    public void l(p p0){
       this.a = p0;
    }
    public final void a(MediaRecorderCallbackFrameType p0,VideoFrame p1){
       l ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.D();
       Object[] objArray = new Object[0];
       try{
          uoa.w("RecordToPictureController", "onCaptureStart SpecialFrame start", objArray);
          ta.s = DaenerysUtils.a(p1);
       }catch(java.lang.Exception e7){
          ta.s = null;
          PostUtils.D("RecordToPictureController", "×ª»»BitmapÊ§°Ü", e7);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("RecordToPictureController", "onCaptureStart SpecialFrame mLastFrame:"+ta.s, objArray1);
       return;
    }
}
