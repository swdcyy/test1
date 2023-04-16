package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import v4b.o;
import v4b.h;
import erd.g;
import crd.b;
import eoc.f;
import lnc.b9;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import v4b.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@001bdc
{
    public b p;
    public BaseFragment q;
    public MagicFaceDeleteFragment r;
    public boolean s;
    public final a t;

    public void d(){
       super();
       this.t = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicDeleteShowPresenter", "onBind", objArray);
       this.getActivity().F2(this.t);
       this.p = f.a(o.class, new h(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicDeleteShowPresenter", "onUnbind", objArray);
       this.getActivity().l3(this.t);
       this.r = null;
       b9.a(this.p);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "6")) {
          return;
       }
       String str = "MagicFaceDelete";
       int i = 0;
       if (this.s == null) {
          objArray = new Object[i];
          b.D().w(str, "try to exit MagicDeleteFragment: is not showing", objArray);
          return;
       }else if(this.getActivity() != null && (this.r != null && this.q != null)){
          Object[] objArray1 = new Object[i];
          b.D().w(str, "hidePanel", objArray1);
          e uoe = this.q.getChildFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
          uoe.u(this.r).m();
          this.r = objArray;
          this.s = i;
          RxBus.f.b(new n(i));
       }
    label_0062 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
