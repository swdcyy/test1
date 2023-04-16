package com.yxcorp.gifshow.upload.c1;
import erd.o;
import com.yxcorp.gifshow.upload.g1;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.SegmentUploader$SegmentUploadFailedException;

public class c1 implements o	// class@001e65
{
    public final g1 b;

    public void c1(g1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       boolean b;
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, c1.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else if(p0.size() == this.b.d.g && this.b.d.f != null){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          uBoolean = Boolean.valueOf(b);
       }else {
          throw new SegmentUploader$SegmentUploadFailedException();
       }
       return uBoolean;
    }
}
