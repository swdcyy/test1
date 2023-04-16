package bib.j;
import com.kwai.camerasdk.preprocess.DataExtractProcessor;
import bib.k;
import com.kwai.camerasdk.models.DataExtractType;
import com.kwai.camerasdk.video.VideoFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import mw5.a;
import bib.a;
import com.kwai.camerasdk.videoCapture.FrameBuffer;
import java.nio.ByteBuffer;
import mw5.c;

public class j extends DataExtractProcessor	// class@0003d8
{
    public final k a;

    public void j(k p0,DataExtractType p1){
       this.a = p0;
       super(p1);
    }
    public void onReceiveRawData(VideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, k.class, "4") && p0 != null) {
          Iterator iterator = ta.f.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             VideoFrame width = p0.width;
             VideoFrame height = p0.height;
             VideoFrame timestamp = p0.timestamp;
             boolean b = p0.isTexture();
             VideoFrame yuv_format = p0.yuv_format;
             VideoFrame isOesTexture = p0.isOesTexture;
             VideoFrame textureId = p0.textureId;
             VideoFrame data = p0.data;
             a uoa1 = (data == null)? null: data.byteBuffer;
             uoa1 = new a(width, height, timestamp, b, yuv_format, isOesTexture, textureId, uoa1);
             uoa.a(v12);
          }
       }
       return;
    }
}
