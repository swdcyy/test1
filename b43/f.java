package b43.f;
import im8.g;
import k51.c;
import b43.f$b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import b43.c;
import b43.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.ConstraintHelper;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import android.view.View;
import b43.a;
import mw1.d;
import mw1.b;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.Set;
import java.util.List;
import android.animation.Animator;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jv1.b;
import com.kwai.video.waynelive.LivePlayerController;
import e57.a;
import java.util.Iterator;
import e57.a$a;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import b43.e;
import android.animation.Animator$AnimatorListener;
import androidx.constraintlayout.widget.Group;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import wf2.n$b;
import b43.d;
import android.view.ViewGroup$LayoutParams;
import mw1.c;
import b43.f$a;
import java.lang.Enum;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import android.widget.Space;
import b43.i;

public class f extends c implements g	// class@0002fa
{
    public final Set A;
    public final List B;
    public final List C;
    public final Set D;
    public final Runnable E;
    public Animator F;
    public boolean G;
    public final b H;
    public a p;
    public a0 q;
    public c r;
    public b s;
    public View t;
    public ViewGroup u;
    public View v;
    public Space w;
    public Group x;
    public d y;
    public final Map z;
    public static String sLivePresenterClassName = "LiveAudiencePlayerFloatElementPresenter";

    public void f(){
       super();
       this.p = new f$b(this);
       this.z = new HashMap();
       this.A = new HashSet();
       this.B = new ArrayList();
       this.C = new ArrayList();
       this.D = new HashSet();
       this.E = new c(this);
       this.H = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       int i = 2;
       this.x.setReferencedIds(new int[i]{R.id.live_player_float_element_background,0x7f0a1ecd});
       if (this.q.e.isLandscape()) {
          this.v.setBackgroundResource(R.drawable.arg_RES_7f08127f);
       }
       a uoa = new a(this);
       this.y = uoa;
       this.s.Y3(uoa);
       a[] uoaArray = new a[i];
       int i1 = 0;
       uoaArray[i1] = AudienceBizRelation.PK;
       uoaArray[1] = AudienceBizRelation.GAME_INTERACTIVE_PK;
       this.q.N().u5(this.H, uoaArray);
       LivePlayerFloatItem[] livePlayerFl = LivePlayerFloatItem.values();
       i = livePlayerFl.length;
       for (; i1 < i; i1 = i1 + 1) {
          this.z.put(livePlayerFl[i1], Boolean.FALSE);
       }
       this.Y8();
       this.R8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "17")) {
          return;
       }
       this.P8();
       this.u.removeCallbacks(this.E);
       this.z.clear();
       this.A.clear();
       this.S8(false);
       this.s.X0(this.y);
       a[] uoaArray = new a[]{AudienceBizRelation.PK,AudienceBizRelation.GAME_INTERACTIVE_PK};
       this.q.N().G5(this.H, uoaArray);
       this.B.clear();
       this.C.clear();
       this.D.clear();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       f tF = this.F;
       if (tF != null) {
          tF.cancel();
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.getActivity();
       boolean b = this.q.x.H2();
       if (!this.q.E.isSideBySideStream() && !b) {
          this.u.setVisibility(0);
          this.W8(5000);
          this.X8();
       }else {
          this.u.setVisibility(8);
          this.p.d(0);
       }
       return;
    }
    public void S8(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "13")) {
          return;
       }
       this.u.removeCallbacks(this.E);
       Iterator iterator = this.C.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(true);
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, uof, "12")) {
             this.P8();
             ObjectAnimator objectAnimat = j.a(this.x, new float[2]{0x3f800000,0});
             this.F = objectAnimat;
             objectAnimat.setDuration(200);
             this.F.setInterpolator(new LinearInterpolator());
             this.F.addListener(new e(this));
             this.F.start();
             this.G = true;
          }
       }else {
          this.V8();
       }
       return;
    }
    public void V8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "14")) {
          return;
       }
       this.x.setVisibility(8);
       if (!PatchProxy.applyVoid(objArray, this, uof, "15")) {
          Iterator iterator = this.z.keySet().iterator();
          while (iterator.hasNext()) {
             LivePlayerFloatItem livePlayerFl = iterator.next();
             View view = this.u.findViewById(livePlayerFl.getLayoutResId());
             if (livePlayerFl.shouldGoneWhenContainerHide() && (view != null && (!view.getVisibility() && Boolean.TRUE.equals(this.z.get(livePlayerFl))))) {
                view.setVisibility(8);
             }
          }
       }
       this.A.clear();
       return;
    }
    public boolean W8(long p0){
       boolean b1;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, f.class, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       Object obj1 = PatchProxy.apply(null, this, f.class, "8");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): this.q.N().r2(AudienceBizRelation.VOICE_PARTY);
       if (b) {
          return false;
       }else if(!this.q.x.H2()){
          obj1 = PatchProxy.apply(null, this, f.class, "16");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             iterator = this.z.keySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (Boolean.TRUE.equals(this.z.get(iterator.next()))) {
                      b1 = true;
                   }
                }else {
                   b1 = false;
                }
             }
          }
          if (b1) {
             a0 n1 = this.q.n1;
             if (n1 != null && n1.a()) {
                return false;
             }else {
                iterator = this.C.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(false);
                }
                this.u.removeCallbacks(this.E);
                this.u.postDelayed(this.E, p0);
                if (this.x.getVisibility()) {
                   this.x.setVisibility(false);
                   if (!PatchProxy.applyVoid(null, this, f.class, "11")) {
                      this.P8();
                      this.G = false;
                      ObjectAnimator objectAnimat = j.a(this.x, new float[2]{0,0x3f800000});
                      this.F = objectAnimat;
                      objectAnimat.setDuration(200);
                      this.F.addListener(new d(this));
                      this.F.setInterpolator(new LinearInterpolator());
                      this.F.start();
                   }
                   this.Y8();
                }
                return true;
             }
          }
       }
       return false;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.u.setTranslationX(0);
       this.u.getLayoutParams().height = this.t.getHeight();
       this.u.setTranslationY(this.t.getY());
       return;
    }
    public void Y8(){
       f obj;
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       float videoSizeRat = this.q.F2.getVideoSizeRatio();
       Iterator iterator = this.z.keySet().iterator();
       while (iterator.hasNext()) {
          LivePlayerFloatItem livePlayerFl = iterator.next();
          View view = this.u.findViewById(livePlayerFl.getLayoutResId());
          if (view != null) {
             if (Boolean.TRUE.equals(this.z.get(livePlayerFl)) && (videoSizeRat - 0x3f800000 > 0 || livePlayerFl.showInVerticalVideo())) {
                int i = 0;
                view.setVisibility(i);
                if (!this.A.contains(livePlayerFl) && (!PatchProxy.applyVoidOneRefs(livePlayerFl, this, f.class, "18") && this.p.k())) {
                   this.A.add(livePlayerFl);
                   int i1 = f$a.a[livePlayerFl.ordinal()];
                   PatchProxyResult patchProxyRe = 2;
                   if (i1 != 1) {
                      if (i1 == patchProxyRe) {
                         obj = this.q;
                         obj.B.onFloatFullScreenShow(obj.c);
                         obj = this.q;
                         obj.B.onFloatFullScreenButtonShow(true, obj.Z2.a());
                      }
                   }else if(PatchProxy.applyVoid(null, this, f.class, "20")){
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "SHOW_LIVE_DEFINITION";
                      StringBuilder str = "{\"is_vertical\":";
                      if (!this.q.x.H2()) {
                         patchProxyRe = 1;
                      }
                      uElementPack.params = str+patchProxyRe+"}";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = this.q.Z2.a();
                      u1.u0(6, uElementPack, uContentPack);
                   }
                   this.D.add(livePlayerFl);
                }
             label_00e9 :
                obj = PatchProxy.applyOneRefs(livePlayerFl, this, f.class, "7");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else if(livePlayerFl == LivePlayerFloatItem.ACTIVE_ORIENTATION && this.q.c.isGRPRCustomizedLive()){
                   i = true;
                }
                if (i) {
                   this.x.h(view);
                }
             }else {
                view.setVisibility(8);
                this.A.remove(livePlayerFl);
                this.x.q(view);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.live_player_float_element_container);
       this.u = viewGroup;
       this.w = m1.f(viewGroup, 0x7f0a04e8);
       this.v = m1.f(p0, 0x7f0a232a);
       this.x = m1.f(p0, 0x7f0a232c);
       this.t = m1.f(p0, 0x7f0a30e6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.q8(c.class);
       this.s = this.r8("LIVE_AUDIENCE_PLAY_VIEW_LAYOUT_SERVICE");
       return;
    }
}
