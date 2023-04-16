package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import ml8.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import umd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$c;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import faa.a;
import q87.c;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import java.util.ArrayList;
import ekd.m1;
import android.widget.FrameLayout;
import android.text.TextPaint;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Float;
import android.graphics.Bitmap;
import zv9.a;
import java.lang.Number;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.io.File;
import com.yxcorp.gifshow.util.AdvEditUtil;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.util.Collection;
import ekd.q;
import ekd.a0;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;
import android.view.ViewTreeObserver;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup;
import i2b.a;
import bvc.a;
import java.lang.Math;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.Layout;
import emd.f;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.Editable;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import emd.b;
import java.lang.Runnable;
import emd.c;
import emd.d;
import emd.e;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public class NewVoteStickerDrawer extends NewEditStickerBaseDrawer implements d	// class@000a6f
{
    public VoteTextView mFocusedView;
    public boolean mIsFirstTimeEdit;
    public b mOnStickerTextChangeListener;
    public VoteTextView mOptionsOneView;
    public VoteTextView mOptionsThreeView;
    public VoteTextView mOptionsTwoView;
    public FrameLayout mQuestionContainer;
    public int mQuestionLineSize;
    public VoteTextView mQuestionView;
    public final EditVoteStickerDrawer$b mQuestionViewLineSizeListener;
    public View mVoteViewContainer;
    public static final boolean $assertionsDisabled;
    public static final int MULTI_VOTE_QUESTION_VOTE_VIEW_ORIGIN_HEIGHT;
    public static final int MULTI_VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT;
    public static final int MULTI_VOTE_STICKER_LAYOUT_ORIGIN_WIDTH;
    public static final int QUESTION_VOTE_VIEW_ORIGIN_HEIGHT;
    public static final int VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT;
    public static final int VOTE_STICKER_LAYOUT_ORIGIN_WIDTH;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
       NewVoteStickerDrawer.QUESTION_VOTE_VIEW_ORIGIN_HEIGHT = a1.d(0x7f070d5d);
       NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH = a1.d(0x7f070c17);
       NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT = a1.d(0x7f070c16);
       NewVoteStickerDrawer.MULTI_VOTE_QUESTION_VOTE_VIEW_ORIGIN_HEIGHT = a1.d(0x7f070fd6);
       NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_WIDTH = a1.d(0x7f070fd5);
       NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT = a1.d(0x7f070fd4);
       NewVoteStickerDrawer.c = a1.d(0x7f070fcf);
       NewVoteStickerDrawer.d = a1.d(0x7f070fce);
       NewVoteStickerDrawer.e = a1.d(0x7f070fd3);
    }
    public void NewVoteStickerDrawer(NewVoteStickerDrawerData p0,b p1,float p2){
       super(p0);
       this.mQuestionLineSize = 1;
       this.mIsFirstTimeEdit = true;
       this.mQuestionViewLineSizeListener = new a(this);
       this.mOnStickerTextChangeListener = p1;
       this.setNeedGenerateBitmap(1);
       this.mIsNeedReGenerateFile = true;
    }
    public void addOptionTextChangeListener(VoteTextView p0,int p1){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewVoteStickerDrawer.class, "34")) {
          return;
       }
       int i = (this.mBaseDrawerData.W0())? 2: 1;
       p0.addTextChangedListener(new NewVoteStickerDrawer$c(this, p1, i));
       return;
    }
    public void addQuestionTextChangeListener(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "33")) {
          return;
       }
       int i = (this.mBaseDrawerData.W0())? 2: 1;
       this.mQuestionView.addTextChangedListener(new NewVoteStickerDrawer$b(this, i));
       return;
    }
    public boolean canRestore(NewEditStickerBaseDrawer p0){
       NewVoteStickerDrawer obj = PatchProxy.applyOneRefs(p0, this, NewVoteStickerDrawer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.n(this.mQuestionView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.V0()) && (TextUtils.n(this.mOptionsOneView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.S0()) && TextUtils.n(this.mOptionsTwoView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.U0()))) {
          obj = this.mOptionsThreeView;
          if (obj == null || TextUtils.n(obj.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.T0())) {
             return true;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EditVoteStickerDrawer", "canRestore question or options not the same", objArray);
       return 0;
    }
    public void clearAllFocus(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "8")) {
          return;
       }
       this.clearViewFocus(this.mQuestionView);
       this.clearViewFocus(this.mOptionsOneView);
       this.clearViewFocus(this.mOptionsTwoView);
       this.clearViewFocus(this.mOptionsThreeView);
       this.clearViewFocus(this.mQuestionContainer);
       this.mFocusedView = null;
       return;
    }
    public void clearFocusEditText(){
       this.mFocusedView = null;
    }
    public void clearViewFocus(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawer.class, "9")) {
          return;
       }
       if (p0 != null) {
          Activity uActivity = a.b(p0.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
          p0.setFocusable(false);
          p0.setFocusableInTouchMode(false);
          p0.clearFocus();
       }
       return;
    }
    public ArrayList constructOptionList(String p0,String p1,String p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewVoteStickerDrawer.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(p0);
       obj.add(p1);
       obj.add(p2);
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawer.class, "1")) {
          return;
       }
       this.mQuestionContainer = m1.f(p0, 0x7f0a33a4);
       this.mQuestionView = m1.f(p0, 0x7f0a33ad);
       this.mOptionsOneView = m1.f(p0, 0x7f0a2ef8);
       this.mOptionsTwoView = m1.f(p0, 0x7f0a2efb);
       if (this.mBaseDrawerData.W0()) {
          this.mOptionsThreeView = m1.f(p0, 0x7f0a2efd);
          this.mQuestionView.getPaint().setFakeBoldText(true);
          this.mOptionsOneView.getPaint().setFakeBoldText(true);
          this.mOptionsTwoView.getPaint().setFakeBoldText(true);
          this.mOptionsThreeView.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void generateDecorationBitmap(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "17")) {
          return;
       }
       this.generateDecorationBitmap(this.mBaseDrawerData.A());
       return;
    }
    public void generateDecorationBitmap(float p0){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewVoteStickerDrawer.class, "18")) {
          return;
       }
       boolean b = this.mQuestionView.isCursorVisible();
       boolean b1 = this.mOptionsOneView.isCursorVisible();
       boolean b2 = this.mOptionsTwoView.isCursorVisible();
       NewVoteStickerDrawer tmOptionsThr = this.mOptionsThreeView;
       tmOptionsThr = (tmOptionsThr != null && tmOptionsThr.isCursorVisible())? 1: 0;
       NewVoteStickerDrawer newVoteStick = (!this.mQuestionContainer.getVisibility())? 1: null;
       if (TextUtils.x(this.mBaseDrawerData.V0())) {
          this.mQuestionContainer.setVisibility(4);
       }
       this.hideTextCursors();
       this.k(true, true);
       this.mDecorationBitmap = a.b(this.mDecorationShowingView, 0x3f800000, false);
       this.k(true, false);
       if (newVoteStick) {
          this.mQuestionContainer.setVisibility(false);
       }
       if (b) {
          this.mQuestionView.setCursorVisible(true);
       }
       if (b1) {
          this.mOptionsOneView.setCursorVisible(true);
       }
       if (b2) {
          this.mOptionsTwoView.setCursorVisible(true);
       }
       if (tmOptionsThr) {
          NewVoteStickerDrawer tmOptionsThr1 = this.mOptionsThreeView;
          if (tmOptionsThr1 != null) {
             tmOptionsThr1.setCursorVisible(true);
          }
       }
       return;
    }
    public int getContentHeight(int p0){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NewVoteStickerDrawer.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int mULTI_VOTE_S = (this.mBaseDrawerData.W0())? NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT: NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT;
       int mULTI_VOTE_Q = (this.mBaseDrawerData.W0())? NewVoteStickerDrawer.MULTI_VOTE_QUESTION_VOTE_VIEW_ORIGIN_HEIGHT: NewVoteStickerDrawer.QUESTION_VOTE_VIEW_ORIGIN_HEIGHT;
       if (p0 != 1) {
          mULTI_VOTE_S = (mULTI_VOTE_S - mULTI_VOTE_Q) + this.mQuestionView.getTwoLineHeight();
       }
       return mULTI_VOTE_S;
    }
    public String getElementOutputPath(){
       Object obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(AdvEditUtil.e(), this.mBaseDrawerData.i0()+this.mBaseDrawerData.l()+this.getElementPathIdentify(this.mBaseDrawerData)+".png").getAbsolutePath();
    }
    public String getElementPathIdentify(NewStickerElementData p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, NewVoteStickerDrawer.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0 instanceof NewVoteStickerDrawerData) {
          return super.getElementPathIdentify(p0);
       }
       NewVoteStickerDrawerData newVoteStick = p0;
       obj = newVoteStick.V0()+newVoteStick.S0()+newVoteStick.U0();
       if (this.mBaseDrawerData.W0()) {
          obj = obj+newVoteStick.T0();
       }
       List list = p0.A0();
       if (!q.f(list)) {
          obj = obj+list.get(0);
       }
       return a0.c(obj);
    }
    public EditText getFocusEditText(){
       if (this.mFocusedView == null) {
          this.mFocusedView = this.mQuestionView;
       }
       return this.mFocusedView;
    }
    public Rect getOptionOneViewRect(){
       Rect obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getQuestionViewRect();
       Rect outBoxRect = this.getOutBoxRect();
       if (!this.mBaseDrawerData.W0()) {
          return new Rect(obj.left, obj.bottom, (outBoxRect.left + (obj.width() / 2)), outBoxRect.bottom);
       }
       Rect bottom = obj.bottom;
       int c = NewVoteStickerDrawer.c;
       int i = bottom + c;
       int i1 = bottom + c;
       return new Rect(obj.left, i, obj.right, (i1 + NewVoteStickerDrawer.e));
    }
    public Rect getOptionThreeViewRect(){
       Rect obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.mBaseDrawerData.W0()) {
          return new Rect(0, 0, 0, 0);
       }
       obj = this.getOptionTwoViewRect();
       obj.offset(0, (obj.height() + NewVoteStickerDrawer.d));
       return obj;
    }
    public Rect getOptionTwoViewRect(){
       Rect obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOptionOneViewRect();
       if (this.mBaseDrawerData.W0()) {
          obj.offset(0, (obj.height() + NewVoteStickerDrawer.d));
       }else {
          obj.offset((this.getOutBoxRect().width() / 2), 0);
       }
       return obj;
    }
    public String getQuestion(){
       Object obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.V0();
    }
    public EditVoteStickerDrawer$b getQuestionViewLineSizeListener(){
       return this.mQuestionViewLineSizeListener;
    }
    public Rect getQuestionViewRect(){
       Rect obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       float f = 0x3f800000;
       if (this.mBaseDrawerData.W0()) {
          int dECORATION_R = BaseDrawer.DECORATION_REMOVE_ICON_WIDTH;
          Rect top = obj.top;
          return new Rect((obj.left + (dECORATION_R / 2)), top, (obj.right - (dECORATION_R / 2)), (int)((float)top + ((((float)obj.height() * f) * (float)this.mQuestionView.getHeight()) / (float)this.mVoteViewContainer.getHeight())));
       }else {
          Rect top1 = obj.top;
          int dECORATION_R1 = BaseDrawer.DECORATION_REMOVE_ICON_WIDTH;
          int i = (dECORATION_R1 / 2) + top1;
          return new Rect(obj.left, i, obj.right, (int)((float)(top1 + (dECORATION_R1 / 2)) + ((((float)obj.height() * f) * (float)this.mQuestionView.getHeight()) / (float)this.mVoteViewContainer.getHeight())));
       }
    }
    public final int h(boolean p0,String p1,boolean p2){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, NewVoteStickerDrawer.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 && (this.mIsFirstTimeEdit != null && !p2)) {
          int i = (TextUtils.x(p1))? a1.a(R.color.arg_RES_7f0601c3): a1.a(R.color.arg_RES_7f061d4e);
          return i;
       }else {
          return a1.a(0x7f061d4e);
       }
    }
    public void hideTextCursors(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "36")) {
          return;
       }
       this.mQuestionView.setCursorVisible(false);
       this.mOptionsOneView.setCursorVisible(false);
       this.mOptionsTwoView.setCursorVisible(false);
       NewVoteStickerDrawer tmOptionsThr = this.mOptionsThreeView;
       if (tmOptionsThr != null) {
          tmOptionsThr.setCursorVisible(false);
       }
       return;
    }
    public final void i(VoteTextView p0,String p1,int p2){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NewVoteStickerDrawer.class, "31")) {
          return;
       }
       if (this.mBaseDrawerData.k0() && !TextUtils.x(p1)) {
          p0.getViewTreeObserver().addOnGlobalLayoutListener(new NewVoteStickerDrawer$a(this, p0, p1, p2));
       }else {
          this.addOptionTextChangeListener(p0, p2);
       }
       return;
    }
    public View initView(DecorationContainerView p0){
       int mULTI_VOTE_S;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, NewVoteStickerDrawer.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.containerView = p0;
       int i = (this.mBaseDrawerData.W0())? 0x7f0d07a6: 0x7f0d07a4;
       View view = a.c(p0.getContext(), i, null);
       this.mVoteViewContainer = view;
       view.setAlpha(this.mBaseDrawerData.e());
       this.doBindView(this.mVoteViewContainer);
       if (!PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "30")) {
          String str = this.mBaseDrawerData.V0();
          view = PatchProxy.applyOneRefs(str, this, NewVoteStickerDrawer.class, "32");
          if (view != patchProxyRe) {
             mULTI_VOTE_S = view.intValue();
          }else if(TextUtils.x(str)){
             mULTI_VOTE_S = 1;
          }else if(a.a){
             mULTI_VOTE_S = (this.mQuestionView.getMaxWidth() - this.mQuestionView.getCompoundPaddingLeft()) - this.mQuestionView.getCompoundPaddingRight();
             i1 = a.b * 2;
          }else {
             mULTI_VOTE_S = Math.max(this.mQuestionView.getWidth(), this.mQuestionView.getMaxWidth()) - this.mQuestionView.getCompoundPaddingLeft();
             i1 = this.mQuestionView.getCompoundPaddingRight();
          }
          StaticLayout staticLayout = new StaticLayout(str, this.mQuestionView.getPaint(), (mULTI_VOTE_S - i1), Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, false);
          mULTI_VOTE_S = Math.min(mULTI_VOTE_S.getLineCount(), 2);
          this.mQuestionLineSize = mULTI_VOTE_S;
          if (this.mBaseDrawerData.k0() && !TextUtils.x(this.mBaseDrawerData.V0())) {
             this.mQuestionView.getViewTreeObserver().addOnGlobalLayoutListener(new f(this));
          }else {
             this.addQuestionTextChangeListener();
          }
          this.mQuestionView.setVoteViewLineSizeListener(this.getQuestionViewLineSizeListener());
       }
       mULTI_VOTE_S = (this.mBaseDrawerData.W0())? NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_WIDTH: NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH;
       this.mVoteViewContainer.setLayoutParams(new AbsoluteLayout$LayoutParams(mULTI_VOTE_S, this.getContentHeight(this.mQuestionLineSize), 0, 0));
       this.mBaseDrawerData.M((float)this.getContentHeight(this.mQuestionLineSize));
       this.i(this.mOptionsOneView, this.mBaseDrawerData.S0(), 0);
       this.i(this.mOptionsTwoView, this.mBaseDrawerData.U0(), 1);
       if (this.mBaseDrawerData.W0()) {
          NewVoteStickerDrawer tmOptionsThr = this.mOptionsThreeView;
          if (tmOptionsThr != null) {
             this.i(tmOptionsThr, this.mBaseDrawerData.T0(), 2);
          }
       }
       return this.mVoteViewContainer;
    }
    public boolean isInteractSticker(){
       return true;
    }
    public boolean isNewVoteSticker(){
       return true;
    }
    public final void j(VoteTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewVoteStickerDrawer.class, "4")) {
          return;
       }
       this.mFocusedView = p0;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawer.class, "5")) {
          p0.setCursorVisible(true);
          p0.setFocusable(true);
          p0.setFocusableInTouchMode(true);
          p0.requestFocus();
          n.b0(p0.getContext(), p0, i);
          this.mFocusedView = p0;
       }
       Object[] objArray = new Object[i];
       a.D().w("EditVoteStickerDrawer", p1, objArray);
       return;
    }
    public final void k(boolean p0,boolean p1){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, NewVoteStickerDrawer.class, "22")) {
          return;
       }
       if (!this.mBaseDrawerData.W0()) {
          return;
       }
       NewVoteStickerDrawer tmOptionsOne = this.mOptionsOneView;
       tmOptionsOne.setHintTextColor(this.h(p0, tmOptionsOne.getText().toString(), p1));
       tmOptionsOne = this.mOptionsTwoView;
       tmOptionsOne.setHintTextColor(this.h(p0, tmOptionsOne.getText().toString(), p1));
       tmOptionsOne = this.mOptionsThreeView;
       if (tmOptionsOne != null) {
          tmOptionsOne.setHintTextColor(this.h(p0, tmOptionsOne.getText().toString(), p1));
       }
       return;
    }
    public void layoutVoteContainer(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "37")) {
          return;
       }
       int mULTI_VOTE_S = (this.mBaseDrawerData.W0())? NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_WIDTH: NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH;
       this.mVoteViewContainer.measure(View$MeasureSpec.makeMeasureSpec(mULTI_VOTE_S, 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
       NewVoteStickerDrawer tmVoteViewCo = this.mVoteViewContainer;
       tmVoteViewCo.layout(0, 0, tmVoteViewCo.getMeasuredWidth(), this.mVoteViewContainer.getMeasuredHeight());
       return;
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       int[] obj;
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewVoteStickerDrawer.class, "26");
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
          a.D().s("EditVoteStickerDrawer", "limitDrawerAreaLeftRight motionEventX:"+p0+",wholeRect:"+contentRect+",mEditRect:"+this.mEditRect+"leftLimit:"+f+",rightLimit:"+f1, objArray);
          if (p0 < 0 && f - ((float)contentRect.left + p0) < 0) {
             return b;
          }else if(p0 >= 0 && ((float)contentRect.right + p0) - f1 < 0){
             b = false;
          }
       }
       return b;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       int[] obj;
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewVoteStickerDrawer.class, "27");
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
          a.D().s("EditVoteStickerDrawer", "limitDrawerAreaTopBottom motionEventY:"+p0+",wholeRect:"+contentRect+",mEditRect:"+this.mEditRect+",topLimit:"+f+",bottomLimit:"+f1, objArray);
          if (p0 < 0 && f - ((float)contentRect.top + p0) < 0) {
             return b;
          }else if(p0 >= 0 && ((float)contentRect.bottom + p0) - f1 < 0){
             b = false;
          }
       }
       return b;
    }
    public float maxScaleFactor(){
       return 0x3f800000;
    }
    public float minScaleFactor(){
       Object obj = PatchProxy.apply(null, this, NewVoteStickerDrawer.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = (this.mBaseDrawerData.W0())? 0x3f2b851f: 0x3f0f5c29;
       return f;
    }
    public boolean needBlockedByAirWall(){
       return true;
    }
    public boolean needGenerateBitmap(NewStickerElementData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewVoteStickerDrawer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewVoteStickerDrawerData) {
          return super.needGenerateBitmap(p0);
       }
       boolean b = (!super.needGenerateBitmap(p0) && (TextUtils.n(p0.V0(), this.mBaseDrawerData.V0()) && (TextUtils.n(p0.S0(), this.mBaseDrawerData.S0()) && (!TextUtils.n(p0.U0(), this.mBaseDrawerData.U0()) || (this.mBaseDrawerData.W0() && !TextUtils.n(p0.T0(), this.mBaseDrawerData.T0()))))))? true: false;
       return b;
    }
    public void remove(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(NewVoteStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, NewVoteStickerDrawer.class, "7")) {
          return;
       }
       super.remove(p0, p1);
       this.clearAllFocus();
       this.mQuestionView.setVoteViewLineSizeListener(null);
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "6")) {
          return;
       }
       super.select();
       this.mQuestionContainer.setVisibility(0);
       this.k(true, 0);
       return;
    }
    public void selectedTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawer.class, "3")) {
          return;
       }
       super.selectedTap(p0);
       if (this.isPointInTheRect(p0.getX(), p0.getY(), this.getQuestionViewRect())) {
          this.j(this.mQuestionView, "clickQuestionView");
       }else if(this.isPointInTheRect(p0.getX(), p0.getY(), this.getOptionOneViewRect())){
          this.j(this.mOptionsOneView, "clickOptionOneView");
       }else if(this.isPointInTheRect(p0.getX(), p0.getY(), this.getOptionTwoViewRect())){
          this.j(this.mOptionsTwoView, "clickOptionTwoView");
       }else if(this.mOptionsThreeView != null && this.isPointInTheRect(p0.getX(), p0.getY(), this.getOptionThreeViewRect())){
          this.j(this.mOptionsThreeView, "clickOptionThreeView");
       }else {
          Object[] objArray = new Object[0];
          a.D().w("EditVoteStickerDrawer", "selectedTap click nothing", objArray);
       }
       return;
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "21")) {
          return;
       }
       this.hideTextCursors();
       if (TextUtils.x(this.getQuestion()) || TextUtils.x((this.getQuestion()).trim())) {
          this.mQuestionView.setText("");
          this.mQuestionContainer.setVisibility(4);
       }
       if (TextUtils.x(this.mBaseDrawerData.S0()) || TextUtils.x((this.mBaseDrawerData.S0()).trim())) {
          this.mOptionsOneView.setText("");
       }
       if (TextUtils.x(this.mBaseDrawerData.U0()) || TextUtils.x((this.mBaseDrawerData.U0()).trim())) {
          this.mOptionsTwoView.setText("");
       }
       if (this.mBaseDrawerData.W0() && (this.mOptionsThreeView != null && (TextUtils.x(this.mBaseDrawerData.T0()) || TextUtils.x((this.mBaseDrawerData.T0()).trim())))) {
          this.mOptionsThreeView.setText("");
       }
    label_00b1 :
       this.k(false, false);
       this.clearAllFocus();
       this.mIsFirstTimeEdit = false;
       return;
    }
    public void updateElement(NewStickerElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawer.class, "19")) {
          return;
       }
       this.setNeedGenerateBitmap(this.needGenerateBitmap(p0));
       this.mBaseDrawerData.R0(p0);
       this.mBaseDrawerData.M((float)this.getContentHeight(this.mQuestionLineSize));
       this.mIsNeedReGenerateFile = this.isNeedGenerateBitmap();
       if (!PatchProxy.applyVoid(null, this, NewVoteStickerDrawer.class, "20")) {
          String question = this.getQuestion();
          String str = this.mBaseDrawerData.S0();
          String str1 = this.mBaseDrawerData.U0();
          String str2 = this.mBaseDrawerData.T0();
          if (!(this.mQuestionView.getText().toString()).equals(question)) {
             this.mQuestionView.post(new b(this, question));
          }
          if (!(this.mOptionsOneView.getText().toString()).equals(str)) {
             this.mOptionsOneView.post(new c(this, str));
          }
          if (!(this.mOptionsTwoView.getText().toString()).equals(str1)) {
             this.mOptionsTwoView.post(new d(this, str1));
          }
          if (this.mBaseDrawerData.W0()) {
             NewVoteStickerDrawer tmOptionsThr = this.mOptionsThreeView;
             if (tmOptionsThr != null && !(tmOptionsThr.getText().toString()).equals(str2)) {
                this.mOptionsThreeView.post(new e(this, str2));
             }
          }
       }
    label_00ca :
       this.update();
       this.containerView.U(this);
       return;
    }
    public void updateView(EditDecorationContainerViewV2 p0){
    }
}
