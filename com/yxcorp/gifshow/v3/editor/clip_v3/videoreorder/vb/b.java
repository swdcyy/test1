package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import ei0.a;
import lnc.a1;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment;
import android.view.View;
import mpc.c;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.VideoReorderFragment$b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import opc.f;
import k17.b;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$a;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$n;
import lpc.e;
import kpc.a;
import tyc.m3;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$e;
import hpc.a;
import lpc.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lpc.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import lpc.a;
import androidx.lifecycle.LifecycleObserver;
import lpc.f;
import android.view.View$OnClickListener;
import lpc.g;
import lpc.h;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.c;
import faa.a;
import q87.c;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPanelOpenAction;
import tvc.e;
import bpc.c;
import bpc.f;
import xvc.b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPanelOpenUndoAction;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class b extends a	// class@000e0e
{
    public VideoReorderFragment c;
    public RecyclerView d;
    public View e;
    public LinearLayout f;
    public ImageView g;
    public TextView h;
    public ImageView i;
    public ImageView j;
    public a k;
    public m l;
    public w1 m;
    public b n;
    public f o;
    public boolean p;
    public c q;
    public Map r;
    public VideoSDKPlayerView s;
    public VideoSDKPlayerView$d t;
    public final VideoReorderFragment$b u;
    public double v;
    public VideoSDKPlayerView$e w;
    public int x;
    public Intent y;
    public boolean z;
    public static final int A;
    public static final int B;
    public static final long C;

    static {
       b.A = a1.e(6.00f);
       b.B = a1.e(6.00f);
       b.C = LongVideoLocalProject.e(false);
    }
    public void b(VideoReorderFragment p0,View p1,c p2,VideoReorderFragment$b p3,VideoSDKPlayerView p4,f p5){
       super(p1);
       int b = b.B;
       this.n = new b(0, b.A, b.A, b);
       this.p = true;
       this.r = new HashMap();
       this.t = new b$a(this);
       this.v = 0;
       this.w = new b$b(this);
       this.x = 0;
       this.y = null;
       this.z = false;
       this.c = p0;
       this.q = p2;
       this.u = p3;
       this.s = p4;
       this.o = p5;
       if (PatchProxy.applyVoidOneRefs(p1, this, b.class, "1")) {
       }else {
          this.d = p1.findViewById(0x7f0a3ed0);
          this.e = p1.findViewById(0x7f0a1518);
          this.f = p1.findViewById(0x7f0a2891);
          this.g = p1.findViewById(0x7f0a14e3);
          this.h = p1.findViewById(0x7f0a40e1);
          this.i = p1.findViewById(0x7f0a440c);
          this.j = p1.findViewById(0x7f0a440b);
       }
       if (!PatchProxy.applyVoid(null, this, b.class, "2")) {
          if (!this.d.getItemDecorationCount()) {
             this.d.addItemDecoration(this.n);
          }
          e uoe = new e(this, new a(), 12);
          this.m = uoe;
          m om = new m(uoe);
          this.l = om;
          om.f(this.d);
          a uoa = new a();
          this.k = uoa;
          uoa.i = new c(this);
          this.d.setAdapter(uoa);
          this.d.setLayoutManager(new CenterLayoutManager(a.b(), 0, 0, b));
       }
       if (!PatchProxy.applyVoid(null, this, b.class, "3")) {
          this.q.r0().observe(this.c, new b(this));
       }
       if (!PatchProxy.applyVoid(null, this, b.class, "12")) {
          this.c.getLifecycle().addObserver(new a(this));
       }
       if (!PatchProxy.applyVoid(null, this, b.class, "7")) {
          this.i.setOnClickListener(new f(this));
          this.j.setOnClickListener(new g(this));
          this.e.setOnClickListener(new h(this));
          this.f.setOnClickListener(new c(this));
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoReorderPanelViewBinder", "onAttach", objArray);
       this.r.clear();
       this.q.t0(new ReorderPanelOpenAction(this.o.o0().e().c()));
       this.s.setEnablePlayerStatusChanged(true);
       this.s.updatePlayerStatusView(0);
       this.s.addSimpleGestureListener("VideoReorderPanelViewBinder", this.t);
       this.s.setPreviewEventListener("VideoReorderPanelViewBinder", this.w);
       this.q.t0(new ReorderPanelOpenUndoAction());
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoReorderPanelViewBinder", "onDetach", objArray);
       this.p = true;
       this.s.updatePlayerStatusView(true);
       this.s.setEnablePlayerStatusChanged(0);
       this.s.addSimpleGestureListener("VideoReorderPanelViewBinder", null);
       this.s.setPreviewEventListener("VideoReorderPanelViewBinder", null);
       return;
    }
    public void D(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "15")) {
          return;
       }
       if (!this.d.getWidth() || !this.d.getChildCount()) {
          this.d.getViewTreeObserver().addOnGlobalLayoutListener(new b$c(this, p0));
          return;
       }else {
          uob = this.x;
          if (uob != null) {
             b = true;
             if (uob != b && uob != 2) {
                if (uob == 3) {
                   this.d.scrollToPosition(p0);
                }
             }else {
                this.d.getLayoutManager().H(b);
                this.d.smoothScrollToPosition(p0);
             }
          }else {
             this.d.getLayoutManager().H(false);
             this.d.smoothScrollToPosition(p0);
          }
          return;
       }
    }
}
