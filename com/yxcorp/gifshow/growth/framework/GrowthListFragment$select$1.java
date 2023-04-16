package com.yxcorp.gifshow.growth.framework.GrowthListFragment$select$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import pna.j;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import java.util.ArrayList;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class GrowthListFragment$select$1 extends Lambda implements l	// class@001376
{
    public final int $position;
    public final GrowthListFragment this$0;

    public void GrowthListFragment$select$1(GrowthListFragment p0,int p1){
       this.this$0 = p0;
       this.$position = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(GrowthListFragment$select$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthListFragment$select$1.class, "1")) {
          return;
       }
       if (this.this$0.fh().b == null) {
          Integer integer = CollectionsKt___CollectionsKt.p2(this.this$0.o);
          if (p0) {
             this.this$0.o.clear();
             this.this$0.o.add(Integer.valueOf(this.$position));
             this.this$0.hh();
             FragmentActivity activity = this.this$0.getActivity();
             if (activity != null) {
                activity.finish();
             }
          }else if(integer != null){
             this.this$0.o.clear();
             this.this$0.o.add(integer);
             this.this$0.hh();
          }
       }else if(p0){
          this.this$0.o.add(Integer.valueOf(this.$position));
       }else {
          this.this$0.o.remove(Integer.valueOf(this.$position));
       }
       return;
    }
}
