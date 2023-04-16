package hd9.l0;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$d;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import pi9.h;
import android.view.View;
import java.lang.Math;
import j8c.a;
import q87.c;

public class l0 implements AdjustableCameraView$d	// class@00261a
{
    public final d a;

    public void l0(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       this.a.I2();
       return;
    }
    public void b(int p0,int p1){
       float f;
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ol0, "2")) {
          return;
       }
       d q = this.a.q;
       Objects.requireNonNull(q);
       if (!PatchProxy.isSupport(SampleVideoView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), q, SampleVideoView.class, "12")) {
          SampleVideoView k = q.k;
          Objects.requireNonNull(k);
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(q, Integer.valueOf(p0), Integer.valueOf(p1), k, h.class, "4")) {
             h oh = 1;
             String str = (q.getHeight() > q.getWidth())? 1: null;
             int i = k.d - q.getWidth();
             int i1 = k.c - q.getHeight();
             int i2 = Math.abs((q.getHeight() - q.getWidth())) / 2;
             if (k.e == null && str) {
                i = k.d - q.getHeight();
             }
             k.d(q, i2);
             h a = k.a;
             if (a != null) {
                if (a != oh) {
                   if (a != 2) {
                      if (a != 3) {
                         Object[] objArray = new Object[0];
                         a.D().A("FollowShootSnapEdgeHelp", "position undefined", objArray);
                      }else if(k.e != null){
                         f = (p0 > i)? (float)i: (float)p0;
                         q.setX(f);
                         q.setY((float)p1);
                      }else if(str != null){
                         q.setX((float)(p0 - i2));
                         q.setY((float)p1);
                      }else {
                         q.setX((float)(p0 - i2));
                         q.setY((float)(p1 + i2));
                      }
                   }else if(k.e != null){
                      f = (p0 > i)? (float)i: (float)p0;
                      q.setX(f);
                      q.setY((float)p1);
                   }else if(str != null){
                      q.setY((float)p1);
                      q.setX((float)(p0 + i2));
                   }else {
                      q.setX((float)(p0 - i2));
                      q.setY((float)(p1 + i2));
                   }
                }else if(k.e != null){
                   f = (p0 > i)? (float)i: (float)p0;
                   q.setX(f);
                   f = (p1 < i1)? (float)i1: (float)p1;
                   q.setY(f);
                }else if(str != null){
                   f = (p0 > i)? (float)(i + i2): (float)p0;
                   q.setX(f);
                   q.setY((float)(p1 + i2));
                }else {
                   q.setX((float)(p0 - i2));
                   q.setY((float)(p1 + i2));
                }
             }else if(k.e != null){
                f = (p0 > i)? (float)i: (float)p0;
                q.setX(f);
                q.setY((float)p1);
             }else if(str != null){
                f = (p0 > i)? (float)(i + i2): (float)p0;
                q.setX(f);
                q.setY((float)(p1 - i2));
             }else {
                q.setX((float)(p0 - i2));
                q.setY((float)(p1 + i2));
             }
             q.invalidate();
          }
       }
       this.a.F2();
       return;
    }
}
