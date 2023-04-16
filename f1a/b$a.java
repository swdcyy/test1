package f1a.b$a;
import qvb.q;
import f1a.b;
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
import java.lang.Runnable;

public final class b$a implements q	// class@002270
{
    public final b b;

    public void b$a(b p0){
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
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          b q = this.b.q;
          if (q != null) {
             q.setVisibility(8);
          }
          q = this.b.r;
          if (q == null) {
             a.S("mPhotoDetailParam");
          }
          b p = this.b.p;
          QPhoto item = (p != null)? p.getItem(0): null;
          q.mPhoto = item;
          q = this.b.s;
          if (q == null) {
             a.S("mFlowEndCallback");
          }
          q.run();
       }
       return;
    }
}
