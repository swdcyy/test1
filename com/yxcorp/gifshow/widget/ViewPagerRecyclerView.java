package com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.t;
import t36.f;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.MotionEvent;
import java.lang.Boolean;
import androidx.recyclerview.widget.z;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$b;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ViewPagerRecyclerView extends RecyclerView	// class@0018e8
{
    public t b;
    public boolean c;
    public boolean d;
    public f e;
    public RecyclerView$r f;

    public void ViewPagerRecyclerView(Context p0){
       super(p0);
       this.b = new t();
       this.c = true;
       this.d = true;
       this.e = new f();
       this.f = new ViewPagerRecyclerView$a(this);
       this.setEnableViewPager(this.c);
       this.addOnScrollListener(this.f);
    }
    public void ViewPagerRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new t();
       this.c = true;
       this.d = true;
       this.e = new f();
       this.f = new ViewPagerRecyclerView$a(this);
       this.setEnableViewPager(this.c);
       this.addOnScrollListener(this.f);
    }
    public void ViewPagerRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new t();
       this.c = true;
       this.d = true;
       this.e = new f();
       this.f = new ViewPagerRecyclerView$a(this);
       this.setEnableViewPager(this.c);
       this.addOnScrollListener(this.f);
    }
    public int getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, ViewPagerRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.c == null || !this.getLayoutManager() instanceof LinearLayoutManager) {
          return -1;
       }
       int i = this.getLayoutManager().i0();
       int i1 = this.getLayoutManager().c();
       Object[] objArray = new Object[0];
       a.D().w("ViewPagerRecyclerView", "getCurrentPosition firstVisiblePosition:"+i+",lastVisiblePosition:"+i1, objArray);
       if (i != i1) {
          return -1;
       }
       return i;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewPagerRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public void setEnableTouch(boolean p0){
       this.d = p0;
    }
    public void setEnableViewPager(boolean p0){
       if (PatchProxy.isSupport(ViewPagerRecyclerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ViewPagerRecyclerView.class, "2")) {
          return;
       }
       if (p0) {
          this.c = true;
          this.b.b(this);
       }else {
          this.c = false;
          this.b.b(null);
       }
       return;
    }
    public void x(ViewPagerRecyclerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPagerRecyclerView.class, "5")) {
          return;
       }
       this.e.d(p0);
       return;
    }
    public void y(ViewPagerRecyclerView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPagerRecyclerView.class, "6")) {
          return;
       }
       this.e.c(p0);
       return;
    }
    public void z(int p0){
       if (PatchProxy.isSupport(ViewPagerRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewPagerRecyclerView.class, "4")) {
          return;
       }
       if (p0 >= 0 && (this.getAdapter() == null || p0 < this.getAdapter().getItemCount())) {
          this.scrollToPosition(p0);
       }
       return;
    }
}
