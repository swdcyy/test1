package id.u;
import dd.c;
import id.t;
import dd.d;
import id.f0;
import id.e0;
import id.c0;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;

public class u extends t implements c	// class@0021cc
{
    public final d c;
    public final c d;

    public void u(d p0,c p1){
       super(p0, p1);
       this.c = p0;
       this.d = p1;
    }
    public void onRequestCancellation(c0 p0){
       u tc = this.c;
       if (tc != null) {
          tc.onRequestCancellation(p0.getId());
       }
       tc = this.d;
       if (tc != null) {
          tc.onRequestCancellation(p0);
       }
       return;
    }
    public void onRequestFailure(c0 p0,Throwable p1){
       u tc = this.c;
       if (tc != null) {
          tc.onRequestFailure(p0.b(), p0.getId(), p1, p0.p());
       }
       tc = this.d;
       if (tc != null) {
          tc.onRequestFailure(p0, p1);
       }
       return;
    }
    public void onRequestStart(c0 p0){
       u tc = this.c;
       if (tc != null) {
          tc.onRequestStart(p0.b(), p0.h(), p0.getId(), p0.p());
       }
       tc = this.d;
       if (tc != null) {
          tc.onRequestStart(p0);
       }
       return;
    }
    public void onRequestSuccess(c0 p0){
       u tc = this.c;
       if (tc != null) {
          tc.onRequestSuccess(p0.b(), p0.getId(), p0.p());
       }
       tc = this.d;
       if (tc != null) {
          tc.onRequestSuccess(p0);
       }
       return;
    }
}
