package androidx.transition.GhostViewHolder;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.content.Context;
import java.lang.Object;
import e3.r;
import e3.s;
import e3.q;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewParent;
import android.os.Build$VERSION;
import java.lang.Math;
import androidx.transition.GhostViewPort;
import java.lang.IllegalStateException;
import java.lang.String;

public class GhostViewHolder extends FrameLayout	// class@0009c1
{
    public ViewGroup b;
    public boolean c;

    public void GhostViewHolder(ViewGroup p0){
       super(p0.getContext());
       this.setClipChildren(false);
       this.b = p0;
       p0.setTag(R.id.ghost_view_holder, this);
       s.b(this.b).c(this);
       this.c = true;
    }
    public static GhostViewHolder b(ViewGroup p0){
       return p0.getTag(0x7f0a1091);
    }
    public static void d(View p0,ArrayList p1){
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          GhostViewHolder.d(parent, p1);
       }
       p1.add(p0);
       return;
    }
    public static boolean e(View p0,View p1){
       ViewGroup parent = p0.getParent();
       int childCount = parent.getChildCount();
       boolean b = false;
       if (Build$VERSION.SDK_INT > 0.00f && p0.getZ() - p1.getZ()) {
          if (p0.getZ() - p1.getZ() > 0) {
             b = true;
          }
          return b;
       }else {
          int i = 0;
          while (true) {
             if (i < childCount) {
                View childAt = parent.getChildAt(s.a(parent, i));
                if (childAt == p0) {
                   break ;
                }else if(childAt == p1){
                label_0040 :
                   b = true;
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                goto label_0040 ;
             }
          }
          return b;
       }
    }
    public static boolean f(ArrayList p0,ArrayList p1){
       int i = 0;
       if (p0.isEmpty() || (!p1.isEmpty() && p0.get(i) == p1.get(i))) {
          int i1 = Math.min(p0.size(), p1.size());
          int i2 = 1;
          while (true) {
             if (i2 < i1) {
                View view = p0.get(i2);
                View view1 = p1.get(i2);
                if (view != view1) {
                   return GhostViewHolder.e(view, view1);
                }else {
                   i2 = i2 + 1;
                }
             }else if(p1.size() == i1){
                break ;
             }
          }
          return i;
       }
       i = true;
       goto label_0045 ;
    }
    public void a(GhostViewPort p0){
       ArrayList uArrayList = new ArrayList();
       GhostViewHolder.d(p0.d, uArrayList);
       int i = this.c(uArrayList);
       if (i < 0 || i >= this.getChildCount()) {
          this.addView(p0);
       }else {
          this.addView(p0, i);
       }
       return;
    }
    public final int c(ArrayList p0){
       ArrayList uArrayList = new ArrayList();
       int i = this.getChildCount() - 1;
       int i1 = 0;
       while (i1 <= i) {
          int i2 = i1 + i;
          i2 = i2 / 2;
          GhostViewHolder.d(this.getChildAt(i2).d, uArrayList);
          if (GhostViewHolder.f(p0, uArrayList)) {
             i2 = i2 + 1;
             i1 = i2;
          }else {
             i2 = i2 - 1;
             i = i2;
          }
          uArrayList.clear();
       }
       return i1;
    }
    public void g(){
       if (this.c == null) {
          throw new IllegalStateException("This GhostViewHolder is detached!");
       }
       s.b(this.b).a(this);
       s.b(this.b).c(this);
       return;
    }
    public void onViewAdded(View p0){
       if (this.c == null) {
          throw new IllegalStateException("This GhostViewHolder is detached!");
       }
       super.onViewAdded(p0);
       return;
    }
    public void onViewRemoved(View p0){
       super.onViewRemoved(p0);
       if (this.getChildCount() != 1 || (this.getChildAt(0) == p0 || !this.getChildCount())) {
          this.b.setTag(R.id.ghost_view_holder, null);
          s.b(this.b).a(this);
          this.c = false;
       }
       return;
    }
}
