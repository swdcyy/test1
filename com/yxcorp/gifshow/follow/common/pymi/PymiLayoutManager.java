package com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class PymiLayoutManager extends NpaLinearLayoutManager	// class@001083
{
    public float r;

    public void PymiLayoutManager(Context p0){
       super(p0);
       this.r = 100.00f;
    }
    public void PymiLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.r = 100.00f;
    }
    public void PymiLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.r = 100.00f;
    }
    public void W0(float p0){
       this.r = p0;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(PymiLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PymiLayoutManager.class, "1")) {
          return;
       }
       PymiLayoutManager$a uoa = new PymiLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
