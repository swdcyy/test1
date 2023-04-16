package com.kuaishou.live.gzone.barrage.h;
import im8.g;
import k51.c;
import b53.h;
import b53.l;
import com.kuaishou.live.gzone.barrage.h$a;
import b53.g;
import b53.m;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b53.s;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import x61.c;
import androidx.lifecycle.MutableLiveData;
import z61.e;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.b;
import b53.k;
import b53.i;
import lp3.c;
import lp3.i;
import b53.j;
import com.kuaishou.live.gzone.barrage.BarrageView;
import z1.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import cw9.c;
import oq5.c;
import jv1.b;
import t02.a0;
import da1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import hf3.a;
import brd.t;
import ry1.b;
import com.kuaishou.live.gzone.barrage.g;
import erd.o;
import b53.n;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import android.widget.FrameLayout;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import va1.a0;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.live.gzone.barrage.BarrageView$d;
import jl5.f;
import z47.d;
import hf1.f;
import android.text.SpannableStringBuilder;
import java.lang.StringBuilder;
import jl5.c;
import java.lang.CharSequence;
import ak5.j;
import rnc.i;
import com.yxcorp.utility.TextUtils;
import android.text.style.CharacterStyle;
import q38.a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import com.kuaishou.live.gzone.barrage.BarrageView$f;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import com.kuaishou.live.gzone.barrage.BarrageView$h;
import android.os.SystemClock;
import z12.e;
import java.util.Collection;
import tkd.b;
import tkd.d;
import ym5.a;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import java.util.LinkedList;
import lnc.a1;
import android.text.TextPaint;
import java.util.Queue;
import android.util.SparseArray;
import com.kwai.library.widget.popup.common.c;
import pm8.a;
import android.content.SharedPreferences;
import gq5.f;
import com.kuaishou.live.gzone.barrage.i$c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ia2.a;
import com.kuaishou.live.gzone.barrage.i;
import android.view.View;
import ekd.m1;
import b53.f;
import android.view.View$OnClickListener;
import b53.r;
import java.util.Map;
import java.util.HashMap;
import i81.g;

public class h extends c implements g	// class@001c36
{
    public final a A;
    public final g B;
    public b C;
    public final View$OnLongClickListener D;
    public final c E;
    public d F;
    public s G;
    public c H;
    public boolean I;
    public Resources J;
    public int K;
    public int L;
    public int M;
    public a N;
    public boolean p;
    public BarrageView q;
    public boolean r;
    public a0 s;
    public b t;
    public i u;
    public g v;
    public MutableLiveData w;
    public e x;
    public MutableLiveData y;
    public e z;
    public static String sLivePresenterClassName = "LiveGzoneAudienceBarragePresenter";

