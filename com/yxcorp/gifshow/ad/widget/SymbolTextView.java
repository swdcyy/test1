package com.yxcorp.gifshow.ad.widget.SymbolTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.TextPaint;
import java.lang.StringBuilder;

public class SymbolTextView extends TextView	// class@001925
{

    public void SymbolTextView(Context p0){
       super(p0);
    }
    public void SymbolTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SymbolTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SymbolTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SymbolTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (!this.getLineCount()) {
          return;
       }
       if (this.getLayout() == null) {
          return;
       }
       if (!this.getLayout().getEllipsisCount((this.getLineCount() - 1))) {
          return;
       }
       String str = this.getText().toString();
       String str1 = str.substring((str.length() - 1), str.length());
       int i = this.getMeasuredWidth() * this.getLineCount();
       while (this.getPaint().measureText(str+"бн"+str1) - (float)i > 0) {
          int i1 = str.length() - 2;
          str = str.substring(0, i1);
       }
       this.setText(str+"бн"+str1);
       return;
    }
}
