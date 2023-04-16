package com.yxcorp.gifshow.video.b$a;
import com.yxcorp.gifshow.video.c$a;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class b$a implements c$a	// class@001689
{
    public EncodedSegmentInfo a;

    public void b$a(EncodedSegmentInfo p0){
       super();
       this.a = null;
       this.a = p0;
    }
    public int getByteLength(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getByteLength();
    }
    public long getCrc32(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getCrc32();
    }
    public byte[] getMetadataBytes(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getMetadataBytes();
    }
    public double getSegmentDuration(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.a.getSegmentDuration();
    }
    public int getStartByte(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getStartByte();
    }
    public boolean isVideoSegment(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isVideoSegment();
    }
}