    public void h(){
       super();
       this.A = new h(this);
       this.B = new l(this);
       this.C = new h$a(this);
       this.D = new g(this);
       this.E = new m(this);
       this.I = false;
    }
    public static JsonObject P8(h p0){
       Objects.requireNonNull(p0);
       JsonObject jsonObject = PatchProxy.apply(null, p0, h.class, "21");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          h g = p0.G;
          if (g != null) {
             jsonObject.H("status", Boolean.valueOf((g.c() ^ 0x01)));
             jsonObject.a0("barrage_type", Integer.valueOf(p0.G.b));
          }
       }
       return jsonObject;
    }
    public void E8(){
       c uoc = c.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "20")) {
          this.y = new MutableLiveData();
          e uoe1 = new e();
          this.z = uoe1;
          uoe1.mIconRes = 0x7f081121;
          uoe1.mFeatureId = 1005;
          uoe1.mIsVisible = Boolean.FALSE;
          uoe1.mClickCallback = new k(this);
          uoe1.mShowLogParamsSupplier = new i(this);
          uoe1.mClickLogParamsSupplier = new i(this);
          this.y.setValue(uoe1);
          this.u.a(uoc).v1(this.y);
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "19")) {
          this.w = new MutableLiveData();
          e uoe = new e();
          this.x = uoe;
          uoe.mIconRes = 0x7f081393;
          uoe.mTextRes = 0x7f101eae;
          uoe.mFeatureId = 1006;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mClickCallback = new j(this);
          this.w.setValue(uoe);
          this.u.a(uoc).v1(this.w);
       }
       this.G = new s(this.q, this.A);
       Resources resources = a.a().a().getResources();
       this.J = resources;
       this.K = resources.getColor(0x7f061fda);
       this.L = this.J.getColor(0x7f06203c);
       this.M = c.b(this.J, 0x7f070836);
       this.t.H6(this.E);
       this.S8(this.s.x.H2());
       this.N = a.b();
       this.s.C.u0(310, LiveStreamMessages$SCFeedPush.class, this.B);
       h ts = this.s;
       if (ts != null) {
          this.X7(ts.b3.T3().map(g.b).subscribe(new n(this)));
       }
       return;
    }
    public void J8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "6")) {
          return;
       }
       this.I = false;
       this.t.Q0(this.E);
       this.s.C.o(310, this.B);
       this.V8();
       if (!PatchProxy.applyVoid(objArray, this, oh, "22")) {
          this.u.a(c.class).O0(1006);
          this.u.a(c.class).O0(1005);
       }
       return;
    }
    public void R8(List p0){
       object oobject;
       Iterator iterator;
       h oh2;
       SpannableStringBuilder spannableStr;
       int i1;
       h q;
       BarrageView$d uod2;
       a uoa;
       d uod = this;
       Iterator obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(obj, uod, oh, "15")) {
          return;
       }
       if (uod.q.isShown() && obj != null) {
          String id = QCurrentUser.me().getId();
          int i = n.c(a.a().a(), 16.00f);
          ArrayList uArrayList = new ArrayList();
          obj = p0.iterator();
          while (obj.hasNext()) {
             QLiveMessage qLiveMessage = obj.next();
             if (a0.d(qLiveMessage)) {
                continue ;
             }else if(qLiveMessage instanceof CommentMessage){
                CommentMessage uCommentMess = qLiveMessage.cast();
                h p = uod.p;
                h j = uod.J;
                h k = uod.K;
                h l = uod.L;
                h m = uod.M;
                h oh1 = PatchProxy.applyOneRefs(uCommentMess, uod, oh, "16");
                if (oh1 != patchProxyRe) {
                }else if(uCommentMess.mEnableKwaiEmoji == null){
                   oobject = null;
                label_008e :
                   f uof = f.class;
                   if (PatchProxy.isSupport(uof)) {
                      Object[] objArray = new Object[]{Boolean.valueOf(p),j,uCommentMess,Integer.valueOf(i),Integer.valueOf(k),Integer.valueOf(l),Integer.valueOf(m),oobject};
                      iterator = obj;
                      oh2 = oh;
                      spannableStr = PatchProxy.apply(objArray, null, uof, "8");
                      if (spannableStr != patchProxyRe) {
                         i1 = 0;
                      label_0170 :
                         BarrageView$d uod1 = new BarrageView$d(spannableStr, i1);
                         if ((uCommentMess.getUser().mId).equals(id)) {
                            if (TextUtils.n(a0.b(), uCommentMess.mDeviceHash)) {
                            label_018b :
                               obj = iterator;
                               oh = oh2;
                            }else {
                               uod1.b = 0x7f08041e;
                               q = uod.q;
                               Objects.requireNonNull(q);
                               if (!PatchProxy.applyVoidOneRefs(uod1, q, BarrageView.class, "12")) {
                                  q.c.add(0, uod1);
                               }
                            }
                         }else {
                            uArrayList.add(uod1);
                         }
                         uod2 = uod1;
                      }
                   }else {
                      iterator = obj;
                      oh2 = oh;
                   }
                   String content = uCommentMess.getContent();
                   if (a0.g(uCommentMess) && p != null) {
                      content = content+"["+c.g(0x7f1037e8)+"]";
                   }
                   SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(content);
                   if (uCommentMess.mEnableKwaiEmoji != null) {
                      j.o().e(spannableStr1, 0, content.length(), (float)i, oobject);
                   }
                   i.j(spannableStr1);
                   if (!TextUtils.x(uCommentMess.mLandscapeFontColor)) {
                      k = TextUtils.J(uCommentMess.mLandscapeFontColor, k);
                   }
                   if (PatchProxy.isSupport(uof)) {
                      uoa = PatchProxy.applyFourRefs(j, Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(m), null, f.class, "9");
                      if (uoa != patchProxyRe) {
                      label_0165 :
                         i1 = 0;
                         spannableStr1.setSpan(uoa, i1, content.length(), 33);
                         spannableStr = spannableStr1;
                         goto label_0170 ;
                      }
                   }
                   uoa = new a(k, l, m);
                   goto label_0165 ;
                }else if(uod.F == null){
                   uod.F = new d();
                }
                uod.F.d(uCommentMess.mUnsupportedGzoneEmotions);
                oh1 = uod.F;
                oobject = oh1;
                goto label_008e ;
             }else {
                iterator = obj;
                oh2 = oh;
                oh = null;
                if (qLiveMessage instanceof ComboCommentMessage) {
                   uod2 = new BarrageView$f(qLiveMessage.cast(), 0);
                   uArrayList.add(uod2);
                }else {
                   int i2 = 0;
                   if (qLiveMessage instanceof LiveGzoneInteractiveCommentMessage) {
                      uod2 = new BarrageView$h(qLiveMessage.cast(), i2);
                      uod2.b = 0x7f081234;
                      uArrayList.add(uod2);
                   }else {
                      uod2 = oh;
                   }
                }
             }
             if (uod2 != null) {
                uod2.d = uod.D;
                goto label_018b ;
             }
          }
          if (!uArrayList.isEmpty()) {
             q = uod.q;
             Objects.requireNonNull(q);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, q, BarrageView.class, "11")) {
                int i3 = q.c.size();
                long l1 = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
                if (l1 - 10 > 0) {
                   String[] stringArray = new String[]{"cost",String.valueOf(l1),"queue size",String.valueOf(i3)};
                   e.c("BarrageView", "putBarrage", stringArray);
                }
                if (i3 <= 50) {
                   q.c.addAll(uArrayList);
                }
             }
          }
       }
       return;
    }
    public final void S8(boolean p0){
       h tq;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "5")) {
          return;
       }
       int i = 0;
       if (this.s.r == null && d.a(0x4c5dd1b8).f2()) {
          p0 = false;
       }
       if (this.r == null && p0) {
          if (this.I == null) {
             tq = this.q;
             Objects.requireNonNull(tq);
             if (!PatchProxy.applyVoid(null, tq, BarrageView.class, "9")) {
                tq.i = new FrameLayout$LayoutParams(-2, tq.q);
                BarrageView$e[] uoeArray = new BarrageView$e[15];
                tq.g = uoeArray;
                tq.d = new LinkedList();
                BarrageView$d[] uodArray = new BarrageView$d[15];
                tq.h = uodArray;
                tq.w.setTextSize((float)a1.e(tq.r));
                short[] oshortArray = new short[15];
                tq.m = oshortArray;
                for (; i < tq.k; i = i + 1) {
                   tq.d.offer(tq.b());
                }
                tq.e = new LinkedList();
                tq.f = new SparseArray();
             }
             this.I = true;
          }
          this.W8();
       }else {
          this.V8();
          tq = this.H;
          if (tq != null && tq.K()) {
             this.H.q(i);
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, h.class, "11")) {
          return;
       }
       this.q.f();
       this.Y8(false);
       return;
    }
    public void W8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "10")) {
          oh = this.G;
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoid(objArray, oh, s.class, "1")) {
             oh.b = a.C();
             oh.d(((float)a.a.getInt("live_barrage_setting_apha_model", 90) / 100.00f));
             oh.e(oh.b);
             oh.f(a.D());
          }
       }
       this.G.g();
       this.Y8(true);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       h ts = this.s;
       if (ts != null) {
          a0 g2 = ts.g2;
          if (g2 != null) {
             g2.p();
          }
       }
       i$c uoc = new i$c(this.getActivity());
       uoc.x(0);
       uoc.W(0);
       uoc.G = this.s.Z2.a();
       uoc.H = a.c();
       uoc.I = this.s.s;
       i oi = new i(uoc);
       this.H = oi;
       oi.q = this.G;
       if (this.s.l()) {
          oi.B = true;
       }
       oi.Z();
       return;
    }
    public void Y8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "12")) {
          return;
       }
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "13")) {
          this.Z8();
          oh = this.z;
          if (oh != null && this.y != null) {
             oh.mIsVisible = Boolean.valueOf(p0);
             this.y.setValue(this.z);
          }
          oh = this.x;
          if (oh != null && this.w != null) {
             oh.mIsVisible = Boolean.valueOf(p0);
             this.w.setValue(this.x);
          }
       }
    label_0055 :
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, h.class, "14")) {
          return;
       }
       h tG = this.G;
       if (tG != null && (this.z != null && this.y != null)) {
          h tz = this.z;
          int i = (tG.c())? 0x7f081122: 0x7f081121;
          tz.mIconRes = i;
          this.y.setValue(tz);
       }
    label_002e :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a03e8);
       m1.a(p0, new f(this), R.id.live_danmaku_btn);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new r());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.q8(a0.class);
       this.t = this.q8(b.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.u = oi;
       this.v = oi.a(g.class);
       return;
    }
}
