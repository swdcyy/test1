package com.yxcorp.gifshow.growth.framework.GrowthListActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import com.yxcorp.gifshow.growth.framework.GrowthListActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;

public final class GrowthListActivity$a extends SwipeLayout$c	// class@00136f
{
    public final GrowthListActivity a;

    public void GrowthListActivity$a(GrowthListActivity p0){
       this.a = p0;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, GrowthListActivity$a.class, "1")) {
          return;
       }
       GrowthListActivity y = this.a.y;
       if (y == null || y.eh() != true) {
          this.a.finish();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, GrowthListActivity$a.class, "2")) {
          return;
       }
       GrowthListActivity y = this.a.y;
       if (y == null || y.eh() != true) {
          this.a.finish();
       }
       return;
    }
}
