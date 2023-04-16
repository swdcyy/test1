package com.yxcorp.gifshow.growth.framework.GrowthListFragment$initActionBar$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import pna.j;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$initActionBar$1$1;
import android.app.Activity;
import msd.a;
import pna.a;

public final class GrowthListFragment$initActionBar$1 implements View$OnClickListener	// class@001375
{
    public final GrowthListFragment b;

    public void GrowthListFragment$initActionBar$1(GrowthListFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthListFragment$initActionBar$1.class, "1")) {
          return;
       }
       FragmentActivity activity = this.b.getActivity();
       if (activity != null) {
          a.b(activity, this.b.fh().a, "当前已选择"+this.b.o.size()+0x9879, "确认", null, new GrowthListFragment$initActionBar$1$1(this), 8, null);
       }
       return;
    }
}
