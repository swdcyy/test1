package com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView$a;

public final class NearbyCustomRecycleView extends CustomRecyclerView	// class@002140
{

    public void NearbyCustomRecycleView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyCustomRecycleView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyCustomRecycleView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void NearbyCustomRecycleView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void B(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCustomRecycleView.class, "2")) {
          return;
       }
       if (this.isComputingLayout()) {
          this.post(new NearbyCustomRecycleView$b(this, p0));
       }else {
          p0.k0();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Object[] objArray;
       if (PatchProxy.isSupport(NearbyCustomRecycleView.class)) {
          objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NearbyCustomRecycleView.class, "1")) {
             return;
          }
       }
       try{
          super.onLayout(p0, p1, p2, p3, p4);
       }catch(java.lang.IllegalArgumentException e0){
          NearbyCustomRecycleView$a uoa = new NearbyCustomRecycleView$a(this, p0, p1, p2, p3, p4);
          this.post(objArray);
       }
       return;
    }
}
