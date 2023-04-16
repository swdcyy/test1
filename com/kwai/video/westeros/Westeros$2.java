package com.kwai.video.westeros.Westeros$2;
import com.kwai.video.westeros.UIInteractionHandler$PointTransformDelegate;
import com.kwai.video.westeros.Westeros;
import java.lang.Object;
import com.kwai.video.westeros.models.Point;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.camerasdk.models.Point$b;
import com.kwai.camerasdk.models.Point;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Objects;
import com.kwai.camerasdk.Daenerys;
import java.lang.ref.WeakReference;
import m65.f;
import com.kwai.camerasdk.preprocess.CropAndFlipProcessor;
import l65.a;
import com.google.protobuf.AbstractMessageLite;
import java.lang.StringBuilder;
import com.kwai.camerasdk.log.Log;
import com.kwai.video.westeros.models.Point$Builder;

public class Westeros$2 implements UIInteractionHandler$PointTransformDelegate	// class@000e68
{
    public final Westeros this$0;

    public void Westeros$2(Westeros p0){
       this.this$0 = p0;
       super();
    }
    public Point transformPoint(Point p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Point$b obj = PatchProxy.applyOneRefs(p0, this, Westeros$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null || (this.this$0.disposed == null && this.this$0.daenerys != null)) {
          obj = Point.newBuilder();
          obj.a(p0.getX());
          obj.b(p0.getY());
          p0 = obj.build();
          Westeros daenerys = this.this$0.daenerys;
          Objects.requireNonNull(daenerys);
          Point point = PatchProxy.applyOneRefs(p0, daenerys, Daenerys.class, "18");
          if (point != patchProxyRe) {
          }else if(daenerys.k != null || p0 == null){
             Daenerys t = daenerys.t;
             if (t != null && t.get() != null) {
                p0 = daenerys.t.get().d(p0);
             }
             t = daenerys.s;
             if (t != null && t.get() != null) {
                CropAndFlipProcessor uCropAndFlip = daenerys.s.get();
                Objects.requireNonNull(uCropAndFlip);
                Object obj1 = PatchProxy.applyOneRefs(p0, uCropAndFlip, CropAndFlipProcessor.class, "13");
                if (obj1 != patchProxyRe) {
                   p0 = obj1;
                }else if(uCropAndFlip.released() || p0 == null){
                   byte[] uobyteArray = uCropAndFlip.nativeReverseTransformPoint(uCropAndFlip.nativeProcessor, p0.toByteArray());
                   if (uobyteArray != null) {
                      try{
                         p0 = Point.parseFrom(uobyteArray);
                      }catch(java.lang.Exception e0){
                         Log.e("CropAndFlipProcessor", e0);
                      }
                   }
                }
             }
          }
          p0 = Point.newBuilder().setX(point.getX()).setY(point.getY()).build();
       }
    label_00d9 :
       return p0;
    }
}
