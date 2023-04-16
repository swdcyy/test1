package com.yxcorp.gifshow.growth.framework.GrowthListFragment$backward$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class GrowthListFragment$backward$1 extends Lambda implements l	// class@001371
{
    public final GrowthListFragment this$0;

    public void GrowthListFragment$backward$1(GrowthListFragment p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(GrowthListFragment$backward$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthListFragment$backward$1.class, "1")) {
          return;
       }
       if (p0) {
          FragmentActivity activity = this.this$0.getActivity();
          if (activity != null) {
             activity.finish();
          }
       }else {
          this.this$0.dh();
       }
       return;
    }
}
