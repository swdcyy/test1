package nn2.v1;
import nn2.v1$a;
import nsd.u;
import lnc.a1;
import android.view.View;
import ks5.c;
import ab1.g;
import qy1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import nn2.v1$b;
import nn2.v1$c;
import crd.a;
import android.content.Context;
import nn2.j0;
import nn2.t1;
import ab1.g$a;
import nn2.a;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import android.app.Activity;
import e3a.a;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import java.util.List;
import trd.t;
import com.kuaishou.live.core.show.wishlist.LiveWishListPendentBaseController$setupTurboModeLogic$1;
import msd.l;
import crd.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import d61.y;
import yn2.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.wishlist.model.LiveWishInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import xn2.a;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import nn2.b;
import nn2.k0;
import nn2.u1;
import nn2.w1;
import android.view.View$OnClickListener;
import java.util.HashSet;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.CharSequence;
import e17.i;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.wishlist.detail.widget.LiveWishListDetailFragmentV2;
import p91.m;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import xp5.a;
import u53.b;

public abstract class v1	// class@003993
{
    public m a;
    public boolean b;
    public WeakReference c;
    public LiveWishListDetailFragmentV2 d;
    public LiveStreamMessages$SCWishListOpened e;
    public ViewGroup f;
    public ViewFlipper g;
    public final List h;
    public final Runnable i;
    public HashSet j;
    public boolean k;
    public int l;
    public a m;
    public a n;
    public boolean o;
    public boolean p;
    public final g$a q;
    public Context r;
    public final a s;
    public final a t;
    public static final int u;
    public static final v1$a v;

