package com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.widget.EmojiTextView$b;
import android.widget.TextView$BufferType;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.yxcorp.gifshow.widget.EmojiTextView$a;
import android.text.TextWatcher;
import android.text.Editable;

public class EmojiTextView extends SizeAdjustableTextView	// class@00183a
{
    public EmojiTextView$b q;
    public KSTextDisplayHandler r;
    public boolean s;
    public boolean t;
    public boolean u;

    public void EmojiTextView(Context p0){
       super(p0);
       this.s = false;
       this.t = false;
       this.u = false;
       this.u();
    }
    public void EmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = false;
       this.t = false;
       this.u = false;
       this.u();
    }
    public void EmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.s = false;
       this.t = false;
       this.u = false;
       this.u();
    }
    public void append(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(EmojiTextView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EmojiTextView.class, "8")) {
          return;
       }
       super.append(p0, p1, p2);
       return;
    }
    public int getBaseline(){
       Object obj = PatchProxy.apply(null, this, EmojiTextView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return super.getBaseline();
       }catch(java.lang.IndexOutOfBoundsException e0){
          u1.Q("EmojiTextView_getBaseline", Log.f(e0));
          return -1;
       }
    }
    public KSTextDisplayHandler getKSTextDisplayHandler(){
       return this.r;
    }
    public CharSequence getText(){
       String str;
       CharSequence obj = PatchProxy.apply(null, this, EmojiTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getText();
       if (obj == null) {
          str = "";
       }
       return str;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(EmojiTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EmojiTextView.class, "3")) {
          return;
       }
       try{
          super.onMeasure(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e0){
          String str = this.getText().toString();
          try{
             this.setText(str);
             super.onMeasure(p0, p1);
          }catch(java.lang.IndexOutOfBoundsException e0){
             this.setText("");
             super.onMeasure(p0, p1);
          }
       }
       return;
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, EmojiTextView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onPreDraw();
       }catch(java.lang.IndexOutOfBoundsException e0){
          u1.Q("EmojiTextView_onPreDraw", this.getText().toString());
          this.setText("");
          return super.onPreDraw();
       }
    }
    public boolean performLongClick(){
       Object obj = PatchProxy.apply(null, this, EmojiTextView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.performLongClick();
    }
    public void postInvalidate(){
       if (PatchProxy.applyVoid(null, this, EmojiTextView.class, "2")) {
          return;
       }
       this.t = true;
       super.postInvalidate();
       return;
    }
    public void setKSTextDisplayHandler(KSTextDisplayHandler p0){
       this.r = p0;
    }
    public void setOnPressedListener(EmojiTextView$b p0){
       this.q = p0;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(EmojiTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EmojiTextView.class, "9")) {
          return;
       }
       super.setPressed(p0);
       if (this.isPressed() ^ p0) {
          EmojiTextView tq = this.q;
          if (tq != null) {
             tq.a(this, p0);
          }
       }
       return;
    }
    public void setPreventDeadCycleInvalidate(boolean p0){
       this.s = p0;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmojiTextView.class, "7")) {
          return;
       }
       super.setText(p0, p1);
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, EmojiTextView.class, "1")) {
          return;
       }
       this.r = new KSTextDisplayHandler(this);
       this.addTextChangedListener(new EmojiTextView$a(this));
       if (this.getText() != null && this.getText().length() > 0) {
          this.r.a(this.getEditableText());
       }
       return;
    }
}
