package dfc.o;
import com.smile.gifmaker.mvps.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import wkd.b;
import ncc.g;
import com.kwai.social.startup.reminder.model.NewsSlidePlayConfig;
import dfc.o$a;
import qvb.i;
import qvb.q;
import qvb.j;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import dfc.n;
import erd.g;
import io.reactivex.internal.functions.Functions;
import j9c.b;
import java.lang.Boolean;
import dub.z;
import android.view.View;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.c;
import im8.f;

public class o extends a	// class@0021ad
{
    public BaseFragment r;
    public f s;
    public c t;
    public f u;
    public f v;
    public View w;
    public ViewGroup x;
    public q y;
    public b z;

    public void o(){
       super();
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       if (this.x == null || (this.r instanceof RecyclerFragment && b.a(-83154551).f().mEnable != null)) {
          o tr = this.r;
          if (this.y == null) {
             this.y = new o$a(this);
          }
          tr.q().h(this.y);
          if (!PatchProxy.applyVoid(objArray, this, oo, "8")) {
             oo = this.z;
             if (oo == null || oo.isDisposed()) {
                this.z = this.r.Vg().i().subscribe(new n(this), Functions.d());
             }
          }
       }
    label_006d :
       return;
    }
    public void J8(){
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, oo, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oo, "9")) {
          oo = this.z;
          if (oo != null && !oo.isDisposed()) {
             this.z.dispose();
          }
          this.z = null;
       }
       if (this.y != null) {
          oo = this.r;
          if (oo instanceof RecyclerFragment) {
             oo.q().f(this.y);
          }
          this.y = null;
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       if (b.b(-8) > 0) {
          z.d("NewsSlidePlay", -8, 0, Boolean.TRUE);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a2dba);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.r = this.r8("REMINDER_HOST_FRAGMENT");
       this.t = this.r8("NEWS_ENTRANCE_ACTION");
       this.s = this.x8("NEWS_ENTRANCE_CAN_SHOW_RED_DOT");
       this.u = this.x8("HAS_NEWS_ENTRANCE_SUBTITLE_CONSUMED");
       this.v = this.x8("REMINDER_IS_FILTER_CATEGORY_ALL");
       return;
    }
}
