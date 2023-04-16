package com.yxcorp.gifshow.prettify.widget.PrettifyTextView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;

public class PrettifyTextView extends LinearLayout	// class@0011de
{
    public TextView b;
    public TextView c;

    public void PrettifyTextView(Context p0){
       super(p0, null);
    }
    public void PrettifyTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PrettifyTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, PrettifyTextView.class, "1")) {
       }else {
          this.setOrientation(1);
          a.c(this.getContext(), R.layout.arg_RES_7f0d11a6, this);
          this.b = this.findViewById(0x7f0a31ca);
          this.c = this.findViewById(0x7f0a31c5);
       }
       return;
    }
    public CharSequence getName(){
       Object obj = PatchProxy.apply(null, this, PrettifyTextView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getText();
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTextView.class, "2")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
    public void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTextView.class, "4")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
