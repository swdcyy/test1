package cl9.y2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.mix.QComment;
import pk9.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cl9.t2;
import pk9.h$a;
import android.view.View;
import cl9.u2;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Boolean;
import ek9.k1;
import java.lang.Integer;
import e17.i;
import gk9.c;
import gk9.b;
import cjd.e;
import erd.o;
import cl9.w2;
import cl9.y2$a;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import ek9.t0;

public class y2 extends PresenterV2	// class@000687
{
    public QPhoto p;
    public QComment q;
    public d r;
    public CommentsFragment s;
    public t t;
    public k1 u;
    public t0 v;
    public View w;

    public void y2(){
       super();
    }
    public static h P8(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(new t2(p0));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y2.class, "3")) {
          return;
       }
       this.w.setVisibility(8);
       this.X7(this.t.subscribe(new u2(this), Functions.e));
       return;
    }
    public final void R8(QComment p0,boolean p1){
       y2 oy2 = y2.class;
       if (PatchProxy.isSupport(oy2) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oy2, "8")) {
          return;
       }
       oy2 = this.u;
       int i = 0;
       int i1 = 1;
       if (oy2.a != null) {
          Object[] objArray = new Object[]{Integer.valueOf(i1),Integer.valueOf(i)};
          i.b(R.style.arg_RES_7f11066a, 0x7f103a97, objArray);
          return;
       }else {
          oy2.a = i1;
          this.w.setVisibility(i);
          String photoId = p0.getPhotoId();
          String id = p0.getId();
          t ot = PatchProxy.applyTwoRefs(photoId, id, null, c.class, "17");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = c.f().a(photoId, id);
          }
          this.X7(ot.map(new e()).subscribe(new w2(this, p1, p0), new y2$a(this)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a0898);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y2.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       this.r = this.q8(d.class);
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("COMMENT_TOP_OBSERVER");
       this.u = this.r8("COMMENT_STAT_PARAM");
       this.v = this.r8("COMMENT_GLOBAL_ACTION");
       return;
    }
}
