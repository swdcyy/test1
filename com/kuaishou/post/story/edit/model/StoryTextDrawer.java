package com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import lnc.a1;
import com.kuaishou.post.story.edit.model.StoryTextDrawer$a;
import android.os.Parcel;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import java.lang.String;
import android.graphics.RectF;
import android.text.TextUtils;
import java.lang.Object;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import com.kuaishou.post.story.edit.model.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer$b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import nsd.u;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.graphics.Rect;
import android.graphics.PointF;
import com.kuaishou.post.story.edit.model.b;
import java.lang.Runnable;
import android.view.View;
import dq4.f;
import java.lang.StringBuilder;
import java.lang.Number;
import android.widget.AbsoluteLayout;
import com.kuaishou.post.story.widget.StoryEditText;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.EditText;
import rp4.m;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import fq4.b0;
import rp4.c;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import ekd.b0;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$b;
import android.graphics.Paint;
import rp4.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.AbsoluteLayout$LayoutParams;

public class StoryTextDrawer extends DecorationDrawer	// class@000b28
{
    public StoryEditText c;
    public int mAlignment;
    public RectF mContentRect;
    public int mCustomMaxLine;
    public int mEditTextLeft;
    public int mEditTextTop;
    public boolean mEnableTextShadow;
    public boolean mIsInEditing;
    public int mLoggerAction;
    public float mStoryEditTextHeight;
    public float mStoryEditTextWidth;
    public CharSequence mText;
    public int mTextBackgroundStyle;
    public StoryTextDataManager$TextColors mTextColors;
    public String mTextFontName;
    public int mTextMode;
    public static final Parcelable$Creator CREATOR;
    public static final float d;
    public static final float e;

