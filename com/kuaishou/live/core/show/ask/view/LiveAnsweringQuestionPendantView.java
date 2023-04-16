package com.kuaishou.live.core.show.ask.view.LiveAnsweringQuestionPendantView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import android.widget.TextView;
import java.lang.CharSequence;

public class LiveAnsweringQuestionPendantView extends LinearLayout implements d	// class@0009d8
{
    public TextView b;
    public TextView c;

    public void LiveAnsweringQuestionPendantView(Context p0){
       super(p0, null, 0);
    }
    public void LiveAnsweringQuestionPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAnsweringQuestionPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnsweringQuestionPendantView.class, "2")) {
       }else {
          a.g(p0.getSystemService("layout_inflater"), R.layout.arg_RES_7f0d09db, this, true);
          this.doBindView(this);
          this.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnsweringQuestionPendantView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a18e9);
       this.c = m1.f(p0, 0x7f0a18e6);
       return;
    }
    public void setAnsweringQuestionContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnsweringQuestionPendantView.class, "4")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
    public void setAnsweringQuestionTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnsweringQuestionPendantView.class, "3")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
}
