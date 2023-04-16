package com.kuaishou.live.core.show.sticker.widget.SingleEditTextStickerContainer;
import kk2.v0;
import com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.sticker.model.StickerInfo;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import android.widget.FrameLayout;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import nk2.c;
import android.text.TextWatcher;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import nk2.d;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.Color;
import lnc.a1;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer$a;
import a27.c;
import android.text.Editable;
import android.view.MotionEvent;

public class SingleEditTextStickerContainer extends BaseStickerContainer implements v0	// class@0010bf
{
    public EmojiEditText r;
    public KwaiImageView s;

    public void SingleEditTextStickerContainer(Context p0){
       super(p0, null);
    }
    public void SingleEditTextStickerContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SingleEditTextStickerContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, SingleEditTextStickerContainer.class, "1")) {
       }else {
          this.d(false);
          this.c(true);
       }
       return;
    }
    public static SingleEditTextStickerContainer h(Context p0,StickerInfo p1,boolean p2,boolean p3){
       Object[] obj;
       StickerInfo mTextMaxRow;
       EmojiEditText uEmojiEditTe;
       if (PatchProxy.isSupport(SingleEditTextStickerContainer.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, SingleEditTextStickerContainer.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       SingleEditTextStickerContainer singleEditTe = a.a(p0, R.layout.arg_RES_7f0d09d6);
       int i = 8;
       if (b.c(p1.mImageUrls)) {
          singleEditTe.setVisibility(i);
       }
       obj = null;
       int i1 = 0x7f0a3b64;
       if (p3) {
          Objects.requireNonNull(singleEditTe);
          if (!PatchProxy.applyVoid(obj, singleEditTe, SingleEditTextStickerContainer.class, "3")) {
             singleEditTe.s = singleEditTe.findViewById(0x7f0a3b60);
             uEmojiEditTe = singleEditTe.findViewById(i1);
             singleEditTe.r = uEmojiEditTe;
             uEmojiEditTe.setVisibility(i);
             singleEditTe.r.addTextChangedListener(new c(singleEditTe));
          }
       }else {
          Objects.requireNonNull(singleEditTe);
          if (!PatchProxy.applyVoidOneRefs(p1, singleEditTe, SingleEditTextStickerContainer.class, "4")) {
             singleEditTe.s = singleEditTe.findViewById(0x7f0a3b60);
             uEmojiEditTe = singleEditTe.findViewById(i1);
             singleEditTe.r = uEmojiEditTe;
             uEmojiEditTe.setVisibility(i);
             mTextMaxRow = p1.mTextMaxRow;
             if (mTextMaxRow == 1) {
                singleEditTe.r.setSingleLine();
             }else {
                singleEditTe.r.setMaxLines(mTextMaxRow);
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(singleEditTe, p1, obj, SingleEditTextStickerContainer.class, "5")) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live");
          uoa.d(ImageSource.ICON);
          StickerInfo mImageUrls = p1.mImageUrls;
          CDNUrl[] uCDNUrlArray = new CDNUrl[mImageUrls.size()];
          singleEditTe.s.Y(mImageUrls.toArray(uCDNUrlArray), uoa.a(), new d(singleEditTe));
       }
       try{
          singleEditTe.r.setTextColor(Color.parseColor(p1.mTextFontColor));
       }catch(java.lang.IllegalArgumentException e0){
          singleEditTe.r.setTextColor(a1.a(R.color.arg_RES_7f0619ea));
       }
       if (p1.mTextFontSize <= null) {
          p1.mTextFontSize = 10;
       }
       singleEditTe.r.setTextSize(1, (float)p1.mTextFontSize);
       singleEditTe.r.setText(p1.mTextContent);
       mTextMaxRow = p1.mTextMaxRow;
       if (mTextMaxRow > null) {
          singleEditTe.r.setLines(mTextMaxRow);
       }
       FrameLayout$LayoutParams layoutParams = singleEditTe.r.getLayoutParams();
       layoutParams.topMargin = a1.e((float)p1.mTextViewTopMargin);
       int i2 = a1.e((float)p1.mTextViewLeftMargin);
       layoutParams.leftMargin = i2;
       layoutParams.rightMargin = i2;
       singleEditTe.r.setLayoutParams(layoutParams);
       singleEditTe.e(p2);
       singleEditTe.setStickerInfo(p1);
       return singleEditTe;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SingleEditTextStickerContainer.class, "8")) {
          return;
       }
       SingleEditTextStickerContainer tr = this.r;
       if (tr != null && (tr.isFocused() && this.getOnActionListener() != null)) {
          this.getOnActionListener().a(this);
       }
    label_0023 :
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SingleEditTextStickerContainer.class, "6")) {
          return;
       }
       if (!this.getEditText().hasFocus()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, SingleEditTextStickerContainer.class, "7")) {
          this.getEditText().clearFocus();
          c.d(this.getEditText());
          if (this.getEditText().getText() != null && !((this.getEditText().getText().toString()).trim()).equals(this.getStickInfo().mTextContent)) {
             this.getStickInfo().mTextContent = this.getEditText().getText().toString();
             if (this.getOnActionListener() != null) {
                this.getOnActionListener().i(this);
             }
          }
       }
       return;
    }
    public final EditText getEditText(){
       return this.r;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, SingleEditTextStickerContainer.class, "11")) {
          return;
       }
       SingleEditTextStickerContainer tr = this.r;
       if (tr != null && tr.hasFocus()) {
          c.d(this.r);
       }
       return;
    }
    public void onAttachedToWindow(){
       SingleEditTextStickerContainer tr;
       if (PatchProxy.applyVoid(null, this, SingleEditTextStickerContainer.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.f()) {
          if (this.getStickInfo().mShouldShowKeyboardDirectly != null) {
             tr = this.r;
             if (tr != null) {
                tr.requestFocus();
                c.e(this.r);
                tr = this.r;
                tr.setSelection(tr.getEditableText().length());
             }
          }else {
             this.r.clearFocus();
          }
          this.getStickInfo().mShouldShowKeyboardDirectly = false;
       }else {
          tr = this.r;
          if (tr != null) {
             tr.setEnabled(false);
             this.r.setClickable(false);
             this.r.setFocusable(false);
             this.r.clearFocus();
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SingleEditTextStickerContainer obj = PatchProxy.applyOneRefs(p0, this, SingleEditTextStickerContainer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       if (obj != null && obj.hasFocus()) {
          return this.r.onTouchEvent(p0);
       }
       return super.onTouchEvent(p0);
    }
}
