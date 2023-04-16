package com.yxcorp.gifshow.detail.helper.ToolbarTextView;
import b3a.h;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import android.view.View;
import java.lang.Boolean;
import android.text.TextPaint;
import java.lang.CharSequence;

public class ToolbarTextView extends FrameLayout implements h	// class@001568
{
    public TextView b;
    public TextView c;

    public void ToolbarTextView(Context p0){
       super(p0);
    }
    public void ToolbarTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ToolbarTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(float p0){
       if (PatchProxy.isSupport(ToolbarTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ToolbarTextView.class, "2")) {
          return;
       }
       float f = 0x3f800000 - p0;
       if (!PatchProxy.isSupport(ToolbarTextView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(f), this, ToolbarTextView.class, "3")) {
          this.b.setAlpha(p0);
          this.c.setAlpha(f);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, ToolbarTextView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.getChildAt(0);
       this.b = this.getChildAt(1);
       return;
    }
    public void setFakeBoldText(boolean p0){
       if (PatchProxy.isSupport(ToolbarTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToolbarTextView.class, "5")) {
          return;
       }
       this.b.getPaint().setFakeBoldText(p0);
       this.c.getPaint().setFakeBoldText(p0);
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolbarTextView.class, "4")) {
          return;
       }
       this.b.setText(p0);
       this.c.setText(p0);
       return;
    }
}
