package com.kwai.video.krtc.videoprocessing.VideoProcessFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class VideoProcessFrame	// class@0008cd
{
    public int colorSpace;
    public int cropHeight;
    public int cropWidth;
    public ByteBuffer data;
    public int format;
    public int height;
    public boolean isFrontCamera;
    public boolean isOesTexture;
    public float[] matrix;
    public long ptsMs;
    public int rotation;
    public int textureId;
    public int width;

    public void VideoProcessFrame(){
       super();
       this.width = 0;
       this.height = 0;
       this.cropWidth = 0;
       this.cropHeight = 0;
       this.colorSpace = 0;
       this.format = 0;
       this.textureId = 0;
       this.isOesTexture = false;
       this.data = null;
       this.ptsMs = 0;
       this.rotation = 0;
       this.isFrontCamera = true;
       this.matrix = null;
    }
    public byte[] getDataByteArray(){
       Object[] objArray = null;
       VideoProcessFrame obj = PatchProxy.apply(objArray, this, VideoProcessFrame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       if (obj == null) {
          return objArray;
       }
       obj.position(0);
       byte[] uobyteArray = new byte[this.data.remaining()];
       this.data.get(uobyteArray);
       this.data.position(0);
       return uobyteArray;
    }
    public byte[] getReadonlyDataByteArray(){
       Object[] objArray = null;
       VideoProcessFrame obj = PatchProxy.apply(objArray, this, VideoProcessFrame.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       if (obj == null) {
          return objArray;
       }
       obj.position(0);
       return this.data.array();
    }
}
