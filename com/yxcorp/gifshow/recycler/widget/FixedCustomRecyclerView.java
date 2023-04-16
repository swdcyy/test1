package com.yxcorp.gifshow.recycler.widget.FixedCustomRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class FixedCustomRecyclerView extends CustomRecyclerView	// class@0017b3
{

    public void FixedCustomRecyclerView(Context p0){
       super(p0);
    }
    public void FixedCustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FixedCustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(FixedCustomRecyclerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, FixedCustomRecyclerView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedCustomRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedCustomRecyclerView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void scrollBy(int p0,int p1){
       if (PatchProxy.isSupport(FixedCustomRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedCustomRecyclerView.class, "3")) {
          return;
       }
       super.scrollBy(p0, p1);
       return;
    }
}
