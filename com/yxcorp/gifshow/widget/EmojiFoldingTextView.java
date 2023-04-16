package com.yxcorp.gifshow.widget.EmojiFoldingTextView;
import com.kwai.library.widget.textview.FoldingTextView;
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
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import android.widget.TextView$BufferType;
import tyc.a1;
import com.yxcorp.gifshow.widget.EmojiFoldingTextView$a;
import android.text.TextWatcher;
import android.text.Editable;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;

public class EmojiFoldingTextView extends FoldingTextView	// class@001837
{
    public KSTextDisplayHandler s;
    public boolean t;
    public boolean u;
    public boolean v;

    public void EmojiFoldingTextView(Context p0){
       super(p0);
       this.t = false;
       this.u = false;
       this.v = false;
       this.w();
    }
    public void EmojiFoldingTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t = false;
       this.u = false;
       this.v = false;
       this.w();
    }
    public void EmojiFoldingTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = false;
       this.u = false;
       this.v = false;
       this.w();
    }
    public void append(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(EmojiFoldingTextView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EmojiFoldingTextView.class, "6")) {
          return;
       }
       super.append(p0, p1, p2);
       return;
    }
    public CharSequence getText(){
       String str;
       CharSequence obj = PatchProxy.apply(null, this, EmojiFoldingTextView.class, "4");
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
       if (PatchProxy.isSupport(EmojiFoldingTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EmojiFoldingTextView.class, "3")) {
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
    public void postInvalidate(){
       if (PatchProxy.applyVoid(null, this, EmojiFoldingTextView.class, "2")) {
          return;
       }
       this.u = true;
       super.postInvalidate();
       return;
    }
    public void setPreventDeadCycleInvalidate(boolean p0){
       this.t = p0;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmojiFoldingTextView.class, "5")) {
          return;
       }
       super.setText(p0, p1);
       return;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, EmojiFoldingTextView.class, "1")) {
          return;
       }
       this.s = new a1(this);
       this.addTextChangedListener(new EmojiFoldingTextView$a(this));
       if (this.getText() != null && this.getText().length() > 0) {
          this.s.a(this.getEditableText());
       }
       return;
    }
}
