package dqb.c;
import sm9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import dqb.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ypb.a;
import zpb.a;
import dqb.a;
import g9c.a;
import com.kuaishou.android.model.feed.MusicRadioFeed;

public final class c extends b	// class@0024f0
{
    public QPhoto y;

    public void c(){
       super();
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       c ty = this.y;
       if (ty == null) {
          a.S("mPhoto");
       }
       f.b(new b(ty, this.u));
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       a uoa = a.a(this.getActivity());
       if (uoa != null) {
          QPhoto qPhoto = uoa.p0();
          c ty = this.y;
          if (ty == null) {
             a.S("mPhoto");
          }
          if (a.g(qPhoto, ty)) {
             this.S8(uoa.o0(), (uoa.o0() ^ 0x01));
          }else {
             this.S8(false, false);
          }
       }
       return;
    }
    public void j8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.s8(a.class);
       QPhoto obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.y = obj;
       obj = obj.mEntity;
       if (!obj instanceof MusicRadioFeed) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.mRaveView;
       }
       this.v = objArray;
       return;
    }
}
