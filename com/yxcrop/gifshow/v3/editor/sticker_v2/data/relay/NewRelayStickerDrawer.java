package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import qmd.i$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$a;
import nsd.u;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import fmd.a;
import qmd.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qmd.b;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.widget.EditText;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Bitmap;
import zv9.a;
import faa.a;
import w46.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.io.File;
import com.yxcorp.gifshow.util.AdvEditUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.util.Collection;
import ekd.q;
import ekd.a0;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.content.Context;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData$a;
import android.view.ViewGroup$LayoutParams;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.graphics.Rect;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qmd.i$a$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerTitleUpdateAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.view.MotionEvent;
import k2b.e0;
import bmd.e;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;

public final class NewRelayStickerDrawer extends NewEditStickerBaseDrawer implements i$a	// class@000a7a
{
    public final a mController;
    public int mLastLoggedFriendCount;
    public String mLastLoggedTitle;
    public final NewRelayStickerDrawer$c mRelayStickerInfoChangedListener;
    public final i mRelayStickerViewHelper;
    public static final NewRelayStickerDrawer$a Companion;
    public static final int RELAY_STICKER_EDGE_DISTANCE_WITH_OUTBOX;
    public static final int RELAY_STICKER_FRIENDS_INVITING_HINT_HEIGHT;
    public static final int RELAY_STICKER_FRIENDS_INVITING_HINT_MARGIN;
    public static final int RELAY_STICKER_LAYOUT_HEIGHT_MAX;
    public static final int RELAY_STICKER_LAYOUT_ORIGIN_HEIGHT;
    public static final int RELAY_STICKER_LAYOUT_ORIGIN_WIDTH;
    public static final float RELAY_STICKER_MAX_SCALE_FACTOR;
    public static final float RELAY_STICKER_MIN_SCALE_FACTOR;