    static {
       StoryTextDrawer.d = (float)a1.d(0x7f070193);
       StoryTextDrawer.e = (float)a1.d(0x7f07018e);
       StoryTextDrawer.CREATOR = new StoryTextDrawer$a();
    }
    public void StoryTextDrawer(Parcel p0){
       super(p0.readParcelable(BaseDrawerData.class.getClassLoader()));
       this.mText = "";
       boolean b = true;
       this.mEnableTextShadow = b;
       this.mEditTextLeft = 0;
       this.mEditTextTop = 0;
       this.mAlignment = 3;
       this.mTextFontName = "";
       this.mCustomMaxLine = -1;
       this.mTextBackgroundStyle = p0.readInt();
       this.mTextColors = p0.readParcelable(StoryTextDataManager$TextColors.class.getClassLoader());
       this.mText = p0.readString();
       boolean b1 = (p0.readByte())? true: false;
       this.mEnableTextShadow = b1;
       this.mEditTextLeft = p0.readInt();
       this.mEditTextTop = p0.readInt();
       this.mStoryEditTextWidth = p0.readFloat();
       this.mStoryEditTextHeight = p0.readFloat();
       this.mTextMode = p0.readInt();
       this.mTextFontName = p0.readString();
       this.mAlignment = p0.readInt();
       this.mContentRect = p0.readParcelable(RectF.class.getClassLoader());
       if (!p0.readByte()) {
          b = false;
       }
       this.mEnableAddingAnimation = b;
       this.mText = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.setAnimationListener(a.a);
       return;
    }
    public void StoryTextDrawer(StoryTextDataManager$TextColors p0,int p1){
       BaseDrawerData uBaseDrawerD = v1;
       BaseDrawerData uBaseDrawerD1 = new BaseDrawerData(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 0, 0, false, 0, 0x1fffff, null);
       super(uBaseDrawerD);
       this.mText = "";
       this.mEnableTextShadow = true;
       this.mEditTextLeft = 0;
       this.mEditTextTop = 0;
       this.mAlignment = 3;
       this.mTextFontName = "";
       this.mCustomMaxLine = -1;
       this.mBaseDrawerData.T(true);
       this.mBaseDrawerData.S("TEXT_STICKER");
       this.mLoggerAction = p1;
       this.mTextColors = p0;
       this.setAnimationListener(a.a);
    }
    public static StoryTextDrawer generateTextDrawer(StoryTextDataManager$TextColors p0,int p1){
       if (PatchProxy.isSupport(StoryTextDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, StoryTextDrawer.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StoryTextDrawer(p0, p1);
    }
    public void addSelectWithAnimation(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryTextDrawer.class, "9")) {
          return;
       }
       super.addSelectWithAnimation(p0);
       this.mEditRect = p0.getEditorRect();
       PointF storyTextEdi = this.getStoryTextEditViewPosition(p0);
       this.mBaseDrawerData.Y(((storyTextEdi.x + ((float)this.mEditRect.width() / 2.00f)) / (float)this.mEditRect.width()));
       this.mBaseDrawerData.Z(((storyTextEdi.y + ((float)this.mEditRect.height() / 2.00f)) / (float)this.mEditRect.height()));
       p0.c(this, false, null, true);
       this.update();
       this.mDecorationShowingView.post(new b(this, p0));
       return;
    }
    public StoryTextDrawer clone(){
       StoryTextDrawer obj = PatchProxy.apply(null, this, StoryTextDrawer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = StoryTextDrawer.generateTextDrawer(this.mTextColors, this.mLoggerAction);
       this.cloneBaseParam(obj);
       obj.mText = this.mText;
       obj.mEditTextLeft = this.mEditTextLeft;
       obj.mEditTextTop = this.mEditTextTop;
       obj.mTextBackgroundStyle = this.mTextBackgroundStyle;
       obj.mStoryEditTextWidth = this.mStoryEditTextWidth;
       obj.mStoryEditTextHeight = this.mStoryEditTextHeight;
       obj.mTextMode = this.mTextMode;
       obj.mAlignment = this.mAlignment;
       obj.mContentRect = this.mContentRect;
       obj.mEnableTextShadow = this.mEnableTextShadow;
       obj.mTextFontName = this.mTextFontName;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public int describeContents(){
       return 0;
    }
    public int getAlignment(){
       return this.mAlignment;
    }
    public int getCustomMaxLine(){
       return this.mCustomMaxLine;
    }
    public String getDecorationName(){
       StoryTextDataManager$TextColors obj = PatchProxy.apply(null, this, StoryTextDrawer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (f.e(this.mTextBackgroundStyle))? this.mTextColors.b: this.mTextColors.d;
       String str = "_";
       StringBuilder str1 = Integer.toHexString(obj)+str;
       StoryTextDrawer tmTextBackgr = this.mTextBackgroundStyle;
       if (tmTextBackgr != null) {
          if (tmTextBackgr != 1) {
             if (tmTextBackgr == 2) {
                str1 = str1+"BG";
             }
          }else {
             str1 = str1+"HBG";
          }
       }else {
          str1 = str1+"NBG";
       }
       str1 = str1+str+f.b(this.mAlignment, this.mTextMode)+str+f.c(this.mTextMode)+str;
       str = (this.mLoggerAction == 406)? "1": "2";
       this.mBaseDrawerData.S(str1+str);
       return this.mBaseDrawerData.l();
    }
    public double getNormalizedScale(){
       return 100.00f;
    }
    public PointF getStoryTextEditViewPosition(DecorationContainerView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StoryTextDrawer obj = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mEditTextTop;
       StoryTextDrawer obj1 = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer.class, "13");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): (p0.getWidth() - p0.getRootView().getWidth()) / 2;
       float f = (float)(obj + i);
       obj1 = this.mEditTextLeft;
       Object obj2 = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer.class, "15");
       int i1 = (obj2 != patchProxyRe)? obj2.intValue(): (p0.getWidth() - p0.getRootView().getWidth()) / 2;
       return new PointF((((float)(obj1 + i1) + (this.mBaseDrawerData.i() / 2.00f)) - (float)this.mEditRect.centerX()), ((f + (this.mBaseDrawerData.f() / 2.00f)) - (float)this.mEditRect.centerY()));
    }
    public int getTextMode(){
       return this.mTextMode;
    }
    public String getUploadText(){
       Object obj = PatchProxy.apply(null, this, StoryTextDrawer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mText.toString();
    }
    public View initView(DecorationContainerView p0){
       StoryEditText obj = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StoryEditText(p0.getContext());
       this.c = obj;
       obj.setTypeface(Typeface.DEFAULT_BOLD);
       this.c.setTextSize(0, StoryTextDrawer.d);
       this.c.setLineSpacing(StoryTextDrawer.e, 0x3f800000);
       this.c.setBackgroundRadius(m.c);
       this.c.setEnabled(0);
       this.c.setBackground(null);
       this.c.setPadding(m.m, m.n, m.m, m.n);
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.addView(this.c);
       p0.post(new b0(this));
       return uFrameLayout;
    }
    public boolean isEnableTextShadow(){
       return this.mEnableTextShadow;
    }
    public void onDecorationRemoved(){
       if (PatchProxy.applyVoid(null, this, StoryTextDrawer.class, "16")) {
          return;
       }
       c.b(404, "drop_text");
       return;
    }
    public void onDecorationScaleAndRotate(){
       if (PatchProxy.applyVoid(null, this, StoryTextDrawer.class, "17")) {
          return;
       }
       c.b(404, "scale_text");
       return;
    }
    public StoryTextDrawer restoreFromBackup(StoryTextDrawer p0){
       if (p0 != null) {
          this.mTextBackgroundStyle = p0.mTextBackgroundStyle;
          this.mText = p0.mText;
          this.mTextMode = p0.mTextMode;
          this.mAlignment = p0.mAlignment;
          this.mTextColors = p0.mTextColors;
          this.mTextFontName = p0.mTextFontName;
       }
       return this;
    }
    public void restoreToBeforeAnimation(DecorationContainerView p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryTextDrawer.class, "11")) {
          return;
       }
       this.mEditRect = p0.getEditorRect();
       PointF storyTextEdi = this.getStoryTextEditViewPosition(p0);
       this.mBaseDrawerData.Y(((storyTextEdi.x + ((float)this.mEditRect.width() / 2.00f)) / (float)this.mEditRect.width()));
       this.mBaseDrawerData.Z(((storyTextEdi.y + ((float)this.mEditRect.height() / 2.00f)) / (float)this.mEditRect.height()));
       this.mBaseDrawerData.L(0x3f800000);
       this.update();
       this.restoreToBeforeAnimation(p1, 300);
       return;
    }
    public void setAlignment(int p0){
       if (PatchProxy.isSupport(StoryTextDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryTextDrawer.class, "6")) {
          return;
       }
       if (p0 == 17 || (p0 != 3 && p0 != 5)) {
          throw new IllegalArgumentException("wrong alignment integer");
       }
       this.mAlignment = p0;
       return;
    }
    public void setCustomMaxLine(int p0){
       if (PatchProxy.isSupport(StoryTextDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryTextDrawer.class, "18")) {
          return;
       }
       this.mCustomMaxLine = Math.min(p0, 20);
       return;
    }
    public void setDimension(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryTextDrawer.class, "14")) {
          return;
       }
       this.mBaseDrawerData.P((float)p0.a);
       this.mBaseDrawerData.M((float)p0.b);
       return;
    }
    public void setTextMode(int p0){
       this.mTextMode = p0;
    }
    public StoryTextDrawer shallowClone(){
       StoryTextDrawer obj = PatchProxy.apply(null, this, StoryTextDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StoryTextDrawer(this.mTextColors, this.mLoggerAction);
       obj.mTextBackgroundStyle = this.mTextBackgroundStyle;
       obj.mText = this.mText;
       obj.mTextMode = this.mTextMode;
       obj.mAlignment = this.mAlignment;
       obj.mTextFontName = this.mTextFontName;
       return obj;
    }
    public boolean shallowEquals(StoryTextDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == this || (p0.mTextColors == this.mTextColors && (p0.mTextBackgroundStyle == this.mTextBackgroundStyle && (TextUtils.n(p0.mText, this.mText) && (p0.mTextMode == this.mTextMode && (p0.mAlignment == this.mAlignment && TextUtils.n(p0.mTextFontName, this.mTextFontName)))))))? true: false;
       return b;
    }
    public void shallowUpdate(StoryTextDrawer p0){
       if (p0 == null) {
          return;
       }
       this.mTextColors = p0.mTextColors;
       this.mTextBackgroundStyle = p0.mTextBackgroundStyle;
       this.mText = p0.mText;
       return;
    }
    public void startTextEditAnimation(DecorationContainerView p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryTextDrawer.class, "10")) {
          return;
       }
       PointF storyTextEdi = this.getStoryTextEditViewPosition(p0);
       this.startElementAnimation(new DecorationDrawer$b(storyTextEdi.x, storyTextEdi.y), p1);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StoryTextDrawer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StoryTextDrawer{mTextBackgroundStyle="+this.mTextBackgroundStyle+", mTextMode="+this.mTextMode+", mTextFontName="+this.mTextFontName+", mAlignment="+this.mAlignment+", mTextColors="+this.mTextColors+", mText=\'"+this.mText+'''+", mBaseDrawerData=\'"+this.mBaseDrawerData+'''+'''+'}';
    }
    public void update(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StoryTextDrawer.class, "3")) {
          return;
       }
       super.update();
       if (this.mIsInEditing == null) {
          this.mDecorationShowingView.setAlpha(0x3f800000);
       }
       StoryTextDataManager$TextColors c = (!f.e(this.mTextBackgroundStyle))? this.mTextColors.c: this.mTextColors.b;
       StoryTextDrawer tmTextMode = this.mTextMode;
       int i = -1;
       int i1 = 2;
       int i2 = 1;
       if (tmTextMode != null && tmTextMode != i2) {
          if (tmTextMode != i1) {
             if (tmTextMode == 3) {
             label_005a :
                StoryTextDrawer tc = this.c;
                tmTextMode = (tmTextMode == i1)? 1: null;
                if (tmTextMode) {
                   c = -1;
                }
                tc.setTextColor(c);
                this.c.setBackgroundEnabled((f.e(this.mTextBackgroundStyle) ^ i2));
                if (f.e(this.mTextBackgroundStyle) && this.mEnableTextShadow != null) {
                   this.c.setShadowLayer((float)m.d, (float)m.e, (float)m.f, m.g);
                }else {
                   this.c.setShadowLayer(0, 0, 0, 0);
                }
                if (f.f(this.mTextBackgroundStyle)) {
                   this.c.setBackgroundColor(this.mTextColors.d);
                }else if(this.mTextBackgroundStyle == i2){
                   i2 = 0;
                }
                if (i2) {
                   this.c.setBackgroundColor(this.mTextColors.e);
                }
                this.c.setLayerType(0, objArray);
             }
          }else {
             this.c.setTextColor(i);
             this.c.setNeonShadowColor(this.mTextColors.g);
             this.c.setBackgroundEnabled(0);
             this.c.setBackgroundColor(0);
             this.c.setLayerType(i2, objArray);
          }
       }else {
          goto label_005a ;
       }
       if (f.g(this.mTextMode)) {
          this.c.setTypeface(n.g(this.mTextFontName));
       }else {
          this.c.setTypeface(Typeface.DEFAULT_BOLD);
       }
       this.c.setTextMode(this.mTextMode);
       this.c.setText(this.mText);
       this.c.setGravity(f.a(this.mAlignment, this.mTextMode));
       FrameLayout$LayoutParams layoutParams = this.c.getLayoutParams();
       StoryTextDrawer tmContentRec = this.mContentRect;
       layoutParams.leftMargin = (int)(tmContentRec.left * 0xbf800000);
       layoutParams.topMargin = (int)(tmContentRec.top * 0xbf800000);
       layoutParams.height = (int)this.mStoryEditTextHeight;
       layoutParams.width = (int)this.mStoryEditTextWidth;
       this.c.setGravity(f.a(this.mAlignment, this.mTextMode));
       this.c.setLayoutParams(layoutParams);
       AbsoluteLayout$LayoutParams layoutParams1 = this.mDecorationShowingView.getLayoutParams();
       layoutParams1.width = (int)this.mBaseDrawerData.i();
       layoutParams1.height = (int)this.mBaseDrawerData.f();
       this.mDecorationShowingView.setLayoutParams(layoutParams1);
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryTextDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryTextDrawer.class, "21")) {
          return;
       }
       p0.writeInt(this.mTextBackgroundStyle);
       p0.writeParcelable(this.mTextColors, p1);
       p0.writeByte(this.mEnableTextShadow);
       p0.writeInt(this.mEditTextLeft);
       p0.writeInt(this.mEditTextTop);
       p0.writeFloat(this.mStoryEditTextWidth);
       p0.writeFloat(this.mStoryEditTextHeight);
       p0.writeInt(this.mTextMode);
       p0.writeString(this.mTextFontName);
       p0.writeInt(this.mAlignment);
       p0.writeParcelable(this.mContentRect, p1);
       p0.writeByte(this.mEnableAddingAnimation);
       p0.writeParcelable(this.mBaseDrawerData, 0);
       TextUtils.writeToParcel(this.mText, p0, 0);
       return;
    }
}
