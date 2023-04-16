package fq1.a;
import p91.m;
import android.view.View;
import android.view.ViewGroup;
import dq5.b;
import g81.c;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import i81.g;
import java.lang.Class;
import lp3.c;
import le1.a;
import fq1.e;
import com.kwai.robust.PatchProxy;
import yp1.c;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import java.lang.Boolean;
import i81.f;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import i81.f$a$b;
import i81.f$a;
import fq1.a$a;
import java.lang.Runnable;
import java.util.Map;
import android.graphics.Rect;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fe3.a;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.basic.playview.LivePlayViewHelper;
import rkd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import lnc.a1;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import java.lang.Enum;
import com.kuaishou.live.comments.view.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;

public final class a	// class@00237f
{
    public final g a;
    public final a b;
    public int c;
    public final m d;
    public final View e;
    public final ViewGroup f;
    public final b g;
    public final c h;
    public final l i;

    public void a(m p0,View p1,ViewGroup p2,b p3,c p4,l p5){
       a.p(p0, "context");
       a.p(p1, "fragmentRootView");
       a.p(p2, "renderArea");
       a.p(p3, "commentsBizService");
       a.p(p4, "commentService");
       a.p(p5, "resetFocusArea");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = this.b(g.class);
       this.b = this.b(a.class);
    }
    public final void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 == null) {
          this.e();
       }else if(p0.a() == 1){
          this.c(true);
          this.d(p0.b);
       }else if(p0.a() == 2){
          this.d(null);
          this.c(false);
       }else {
          this.e();
       }
       return;
    }
    public final c b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = this.d.t5().a(p0);
       a.o(uoc, "context.liveServiceManager.getService\(clazz\)");
       return uoc;
    }
    public final void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       f uof = this.a.nc();
       b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "notifyCenterWindow", "manager", uof);
       if (uof != null) {
          if (p0) {
             this.i.invoke(this.a);
          }else {
             uof.b(new f$a$b(this.f));
          }
       }else {
          this.f.post(new a$a(this, p0));
       }
       return;
    }
    public final void d(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       FragmentActivity uFragmentAct = null;
       Map map = (p0 != null)? p0.b(): uFragmentAct;
       Rect rect = PatchProxy.applyOneRefs(map, this, uoa, "7");
       int i = 0;
       if (rect != patchProxyRe) {
       }else {
          String str = this.d.d();
          Rect rect1 = new Rect(i, i, i, i);
          if (map != null) {
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                int i4 = a.g(uEntry.getKey(), str) ^ 0x01;
                if (i4 && uEntry.getValue().width() > rect1.width()) {
                   rect1 = uEntry.getValue();
                }
             }
          }
          rect = rect1;
       }
       int i1 = (p0 != null)? p0.a().d() - rect.right: 0;
       int i2 = rect.width() + i1;
       if (p0 != null) {
          a uoa1 = p0.a();
          if (uoa1 != null) {
             int i3 = uoa1.d();
             if (PatchProxy.isSupport(uoa)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i3), this, uoa, "5");
                if (obj != patchProxyRe) {
                   i = obj.intValue();
                }else if(this.d.e() || !LivePlayViewHelper.c.b()){
                   if (b.g()) {
                      b = b.e();
                   }else {
                      BaseFragment uBaseFragmen = this.d.b();
                      if (uBaseFragmen != null) {
                         uFragmentAct = uBaseFragmen.getActivity();
                      }
                      b = n.I(uFragmentAct);
                   }
                   if (!b) {
                      i = Math.max(((this.e.getWidth() - i3) / 2), i);
                   }
                }
             }else {
                goto label_00a2 ;
             }
             i2 = i2 + i;
          }
       }
       if (i2 > 0) {
          i2 = i2 + a1.e(10.00f);
       }
       this.h.K0(LayoutParamsType.RIGHT_MARGIN, LiveCommentsBiz.CHAT.ordinal(), i2);
       LiveBulletinLayoutManager liveBulletin = this.a.i7();
       if (liveBulletin != null) {
          if (i2 > 0) {
             liveBulletin.h(LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT, i2);
          }else {
             liveBulletin.k(LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT);
          }
       }
       b.e0(LiveCommonLogTag.NEW_MULTI_CHAT, "notifySideWindow", "rect", rect, "space", Integer.valueOf(i2), "rightMargin", Integer.valueOf(i1));
       this.b.Xm(rect.width(), rect.height(), i1);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.c(true);
       this.d(null);
       return;
    }
}