    static {
       NewRelayStickerDrawer.Companion = new NewRelayStickerDrawer$a(null);
       NewRelayStickerDrawer.RELAY_STICKER_LAYOUT_ORIGIN_WIDTH = a1.d(0x7f070e07);
       NewRelayStickerDrawer.RELAY_STICKER_LAYOUT_ORIGIN_HEIGHT = a1.d(0x7f070e06);
       NewRelayStickerDrawer.RELAY_STICKER_LAYOUT_HEIGHT_MAX = a1.d(0x7f070e05);
       NewRelayStickerDrawer.RELAY_STICKER_EDGE_DISTANCE_WITH_OUTBOX = a1.e(12.00f);
       NewRelayStickerDrawer.RELAY_STICKER_FRIENDS_INVITING_HINT_MARGIN = a1.e(11.00f);
       NewRelayStickerDrawer.RELAY_STICKER_FRIENDS_INVITING_HINT_HEIGHT = a1.d(0x7f070e08);
       NewRelayStickerDrawer.RELAY_STICKER_MAX_SCALE_FACTOR = 0x3f800000;
       NewRelayStickerDrawer.RELAY_STICKER_MIN_SCALE_FACTOR = 0x3f2b851f;
    }
    public void NewRelayStickerDrawer(NewRelayStickerDrawerData p0,a p1,i p2){
       a.p(p0, "drawerData");
       a.p(p1, "mController");
       a.p(p2, "mRelayStickerViewHelper");
       super(p0);
       this.mController = p1;
       this.mRelayStickerViewHelper = p2;
       this.mLastLoggedTitle = "";
       this.mLastLoggedFriendCount = -1;
       this.mRelayStickerInfoChangedListener = new NewRelayStickerDrawer$c(this);
       this.setNeedGenerateBitmap(true);
       this.mIsNeedReGenerateFile = true;
       if (p1.a()) {
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          BaseDrawerData$CustomButtonMode eDIT_TEXT = BaseDrawerData$CustomButtonMode.EDIT_TEXT;
          Objects.requireNonNull(tmBaseDrawer);
          if (!PatchProxy.applyVoidOneRefs(eDIT_TEXT, tmBaseDrawer, NewRelayStickerDrawerData.class, "1")) {
             a.p(eDIT_TEXT, "<set-?>");
             tmBaseDrawer.R = eDIT_TEXT;
          }
       }
       return;
    }
    public final boolean broughtFromFeed(){
       Object obj = PatchProxy.apply(null, this, NewRelayStickerDrawer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.Z;
    }
    public void enterEditingMode(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "19")) {
          return;
       }
       if (this.mBaseDrawerData.Y0()) {
          this.mRelayStickerViewHelper.k();
       }else {
          a a = this.mController.a;
          if (a != null) {
             a.a(this);
          }
       }
       return;
    }
    public void generateDecorationBitmap(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "9")) {
          return;
       }
       View view = this.mRelayStickerViewHelper.e();
       if (view != null) {
          VoteTextView voteTextView = this.mRelayStickerViewHelper.f();
          boolean b = false;
          boolean b1 = (voteTextView != null)? voteTextView.isCursorVisible(): false;
          VoteTextView voteTextView1 = this.mRelayStickerViewHelper.f();
          if (voteTextView1 != null) {
             voteTextView1.setCursorVisible(b);
          }
          this.mRelayStickerViewHelper.l(3);
          if (view.getWidth() > 0 && (view.getHeight() > 0 && this.mBaseDrawerData.A() - (float)b > 0)) {
             this.mDecorationBitmap = a.b(view, 0x3f800000, b);
          }else {
             Object[] objArray = new Object[b];
             a.D().t("NewRelayStickerDrawer", "generateDecorationBitmap: stickerView size invalid, cannot generate bitmap", objArray);
          }
          this.mRelayStickerViewHelper.l(1);
          if (b1) {
             VoteTextView voteTextView2 = this.mRelayStickerViewHelper.f();
             if (voteTextView2 != null) {
                voteTextView2.setCursorVisible(1);
             }
          }
       }
    label_0076 :
       return;
    }
    public String getElementOutputPath(){
       BaseDrawer obj = PatchProxy.apply(null, this, NewRelayStickerDrawer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData;
       a.o(obj, "mBaseDrawerData");
       String absolutePath = new File(AdvEditUtil.e(), this.mBaseDrawerData.i0()+this.mBaseDrawerData.l()+this.getElementPathIdentify(obj)+".png").getAbsolutePath();
       a.o(absolutePath, "File\(AdvEditUtil.getPost¡­\), fileName\).absolutePath");
       return absolutePath;
    }
    public String getElementPathIdentify(NewStickerElementData p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, NewRelayStickerDrawer.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "elementData");
       if (!p0 instanceof NewRelayStickerDrawerData) {
          return super.getElementPathIdentify(p0);
       }
       NewRelayStickerDrawerData newRelayStic = p0;
       obj = newRelayStic.W0()+newRelayStic.U0()+newRelayStic.V0().size();
       ArrayList uArrayList = newRelayStic.V0();
       String str = PatchProxy.applyOneRefs(uArrayList, this, NewRelayStickerDrawer.class, "7");
       String str1 = "";
       if (str != patchProxyRe) {
       }else {
          Iterator iterator = uArrayList.iterator();
          str = str1;
          while (iterator.hasNext()) {
             str = str+iterator.next().getId();
          }
       }
       obj = obj+str;
       List list = p0.A0();
       a.m(list);
       if (!q.f(list)) {
          a.m(list);
          obj = obj+list.get(0);
       }
       String str2 = a0.c(obj);
       if (str2 != null) {
          str1 = str2;
       }
       return str1;
    }
    public EditText getFocusEditText(){
       Object obj = PatchProxy.apply(null, this, NewRelayStickerDrawer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRelayStickerViewHelper.f();
    }
    public final a getMController(){
       return this.mController;
    }
    public View initView(DecorationContainerView p0){
       NewRelayStickerDrawer obj = PatchProxy.applyOneRefs(p0, this, NewRelayStickerDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.setContainerView(p0);
       obj = this.mController;
       NewRelayStickerDrawer tmRelayStick = this.mRelayStickerInfoChangedListener;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(tmRelayStick, obj, a.class, "2")) {
          a.p(tmRelayStick, "listener");
          obj.b = tmRelayStick;
       }
       Context context = p0.getContext();
       a.o(context, "decorationContainerView.context");
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       a.o(tmBaseDrawer, "mBaseDrawerData");
       View view = this.mRelayStickerViewHelper.h(context, NewRelayStickerDrawerData.V0.a(tmBaseDrawer, 1), this);
       this.mBaseDrawerData.P((float)view.getLayoutParams().width);
       tmRelayStick = this.mRelayStickerViewHelper;
       this.mBaseDrawerData.M((float)tmRelayStick.g(tmRelayStick.d(), false));
       this.setAlpha(this.mBaseDrawerData.e());
       return view;
    }
    public final void innerUpdateView(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("NewRelayStickerDrawer", "innerUpdateView invoked", objArray);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       a.o(tmBaseDrawer, "mBaseDrawerData");
       RelayStickerUIData relaySticker = NewRelayStickerDrawerData.V0.a(tmBaseDrawer, 1);
       this.mRelayStickerViewHelper.m(relaySticker, 0, 1, this.mController);
       k1.r(new NewRelayStickerDrawer$b(this), 0);
       return;
    }
    public boolean isInteractSticker(){
       return true;
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       int[] obj;
       if (PatchProxy.isSupport(NewRelayStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewRelayStickerDrawer.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getTextStickerAirWallLimits();
       boolean b = true;
       if (obj != null && obj.length == 4) {
          Rect contentRect = this.getContentRect();
          float f = (float)obj[0];
          float f1 = (float)(this.mEditRect.width() - obj[2]);
          Object[] objArray = new Object[0];
          a.D().s("NewRelayStickerDrawer", "limitDrawerAreaLeftRight motionEventX:"+p0+",wholeRect:"+contentRect+",mEditRect:"+this.mEditRect+"leftLimit:"+f+",rightLimit:"+f1, objArray);
          float f2 = (float)0;
          if (p0 - f2 >= 0 || (f - ((float)contentRect.left + p0) >= 0 && (p0 - f2 < 0 || ((float)contentRect.right + p0) - f1 >= 0))) {
             b = false;
          }
       }
       return b;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       int[] obj;
       if (PatchProxy.isSupport(NewRelayStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewRelayStickerDrawer.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getTextStickerAirWallLimits();
       boolean b = true;
       if (obj != null && obj.length == 4) {
          Rect contentRect = this.getContentRect();
          float f = (float)obj[b];
          float f1 = (float)(this.mEditRect.height() - obj[3]);
          Object[] objArray = new Object[0];
          a.D().s("NewRelayStickerDrawer", "limitDrawerAreaTopBottom motionEventY:"+p0+",wholeRect:"+contentRect+",mEditRect:"+this.mEditRect+",topLimit:"+f+",bottomLimit:"+f1, objArray);
          float f2 = (float)0;
          if (p0 - f2 >= 0 || (f - ((float)contentRect.top + p0) >= 0 && (p0 - f2 < 0 || ((float)contentRect.bottom + p0) - f1 >= 0))) {
             b = false;
          }
       }
       return b;
    }
    public float maxScaleFactor(){
       return NewRelayStickerDrawer.RELAY_STICKER_MAX_SCALE_FACTOR;
    }
    public float minScaleFactor(){
       return NewRelayStickerDrawer.RELAY_STICKER_MIN_SCALE_FACTOR;
    }
    public boolean needBlockedByAirWall(){
       return true;
    }
    public boolean needGenerateBitmap(NewStickerElementData p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, NewRelayStickerDrawer.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "elementData");
       if (!p0 instanceof NewRelayStickerDrawerData) {
          return super.needGenerateBitmap(p0);
       }
       boolean b = false;
       if (!super.needGenerateBitmap(p0) && TextUtils.n(p0.W0(), this.mBaseDrawerData.W0())) {
          ArrayList uArrayList = p0.V0();
          obj = this.mBaseDrawerData.V0();
          Object obj1 = PatchProxy.applyTwoRefs(uArrayList, obj, this, NewRelayStickerDrawer.class, "6");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(uArrayList.size() != obj.size()){
             Iterator iterator = obj.iterator();
             int i = 0;
             while (true) {
                if (iterator.hasNext()) {
                   obj1 = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   i = a.g(obj1.getId(), uArrayList.get(i).getId()) ^ 1;
                   if (!i) {
                      i = i1;
                   }
                }else {
                   b1 = true;
                }
             }
             return b;
          }
          b1 = false;
          if (b1) {
          }
       }
    label_0099 :
       b = true;
       goto label_009a ;
    }
    public void onCloseIconClicked(){
       PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "23");
    }
    public void onRenderComplete(){
       PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "24");
    }
    public void onStickerActionAreaClicked(){
       PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "22");
    }
    public void onStickerInfoAreaClicked(){
       PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "21");
    }
    public void onTitleTextChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawer.class, "2")) {
          return;
       }
       a.p(p0, "newText");
       i$a$a.a(this, p0);
       NewRelayStickerDrawer tmController = this.mController;
       Objects.requireNonNull(tmController);
       if (!PatchProxy.applyVoidOneRefs(p0, tmController, a.class, "3")) {
          a.p(p0, "title");
          tmController.c.t0(new RelayStickerTitleUpdateAction(p0, tmController.c()));
       }
       this.mBaseDrawerData.h1(p0);
       this.innerUpdateView();
       return;
    }
    public void remove(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(NewRelayStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, NewRelayStickerDrawer.class, "12")) {
          return;
       }
       super.remove(p0, p1);
       this.mRelayStickerViewHelper.b();
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "13")) {
          return;
       }
       super.select();
       this.mBaseDrawerData.L(0x3f733333);
       this.mRelayStickerViewHelper.a(true);
       return;
    }
    public void selectedTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawer.class, "15")) {
          return;
       }
       super.selectedTap(p0);
       this.enterEditingMode();
       return;
    }
    public final void tryLogStickerInfoUpdate(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "4")) {
          return;
       }
       String str = this.mBaseDrawerData.W0();
       int i = this.mBaseDrawerData.S0();
       if (this.getContainerView().getContext() instanceof e0 && (!TextUtils.x(str) && (!TextUtils.n(str, this.mLastLoggedTitle) || (i > 0 && i != this.mLastLoggedFriendCount)))) {
          e a = e.a;
          Context context = this.getContainerView().getContext();
          Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          Context uContext = context;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(uContext, str, Integer.valueOf(i), a, e.class, "3")) {
             a.p(uContext, "iLogPage");
             a.p(str, "title");
             i3 oi3 = i3.f();
             oi3.d("text", str);
             oi3.c("invite_num", Integer.valueOf(i));
             String str1 = oi3.e();
             a.o(str1, "params");
             a.a(uContext, "START_SOLITAIRE_CHALLENGE", str1);
          }
          this.mLastLoggedTitle = str;
          this.mLastLoggedFriendCount = i;
       }
    label_0099 :
       return;
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer.class, "14")) {
          return;
       }
       super.unSelect();
       this.mRelayStickerViewHelper.b();
       this.mRelayStickerViewHelper.a(false);
       return;
    }
    public void updateElement(NewStickerElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawer.class, "3")) {
          return;
       }
       a.p(p0, "elementData");
       Object[] objArray = new Object[0];
       a.D().w("NewRelayStickerDrawer", "updateElement invoked", objArray);
       this.setNeedGenerateBitmap(this.needGenerateBitmap(p0));
       this.mBaseDrawerData.R0(p0);
       this.setAlpha(this.mBaseDrawerData.e());
       this.innerUpdateView();
       this.mIsNeedReGenerateFile = this.isNeedGenerateBitmap();
       return;
    }
}
