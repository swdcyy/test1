package etb.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.platform.keventbus.KEventBus;
import com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent;
import brd.t;
import t45.d;
import brd.z;
import etb.j;
import erd.g;
import crd.b;
import etb.n$a;
import qvb.q;
import qvb.a;
import android.app.Activity;
import zf6.l;
import ekd.i;
import android.view.Window;
import zf6.k;
import lnc.i5;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import etb.f;
import android.view.View$OnClickListener;
import java.util.Collection;
import ekd.q;
import etb.m;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import tcc.a;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import etb.g;
import btb.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class n extends PresenterV2	// class@002806
{
    public ArrayList A;
    public String p;
    public String q;
    public e r;
    public RecyclerFragment s;
    public KwaiActionBar t;
    public TextView u;
    public TextView v;
    public View w;
    public View x;
    public Boolean y;
    public q z;

    public void n(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       this.u.setText(this.q);
       this.X7(KEventBus.d.b(NoticeBoxSettingEvent.class).observeOn(d.a).subscribe(new j(this)));
       if (this.z == null) {
          this.z = new n$a(this);
       }
       this.r.h(this.z);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       int i = 0;
       i.h(this.getActivity(), i, l.r());
       Window window = this.getActivity().getWindow();
       int i1 = (k.d())? 0xff000000: -1;
       i5.j(window, i1);
       if (i.c() && this.getContext() != null) {
          this.x.getLayoutParams().height = n.A(this.getContext());
          this.x.setVisibility(i);
       }
       this.t.j(j.n(this.getContext(), R.drawable.arg_RES_7f080562, 0x7f060148));
       this.t.h(new f(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tz = this.z;
       if (tz != null) {
          this.r.f(tz);
       }
       return;
    }
    public void P8(){
       a uoa1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "7")) {
          return;
       }
       int i = 0;
       boolean b = (!q.f(this.A) && CollectionsKt___CollectionsKt.h1(this.A, m.b))? true: false;
       n ty = this.y;
       if (ty == null || ty.booleanValue() != b) {
          ty = this.w;
          if (!b) {
             i = 8;
          }
          ty.setVisibility(i);
          if (this.y != null) {
             RxBus f = RxBus.f;
             ty = this.p;
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                uoa1 = PatchProxy.applyTwoRefs(ty, Boolean.valueOf(b), objArray, uoa, "1");
                if (uoa1 != PatchProxyResult.class) {
                label_005c :
                   f.b(uoa1);
                }
             }
             uoa1 = new a(ty, b);
             goto label_005c ;
          }
          this.y = Boolean.valueOf(b);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3f6a);
       this.u = m1.f(p0, 0x7f0a3f7b);
       this.v = m1.f(p0, 0x7f0a3643);
       this.w = m1.f(p0, 0x7f0a2e18);
       this.x = m1.f(p0, 0x7f0a3b45);
       m1.a(p0, new g(this), R.id.right_btn);
       this.t.f(false);
       this.t.setEnableDynamicAdjustTitleSize(false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.r8("KEY_NOTICE_BOX_ID");
       this.q = this.r8("KEY_NOTICE_BOX_NAME");
       this.r = this.q8(e.class);
       this.s = this.r8("NOTICE_BOX_FRAGMENT");
       return;
    }
}
