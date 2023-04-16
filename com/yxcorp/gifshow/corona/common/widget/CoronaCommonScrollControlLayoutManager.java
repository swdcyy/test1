package com.yxcorp.gifshow.corona.common.widget.CoronaCommonScrollControlLayoutManager;
import com.yxcorp.gifshow.corona.common.widget.a;
import yq9.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import cq9.a;
import java.lang.StackTraceElement;
import java.lang.Exception;
import java.util.Arrays;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.corona.common.widget.a$a;
import android.os.Parcelable;

public class CoronaCommonScrollControlLayoutManager extends LinearLayoutManager implements a, a	// class@001280
{
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public a$a v;

    public void CoronaCommonScrollControlLayoutManager(Context p0){
       super(p0);
       this.r = true;
       this.s = true;
       this.t = -1;
       this.u = -1;
    }
    public void CoronaCommonScrollControlLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.r = true;
       this.s = true;
       this.t = -1;
       this.u = -1;
    }
    public void CoronaCommonScrollControlLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.r = true;
       this.s = true;
       this.t = -1;
       this.u = -1;
    }
    public boolean canScrollHorizontally(){
       Object obj = PatchProxy.apply(null, this, CoronaCommonScrollControlLayoutManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r != null && (this.s != null && super.canScrollHorizontally()))? true: false;
       return b;
    }
    public boolean canScrollVertically(){
       Object obj = PatchProxy.apply(null, this, CoronaCommonScrollControlLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r != null && (this.s != null && super.canScrollVertically()))? true: false;
       return b;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaCommonScrollControlLayoutManager.class, "1")) {
          return;
       }
       try{
          if (this.t != -1 && p1.c() > 0) {
             this.scrollToPositionWithOffset(this.t, this.u);
             this.t = -1;
             this.u = -1;
          }
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          a.C().s("ScrollControlLayoutManager", Arrays.toString(e4.getStackTrace()), objArray);
          if (!SystemUtil.I()) {
          }else {
             throw e4;
          }
       }
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaCommonScrollControlLayoutManager.class, "2")) {
          return;
       }
       super.onLayoutCompleted(p0);
       CoronaCommonScrollControlLayoutManager tv = this.v;
       if (tv != null) {
          tv.a(p0);
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaCommonScrollControlLayoutManager.class, "3")) {
          return;
       }
       this.t = -1;
       this.u = -1;
       super.onRestoreInstanceState(p0);
       return;
    }
    public void q(boolean p0){
       this.s = p0;
    }
    public void r(a$a p0){
       this.v = p0;
    }
    public void v(int p0,int p1){
       this.t = p0;
       this.u = p1;
    }
    public void y(boolean p0){
       this.r = p0;
    }
}
