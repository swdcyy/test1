package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$g;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import g9c.a;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$e;

public final class NearbyCommonRvBtn$g implements RecyclerView$o	// class@00213c
{
    public final NearbyCommonRvBtn b;

    public void NearbyCommonRvBtn$g(NearbyCommonRvBtn p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn$g.class, "2")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn$g.class, "1")) {
          return;
       }
       a.p(p0, "view");
       NearbyCommonRvBtn b = this.b.b;
       if (b != null) {
          int childLayoutP = b.getChildLayoutPosition(p0);
          b = this.b.d;
          if (b != null) {
             CommonBtnModel uCommonBtnMo = b.O0(childLayoutP);
             if (uCommonBtnMo != null && !uCommonBtnMo.getMIsShow()) {
                NearbyCommonRvBtn d = this.b.d;
                int itemCount = (d != null)? d.getItemCount(): 0;
                if (childLayoutP < itemCount) {
                   uCommonBtnMo.setMIsShow(true);
                   NearbyCommonRvBtn g = this.b.g;
                   if (g != null) {
                      g.a(uCommonBtnMo);
                   }
                }
             }
          }
       }
       return;
    }
}
