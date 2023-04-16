package com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetLineView;
import ml8.d;
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
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLineText;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetTextModel;
import android.widget.TextView;
import android.graphics.Color;
import java.lang.CharSequence;
import android.os.CountDownTimer;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetLineView$a;
import p91.m;
import ekd.m1;

public class LiveActivityWidgetLineView extends LinearLayout implements d	// class@0016fb
{
    public TextView b;
    public TextView c;
    public CountDownTimer d;
    public m e;
    public LiveActivityWidgetProto$LiveActivityWidgetLineText f;

    public void LiveActivityWidgetLineView(Context p0){
       super(p0, null);
    }
    public void LiveActivityWidgetLineView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityWidgetLineView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityWidgetLineView.class, "5")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09c0, this);
          this.doBindView(this);
       }
       return;
    }
    public void a(LiveActivityWidgetProto$LiveActivityWidgetLineText p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityWidgetLineView.class, "4")) {
          return;
       }
       this.f = p0;
       this.b(p0.firstFieldText, this.b);
       this.b(p0.secondFieldText, this.c);
       return;
    }
    public final void b(LiveActivityWidgetProto$LiveActivityWidgetTextModel p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityWidgetLineView.class, "6")) {
          return;
       }
       if (p0 != null) {
          int i = 0;
          try{
             p1.setVisibility(i);
             p1.setTextColor(Color.parseColor(p0.textColor));
          }catch(java.lang.IllegalArgumentException e0){
          }
          if (p0.hasText() && p0.textType == 1) {
             p1.setText(p0.getText());
          }else if(p0.hasTimestamp() && p0.textType == 2){
             LiveActivityWidgetLineView td = this.d;
             if (td != null) {
                td.cancel();
             }
             LiveActivityWidgetLineView$a uoa = new LiveActivityWidgetLineView$a(this, (p0.getTimestamp() - this.e.s()), 1000, p1);
             this.d = td;
             td.start();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityWidgetLineView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1877);
       this.c = m1.f(p0, 0x7f0a1878);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveActivityWidgetLineView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       LiveActivityWidgetLineView tf = this.f;
       if (tf != null) {
          this.a(tf);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveActivityWidgetLineView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveActivityWidgetLineView td = this.d;
       if (td != null) {
          td.cancel();
          this.d = null;
       }
       return;
    }
    public void setLiveBasicContext(m p0){
       this.e = p0;
    }
}
