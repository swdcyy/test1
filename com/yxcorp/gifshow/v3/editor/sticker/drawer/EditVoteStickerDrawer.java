package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer;
import ml8.d;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import jtc.a;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.util.Pair;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.view.ViewParent;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import faa.a;
import q87.c;
import ekd.m1;
import android.widget.FrameLayout;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.util.List;
import java.util.Arrays;
import android.widget.EditText;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import java.lang.Float;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.Editable;
import java.lang.StringBuilder;
import android.view.MotionEvent;

public class EditVoteStickerDrawer extends EditStickerBaseDrawer implements d	// class@00122a
{
    public boolean isVideoType;
    public VoteTextView mFocusedView;
    public VoteTextView mOptionsLeftView;
    public VoteTextView mOptionsRightView;
    public FrameLayout mQuestionContainer;
    public int mQuestionLineSize;
    public VoteTextView mQuestionView;
    public EditVoteStickerDrawer$b mQuestionViewLineSizeListener;
    public int[] mVoteStickerLimits;
    public View mVoteViewContainer;
    public static final float HORIZONTAL_VOTE_STICKER_NORMAL_SIZE;
    public static final int QUESTION_VOTE_VIEW_ORIGIN_HEIGHT;
    public static final int VOTE_STICKER_BUTTON_OFFSET;
    public static final int VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT;
    public static final int VOTE_STICKER_LAYOUT_ORIGIN_WIDTH;
    public static final int[] VOTE_STICKER_LIMIT_BIG;
    public static final int[] VOTE_STICKER_LIMIT_MID;
    public static final int[] VOTE_STICKER_LIMIT_SMALL;
    public static final int VOTE_STICKER_TOP_REDUNDANT;

