package com.yxcorp.gifshow.recycler.widget.AppBarFlingRecyclerView;
import sj.d;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;

public class AppBarFlingRecyclerView extends CustomRecyclerView implements d	// class@0017b0
{

    public void AppBarFlingRecyclerView(Context p0){
       super(p0);
    }
    public void AppBarFlingRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AppBarFlingRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AppBarFlingRecyclerView.class, "2")) {
          return;
       }
       this.stopNestedScroll(1);
       return;
    }
    public void f(int p0,int p1){
       if (PatchProxy.isSupport(AppBarFlingRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AppBarFlingRecyclerView.class, "1")) {
          return;
       }
       this.scrollBy(p0, p1);
       return;
    }
    public void smoothScrollBy(int p0,int p1){
       if (PatchProxy.isSupport(AppBarFlingRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AppBarFlingRecyclerView.class, "4")) {
          return;
       }
       this.startNestedScroll(2, 1);
       super.smoothScrollBy(p0, p1);
       return;
    }
    public void smoothScrollToPosition(int p0){
       if (PatchProxy.isSupport(AppBarFlingRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AppBarFlingRecyclerView.class, "3")) {
          return;
       }
       this.startNestedScroll(2, 1);
       super.smoothScrollToPosition(p0);
       return;
    }
}
