package com.yxcorp.gifshow.location.LocationFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.location.LocationFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.location.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.location.LocationActivity;
import com.kwai.feature.component.searchhistory.SearchLayout;

public class LocationFragment$a extends RecyclerView$r	// class@001ad8
{
    public final LocationFragment a;

    public void LocationFragment$a(LocationFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(LocationFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LocationFragment$a.class, "1")) {
          return;
       }
       LocationFragment$a ta = this.a;
       if (ta.N.B == null && (ta.I != null && ta.getActivity() != null)) {
          this.a.getActivity().B.g(true);
       }
    label_0035 :
       return;
    }
}
