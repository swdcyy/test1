package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import zr6.e;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$a;
import nsd.u;
import crd.a;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$b;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wq6.h;
import wq6.f;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.lang.Boolean;
import tra.a;
import zq6.r;
import bo5.a;
import wq6.g;
import zq6.p;
import fr6.b;
import fr6.j;
import fr6.g;
import o56.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ura.c;
import erd.g;
import crd.b;
import lnc.b9;
import kotlin.jvm.internal.Ref$ObjectRef;
import tkd.b;
import tkd.d;
import hn5.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble;
import ura.p;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3;
import co5.g;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import co5.k;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import co5.b;
import android.content.Context;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import zq6.b;
import gsa.e0;

public final class BlockTabLifecycleAwareness extends e	// class@001645
{
    public boolean e;
    public g f;
    public final a g;
    public final BlockTabLifecycleAwareness$b h;
    public final BlockTabLifecycleAwareness$c i;
    public static final BlockTabLifecycleAwareness$a j;

    static {
       BlockTabLifecycleAwareness.j = new BlockTabLifecycleAwareness$a(null);
    }
    public void BlockTabLifecycleAwareness(){
       super();
       this.g = new a();
       this.h = new BlockTabLifecycleAwareness$b(this);
       this.i = new BlockTabLifecycleAwareness$c(this);
    }
    public void f(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockTabLifecycleAwareness.class, "4")) {
          return;
       }
       a.p(p0, "fragment");
       return;
    }
    public void g(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockTabLifecycleAwareness.class, "5")) {
          return;
       }
       a.p(p0, "fragment");
       return;
    }
    public void h(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockTabLifecycleAwareness.class, "1")) {
       }else {
          a.p(p0, "tab");
          if (!a.g(p0.M2(), b.F)) {
             if (a.g(p0.M2(), b.G)) {
                Boolean uBoolean = a.f();
                a.o(uBoolean, "DefaultPreferenceHelper.getXBlockUserChangedTab\(\)");
                if (uBoolean.booleanValue()) {
                label_003a :
                   p s = a.s;
                   a.o(s, "HomeTopStateId.TAB_TEXT");
                   this.c().a(s, p0.j().q("KEY_TAB_NAME_DEST"));
                }
             }
          }else {
             goto label_003a ;
          }
          this.p(p0);
          p0.b0().d(this.h);
          p0.b0().f(this.i);
          if (d.g) {
             this.g.c(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new c(this)));
          }else {
             this.o();
          }
       }
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockTabLifecycleAwareness.class, "3")) {
       }else {
          a.p(p0, "tab");
          p0.b0().l(this.h);
          p0.b0().n(this.i);
          b9.a(this.g);
       }
       return;
    }
    public final void o(){
       h oh;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BlockTabLifecycleAwareness.class, "6")) {
          return;
       }
       f uof = this.d();
       TabIdentifier tabIdentifie = (uof != null)? uof.M2(): objArray;
       int i = 1;
       if (a.g(tabIdentifie, b.G) ^ i) {
          return;
       }else if(this.e != null){
          return;
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = objArray;
          GifshowActivity gifshowActiv = d.a(-1883158055).gB();
          if (gifshowActiv != null) {
             String str = "BlockLifecycle";
             if (gifshowActiv.isFinishing() || gifshowActiv.isDestroyed()) {
                Log.b(str, "activity isFinishing or isDestroyed, can\'t show x block tab bubble");
             }else {
                XBlockBubbleConfig$XBlockBubble xBlockBubble = XBlockBubbleConfig$XBlockBubble.class;
                String str1 = "";
                String str2 = p.a.getString("topXTabNavBubbleConfig", str1);
                Object[] objArray1 = (str2 == null || str2 == str1)? objArray: b.a(str2, xBlockBubble);
                int i1 = 0;
                int intx = a.a.getInt("x_block_bubble_shown_version", i1);
                if (objArray1 == null) {
                   Log.b(str, "bubble config is null");
                }else if(objArray1.mVersion == intx){
                   Log.b(str, "bubble shown. version: "+objArray1.mVersion);
                }else if(!TextUtils.x(objArray1.mSubTabId)){
                   f uof1 = this.d();
                   if (uof1 != null) {
                      XBlockBubbleConfig$XBlockBubble mSubTabId = objArray1.mSubTabId;
                      a.o(mSubTabId, "bubbleConfig.mSubTabId");
                      oh = uof1.I(mSubTabId);
                   }else {
                      oh = objArray;
                   }
                   if (oh == null) {
                      Log.b(str, "childTab "+objArray1.mSubTabId+" is null");
                   }
                }
                Log.b(str, "show bubble");
                a uoa = new a(gifshowActiv);
                uoa.I0(objArray1.mId);
                uoa.K0(KwaiBubbleOption.f);
                uoa.C0((- a1.d(R.dimen.arg_RES_7f070283)));
                uoa.P(i);
                uoa.T(3000);
                uoa.K(new BlockTabLifecycleAwareness$d(objArray1, this, objectRef));
                uoa.M(new BlockTabLifecycleAwareness$e(objArray1, this, objectRef));
                uoa.F0(objArray1.mContent);
                uoa.D0(BubbleInterface$Position.BOTTOM);
                xBlockBubble = objArray1.mId;
                BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3 oshowBubbleI = new BlockTabLifecycleAwareness$showBubbleIfNeed$$inlined$apply$lambda$3(uoa, this, objectRef);
                g og = g.class;
                if (PatchProxy.isSupport(og)) {
                   Object[] objArray2 = new Object[]{uoa,"TopXBlock",Integer.valueOf(xBlockBubble),Integer.valueOf(i),oshowBubbleI};
                   og = PatchProxy.apply(objArray2, objArray, og, "7");
                   if (og != PatchProxyResult.class) {
                   label_0161 :
                      this.f = og;
                      p w = a.w;
                      a.o(w, "HomeTopStateId.TAB_BUBBLE");
                      BlockTabLifecycleAwareness tf = this.f;
                      a.m(tf);
                      this.c().a(w, tf);
                   }
                }
                og = new g(i, uoa);
                og.c = "TopXBlock";
                og.d = xBlockBubble;
                og.l = i;
                og.k = oshowBubbleI;
                goto label_0161 ;
             }
          }
          return;
       }
    }
    public final void p(f p0){
       p m;
       p c;
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockTabLifecycleAwareness.class, "2")) {
          return;
       }
       h oh = p0.j();
       Log.g("BlockLifecycle", "updateParentTab "+oh);
       if (!a.f().booleanValue() && (a.g(oh.M2().getType(), "ato_operate") ^ 0x01)) {
          return;
       }
       String str = "KEY_TAB_ACTION_SKIN";
       ActionBarSkinConfig uActionBarSk = oh.F(str);
       if (uActionBarSk == null) {
          p0.e().f(str);
       }else {
          p0.e().r(str, uActionBarSk);
       }
       TabViewInfo tabViewInfo = oh.F("KEY_TAB_VIEW_INFO");
       TabViewInfo tabViewInfo1 = null;
       TabViewInfo mTabIcon = (tabViewInfo != null)? tabViewInfo.mTabIcon: tabViewInfo1;
       String str1 = "HomeTopStateId.TAB_IMAGE_TITLE";
       if (mTabIcon != null) {
          m = a.M;
          a.o(m, str1);
          this.c().a(m, k.b(tabViewInfo.mTabIcon, tabViewInfo.mXTabIcon));
       }else {
          m = a.M;
          a.o(m, str1);
          this.c().a(m, k.a());
       }
       if (tabViewInfo != null) {
          tabViewInfo1 = tabViewInfo.mTabLottie;
       }
       String str2 = "HomeTopStateId.TAB_COMMON_LOTTIE";
       if (tabViewInfo1 != null) {
          p n = a.N;
          a.o(n, str2);
          this.c().a(n, b.b(tabViewInfo.mTabLottie));
       }else {
          c = a.N;
          a.o(c, str2);
          this.c().a(c, b.a());
       }
       c = a.C;
       a.o(c, "HomeTopStateId.TAB_TRIANGLE_COLOR");
       this.c().a(c, Integer.valueOf(HomeActionBarSkinHelper.l(p0.j(), this.b())));
       p e = a.e;
       a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
       e0 uoe0 = p0.y().e(oh, e);
       if (uoe0 != null) {
          a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
          this.c().a(e, uoe0);
       }
       return;
    }
}
