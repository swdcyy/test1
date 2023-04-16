package fx8.l0;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.util.List;
import java.util.Iterator;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.n;
import android.animation.AnimatorSet;
import android.animation.Animator;
import fx8.j0;
import android.animation.Animator$AnimatorListener;
import fx8.k0;

public class l0 extends y	// class@002387
{
    public List h;
    public List i;
    public List j;
    public List k;

    public void l0(){
       super();
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
    }
    public boolean B(RecyclerView$ViewHolder p0){
       return false;
    }
    public boolean C(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       return false;
    }
    public boolean D(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(l0.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, l0.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0.itemView.setTranslationX((float)(p1 - p3));
       this.j.add(p0);
       return 1;
    }
    public boolean E(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.add(p0);
       return true;
    }
    public void j(RecyclerView$ViewHolder p0){
    }
    public void k(){
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, l0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h.isEmpty() && (this.i.isEmpty() && (!this.j.isEmpty() || !this.k.isEmpty())))? true: false;
       return b;
    }
    public void v(){
       Iterator iterator;
       RecyclerView$ViewHolder viewHolder;
       ObjectAnimator objectAnimat;
       l0 ol0 = l0.class;
       if (PatchProxy.applyVoid(null, this, ol0, "3")) {
          return;
       }
       if (!this.h.isEmpty()) {
          iterator = this.h.iterator();
          while (iterator.hasNext()) {
             viewHolder = iterator.next();
             if (PatchProxy.applyVoidOneRefs(viewHolder, this, ol0, "5")) {
                continue ;
             }
             this.i.add(viewHolder);
             objectAnimat = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", new float[2]{0x3f800000,0});
             objectAnimat.setInterpolator(new e());
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", new float[2]{0x3f800000,0});
             objectAnimat1.setInterpolator(new e());
             ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(viewHolder.itemView, "alpha", new float[2]{0x3f800000,0});
             objectAnimat2.setInterpolator(new n());
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(300);
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.start();
             uAnimatorSet.addListener(new j0(this, viewHolder));
          }
          this.h.clear();
       }
       if (!this.j.isEmpty()) {
          iterator = this.j.iterator();
          while (iterator.hasNext()) {
             viewHolder = iterator.next();
             if (PatchProxy.applyVoidOneRefs(viewHolder, this, ol0, "6")) {
                continue ;
             }
             this.k.add(viewHolder);
             RecyclerView$ViewHolder itemView = viewHolder.itemView;
             float[] uofloatArray = new float[]{itemView.getTranslationX(),0};
             objectAnimat = ObjectAnimator.ofFloat(itemView, "translationX", uofloatArray);
             objectAnimat.setDuration(300);
             objectAnimat.setInterpolator(new e());
             objectAnimat.addListener(new k0(this, viewHolder));
             objectAnimat.start();
          }
          this.j.clear();
       }
       return;
    }
}