    static {
       null.v = new v1$a(null);
       null.u = a1.d(0x7f070319);
    }
    public void v1(View p0,c p1,g p2,a p3,boolean p4,boolean p5,boolean p6){
       a.p(p0, "viewRoot");
       super();
       this.t = p3;
       this.b = p4;
       this.h = new ArrayList();
       this.i = new v1$b(this);
       this.k = true;
       this.o = p6;
       v1$c uoc = new v1$c(this);
       this.q = uoc;
       a uoa = new a();
       this.s = uoa;
       Context context = p0.getContext();
       a.o(context, "viewRoot.context");
       this.r = context;
       v1 tb = this.b;
       j0 oj0 = (tb != null)? new j0(p0, p2): new t1(p0, p1, p5);
       this.m = oj0;
       oj0.b(uoc);
       v1 tm = this.m;
       Object[] objArray = null;
       ViewGroup viewGroup = (tm != null)? tm.H(): objArray;
       this.f = viewGroup;
       tm = this.m;
       ViewFlipper viewFlipper = (tm != null)? tm.c(): objArray;
       this.g = viewFlipper;
       a.m(viewFlipper);
       if (!PatchProxy.applyVoidOneRefs(viewFlipper, this, v1.class, "18")) {
          long l = 500;
          tb = 3000;
          int i = a1.d(R.dimen.arg_RES_7f07030d);
          TranslateAnimation translateAni = new TranslateAnimation(0, 0, (float)i, 0);
          translateAni.setDuration(l);
          TranslateAnimation translateAni1 = new TranslateAnimation(0, 0, 0, (float)(- i));
          translateAni1.setDuration(l);
          viewFlipper.setInAnimation(translateAni);
          viewFlipper.setOutAnimation(translateAni1);
          viewFlipper.setFlipInterval(tb);
       }
       this.c = new WeakReference(a.a(p0));
       if (!PatchProxy.applyVoid(objArray, this, v1.class, "2")) {
          OptimizedElement wISH_LIST = OptimizedElement.WISH_LIST;
          List list = t.k(this.g);
          LiveWishListPendentBaseController$setupTurboModeLogic$1 osetupTurboM = new LiveWishListPendentBaseController$setupTurboModeLogic$1(this);
          a.p(uoa, "disposables");
          a.p(wISH_LIST, "element");
          a.p(list, "viewList");
          a.p(osetupTurboM, "action");
          b uob = new TurboModeViewHandler(p3, wISH_LIST, list, osetupTurboM).a();
          if (uob != null) {
             uoa.c(uob);
          }
       }
       return;
    }
    public void v1(View p0,c p1,g p2,a p3,boolean p4,boolean p5,boolean p6,int p7,u p8){
       boolean b = (p7 & 0x20)? false: p5;
       super(p0, p1, p2, null, p4, b, p6);
       return;
    }
    public final void A(LiveStreamMessages$SCWishListClosed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v1.class, "5")) {
          return;
       }
       a.p(p0, "msg");
       this.p = false;
       this.u();
       return;
    }
    public void B(LiveStreamMessages$SCWishListOpened p0){
       LiveStreamMessages$SCWishListOpened wishEntry;
       String str;
       int len;
       int i1;
       object oobject;
       v1 g;
       LiveStreamMessages$SCWishListOpened sCWishListOp = this;
       Object obj = p0;
       v1 ov1 = v1.class;
       if (PatchProxy.applyVoidOneRefs(obj, sCWishListOp, ov1, "4")) {
          return;
       }
       a.p(obj, "msg");
       if (y.d(sCWishListOp.c.get())) {
          this.v();
          return;
       }else if(!this.z()){
          this.t();
          return;
       }else {
          int i = 0;
          if (!PatchProxy.applyVoidOneRefs(obj, sCWishListOp, ov1, "9")) {
             LiveStreamMessages$SCWishListOpened wishEntry1 = obj.wishEntry;
             a.o(wishEntry1, "wishListOpenedMessage.wishEntry");
             str = (!wishEntry1.length)? 1: null;
             if (!str) {
                v1 n = sCWishListOp.n;
                if (n != null) {
                   b uob = PatchProxy.applyOneRefs(obj, null, b.class, "1");
                   if (uob != PatchProxyResult.class) {
                   }else {
                      LiveStreamMessages$SCWishListOpened wishEntry2 = obj.wishEntry;
                      if (wishEntry2 == null || !wishEntry2.length) {
                         uob = b.b;
                      }else {
                         uob = new b();
                         uob.a = new ArrayList();
                         i1 = 0;
                         LiveStreamMessages$SCWishListOpened wishEntry3 = obj.wishEntry;
                         while (i1 < wishEntry3.length) {
                            oobject = wishEntry3[i1];
                            LiveWishInfo liveWishInfo = new LiveWishInfo();
                            liveWishInfo.mWishId = oobject.wishId;
                            liveWishInfo.mGiftId = oobject.giftId;
                            liveWishInfo.mCurrentCount = (int)oobject.currentCount;
                            liveWishInfo.mDisplayCurrentCount = oobject.displayCurrentCount;
                            liveWishInfo.mDisplayExpectCount = oobject.displayExpectCount;
                            liveWishInfo.mExpectCount = (int)oobject.expectCount;
                            uob.a.add(liveWishInfo);
                            i1 = i1 + 1;
                         }
                      }
                   }
                   n.a(uob);
                }
                sCWishListOp.e = obj;
                int len2 = obj.wishEntry.length;
                if (!PatchProxy.isSupport(ov1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(len2), sCWishListOp, ov1, "7")) {
                   len = sCWishListOp.h.size();
                   LiveLogTag lIVE_WISH_PE = LiveLogTag.LIVE_WISH_PENDANT;
                   lIVE_WISH_PE.appendTag("LiveWishListPendentBaseController");
                   LiveLogTag liveLogTag = lIVE_WISH_PE;
                   b.U(liveLogTag, "[updateLiveWishListPendantViewFlipper]", "receive wish count", Integer.valueOf(len2), "current wish count", Integer.valueOf(len), "mLiveWishListPendantViewFlipper", sCWishListOp.g);
                   if (len > len2) {
                      len = len - len2;
                      Iterator iterator = sCWishListOp.h.iterator();
                      i1 = 0;
                      while (i1 < len) {
                         g = sCWishListOp.g;
                         if (g != null) {
                            g.removeView(iterator.next().a());
                            iterator.remove();
                         }
                         i1 = i1 + 1;
                      }
                   }else if(len < len2){
                      len2 = len2 - len;
                      len = 0;
                      while (len < len2) {
                         k0 ok0 = (sCWishListOp.b != null)? new k0(sCWishListOp.r, this.h()): new u1(sCWishListOp.r, this.h());
                         g = sCWishListOp.g;
                         if (g != null) {
                            g.addView(ok0.a());
                            sCWishListOp.h.add(ok0);
                         }
                         len = len + 1;
                      }
                      n = sCWishListOp.g;
                      if (n != null) {
                         n.setOnClickListener(new w1(sCWishListOp));
                      }
                   }
                }
                this.J(p0);
                this.H();
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, sCWishListOp, ov1, "17")) {
             wishEntry = obj.wishEntry;
             if (wishEntry != null) {
                str = "msg.wishEntry";
                a.o(wishEntry, str);
                ov1 = (!wishEntry.length)? 1: null;
                if (!ov1) {
                   if (sCWishListOp.j == null) {
                      sCWishListOp.j = new HashSet();
                      wishEntry = obj.wishEntry;
                      len = wishEntry.length;
                      i1 = 0;
                      while (i1 < len) {
                         oobject = wishEntry[i1];
                         if (oobject.currentCount - oobject.expectCount >= 0) {
                            v1 j = sCWishListOp.j;
                            if (j != null) {
                               j.add(oobject.wishId);
                            }
                         }
                         i1 = i1 + 1;
                      }
                   }
                   wishEntry = obj.wishEntry;
                   a.o(wishEntry, str);
                   int len1 = wishEntry.length;
                   while (i < len1) {
                      object oobject1 = obj.wishEntry[i];
                      if (oobject1.currentCount - oobject1.expectCount >= 0) {
                         v1 j1 = sCWishListOp.j;
                         if (j1 != null && !j1.contains(oobject1.wishId)) {
                            if (sCWishListOp.a != null) {
                               if (!this.x()) {
                                  Gift gift = a.a(oobject1.giftId);
                                  if (gift != null) {
                                     gift = gift.mName;
                                     a.o(gift, "it.mName");
                                     i.f(R.style.arg_RES_7f110669, sCWishListOp.r(gift), true);
                                  }
                               }
                            }
                            j1 = sCWishListOp.j;
                            if (j1 != null) {
                               j1.add(oobject1.wishId);
                            }
                         }
                      }
                      i = i + 1;
                   }
                }
             }
          }
          return;
       }
    }
    public abstract void C();
    public final void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "19")) {
          return;
       }
       v1 td = this.d;
       if (td != null) {
          v1 ov1 = 1;
          if (td.isAdded() == ov1) {
             td = this.n;
             if (td != null) {
                ov1 = this.d;
                if (ov1 != null) {
                   ov1.Df(td);
                }
             }
          }
       }
       return;
    }
    public void E(boolean p0){
       this.k = p0;
    }
    public final void F(m p0){
       this.a = p0;
    }
    public final void G(LiveWishListDetailFragmentV2 p0){
       this.d = p0;
    }
    public void H(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "10")) {
          return;
       }
       v1 tm = this.m;
       if (tm != null && (!tm.f() && this.w())) {
          tm = this.g;
          if (tm != null) {
             a.m(tm);
             if (tm.getChildCount() > 0 && !y.d(this.c.get())) {
                if (this.x()) {
                   return;
                }else {
                   tm = this.f;
                   if (tm != null) {
                      v1 tm1 = this.m;
                      if (tm1 != null) {
                         tm1.d(tm);
                      }
                   }
                   this.f();
                }
             }
          }
       }
       this.g();
       return;
    }
    public void I(boolean p0){
       this.o = p0;
    }
    public void J(LiveStreamMessages$SCWishListOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v1.class, "8")) {
          return;
       }
       a.p(p0, "wishListOpenedMessage");
       LiveLogTag lIVE_WISH_PE = LiveLogTag.LIVE_WISH_PENDANT;
       lIVE_WISH_PE.appendTag("LiveWishListPendentBaseController");
       LiveLogTag liveLogTag = lIVE_WISH_PE;
       b.U(liveLogTag, "[updateLiveWishListPendantView]", "receive wish count", Integer.valueOf(p0.wishEntry.length), "mLiveWishPendantViewList size", Integer.valueOf(this.h.size()), "mLiveWishListPendantViewFlipper", this.g);
       int i = 0;
       LiveStreamMessages$SCWishListOpened wishEntry = p0.wishEntry;
       a.o(wishEntry, "wishListOpenedMessage.wishEntry");
       int len = wishEntry.length;
       while (true) {
          if (i >= len) {
             return;
          }
          if (i >= this.h.size()) {
             break ;
          }else {
             this.h.get(i).b(p0.wishEntry[i]);
             if (!this.h.get(i).c()) {
                this.l = i;
             }
             i = i + 1;
          }
       }
       return;
    }
    public void a(){
    }
    public abstract boolean b();
    public abstract void c(LiveStreamMessages$SCWishListOpened p0,int p1);
    public void d(){
       if (PatchProxy.applyVoid(null, this, v1.class, "3")) {
          return;
       }
       this.u();
       k1.m(this.i);
       v1 tj = this.j;
       if (tj != null) {
          tj.clear();
       }
       this.j = null;
       this.c.clear();
       tj = this.m;
       if (tj != null) {
          tj.b(null);
       }
       this.s.dispose();
       return;
    }
    public abstract void e();
    public abstract void f();
    public void g(){
       v1 tk;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "15")) {
          return;
       }
       v1 tg = this.g;
       if (tg != null) {
          if (tg.getVisibility()) {
             return;
          }else {
             boolean childCount = tg.getChildCount();
             int i = 1;
             if (childCount > i) {
                tk = this.k;
                if (tk != null) {
                   tk = this.m;
                   if (tk == null || tk.a() != i) {
                      childCount = tg.isFlipping();
                      if (childCount) {
                         return;
                      }else if(this.k != null && tg.getChildCount() > i){
                         tg.startFlipping();
                      }
                   }
                }
             }
             childCount = tg.isFlipping();
             if (childCount) {
                tg.stopFlipping();
             }
             tk = this.l;
             tk = (tk < tg.getChildCount())? this.l: 0;
             tg.setDisplayedChild(tk);
          }
       }
       return;
    }
    public int h(){
       int i = (this.b != null)? 0x7f0d0ce5: 0x7f0d0e91;
       return i;
    }
    public final WeakReference i(){
       return this.c;
    }
    public final boolean j(){
       return this.k;
    }
    public final int k(){
       return this.l;
    }
    public final m l(){
       return this.a;
    }
    public final ViewFlipper m(){
       return this.g;
    }
    public final ViewGroup n(){
       return this.f;
    }
    public final LiveWishListDetailFragmentV2 o(){
       return this.d;
    }
    public final LiveStreamMessages$SCWishListOpened p(){
       return this.e;
    }
    public final a q(){
       return this.m;
    }
    public abstract String r(String p0);
    public final a s(){
       return this.m;
    }
    public void t(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "13")) {
          return;
       }
       v1 tm = this.m;
       if (tm != null && !tm.f()) {
          return;
       }
       tm = this.f;
       if (tm != null) {
          this.a();
          objArray = this.m;
          if (objArray != null) {
             objArray.e(tm);
          }
       }
       tm = this.g;
       if (tm != null) {
          tm.stopFlipping();
       }
       this.k = true;
       this.e();
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, v1.class, "12")) {
          return;
       }
       this.t();
       v1 te = this.e;
       if (te != null) {
          te.clear();
       }
       this.e = null;
       this.h.clear();
       te = this.g;
       if (te != null) {
          te.removeAllViews();
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, v1.class, "14")) {
          return;
       }
       this.t();
       return;
    }
    public abstract boolean w();
    public final boolean x(){
       v1 obj = PatchProxy.apply(null, this, v1.class, "11");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = true;
       if (obj != null) {
          d uod = obj.A0();
          if (uod == null || uod.r2(AudienceBizRelation.VOICE_PARTY) != b) {
          label_0027 :
             obj = this.a;
             if (obj != null) {
                uod = obj.A0();
                if (uod != null && uod.r2(AnchorBizRelation.VOICE_PARTY) == b) {
                label_0039 :
                   if (this.o == null) {
                   label_003f :
                      return b;
                   }
                }
             }
          }else {
             goto label_0039 ;
          }
       }else {
          goto label_0027 ;
       }
       b = false;
       goto label_003f ;
    }
    public final boolean y(){
       v1 obj = PatchProxy.apply(null, this, v1.class, "16");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.k != null) {
          obj = this.m;
          if (obj == null || obj.a() != b) {
             b = false;
          }
       }
       return b;
    }
    public final boolean z(){
       a obj = PatchProxy.apply(null, this, v1.class, "6");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (y.d(this.c.get())) {
          return b;
       }
       obj = b.c(this.a);
       a.o(obj, "LiveGzoneStyleUtil.getGz¡­veType\(mLiveBasicContext\)");
       if (obj.d()) {
          return true;
       }
       v1 ta = this.a;
       if (ta != null) {
          d uod = ta.A0();
          if (uod != null && !uod.r2(AudienceBizRelation.GUEST_ACTIVITY)) {
             b = true;
          }
       }
       return b;
    }
}
