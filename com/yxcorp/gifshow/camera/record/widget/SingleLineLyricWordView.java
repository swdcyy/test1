package com.yxcorp.gifshow.camera.record.widget.SingleLineLyricWordView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.Lyrics$Line;
import com.yxcorp.gifshow.camera.record.widget.KtvLineView;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import android.view.View;
import ekd.m1;

public class SingleLineLyricWordView extends FrameLayout implements d	// class@000fdf
{
    public List b;
    public List c;
    public Lyrics d;
    public int e;
    public int f;
    public KtvLineView g;

    public void SingleLineLyricWordView(Context p0){
       super(p0);
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.e = 0;
       this.f = -1;
    }
    public void SingleLineLyricWordView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.e = 0;
       this.f = -1;
    }
    public void a(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleLineLyricWordView.class, "3")) {
          return;
       }
       if (!this.b(p0)) {
          this.g.p(null);
          this.d = null;
          this.c();
          return;
       }else {
          this.c();
          this.d = p0;
          Iterator iterator = p0.mLines.iterator();
          while (iterator.hasNext()) {
             Lyrics$Line line = iterator.next();
             this.b.add(Integer.valueOf(line.mStart));
             int i = line.mStart + line.mDuration;
             this.c.add(Integer.valueOf(i));
          }
          this.g.p(this.d.mLines.get(0));
          return;
       }
    }
    public final boolean b(Lyrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SingleLineLyricWordView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !q.f(p0.mLines))? true: false;
       return b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SingleLineLyricWordView.class, "4")) {
          return;
       }
       this.b.clear();
       this.c.clear();
       this.e = 0;
       this.f = -1;
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(SingleLineLyricWordView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SingleLineLyricWordView.class, "5")) {
          return;
       }
       if (!this.b(this.d)) {
          return;
       }
       SingleLineLyricWordView singleLineLy = null;
       SingleLineLyricWordView singleLineLy1 = (p0 > this.f)? 1: null;
       if (singleLineLy1) {
          singleLineLy = this.e;
       }
       while (singleLineLy < this.d.mLines.size()) {
          if (p0 >= this.b.get(singleLineLy).intValue() && (p0 <= this.c.get(singleLineLy).intValue() && this.e != singleLineLy)) {
             this.e = singleLineLy;
             this.g.p(this.d.mLines.get(singleLineLy));
             break ;
          }
          singleLineLy = singleLineLy + 1;
       }
       this.f = p0;
       this.g.s(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleLineLyricWordView.class, "1")) {
          return;
       }
       this.g = m1.f(p0, 0x7f0a0515);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SingleLineLyricWordView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.g.setSelected(true);
       return;
    }
}
