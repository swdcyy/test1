package r0d.d;
import vc.m;
import android.content.Context;
import eb.a;
import yc.b;
import yc.d;
import vc.f;
import com.facebook.common.memory.b;
import tc.v;
import tc.g;
import tc.h;
import sc.d;
import vc.a;
import id.b0;
import com.facebook.imagepipeline.producers.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r0d.b;
import java.util.concurrent.Executor;
import ab.i;
import java.lang.Runnable;
import ab.h;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import e0d.h;
import e0d.d;
import android.content.ContentResolver;
import e0d.d$d;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.m;
import r0d.c;

public class d extends m	// class@0022fc
{
    public final b A;
    public final d B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final b F;
    public final f G;
    public final int H;
    public final a I;
    public final a z;

    public void d(Context p0,a p1,b p2,d p3,boolean p4,boolean p5,boolean p6,f p7,b p8,v p9,v p10,g p11,g p12,h p13,d p14,int p15,int p16,boolean p17,int p18,a p19,boolean p20,int p21){
       int i = this;
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
       i.z = p1;
       i.G = p7;
       i.A = p2;
       i.B = p3;
       i.C = p4;
       i.D = p5;
       i.E = p6;
       i.H = p18;
       i.I = p19;
       i.F = p8;
    }
    public b d(b0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(this.z, this.G.h(), this.A, this.B, this.C, this.D, this.E, p0, this.H, this.I, null, i.b);
       return obj;
    }
    public LocalVideoThumbnailProducer j(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.a;
       if (obj != null) {
          obj = obj.P;
          if (obj != null) {
             objArray = obj;
          }
       }
       LocalVideoThumbnailProducer localVideoTh = (objArray == null)? new LocalVideoThumbnailProducer(this.G.b(), this.a): objArray.a(this.G.b(), this.a);
       return localVideoTh;
    }
    public b0 k(n p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this.F, this.z, p0);
       }
       return uoc;
    }
}
