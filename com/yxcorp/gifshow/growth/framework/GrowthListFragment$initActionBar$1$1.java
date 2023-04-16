package com.yxcorp.gifshow.growth.framework.GrowthListFragment$initActionBar$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$initActionBar$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class GrowthListFragment$initActionBar$1$1 extends Lambda implements a	// class@001374
{
    public final GrowthListFragment$initActionBar$1 this$0;

    public void GrowthListFragment$initActionBar$1$1(GrowthListFragment$initActionBar$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthListFragment$initActionBar$1$1.class, "1")) {
          return;
       }
       FragmentActivity activity = this.this$0.b.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
