package com.yxcorp.gifshow.upload.h1;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import com.yxcorp.gifshow.upload.SegmentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;

public class h1 implements g	// class@001e7f
{
    public final int b;
    public final UploadInfo c;
    public final SegmentUploader d;

    public void h1(SegmentUploader p0,int p1,UploadInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "1")) {
       }else {
          this.d.g = (int)Math.ceil((double)(((float)this.b * 0x3f800000) / (float)p0.mPartSize));
          h1 td = this.d;
          td.i = p0.mFileKey;
          p0 = new boolean[td.g];
          td.l = p0;
          this.c.setPartKey(this.d.i);
       }
       return;
    }
}
