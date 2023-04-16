package com.yxcorp.login.debuglogin.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.login.debuglogin.a;
import com.yxcorp.login.debuglogin.b;
import j1d.e;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Integer;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.login.debuglogin.c$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.HashMap;
import com.yxcorp.login.loginaction.LoginHelper;
import com.yxcorp.login.debuglogin.f;
import java.util.Map;
import erd.o;
import j1d.d;
import k1d.e;
import com.yxcorp.login.debuglogin.d;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;

public class c extends PresenterV2	// class@001aaf
{
    public RecyclerView p;
    public a q;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, false));
       a uoa = new a();
       this.q = uoa;
       uoa.w = new b(this);
       uoa.W0(e.c().b());
       this.p.setAdapter(this.q);
       return;
    }
    public final void P8(int p0,DebugAccountInfo p1,ProgressFragment p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "3")) {
          return;
       }
       e uoe = e.c();
       Activity uActivity = this.getActivity();
       c$a uoa = new c$a(this, p2, p0);
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoidThreeRefsWithListener(p1, uActivity, uoa, uoe, e.class, "5")) {
          t ot = PatchProxy.applyOneRefs(p1, uoe, e.class, "8");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = uoe.b.d().flatMap(new f(uoe, new HashMap(), p1));
          }
          ot.subscribe(new d(uoa), new d(uoe, uActivity, uoa));
          PatchProxy.onMethodExit(e.class, "5");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a36c0);
       return;
    }
}
