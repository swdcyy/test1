package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import umd.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerLayout;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Rect;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import qvc.b;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.NullPointerException;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import w46.b;
import com.kwai.robust.PatchProxyResult;
import android.widget.EditText;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.io.File;
import com.yxcorp.gifshow.util.AdvEditUtil;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.util.Collection;
import ekd.q;
import ekd.a0;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import stc.b;
import stc.b$a;
import lnc.a1;
import q87.c;
import usd.q;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$a;
import android.content.Context;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerEditText;
import android.widget.AbsoluteLayout$LayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.MotionEvent;
import com.yxcorp.utility.n;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$b;
import java.lang.Runnable;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public final class NewTagStickerElement extends NewEditStickerBaseDrawer	// class@000a86
{
    public final float MAX_SCALE_FACTOR;
    public final float MIN_SCALE_FACTOR_VOTE;
    public final String TAG;
    public final NewTagStickerElementData editTagStickerElementData;
    public int mContainerWidth;
    public boolean mForceReGenerateFile;
    public String mPreviousText;
    public NewTagStickerLayout mStickerView;
    public final b textChangeListener;
    public final NewTagStickerElement$a textChangeWatcher;

    public void NewTagStickerElement(NewTagStickerElementData p0,b p1){
       a.p(p0, "editTagStickerElementData");
       a.p(p1, "textChangeListener");
       super(p0);
       this.editTagStickerElementData = p0;
       this.textChangeListener = p1;
       this.TAG = "EditTagStickerElement";
       this.MAX_SCALE_FACTOR = 0x3f800000;
       this.MIN_SCALE_FACTOR_VOTE = 0x3f0f5c29;
       this.mPreviousText = "";
       this.textChangeWatcher = new NewTagStickerElement$a(this);
    }
    public static final NewTagStickerLayout access$getMStickerView$p(NewTagStickerElement p0){
       p0 = p0.mStickerView;
       if (p0 == null) {
          a.S("mStickerView");
       }
       return p0;
    }
    public static void calculateAndUpdateDimen$default(NewTagStickerElement p0,boolean p1,int p2,Object p3){
       float f5;
       int i = 1;
       if (p2 & i) {
          p1 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(NewTagStickerElement.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, NewTagStickerElement.class, "5")) {
          NewTagStickerElement mStickerView = p0.mStickerView;
          if (mStickerView == null) {
             a.S("mStickerView");
          }
          RectF contentRect = mStickerView.getContentRect();
          float f = contentRect.width();
          float f1 = contentRect.height();
          float f2 = (float)2;
          float f3 = ((((((p0.mBaseDrawerData.A() * f) * p0.mBaseDrawerData.m()) * p0.mBaseDrawerData.d()) + (float)p0.getWholeRect().width()) - (float)p0.getContentRect().width()) - (float)p0.getWholeRect().width()) / f2;
          float f4 = ((((((p0.mBaseDrawerData.A() * f1) * p0.mBaseDrawerData.m()) * p0.mBaseDrawerData.d()) + (float)p0.getWholeRect().height()) - (float)p0.getContentRect().height()) - (float)p0.getWholeRect().height()) / f2;
          f2 = 0;
          i = (p1)? null: p0.computeShowingWidthFitLimit(f3, i);
          BaseDrawer uBaseDrawer = (p1)? null: p0.computeShowingHeightFitLimit(f4);
          f3 = 0xbf800000;
          if (!i - f3) {
             f = p0.mBaseDrawerData.i();
             f5 = 0;
          }
          if (!uBaseDrawer - f3) {
             f1 = p0.mBaseDrawerData.f();
          }else {
             BaseDrawer uBaseDrawer1 = uBaseDrawer;
          }
          if (!PatchProxy.isSupport(NewTagStickerElement.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f5), Float.valueOf(f2), p0, NewTagStickerElement.class, "6")) {
             p0.mBaseDrawerData.M(f1);
             p0.mBaseDrawerData.P(f);
             uBaseDrawer = p0.mBaseDrawerData;
             uBaseDrawer.Y((uBaseDrawer.w() + (f5 / (float)p0.mEditRect.width())));
             uBaseDrawer = p0.mBaseDrawerData;
             uBaseDrawer.Z((uBaseDrawer.x() + (f2 / (float)p0.mEditRect.height())));
             p0.mBaseDrawerData.P0(f1);
             p0.mBaseDrawerData.Q0(f);
             uBaseDrawer = p0.mDecorationShowingView;
             if (uBaseDrawer != null) {
                f5 = uBaseDrawer.getLayoutParams();
                f5.width = (int)f;
                f5.height = (int)f1;
                uBaseDrawer.setLayoutParams(f5);
                p0.update();
             }
          }
       }
    label_015b :
       return;
    }
    public final void addOnTextChangeWatcher(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "8")) {
          return;
       }
       a.p(p0, "watcher");
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.a(p0);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void generateDecorationBitmap(){
       String str = "mDecorationShowingView";
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "15")) {
          return;
       }
       try{
          BaseDrawer tmDecoration = this.mDecorationShowingView;
          a.o(tmDecoration, str);
          BaseDrawer tmDecoration1 = this.mDecorationShowingView;
          a.o(tmDecoration1, str);
          int height = tmDecoration1.getHeight();
          Bitmap uBitmap = Bitmap.createBitmap(tmDecoration.getWidth(), height, Bitmap$Config.ARGB_8888);
          tmDecoration = this.mDecorationShowingView;
          if (tmDecoration instanceof NewTagStickerLayout) {
             a.m(tmDecoration);
             if (tmDecoration != null) {
                tmDecoration.b(new Canvas(uBitmap));
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerLayout");
             }
          }else {
             tmDecoration.draw(new Canvas(uBitmap));
          }
          this.mDecorationBitmap = uBitmap;
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t(this.TAG, "generateDecorationBitmap: "+e0.getMessage(), objArray);
       }
       return;
    }
    public final String getContent(){
       BaseDrawer obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       return obj.S0();
    }
    public final NewTagStickerElementData getEditTagStickerElementData(){
       return this.editTagStickerElementData;
    }
    public final EditText getEditText(){
       NewTagStickerElement obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStickerView;
       if (obj == null) {
          a.S("mStickerView");
       }
       return obj.getMEditText();
    }
    public String getElementOutputPath(){
       BaseDrawer obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "26");
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
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, NewTagStickerElement.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "elementData");
       if (!p0 instanceof NewTagStickerElementData) {
          return super.getElementPathIdentify(p0);
       }
       obj = p0.S0();
       List list = p0.A0();
       a.m(list);
       if (!q.f(list)) {
          obj = obj+list.get(0);
       }
       String str = a0.c(obj);
       a.o(str, "DigestUtils.md5Hex\(sb.toString\(\)\)");
       return str;
    }
    public EditText getFocusEditText(){
       NewTagStickerElement obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStickerView;
       if (obj == null) {
          a.S("mStickerView");
       }
       return obj.getMEditText();
    }
    public final void getGlobalVisibleRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "23")) {
          return;
       }
       a.p(p0, "rect");
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.getGlobalVisibleRect(p0);
       return;
    }
    public final boolean getMForceReGenerateFile(){
       return this.mForceReGenerateFile;
    }
    public Rect getOutBoxRect(){
       Object obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContentRect();
    }
    public final String getText(){
       BaseDrawer obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       return obj.S0();
    }
    public Rect getWholeRect(){
       Object obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOutBoxRect();
    }
    public final boolean h(){
       int[] obj = PatchProxy.apply(null, this, NewTagStickerElement.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getTextStickerAirWallLimits();
       if (obj != null && obj.length == 4) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             if (obj[i]) {
                return false;
             }
             i = i + 1;
          }
       }
       return true;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "10")) {
          return;
       }
       Rect rect = b.e.e();
       float f = (((float)(this.mContainerWidth - (a1.e(18.00f) * 2)) / this.mBaseDrawerData.A()) - (float)rect.left) - (float)rect.right;
       float f1 = ((((float)this.mContainerWidth - (this.mBaseDrawerData.o().left + this.mBaseDrawerData.o().right)) / this.mBaseDrawerData.A()) - (float)rect.left) - (float)rect.right;
       Object[] objArray = new Object[0];
       a.D().w(this.TAG, "updateMaxWidth, mContainerWidth = "+this.mContainerWidth+", scale = "+this.mBaseDrawerData.A()+", newMaxWidth = "+f+", newDrawMaxWidth = "+f1, objArray);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       tmBaseDrawer.Q = q.t(f, f1);
       return;
    }
    public View initView(DecorationContainerView p0){
       BaseDrawer obj = PatchProxy.applyOneRefs(p0, this, NewTagStickerElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.setContainerView(p0);
       this.mContainerWidth = p0.getWidth();
       if (this.editTagStickerElementData.T0().b > null && this.editTagStickerElementData.T0().c > null) {
          obj = this.mBaseDrawerData;
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
          obj.V0(this.editTagStickerElementData.T0().b, this.editTagStickerElementData.T0().c);
       }else {
          obj = this.mBaseDrawerData;
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
          obj.V0(p0.getWidth(), p0.getHeight());
       }
       this.i();
       EditTagStickerEditText.l.a(k1.i());
       Context context = p0.getContext();
       a.o(context, "decorationContainerView.context");
       Context context1 = p0.getContext();
       a.o(context1, "decorationContainerView.context");
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       NewTagStickerLayout newTagSticke = new NewTagStickerLayout(context, new NewTagStickerEditText(context1, tmBaseDrawer));
       this.mStickerView = newTagSticke;
       boolean b = false;
       newTagSticke.setAcceptTouchEvent(b);
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.a(this.textChangeWatcher);
       NewTagStickerElement tmStickerVie1 = this.mStickerView;
       if (tmStickerVie1 == null) {
          a.S("mStickerView");
       }
       int i = (int)tmStickerVie1.getContentRect().width();
       NewTagStickerElement tmStickerVie2 = this.mStickerView;
       if (tmStickerVie2 == null) {
          a.S("mStickerView");
       }
       AbsoluteLayout$LayoutParams layoutParams = new AbsoluteLayout$LayoutParams(i, (int)tmStickerVie2.getContentRect().height(), b, b);
       NewTagStickerElement tmStickerVie3 = this.mStickerView;
       if (tmStickerVie3 == null) {
          a.S("mStickerView");
       }
       tmStickerVie3.setLayoutParams(layoutParams);
       BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.P(tmStickerVie.getContentRect().width());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.M(tmStickerVie.getContentRect().height());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.Q0(tmStickerVie.getContentRect().width());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.P0(tmStickerVie.getContentRect().height());
       this.mIsNeedReGenerateFile = true;
       tmBaseDrawer1 = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       String str = tmBaseDrawer1.S0();
       this.mPreviousText = str;
       if (!TextUtils.x(str)) {
          tmStickerVie3 = this.mStickerView;
          if (tmStickerVie3 == null) {
             a.S("mStickerView");
          }
          tmStickerVie3.f(this.mPreviousText);
       }
       tmStickerVie3 = this.mStickerView;
       if (tmStickerVie3 == null) {
          a.S("mStickerView");
       }
       return tmStickerVie3;
    }
    public boolean interceptTouchEvent(){
       return false;
    }
    public boolean isInteractSticker(){
       return true;
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       Rect obj;
       float f;
       if (PatchProxy.isSupport(NewTagStickerElement.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewTagStickerElement.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getBaseDrawerContentRect();
       int i = 2;
       boolean b = true;
       if (this.h()) {
          f = (float)0;
          if (p0 - f > 0) {
             if (this.mBaseDrawerData.o().right - f >= 0) {
                if ((((float)obj.right + p0) + this.mBaseDrawerData.o().right) - (float)this.mEditRect.width() > 0) {
                label_00b4 :
                   b = false;
                }
             }else if(obj.left < (this.mEditRect.width() / i) || (float)(this.mEditRect.width() - obj.left) - (- this.mBaseDrawerData.o().right) > 0){
             }
          }else if(this.mBaseDrawerData.o().left - f >= 0){
             if (((float)obj.left + p0) - this.mBaseDrawerData.o().left < 0) {
             }
          }else if((float)obj.right - (- this.mBaseDrawerData.o().left) > 0){
          }
          return b;
       }else {
          int[] textStickerA = this.getTextStickerAirWallLimits();
          float f1 = (float)textStickerA[0];
          f = (float)(this.mEditRect.width() - textStickerA[i]);
          float f2 = (float)0;
          if (p0 - f2 >= 0 || (f1 - ((float)obj.left + p0) >= 0 && (p0 - f2 < 0 || ((float)obj.right + p0) - f >= 0))) {
             b = false;
          }
          return b;
       }
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       Rect obj;
       float f;
       if (PatchProxy.isSupport(NewTagStickerElement.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewTagStickerElement.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getBaseDrawerContentRect();
       int i = 0;
       if (this.h()) {
          f = (float)i;
          if (p0 - f > 0) {
             if (this.mBaseDrawerData.o().bottom - f >= 0) {
                if ((((float)obj.bottom + p0) + this.mBaseDrawerData.o().bottom) - (float)this.mEditRect.height() <= 0) {
                label_00b3 :
                   i = true;
                }
             }else if(obj.top < (this.mEditRect.height() / 2) || (float)(this.mEditRect.height() - obj.top) - (- this.mBaseDrawerData.o().bottom) > 0){
                goto label_00b3 ;
             }
          }else if(this.mBaseDrawerData.o().top - f >= 0){
             if (((float)obj.top + p0) - this.mBaseDrawerData.o().top >= 0) {
                goto label_00b3 ;
             }
          }else if((float)obj.bottom - (- this.mBaseDrawerData.o().top) > 0){
             goto label_00b3 ;
          }
          return i;
       }else {
          int[] textStickerA = this.getTextStickerAirWallLimits();
          float f1 = (float)textStickerA[1];
          f = (float)(this.mEditRect.height() - textStickerA[3]);
          float f2 = (float)i;
          if (p0 - f2 < 0 && (f1 - ((float)obj.top + p0) < 0 || (p0 - f2 >= 0 && ((float)obj.bottom + p0) - f < 0))) {
             i = true;
          }
          return i;
       }
    }
    public boolean needBlockedByAirWall(){
       return true;
    }
    public boolean needGenerateBitmap(NewStickerElementData p0){
       boolean b;
       BaseDrawer obj = PatchProxy.applyOneRefs(p0, this, NewTagStickerElement.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elementData");
       if (!p0 instanceof NewTagStickerElementData) {
          b = super.needGenerateBitmap(p0);
       }else if(!super.needGenerateBitmap(p0)){
          obj = this.mBaseDrawerData;
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
          if (TextUtils.n(p0.S0(), obj.S0())) {
             b = false;
          }
       }
       b = true;
       return b;
    }
    public void onDoubleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "11")) {
          return;
       }
       super.onDoubleFingerScaleAndRotateEnd();
       this.i();
       return;
    }
    public void onSingleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "12")) {
          return;
       }
       super.onSingleFingerScaleAndRotateEnd();
       this.i();
       return;
    }
    public final void removeOnTextChangeWatcher(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "9")) {
          return;
       }
       a.p(p0, "watcher");
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.c(p0);
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "17")) {
          return;
       }
       super.select();
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       this.mPreviousText = tmBaseDrawer.S0();
       return;
    }
    public void selectedTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "18")) {
          return;
       }
       super.selectedTap(p0);
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       EditTagStickerEditText mEditText = tmStickerVie.getMEditText();
       if (!PatchProxy.applyVoidOneRefs(mEditText, this, NewTagStickerElement.class, "19")) {
          mEditText.setCursorVisible(true);
          mEditText.setFocusable(true);
          mEditText.setFocusableInTouchMode(true);
          mEditText.requestFocus();
          n.b0(mEditText.getContext(), mEditText, false);
       }
       return;
    }
    public void sendCancelEvent(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "20")) {
          return;
       }
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.d();
       return;
    }
    public void setAcceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(NewTagStickerElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NewTagStickerElement.class, "2")) {
          return;
       }
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.setAcceptTouchEvent(p0);
       return;
    }
    public final void setMForceReGenerateFile(boolean p0){
       this.mForceReGenerateFile = p0;
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement.class, "16")) {
          return;
       }
       super.unSelect();
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       int i = 1;
       if (!(a.g(this.mPreviousText, tmBaseDrawer.S0()) ^ i) && this.mForceReGenerateFile == null) {
          i = false;
       }
       this.mIsNeedReGenerateFile = i;
       this.mForceReGenerateFile = false;
       BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       this.mPreviousText = tmBaseDrawer1.S0();
       if (this.isAdded()) {
          NewTagStickerElement tmStickerVie = this.mStickerView;
          if (tmStickerVie == null) {
             a.S("mStickerView");
          }
          tmStickerVie.e();
       }
       return;
    }
    public void updateElement(NewStickerElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "28")) {
          return;
       }
       a.p(p0, "elementData");
       this.setNeedGenerateBitmap(this.needGenerateBitmap(p0));
       this.mBaseDrawerData.R0(p0);
       if (p0 instanceof NewTagStickerElementData) {
          String str = p0.S0();
          NewTagStickerElement tmStickerVie = this.mStickerView;
          if (tmStickerVie == null) {
             a.S("mStickerView");
          }
          if (a.g(str, String.valueOf(tmStickerVie.getMEditText().getText())) ^ 1) {
             NewTagStickerElement tmStickerVie1 = this.mStickerView;
             if (tmStickerVie1 == null) {
                a.S("mStickerView");
             }
             tmStickerVie1.post(new NewTagStickerElement$b(this, p0));
          }
       }
       NewTagStickerElement.calculateAndUpdateDimen$default(this, false, 1, null);
       this.getContainerView().T();
       NewTagStickerElement tmStickerVie2 = this.mStickerView;
       if (tmStickerVie2 == null) {
          a.S("mStickerView");
       }
       tmStickerVie2.invalidate();
       this.mIsNeedReGenerateFile = this.isNeedGenerateBitmap();
       return;
    }
    public final void updateLimit(int p0,int p1){
       if (PatchProxy.isSupport(NewTagStickerElement.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NewTagStickerElement.class, "24")) {
          return;
       }
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       tmBaseDrawer.V0(p0, p1);
       return;
    }
    public final void updateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "3")) {
          return;
       }
       String str = "newText";
       a.p(p0, str);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData");
       if (!PatchProxy.applyVoidOneRefs(p0, tmBaseDrawer, NewTagStickerElementData.class, "2")) {
          a.p(p0, str);
          tmBaseDrawer.R = p0;
       }
       NewTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.f(p0);
       return;
    }
    public void updateView(EditDecorationContainerViewV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElement.class, "7")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       return;
    }
}
