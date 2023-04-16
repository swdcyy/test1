package f83.c;
import lp1.b;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2;
import java.lang.Object;
import lp1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f83.e;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$DefaultImpls;
import f83.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.layoutmanager.StageType;
import vb3.m;
import android.view.ViewParent;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import kotlin.jvm.internal.a;
import fq1.e;
import java.lang.Integer;
import vb3.c;
import com.kuaishou.live.lite.sidebar.e;

public final class c implements b	// class@0028ee
{
    public final LiveLiteMultiChatPresenterV2 b;

    public void c(LiveLiteMultiChatPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void A5(){
       a.c(this);
    }
    public void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       LiveLiteMultiChatPresenterV2 v = this.b.v;
       if (v != null) {
          e uoe = e.class;
          if (!PatchProxy.applyVoid(objArray, v, uoe, "3")) {
             if (!PatchProxy.applyVoid(objArray, v, uoe, "5") && v.m == null) {
                FrameLayout uFrameLayout = new FrameLayout(v.D2());
                uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                uFrameLayout.setClickable(true);
                View view = v.P2();
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                view.addView(uFrameLayout);
                v.m = uFrameLayout;
             }
             e m = v.m;
             if (m != null) {
                LiveLiteGestureService$DefaultImpls.a(v.q, m, true, null, 4, null);
             }
          }
       }
       return;
    }
    public void I(){
       String str = "3";
       if (PatchProxy.applyVoid(null, this, c.class, str)) {
          return;
       }
       LiveLiteMultiChatPresenterV2 w = this.b.w;
       if (w != null && !PatchProxy.applyVoid(null, w, b.class, str)) {
          b.Z(LiveCommonLogTag.LITE_NEW_MULTI_CHAT, "exit");
          w.l.c(StageType.MultiChat);
       }
       w = this.b.v;
       if (w != null && !PatchProxy.applyVoid(null, w, e.class, "4")) {
          e l = w.l;
          if (l != null) {
             l.dispose();
          }
          l = w.m;
          if (l != null) {
             ViewParent parent = l.getParent();
             if (parent instanceof ViewGroup) {
                parent.removeView(l);
             }
          }
          w.m = null;
       }
       return;
    }
    public void J1(){
       a.a(this);
    }
    public void M(LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "renderLayoutConfig");
       return;
    }
    public void Y1(){
    }
    public void Y2(){
       a.d(this);
    }
    public void Z(e p0){
    }
    public void b2(){
       a.b(this);
    }
    public void c(){
    }
    public void z0(int p0){
       LiveLiteMultiChatPresenterV2 w;
       StageType multiChat;
       b uob = b.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (p0 == 1) {
          w = this.b.w;
          if (w != null && !PatchProxy.applyVoid(null, w, uob, "1")) {
             b.Z(LiveCommonLogTag.LITE_NEW_MULTI_CHAT, "enterSideLayout");
             multiChat = StageType.MultiChat;
             w.l.c(multiChat);
             w.l.d(multiChat, w.j);
          }
          if (!LiveLiteMultiChatPresenterV2.c9(this.b).j()) {
             LiveLiteMultiChatPresenterV2.c9(this.b).a();
          }
       }else if(p0 == 2){
          w = this.b.w;
          if (w != null && !PatchProxy.applyVoid(null, w, uob, "2")) {
             b.Z(LiveCommonLogTag.LITE_NEW_MULTI_CHAT, "enterCenterLayout");
             multiChat = StageType.MultiChat;
             w.l.c(multiChat);
             w.l.d(multiChat, w.k);
          }
       }
       return;
    }
}
