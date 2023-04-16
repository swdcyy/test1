package f0a.c$a;
import qvb.q;
import f0a.c;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import kotlin.jvm.internal.a;
import qvb.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;
import java.lang.Runnable;
import f0a.c$a$a;

public final class c$a implements q	// class@00226a
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          c s = this.b.s;
          if (s != null) {
             s.setVisibility(8);
          }
          c$a tb = this.b;
          c t = tb.t;
          if (t == null) {
             t = tb.u;
          }
          if (t != null) {
             t.setVisibility(4);
          }
          s = this.b.p;
          if (s == null) {
             a.S("mPhotoDetailParam");
          }
          if (s != null) {
             c v = this.b.v;
             QPhoto item = (v != null)? v.getItem(0): null;
             s.mPhoto = item;
             s = QPhotoMediaPlayerCacheManager.d(item);
             if (s != null) {
                s.release();
             }
          }
          s = this.b.v;
          if (s != null) {
             s.f(this);
          }
          s = this.b.q;
          if (s == null) {
             a.S("mFlowEndCallback");
          }
          s.run();
          if (t != null) {
             t.post(new c$a$a(this, t));
          }
       }
       return;
    }
}
