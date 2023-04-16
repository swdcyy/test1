package com.yxcorp.gifshow.widget.textview.PressedSpanTextView;
import com.kwai.library.widget.textview.MovementTextView;
import android.content.Context;
import rzc.c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.text.method.MovementMethod;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.Layout;

public class PressedSpanTextView extends MovementTextView	// class@0019d1
{
    public c k;

    public void PressedSpanTextView(Context p0){
       super(p0);
       this.k = new c();
    }
    public void PressedSpanTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = new c();
    }
    public void PressedSpanTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = new c();
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, PressedSpanTextView.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, PressedSpanTextView.class, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.getMovementMethod() != null || (this.onCheckIsTextEditor() && (this.isEnabled() && (this.getText() instanceof Spannable && this.getLayout() != null)))){
          b = true;
       }else {
          b = false;
       }
       if (b && (this.getText() instanceof Spannable && this.k.a(p0, this.getText(), this))) {
          return true;
       }else {
          return super.onTouchEvent(p0);
       }
    }
    public void setEnableTextScroll(boolean p0){
       if (PatchProxy.isSupport(PressedSpanTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedSpanTextView.class, "1")) {
          return;
       }
       this.k.b(p0);
       return;
    }
}
