package com.kuaishou.live.gzone.v2.profile.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e63.a;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.kwai.library.widget.refresh.RefreshLayout;
import e63.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ekd.m1;
import mrd.c;
import p91.m;

public class a extends c	// class@001cda
{
    public c p;
    public c q;
    public m r;
    public RefreshLayout s;
    public static String sLivePresenterClassName = "LiveGzoneAnchorProfileRefreshPresenter";

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.s.setOnRefreshListener(new a(this));
       this.X7(this.q.subscribe(new b(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.s.setOnRefreshListener(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3537);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PROFILE_REFRESH_SUBJECT");
       this.q = this.r8("LIVE_PROFILE_REFRESHING_STATE_CHANGED_SUBJECT");
       this.r = this.t8("LIVE_BASIC_CONTEXT");
       return;
    }
}