    static {
       EditVoteStickerDrawer.HORIZONTAL_VOTE_STICKER_NORMAL_SIZE = (float)a1.e(140.00f);
       int[] ointArray = new int[]{a1.e(15.00f),a1.e(8.00f),a1.e(15.00f),a1.e(50.00f)};
       EditVoteStickerDrawer.VOTE_STICKER_LIMIT_BIG = ointArray;
       ointArray = new int[]{a1.e(15.00f),a1.e(55.00f),a1.e(15.00f),a1.e(50.00f)};
       EditVoteStickerDrawer.VOTE_STICKER_LIMIT_MID = ointArray;
       int[] ointArray1 = new int[]{a1.e(15.00f),a1.e(55.00f),a1.e(15.00f),a1.e(82.00f)};
       EditVoteStickerDrawer.VOTE_STICKER_LIMIT_SMALL = ointArray1;
       EditVoteStickerDrawer.VOTE_STICKER_TOP_REDUNDANT = a1.e(17.00f);
       EditVoteStickerDrawer.QUESTION_VOTE_VIEW_ORIGIN_HEIGHT = a1.d(0x7f070d60);
       EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH = a1.d(0x7f071088);
       EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT = a1.d(0x7f071087);
       EditVoteStickerDrawer.VOTE_STICKER_BUTTON_OFFSET = a1.e(3.00f);
    }
    public void EditVoteStickerDrawer(){
       super(new EditVoteStickerDrawerData());
       this.mQuestionLineSize = 1;
       this.isVideoType = false;
       this.mQuestionViewLineSizeListener = new a(this);
       this.i(0x3f800000);
    }
    public void EditVoteStickerDrawer(double p0,double p1,int p2,float p3,boolean p4){
       BaseDrawer uBaseDrawer = this;
       super(new EditVoteStickerDrawerData(), 3, "sticker_vote_0", p0, p1, p2);
       uBaseDrawer.mQuestionLineSize = 1;
       uBaseDrawer.isVideoType = false;
       uBaseDrawer.mQuestionViewLineSizeListener = new a(this);
       uBaseDrawer.mBaseDrawerData.P((float)EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH);
       uBaseDrawer.mBaseDrawerData.M((float)EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT);
       uBaseDrawer.isVideoType = p4;
       this.i(p3);
    }
    public void EditVoteStickerDrawer(String p0,Pair p1,double p2,double p3,int p4,String p5,float p6,float p7,float p8,boolean p9){
       BaseDrawer uBaseDrawer = this;
       Pair pair = p1;
       super(new EditVoteStickerDrawerData(), 3, "sticker_vote_0", p2, p3, p4);
       uBaseDrawer.mQuestionLineSize = 1;
       uBaseDrawer.isVideoType = false;
       uBaseDrawer.mQuestionViewLineSizeListener = new a(this);
       uBaseDrawer.mBaseDrawerData.J0(p0);
       uBaseDrawer.mBaseDrawerData.H0(pair.first);
       uBaseDrawer.mBaseDrawerData.I0(pair.second);
       uBaseDrawer.mBaseDrawerData.D0(p7);
       uBaseDrawer.mBaseDrawerData.C0(p8);
       uBaseDrawer.mBaseDrawerData.R(p5);
       uBaseDrawer.mBaseDrawerData.P((float)EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH);
       uBaseDrawer.mBaseDrawerData.M((float)EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT);
       uBaseDrawer.isVideoType = p9;
       this.i(p6);
    }
    public static void g(EditVoteStickerDrawer p0,int p1){
       if (p0.mQuestionLineSize != p1) {
          AbsoluteLayout$LayoutParams layoutParams = p0.mVoteViewContainer.getLayoutParams();
          layoutParams.height = (p1 == 1)? EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT: (layoutParams.height - EditVoteStickerDrawer.QUESTION_VOTE_VIEW_ORIGIN_HEIGHT) + p0.mQuestionView.getTwoLineHeight();
          p0.mBaseDrawerData.M((float)layoutParams.height);
          p0.mVoteViewContainer.setLayoutParams(layoutParams);
          p0.mVoteViewContainer.getParent().T();
       }
       p0.mQuestionLineSize = p1;
       return;
    }
    public boolean canRestore(EditStickerBaseDrawer p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, EditVoteStickerDrawer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!super.canRestore(p0)) {
          return false;
       }
       if (!TextUtils.n(this.mQuestionView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.G0()) || (TextUtils.n(this.mOptionsLeftView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.E0()) && TextUtils.n(this.mOptionsRightView.getTextWithoutBreakChar().toString(), p0.mBaseDrawerData.F0()))) {
          return true;
       }
       obj = new Object[false];
       a.D().w("EditVoteStickerDrawer", "canRestore question or options not the same", obj);
       return false;
    }
    public void clickQuestionView(){
       if (PatchProxy.applyVoid(null, this, EditVoteStickerDrawer.class, "6")) {
          return;
       }
       EditVoteStickerDrawer tmQuestionVi = this.mQuestionView;
       this.mFocusedView = tmQuestionVi;
       this.j(tmQuestionVi);
       Object[] objArray = new Object[0];
       a.D().w("EditVoteStickerDrawer", "clickQuestionView", objArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawer.class, "1")) {
          return;
       }
       this.mQuestionContainer = m1.f(p0, 0x7f0a33a4);
       this.mQuestionView = m1.f(p0, 0x7f0a33ad);
       this.mOptionsRightView = m1.f(p0, 0x7f0a2efb);
       this.mOptionsLeftView = m1.f(p0, 0x7f0a2ef8);
       return;
    }
    public Rect getContentRect(){
       Rect obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       obj.top = obj.top - EditVoteStickerDrawer.VOTE_STICKER_TOP_REDUNDANT;
       return obj;
    }
    public Rect getOptionLeftViewRect(){
       Rect obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getQuestionViewRect();
       Rect outBoxRect = this.getOutBoxRect();
       return new Rect(obj.left, obj.bottom, (outBoxRect.left + (obj.width() / 2)), outBoxRect.bottom);
    }
    public Rect getOptionRightViewRect(){
       Rect obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOptionLeftViewRect();
       obj.offset((this.getOutBoxRect().width() / 2), 0);
       return obj;
    }
    public List getOptions(){
       String[] obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{this.getOptionsLeft(),this.getOptionsRight()};
       return Arrays.asList(obj);
    }
    public String getOptionsLeft(){
       Object obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.E0();
    }
    public String getOptionsRight(){
       Object obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.F0();
    }
    public String getQuestion(){
       Object obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.G0();
    }
    public Rect getQuestionViewRect(){
       Rect obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       Rect top = obj.top;
       int dECORATION_R = BaseDrawer.DECORATION_REMOVE_ICON_WIDTH;
       int i = (dECORATION_R / 2) + top;
       return new Rect(obj.left, i, obj.right, (int)((float)(top + (dECORATION_R / 2)) + ((((float)obj.height() * 0x3f800000) * (float)this.mQuestionView.getHeight()) / (float)this.mVoteViewContainer.getHeight())));
    }
    public Rect getRemoveButtonRect(){
       Rect obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getRemoveButtonRect();
       obj.offset(((BaseDrawer.DECORATION_REMOVE_ICON_WIDTH / 2) - EditVoteStickerDrawer.VOTE_STICKER_BUTTON_OFFSET), 0);
       return obj;
    }
    public Rect getWholeRect(){
       Object obj = PatchProxy.apply(null, this, EditVoteStickerDrawer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOutBoxRect();
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, EditVoteStickerDrawer.class, "13")) {
          return;
       }
       EditVoteStickerDrawer tmFocusedVie = this.mFocusedView;
       if (tmFocusedVie != null) {
          Activity uActivity = a.b(tmFocusedVie.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
          this.mFocusedView.setFocusable(false);
          this.mFocusedView.setFocusableInTouchMode(false);
          this.mFocusedView.clearFocus();
          this.mFocusedView = null;
       }
       return;
    }
    public final void i(float p0){
       if (PatchProxy.isSupport(EditVoteStickerDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditVoteStickerDrawer.class, "2")) {
          return;
       }
       if (p0 - 0x3f800000 < 0) {
          this.mVoteStickerLimits = EditVoteStickerDrawer.VOTE_STICKER_LIMIT_SMALL;
       }else if(p0 - 0x3fe38e39 >= 0){
          this.mVoteStickerLimits = EditVoteStickerDrawer.VOTE_STICKER_LIMIT_BIG;
       }else {
          this.mVoteStickerLimits = EditVoteStickerDrawer.VOTE_STICKER_LIMIT_MID;
       }
       this.mBaseDrawerData.b(256);
       this.mBaseDrawerData.b(4096);
       return;
    }
    public View initView(DecorationContainerView p0){
       View obj = PatchProxy.applyOneRefs(p0, this, EditVoteStickerDrawer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(p0.getContext(), R.layout.arg_RES_7f0d07a8, null);
       this.mVoteViewContainer = obj;
       obj.setAlpha(this.mBaseDrawerData.e());
       this.doBindView(this.mVoteViewContainer);
       this.mVoteViewContainer.setLayoutParams(new AbsoluteLayout$LayoutParams(EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH, EditVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT, 0, 0));
       this.mQuestionView.setVoteViewLineSizeListener(this.mQuestionViewLineSizeListener);
       p0.getViewTreeObserver().addOnGlobalLayoutListener(new EditVoteStickerDrawer$a(this, p0));
       return this.mVoteViewContainer;
    }
    public boolean isEnableSelectBox(){
       return false;
    }
    public boolean isInScaleAndRotateButton(float p0,float p1){
       return false;
    }
    public final void j(VoteTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawer.class, "9")) {
          return;
       }
       p0.setCursorVisible(true);
       p0.setFocusable(true);
       p0.setFocusableInTouchMode(true);
       p0.requestFocus();
       p0.setSelection(p0.getText().length());
       n.b0(p0.getContext(), p0, false);
       this.mFocusedView = p0;
       return;
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       Rect obj;
       if (PatchProxy.isSupport(EditVoteStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, EditVoteStickerDrawer.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getWholeRect();
       int i = 0;
       float f = (float)this.mVoteStickerLimits[i];
       float f1 = (float)(this.mEditRect.width() - this.mVoteStickerLimits[2]);
       Object[] objArray = new Object[i];
       a.D().s("EditVoteStickerDrawer", "limitDrawerAreaLeftRight motionEventX:"+p0+",wholeRect:"+obj+",mEditRect:"+this.mEditRect+"leftLimit:"+f+",rightLimit:"+f1, objArray);
       if (p0 < 0 && f - ((float)obj.left + p0) < 0) {
          return true;
       }else if(p0 >= 0 && ((float)obj.right + p0) - f1 < 0){
          i = true;
       }
       return i;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       Rect obj;
       if (PatchProxy.isSupport(EditVoteStickerDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, EditVoteStickerDrawer.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getWholeRect();
       int i = 1;
       float f = (float)this.mVoteStickerLimits[i];
       float f1 = (float)(this.mEditRect.height() - this.mVoteStickerLimits[3]);
       Object[] objArray = new Object[0];
       a.D().s("EditVoteStickerDrawer", "limitDrawerAreaTopBottom motionEventY:"+p0+",wholeRect:"+obj+",mEditRect:"+this.mEditRect+",topLimit:"+f+",bottomLimit:"+f1, objArray);
       if (p0 < 0 && f - ((float)obj.top + p0) < 0) {
          return i;
       }else if(p0 >= 0 && ((float)obj.bottom + p0) - f1 < 0){
          i = false;
       }
       return i;
    }
    public void remove(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(EditVoteStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditVoteStickerDrawer.class, "12")) {
          return;
       }
       super.remove(p0, p1);
       this.h();
       this.mQuestionView.setVoteViewLineSizeListener(null);
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, EditVoteStickerDrawer.class, "10")) {
          return;
       }
       super.select();
       this.mQuestionContainer.setVisibility(0);
       return;
    }
    public void selectedTap(MotionEvent p0){
       EditVoteStickerDrawer tmOptionsLef;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawer.class, "5")) {
          return;
       }
       super.selectedTap(p0);
       if (this.isPointInTheRect(p0.getX(), p0.getY(), this.getQuestionViewRect())) {
          this.clickQuestionView();
       }else {
          Object[] objArray = null;
          if (this.isPointInTheRect(p0.getX(), p0.getY(), this.getOptionLeftViewRect())) {
             if (!PatchProxy.applyVoid(objArray, this, EditVoteStickerDrawer.class, "7")) {
                tmOptionsLef = this.mOptionsLeftView;
                this.mFocusedView = tmOptionsLef;
                this.j(tmOptionsLef);
                objArray1 = new Object[0];
                a.D().w("EditVoteStickerDrawer", "clickOptionLeftView", objArray1);
             }
          }else if(this.isPointInTheRect(p0.getX(), p0.getY(), this.getOptionRightViewRect())){
             if (!PatchProxy.applyVoid(objArray, this, EditVoteStickerDrawer.class, "8")) {
                tmOptionsLef = this.mOptionsRightView;
                this.mFocusedView = tmOptionsLef;
                this.j(tmOptionsLef);
                objArray1 = new Object[0];
                a.D().w("EditVoteStickerDrawer", "clickOptionRightView", objArray1);
             }
          }else {
             objArray1 = new Object[0];
             a.D().w("EditVoteStickerDrawer", "selectedTap click nothing", objArray1);
          }
       }
       return;
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, EditVoteStickerDrawer.class, "11")) {
          return;
       }
       int i = 1;
       int i1 = TextUtils.n(this.mBaseDrawerData.G0(), this.mQuestionView.getTextWithoutBreakChar().toString()) ^ i;
       this.mBaseDrawerData.J0(this.mQuestionView.getTextWithoutBreakChar().toString());
       String str = this.mOptionsLeftView.getTextWithoutBreakChar().toString();
       String str1 = this.mOptionsRightView.getTextWithoutBreakChar().toString();
       int i2 = (!TextUtils.n(this.mBaseDrawerData.E0(), str) || !TextUtils.n(this.mBaseDrawerData.F0(), str1))? 1: 0;
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (TextUtils.x(str)) {
          str = a1.p(R.string.arg_RES_7f10513d);
       }
       tmBaseDrawer.H0(str);
       BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
       if (TextUtils.x(str1)) {
          str1 = a1.p(R.string.arg_RES_7f10513e);
       }
       tmBaseDrawer1.I0(str1);
       if (this.mIsNeedReGenerateFile != null || (!i1 && !i2)) {
          i = false;
       }
    label_009c :
       this.mIsNeedReGenerateFile = i;
       super.unSelect();
       this.h();
       this.mQuestionView.setCursorVisible(false);
       this.mOptionsLeftView.setCursorVisible(false);
       this.mOptionsRightView.setCursorVisible(false);
       if (TextUtils.x(this.getQuestion()) || TextUtils.x((this.getQuestion()).trim())) {
          this.mQuestionView.setText("");
          this.mQuestionContainer.setVisibility(4);
       }
       if (TextUtils.x(this.getOptionsLeft()) || TextUtils.x((this.getOptionsLeft()).trim())) {
          this.mOptionsLeftView.setText(R.string.arg_RES_7f10513d);
       }
       if (TextUtils.x(this.getOptionsRight()) || TextUtils.x((this.getOptionsRight()).trim())) {
          this.mOptionsRightView.setText(R.string.arg_RES_7f10513e);
       }
       return;
    }
    public void updateVoteView(){
       if (PatchProxy.applyVoid(null, this, EditVoteStickerDrawer.class, "4")) {
          return;
       }
       if (!(this.mBaseDrawerData.G0()).isEmpty()) {
          this.mQuestionView.setText(this.mBaseDrawerData.G0());
       }
       if (!(this.mBaseDrawerData.E0()).isEmpty()) {
          this.mOptionsLeftView.setText(this.mBaseDrawerData.E0());
       }
       if (!(this.mBaseDrawerData.F0()).isEmpty()) {
          this.mOptionsRightView.setText(this.mBaseDrawerData.F0());
       }
       return;
    }
}
