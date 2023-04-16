package com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment$b;
import s2b.a;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ia5.a;
import java.lang.Integer;
import k2b.e0;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class FeedAggregateFragment$b implements a	// class@00192b
{
    public final FeedAggregateFragment a;

    public void FeedAggregateFragment$b(FeedAggregateFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedAggregateFragment$b.class, "1")) {
          return;
       }
       FeedAggregateFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, FeedAggregateFragment.class, "12")) {
          int intx = ta.getArguments().getInt("contentType");
          String str = ta.getArguments().getString("pageType");
          int i = 0;
          while (i < p0.size()) {
             Object obj = p0.get(i);
             int i1 = 804;
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{ta,Integer.valueOf(intx),str,obj,Integer.valueOf(i1)};
                if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
                label_0074 :
                   i = i + 1;
                }
             }
             a.e(ta, intx, str, obj, 804, null);
             goto label_0074 ;
          }
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedAggregateFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.isShowed()){
          b = false;
       }else {
          p0.setShowed(true);
          b = true;
       }
       return b;
    }
}
