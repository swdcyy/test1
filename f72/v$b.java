package f72.v$b;
import ub.a;
import f72.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverMeta;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import wkd.b;
import com.yxcorp.gifshow.w;
import hn5.n;
import hn5.m;
import uv8.e1;
import lnc.t5;
import com.yxcorp.gifshow.util.rx.RxBus;
import fa5.e;
import com.yxcorp.gifshow.entity.QPhoto;
import fa5.a;
import java.lang.Throwable;
import fa5.d;
import android.graphics.drawable.Animatable;
import bd.f;
import da6.c;
import com.yxcorp.image.callercontext.a;

public class v$b extends a	// class@0028dd
{
    public a b;
    public RecyclerFragment c;
    public CommonMeta d;
    public CoverMeta e;
    public final v f;

    public void v$b(v p0,RecyclerFragment p1,CommonMeta p2,CoverMeta p3){
       this.f = p0;
       super();
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "4")) {
          return;
       }
       if (this.c.getActivity() != null) {
          Objects.requireNonNull(this.c.getActivity());
       }
       v$b td = this.d;
       if (td.mTransientShowed != null) {
          return;
       }else {
          boolean b = true;
          td.mTransientShowed = b;
          w ow = b.a(-1343064608);
          if (ow != null && m.a().FG(this.c)) {
             v$b tc = this.c;
             ow.z().L(tc, t5.a(tc));
          }else {
             b = false;
          }
          e uoe = new e(b);
          uoe.c(this.f.s.getPhotoId());
          uoe.b(this.c.f());
          RxBus.f.b(uoe);
          return;
       }
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$b.class, "2")) {
          return;
       }
       w ow = b.a(-1343064608);
       if (ow != null && m.a().FG(this.c)) {
          v$b tc = this.c;
          ow.z().x(tc, p1, t5.a(tc));
          RxBus.f.b(new d());
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, v$b.class, "3")) {
       }else {
          this.e.putExtra("KWAI_IMAGE_CALLER_CONTEXT", this.b);
          this.a();
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$b.class, "1")) {
          return;
       }
       if (p1 instanceof a) {
          this.b = p1;
       }
       return;
    }
}
