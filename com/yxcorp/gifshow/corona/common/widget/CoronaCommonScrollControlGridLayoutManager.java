package com.yxcorp.gifshow.corona.common.widget.CoronaCommonScrollControlGridLayoutManager;
import com.yxcorp.gifshow.corona.common.widget.a;
import yq9.a;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import com.yxcorp.gifshow.corona.common.widget.a$a;
import android.os.Parcelable;

public class CoronaCommonScrollControlGridLayoutManager extends GridLayoutManager implements a, a	// class@00127f
{
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public a$a E;

    public void CoronaCommonScrollControlGridLayoutManager(Context p0,int p1){
       super(p0, p1);
       this.A = true;
       this.B = true;
       this.C = -1;
       this.D = -1;
    }
    public void CoronaCommonScrollControlGridLayoutManager(Context p0,int p1,int p2,boolean p3){
       super(p0, p1, p2, p3);
       this.A = true;
       this.B = true;
       this.C = -1;
       this.D = -1;
    }
    public void CoronaCommonScrollControlGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.A = true;
       this.B = true;
       this.C = -1;
       this.D = -1;
    }
    public boolean canScrollHorizontally(){
       Object obj = PatchProxy.apply(null, this, CoronaCommonScrollControlGridLayoutManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.A != null && (this.B != null && super.canScrollHorizontally()))? true: false;
       return b;
    }
    public boolean canScrollVertically(){
       Object obj = PatchProxy.apply(null, this, CoronaCommonScrollControlGridLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.A != null && (this.B != null && super.canScrollVertically()))? true: false;
       return b;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaCommonScrollControlGridLayoutManager.class, "1")) {
          return;
       }
       if (this.C != -1 && p1.c() > 0) {
          this.scrollToPositionWithOffset(this.C, this.D);
          this.C = -1;
          this.D = -1;
       }
       super.onLayoutChildren(p0, p1);
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaCommonScrollControlGridLayoutManager.class, "2")) {
          return;
       }
       super.onLayoutCompleted(p0);
       CoronaCommonScrollControlGridLayoutManager tE = this.E;
       if (tE != null) {
          tE.a(p0);
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaCommonScrollControlGridLayoutManager.class, "3")) {
          return;
       }
       this.C = -1;
       this.D = -1;
       super.onRestoreInstanceState(p0);
       return;
    }
    public void q(boolean p0){
       this.B = p0;
    }
    public void r(a$a p0){
       this.E = p0;
    }
    public void v(int p0,int p1){
       this.C = p0;
       this.D = p1;
    }
    public void y(boolean p0){
       this.A = p0;
    }
}
