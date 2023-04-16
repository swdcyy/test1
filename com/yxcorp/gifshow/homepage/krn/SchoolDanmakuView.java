package com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import hta.c;
import android.util.AttributeSet;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.event.a;
import oj0.a;
import android.view.MotionEvent;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.animation.LinearInterpolator;
import com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import ita.c;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ita.a;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.homepage.krn.c;
import com.yxcorp.gifshow.homepage.krn.d;
import erd.g;

public class SchoolDanmakuView extends RecyclerView	// class@001764
{
    public b b;
    public b c;
    public LinearInterpolator d;
    public int e;
    public int f;
    public final a g;
    public static final int h;

    public void SchoolDanmakuView(Context p0){
       super(p0);
       this.e = 0;
       this.g = new c(this);
       this.y();
    }
    public void SchoolDanmakuView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 0;
       this.g = new c(this);
       this.y();
    }
    public void SchoolDanmakuView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0;
       this.g = new c(this);
       this.y();
    }
    public static void x(SchoolDanmakuView p0,Map p1){
       p0.z();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SchoolDanmakuView.class, "6")) {
          return;
       }
       this.release();
       a.b().c("sendHopeSuccess", this.g);
       super.onDetachedFromWindow();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return true;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, SchoolDanmakuView.class, "5")) {
          return;
       }
       SchoolDanmakuView tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       tb = this.c;
       if (tb != null) {
          tb.dispose();
       }
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, SchoolDanmakuView.class, "1")) {
          return;
       }
       this.setLayoutParams(new RecyclerView$LayoutParams(-1, -2));
       this.setLayoutManager(new StaggeredGridLayoutManager(3, 0));
       this.d = new LinearInterpolator();
       this.addOnScrollListener(new SchoolDanmakuView$a(this));
       this.addItemDecoration(new e(0, a1.e(12.00f), 0));
       a.b().a("sendHopeSuccess", this.g);
       return;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SchoolDanmakuView.class, "3")) {
          return;
       }
       this.release();
       a uoa = PatchProxy.apply(objArray, objArray, c.class, "2");
       if (uoa == PatchProxyResult.class) {
          uoa = b.a(-124170414);
       }
       this.c = uoa.a(this.f).map(new e()).subscribe(new c(this), d.b);
       return;
    }
}
