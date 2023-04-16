package com.yxcorp.plugin.setting.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nc5.i;
import tgd.f;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.c;
import android.widget.TextView;
import lnc.j9;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import android.view.View;
import ekd.m1;

public class c extends PresenterV2	// class@0008d7
{
    public TextView p;
    public final int q;
    public c r;

    public void c(int p0){
       super();
       this.q = p0;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoc, "6");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): i.c(this.q);
       this.P8(b);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.r = new f(this);
       b.a(0x34c80eb4).r(this.q, this.r);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       b.a(0x34c80eb4).s(this.q, this.r);
       return;
    }
    public final void P8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       j9.a(this.p, p0);
       i.e(this.q, this.getActivity());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6d);
       return;
    }
}
