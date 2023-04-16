package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import p79.h;
import android.os.Handler;
import android.os.Looper;
import t36.f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$c;
import th0.n;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$b;

public class a extends h	// class@000df6
{
    public Handler v;
    public f w;

    public void a(){
       super();
       this.v = new Handler(Looper.getMainLooper());
       this.w = new f();
    }
    public void L(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       p0.itemView.setVisibility(0);
       return;
    }
    public ViewPropertyAnimator M(RecyclerView$ViewHolder p0,View p1,ViewPropertyAnimator p2,ArrayList p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("TimelineItemAnimator", "addItemAnimatorImpl");
       a$a uoa = new a$a(this, p0, p1, p2, p3);
       p2.setDuration(0).setInterpolator(new e()).setListener(v7);
       return p2;
    }
    public void N(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             return;
          }
       }
       Log.b("TimelineItemAnimator", "animateMoveImpl");
       RecyclerView$ViewHolder itemView = p0.itemView;
       int i = p3 - p1;
       int i1 = p4 - p2;
       float f = 0;
       if (i) {
          itemView.animate().translationX(f);
       }
       if (i1) {
          itemView.animate().translationY(f);
       }
       ViewPropertyAnimator viewProperty = itemView.animate();
       this.p.add(p0);
       a$c uoc = new a$c(this, p0, i, itemView, i1, viewProperty);
       viewProperty.setInterpolator(this.t).setDuration(200).setListener(200).start();
       return;
    }
    public void Q(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "8");
    }
    public void U(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       p0.itemView.setAlpha(0);
       return;
    }
    public ViewPropertyAnimator V(RecyclerView$ViewHolder p0,View p1,ViewPropertyAnimator p2,ArrayList p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("TimelineItemAnimator", "removeItemAnimatorImpl");
       a$b uob = new a$b(this, p0, p2, p1, p3);
       p2.setDuration(240).setInterpolator(new n()).alpha(0).setListener(v7);
       return p2;
    }
}
