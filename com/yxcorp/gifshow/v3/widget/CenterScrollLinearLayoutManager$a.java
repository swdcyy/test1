package com.yxcorp.gifshow.v3.widget.CenterScrollLinearLayoutManager$a;
import androidx.recyclerview.widget.o;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$x;
import android.view.View;
import usd.q;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class CenterScrollLinearLayoutManager$a extends o	// class@00162e
{
    public final int q;
    public final int r;

    public void CenterScrollLinearLayoutManager$a(Context p0,int p1){
       a.p(p0, "context");
       super(p0);
       this.r = p1;
       this.q = p0.getResources().getInteger(0x10e0000);
    }
    public int B(){
       return this.r;
    }
    public void C(RecyclerView$x$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CenterScrollLinearLayoutManager$a.class, "1")) {
          return;
       }
       a.p(p0, "action");
       RecyclerView$LayoutManager layoutManage = this.e();
       if (layoutManage != null) {
          a.o(layoutManage, "layoutManager ?: return \x20\x02nForInterimTarget\(action\)\x00");
          int i = this.f();
          int i1 = Integer.MAX_VALUE;
          int i2 = Integer.MIN_VALUE;
          int i3 = this.c();
          int i4 = 0;
          int i5 = 0;
          while (i4 < i3) {
             View childAt = layoutManage.getChildAt(i4);
             if (childAt != null) {
                a.o(childAt, "lm.getChildAt\(i\) ?: continue");
                int i6 = this.d(childAt);
                i1 = q.u(i6, i1);
                i2 = q.n(i6, i2);
                if (layoutManage.canScrollVertically()) {
                   if (childAt.getTop() >= layoutManage.getHeight() || childAt.getBottom() <= 0) {
                   label_006c :
                      i4 = i4 + 1;
                   }
                }else if(childAt.getLeft() < layoutManage.getWidth() && childAt.getRight() > 0){
                }
                i5 = i5 + 1;
                goto label_006c ;
             }
          }
          if ((i1 - i) > i5) {
             p0.c((i + i5));
          }else if((i - i2) > i5){
             p0.c((i - i5));
          }else {
             super.C(p0);
          }
          return;
       }else {
          super.C(p0);
          return;
       }
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CenterScrollLinearLayoutManager$a.class, "2")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p1, "state");
       a.p(p2, "action");
       super.o(p0, p1, p2);
       CenterScrollLinearLayoutManager$a tq = this.q;
       if (p2.a() < tq) {
          p2.e(tq);
       }
       return;
    }
    public int t(View p0,int p1){
       CenterScrollLinearLayoutManager$a uoa = CenterScrollLinearLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "view");
       if (p1) {
          return super.t(p0, p1);
       }else {
          RecyclerView$LayoutManager layoutManage = this.e();
          if (layoutManage != null && layoutManage.canScrollHorizontally()) {
             return (((- p0.getLeft()) - (p0.getWidth() / 2)) + (layoutManage.getWidth() / 2));
          }else {
             return 0;
          }
       }
    }
    public int u(View p0,int p1){
       CenterScrollLinearLayoutManager$a uoa = CenterScrollLinearLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "view");
       if (p1) {
          return super.u(p0, p1);
       }else {
          RecyclerView$LayoutManager layoutManage = this.e();
          if (layoutManage != null && layoutManage.canScrollVertically()) {
             return (((- p0.getTop()) - (p0.getHeight() / 2)) + (layoutManage.getHeight() / 2));
          }else {
             return 0;
          }
       }
    }
    public int z(){
       return this.r;
    }
}
