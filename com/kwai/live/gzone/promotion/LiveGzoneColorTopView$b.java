package com.kwai.live.gzone.promotion.LiveGzoneColorTopView$b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import a2.i0;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView;
import android.content.Context;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import android.view.View;

public final class LiveGzoneColorTopView$b	// class@000daa
{
    public List a;
    public List b;
    public boolean c;
    public int d;

    public void LiveGzoneColorTopView$b(){
       super();
       this.b = new ArrayList();
       this.d = 50;
    }
    public void a(int p0){
       LiveGzoneColorTopView$b uob = LiveGzoneColorTopView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.b == null) {
          this.b = new ArrayList();
       }
       if (this.b.size() >= p0) {
          return;
       }else {
          for (int i = this.b.size(); i < p0; i = i + 1) {
             this.b.add(Integer.valueOf(i0.l()));
          }
          return;
       }
    }
    public ViewGroup b(ViewGroup p0,int p1){
       LiveGzoneColorTopView obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGzoneColorTopView$b uob = LiveGzoneColorTopView$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.c == null) {
          return p0;
       }else if(p0 instanceof LiveGzoneColorTopView){
          p0.setTopColor(this.a.get(p1).intValue());
          p0.a(this.c);
       }else {
          obj = new LiveGzoneColorTopView(p0.getContext());
          if (!q.f(this.b)) {
             if (PatchProxy.isSupport(uob)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uob, "3");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                label_007e :
                   obj.setId(i);
                }
             }
             LiveGzoneColorTopView$b tb = this.b;
             if (tb == null || tb.size() <= p1) {
                this.a((p1 + 1));
             }
             i = this.b.get(p1).intValue();
             goto label_007e ;
          }
          obj.setPadding(0, n.c(obj.getContext(), (float)this.d), 0, 0);
          obj.setTopColor(this.a.get(p1).intValue());
          obj.a(this.c);
          p0.addView(obj);
          LiveGzoneColorTopView liveGzoneCol = obj;
       }
       return p0;
    }
    public void c(boolean p0){
       this.c = p0;
    }
    public void d(List p0){
       this.a = p0;
    }
    public void e(int p0){
       this.d = p0;
    }
}
