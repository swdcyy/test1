package com.kwai.component.photo.reduce.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.Integer;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import yf5.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.component.photo.reduce.e$b;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import ekd.m1;

public class e extends PresenterV2	// class@000ae2
{
    public RecyclerView p;
    public ValueAnimator q;
    public int r;
    public int s;
    public final RecyclerView$i t;

    public void e(){
       super();
       this.t = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p.getAdapter().F0(this.t);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.p.getAdapter().I0(this.t);
       return;
    }
    public void P8(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "5")) {
          return;
       }
       int[] ointArray = new int[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.q = valueAnimato;
       valueAnimato.setInterpolator(new DecelerateInterpolator(2.00f));
       this.q.setDuration(300);
       this.q.addUpdateListener(new m(this));
       this.q.addListener(new e$b(this, p1));
       this.q.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a34da);
       return;
    }
}
