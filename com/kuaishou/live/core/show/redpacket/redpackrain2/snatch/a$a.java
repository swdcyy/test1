package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a$b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ph2.a;
import ih2.x;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import oq5.b;
import th2.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;

public class a$a implements a$b	// class@000f1b
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       a s = this.a.s;
       if (s != null && s.d()) {
          this.a.s.dismissAllowingStateLoss();
       }
       return;
    }
    public void k0(DialogInterface$OnDismissListener p0){
       this.a.t = p0;
    }
    public boolean l0(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.a.q.b() == null) {
          return b;
       }else {
          uoa = this.a;
          if (uoa.p.p1 != null && y.d(uoa.getActivity())) {
             this.a.p.p1.d();
          }
          uoa = this.a;
          if (uoa.s == null) {
             uoa.s = new LiveRedPackRainDialogFragment(p0, this.a.q.b(), this.a.p);
             this.a.s.k0(new a(this));
          }
          if (!this.a.s.d()) {
             this.a.s.zh(p0);
             c childFragmen = this.a.p.Z2.b().getChildFragmentManager();
             if (childFragmen.isStateSaved()) {
                return b;
             }else {
                this.a.s.Cb(childFragmen, "LiveRedPackRainSnatchDialog");
             }
          }else {
             this.a.s.Dh(p0);
          }
          return true;
       }
    }
    public boolean m0(){
       a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.s;
       boolean b = (obj != null && obj.d())? true: false;
       return b;
    }
}
