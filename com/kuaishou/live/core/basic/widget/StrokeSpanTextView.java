package com.kuaishou.live.core.basic.widget.StrokeSpanTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.SpannedString;
import q38.a;
import android.text.Editable;
import android.widget.TextView;

public class StrokeSpanTextView extends AppCompatTextView	// class@000915
{

    public void StrokeSpanTextView(Context p0){
       super(p0);
    }
    public void StrokeSpanTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void StrokeSpanTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrokeSpanTextView.class, "1")) {
          return;
       }
       SpannedString spannedStrin = null;
       int i = 0;
       if (this.getText() instanceof SpannedString) {
          spannedStrin = this.getText().getSpans(i, this.getText().length(), a.class);
       }else if(this.getEditableText() != null){
          spannedStrin = this.getEditableText().getSpans(i, this.getText().length(), a.class);
       }
       if (spannedStrin != null && spannedStrin.length > 0) {
          int len = spannedStrin.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             spannedStrin[i1].b();
          }
          super.onDraw(p0);
          len = spannedStrin.length;
          for (; i < len; i = i + 1) {
             spannedStrin[i].a();
          }
       }
       super.onDraw(p0);
       return;
    }
}
