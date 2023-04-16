package bua.h$a;
import ub.a;
import bua.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import mrd.a;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.q;
import com.kuaishou.android.model.mix.CommonMeta;
import wkd.b;
import com.yxcorp.gifshow.w;
import hn5.n;
import hn5.m;
import androidx.fragment.app.Fragment;
import gb5.a;
import uv8.e1;
import lnc.t5;
import java.lang.Throwable;
import android.graphics.drawable.Animatable;
import bd.f;
import da6.c;
import com.yxcorp.image.callercontext.a;

public class h$a extends a	// class@000478
{
    public a b;
    public final h c;

    public void h$a(h p0){
       this.c = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "4")) {
          return;
       }
       if (this.c.getActivity() != null) {
          Objects.requireNonNull(this.c.getActivity());
       }
       h$a tc = this.c;
       h a = tc.A;
       if (a != null) {
          a.onNext(tc.w);
       }
       tc = this.c;
       a = tc.C;
       if (a != null) {
          a.a(tc.w);
       }
       h d = this.c.D;
       if (d.mTransientShowed != null) {
          return;
       }else {
          d.mTransientShowed = true;
          w ow = b.a(-1343064608);
          if (ow != null && m.a().FG(this.c.z)) {
             b.a(0x8708467).u();
             h z = this.c.z;
             ow.z().L(z, t5.a(z));
             b.a(0x8708467).log("PhotoChannel first cover success");
          }
          return;
       }
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "2")) {
          return;
       }
       w ow = b.a(-1343064608);
       if (ow != null && m.a().FG(this.c.z)) {
          h z = this.c.z;
          ow.z().x(z, p1, t5.a(z));
          b.a(0x8708467).log("PhotoChannel first cover error");
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$a.class, "3")) {
       }else {
          this.c.y.putExtra("KWAI_IMAGE_CALLER_CONTEXT", this.b);
          this.a();
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "1")) {
          return;
       }
       if (p1 instanceof a) {
          this.b = p1;
       }
       return;
    }
}
