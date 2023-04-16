package com.kwai.widget.customer.mediapreview.widget.KwaiSnappyLinearLayoutManager;
import m17.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.widget.customer.mediapreview.widget.KwaiSnappyLinearLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class KwaiSnappyLinearLayoutManager extends LinearLayoutManager implements a	// class@00114d
{
    public static final int r;

    static {
       KwaiSnappyLinearLayoutManager.r = n.c(a.b(), 200.00f);
    }
    public void KwaiSnappyLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public int J(int p0,int p1){
       KwaiSnappyLinearLayoutManager kwaiSnappyLi = KwaiSnappyLinearLayoutManager.class;
       if (PatchProxy.isSupport(kwaiSnappyLi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, kwaiSnappyLi, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }else if(!this.getOrientation()){
          return this.W0(p0, this.getChildAt(i).getLeft(), this.getChildAt(i).getWidth(), this.getPosition(this.getChildAt(i)));
       }else {
          return this.W0(p1, this.getChildAt(i).getTop(), this.getChildAt(i).getHeight(), this.getPosition(this.getChildAt(i)));
       }
    }
    public final int W0(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiSnappyLinearLayoutManager.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiSnappyLinearLayoutManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (Math.abs(p0) < KwaiSnappyLinearLayoutManager.r) {
          p0 = ((p1 + (p2 / 2)) < 0)? 1: 0;
          return (p3 + p0);
       }else if(p0 < 0){
          p3++;
       }
       return p3;
    }
    public void collectAdjacentPrefetchPositions(int p0,int p1,RecyclerView$y p2,RecyclerView$LayoutManager$c p3){
       if (PatchProxy.isSupport(KwaiSnappyLinearLayoutManager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, KwaiSnappyLinearLayoutManager.class, "4")) {
          return;
       }
       super.collectAdjacentPrefetchPositions(p0, p1, p2, p3);
       if (this.getOrientation()) {
          p0 = p1;
       }
       int position = this.getPosition(this.getChildAt(0));
       if (p0 < 0) {
          position = position - 1;
          if (position >= 0) {
             p3.a(position, 0);
          }
       }else {
          position = position + 1;
          if (position < p2.c()) {
             p3.a(position, 0);
          }
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(KwaiSnappyLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiSnappyLinearLayoutManager.class, "3")) {
          return;
       }
       KwaiSnappyLinearLayoutManager$a uoa = new KwaiSnappyLinearLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
    public int u(){
       View obj = PatchProxy.apply(null, this, KwaiSnappyLinearLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       obj = this.getChildAt(i);
       i = this.getPosition(obj);
       if (!this.getOrientation() && Math.abs(obj.getLeft()) > (obj.getMeasuredWidth() / 2)) {
          return (i + 1);
       }
       if (this.getOrientation() == 1 && Math.abs(obj.getTop()) > (obj.getMeasuredWidth() / 2)) {
          i = i + 1;
       }
       return i;
    }
}
