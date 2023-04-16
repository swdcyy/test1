package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import sz1.e;
import sa3.b;
import java.lang.String;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import lh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import f02.b;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController$stageStatusObserver$2;
import qrd.p;
import qrd.s;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.f;
import je3.i;
import com.kuaishou.live.livestage.f$a$b;
import com.kuaishou.live.livestage.f$b;
import fe3.b;
import f02.d;
import com.kuaishou.live.livestage.f$a;
import re3.c;
import ee3.e;
import ke3.d;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.d0;
import com.kuaishou.live.livestage.g;
import qrd.l1;

public final class LiveLiteMultiLineViewController extends ViewController	// class@001e0d
{
    public RenderAreaView j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final b n;
    public final AtomicBoolean o;
    public final p p;
    public f q;
    public final e r;
    public final b s;
    public final String t;
    public final a u;

    public void LiveLiteMultiLineViewController(e p0,b p1,String p2,a p3){
       a.p(p0, "interactManager");
       a.p(p1, "interactiveEffectService");
       a.p(p3, "onStartRender");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.u = p3;
       InteractiveChatRoomInfo interactiveC = null;
       this.k = new MutableLiveData(interactiveC);
       this.l = new MutableLiveData(interactiveC);
       b uob = p0.gc();
       a.o(uob, "interactManager.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          sCInteractiv = sCInteractiv.roomInfo;
          if (sCInteractiv != null) {
             interactiveC = sCInteractiv.layoutConfig;
          }
       }
       this.m = new MutableLiveData(interactiveC);
       this.n = new b();
       this.o = new AtomicBoolean(false);
       this.p = s.c(new LiveLiteMultiLineViewController$stageStatusObserver$2(this));
       return;
    }
    public static final RenderAreaView V2(LiveLiteMultiLineViewController p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("renderArea");
       }
       return p0;
    }
    public void F2(){
       LiveLiteMultiLineViewController liveLiteMult = LiveLiteMultiLineViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteMult, "2")) {
          return;
       }
       RenderAreaView renderAreaVi = new RenderAreaView(this.D2());
       this.j = renderAreaVi;
       renderAreaVi.setTag(d.a, LayoutViewType.MultiLine.name());
       LiveLiteMultiLineViewController tj = this.j;
       String str = "renderArea";
       if (tj == null) {
          a.S(str);
       }
       this.R2(tj);
       Object[] objArray1 = PatchProxy.apply(objArray, this, liveLiteMult, "4");
       if (objArray1 != PatchProxyResult.class) {
       }else if(this.r.Rf() == null){
          objArray1 = objArray;
       }else {
          f$a$b uoa$b = f.s.b().b(new b(2, d.a(this.r)));
          LiveLiteMultiLineViewController tj1 = this.j;
          if (tj1 == null) {
             a.S(str);
          }
          i oi = this.r.Rf();
          a.m(oi);
          a.o(oi, "interactManager.liveStageRtcClient!!");
          f$a$b uoa$b1 = uoa$b.w(tj1).x(oi);
          uoa$b1 = uoa$b1.C(e.a).u(this.n).A(VideoRenderMode.ALWAYS);
          d0 uod0 = PatchProxy.apply(objArray, this, liveLiteMult, "1");
          if (uod0 == PatchProxyResult.class) {
             uod0 = this.p.getValue();
          }
          objArray1 = uoa$b1.y(uod0).c();
       }
       if (objArray1 != null) {
          g og = this.r.vi();
          if (og != null) {
             og.e(objArray1);
          }
          objArray = objArray1;
       }
       this.q = objArray;
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiLineViewController.class, "3")) {
          return;
       }
       LiveLiteMultiLineViewController tq = this.q;
       if (tq != null) {
          g og = this.r.vi();
          if (og != null) {
             og.a(tq);
          }
       }
       return;
    }
}
