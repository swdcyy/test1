package com.yxcorp.gifshow.detail.view.PressedTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.TextView;

public class PressedTextView extends AppCompatTextView	// class@001a4c
{

    public void PressedTextView(Context p0){
       super(p0);
    }
    public void PressedTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedTextView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (p0) {
          this.setAlpha(0x3f000000);
       }else {
          this.setAlpha(0x3f800000);
       }
       return;
    }
}
