package com.yxcorp.gifshow.homepage.research.ResearchWidget;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import com.kwai.library.widget.seekbar.ScoreSeekBar;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class ResearchWidget extends FrameLayout implements d	// class@0017f4
{
    public TextView b;
    public ScoreSeekBar c;
    public TextView d;
    public TextView e;

    public void ResearchWidget(Context p0){
       super(p0);
       this.a(p0);
    }
    public void ResearchWidget(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void ResearchWidget(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResearchWidget.class, "2")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d05e9, this);
       this.doBindView(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResearchWidget.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a35bb);
       this.e = m1.f(p0, 0x7f0a35bd);
       this.c = m1.f(p0, 0x7f0a35bc);
       this.d = m1.f(p0, 0x7f0a35be);
       return;
    }
    public int getAnswerPosition(){
       Object obj = PatchProxy.apply(null, this, ResearchWidget.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getProgress();
    }
    public int getScore(){
       Object obj = PatchProxy.apply(null, this, ResearchWidget.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getScore();
    }
}
