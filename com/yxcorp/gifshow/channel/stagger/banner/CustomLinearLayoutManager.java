package com.yxcorp.gifshow.channel.stagger.banner.CustomLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.channel.stagger.banner.CustomLinearLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class CustomLinearLayoutManager extends LinearLayoutManager	// class@001063
{

    public void CustomLinearLayoutManager(Context p0){
       super(p0);
    }
    public void CustomLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void CustomLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CustomLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CustomLinearLayoutManager.class, "1")) {
          return;
       }
       CustomLinearLayoutManager$a uoa = new CustomLinearLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
