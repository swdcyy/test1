package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$h;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$g;
import tzc.a;
import java.lang.Number;

public class VideoTrimmer$h implements LinearBitmapContainer$a	// class@0019ea
{
    public final VideoTrimmer a;

    public void VideoTrimmer$h(VideoTrimmer p0){
       this.a = p0;
       super();
    }
    public Bitmap a(int p0){
       VideoTrimmer obj;
       VideoTrimmer$h oh = VideoTrimmer$h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oh = this.a;
       Bitmap uBitmap = null;
       if (oh.m == null) {
          return uBitmap;
       }else {
          oh = this.a;
          p0 = (int)((Math.min(((float)p0 + 0x3f000000), oh.t) * (float)this.a.m.a()) / oh.t);
          obj = oh.m;
          if (obj != null) {
             uBitmap = obj.getFrame(p0);
          }
          return uBitmap;
       }
    }
    public boolean b(int p0){
       return a.a(this, p0);
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, VideoTrimmer$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.ceil((double)this.a.t);
    }
    public int getHeight(){
       return this.a.q;
    }
    public int getWidth(){
       return this.a.r;
    }
}
