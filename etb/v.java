package etb.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etb.u;
import erd.o;
import t45.d;
import brd.z;
import etb.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import dtb.c;
import wkd.b;
import ysb.a;
import java.lang.Integer;
import cjd.e;
import etb.s;
import sfc.a;
import com.kwai.robust.PatchProxyResult;
import mz6.b;
import android.app.Activity;
import android.content.Context;
import lnc.a1;
import mz6.b$d;
import nfc.j;
import etb.p;
import android.content.DialogInterface$OnClickListener;
import etb.o;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.p1;
import etb.v$a;
import android.view.View$OnClickListener;
import etb.q;
import android.view.View$OnLongClickListener;
import btb.e;
import ctb.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class v extends PresenterV2	// class@00280f
{
    public e p;
    public a q;
    public NoticeBoxBaseItem r;
    public NoticeBoxPlateSetting s;
    public RecyclerFragment t;
    public KwaiImageView u;
    public TextView v;
    public View w;
    public View x;
    public Group y;
    public View z;

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       boolean b = false;
       if (this.s == null) {
          this.x.setClickable(b);
          this.z.setLongClickable(b);
          this.y.setVisibility(8);
          this.w.setVisibility(8);
          return;
       }else {
          this.x.setClickable(true);
          this.z.setLongClickable(true);
          this.y.setVisibility(b);
          this.u.L(this.s.mPlateIcon);
          this.v.setText(this.s.mPlateName);
          this.P8();
          this.X7(this.s.observable().distinctUntilChanged(u.b).observeOn(d.a).subscribe(new r(this), Functions.d()));
          return;
       }
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       v tw = this.w;
       int i = (this.s.mIsMuted != null)? 0: 8;
       tw.setVisibility(i);
       return;
    }
    public final void R8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "6")) {
          return;
       }
       ov = this.t;
       v tr = this.r;
       String str = (p0)? "no_disturb_open": "no_disturb_close";
       c.i(ov, tr, str);
       ov = this.s;
       this.X7(b.a(0x636667f2).a(ov.mBoxId, Integer.valueOf(ov.mPlateId), (this.s.mIsMuted ^ 0x01)).map(new e()).subscribe(new s(this), new a()));
       return;
    }
    public boolean S8(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int b = false;
       if (this.s == null) {
          return b;
       }
       obj = new b(this.getActivity());
       obj.o(this.s.mPlateName);
       int[] ointArray = new int[]{a1.d(0x7f07030d),a1.d(0x7f0702c5),a1.d(0x7f07030d),a1.d(0x7f0702c5)};
       obj.p(14.00f, a1.a(R.color.arg_RES_7f061a83), ointArray);
       b = 0x7f061f94;
       int i = (this.s.mIsMuted != null)? 0x7f101c1c: 0x7f1034d1;
       obj.a(j.a(b, i));
       obj.a(j.a(R.color.arg_RES_7f061faf, 0x7f104270));
       obj.l(new p(this));
       obj.k(new o(this));
       obj.q();
       v tt = this.t;
       v tr = this.r;
       if (!PatchProxy.applyVoidTwoRefs(tt, tr, objArray, c.class, "7")) {
          f3 uof3 = f3.l("3567871", "NOTIFICATION_CARD_DOUBLE_CHECK_POPUP");
          uof3.b(c.a(tr));
          uof3.h(tt);
       }
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a2e1f);
       this.v = m1.f(p0, 0x7f0a2e20);
       this.w = m1.f(p0, 0x7f0a2e18);
       this.x = m1.f(p0, 0x7f0a2e16);
       this.y = m1.f(p0, 0x7f0a2e1e);
       this.z = m1.f(p0, 0x7f0a2e15);
       p1.c(this.x, a1.e(14.00f), a1.e(14.00f), a1.e(14.00f), a1.e(14.00f));
       this.x.setOnClickListener(new v$a(this));
       this.z.setOnLongClickListener(new q(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.p = this.q8(e.class);
       this.q = this.q8(a.class);
       this.r = this.r8("NOTICE_BOX_ITEM_DATA");
       this.s = this.t8("NOTICE_BOX_ITEM_PLATE_SETTING");
       this.t = this.r8("NOTICE_BOX_FRAGMENT");
       return;
    }
}
