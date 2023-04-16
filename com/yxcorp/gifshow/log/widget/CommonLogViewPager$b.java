package com.yxcorp.gifshow.log.widget.CommonLogViewPager$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import i27.b;
import k2b.j0;

public class CommonLogViewPager$b implements Runnable	// class@001b5d
{
    public final int b;
    public final CommonLogViewPager c;

    public void CommonLogViewPager$b(CommonLogViewPager p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommonLogViewPager$b.class, "1")) {
          return;
       }
       CommonLogViewPager$b tc = this.c;
       CommonLogViewPager$b tb = this.b;
       Objects.requireNonNull(tc);
       if (PatchProxy.isSupport(CommonLogViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(tb), tc, CommonLogViewPager.class, "5");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
          label_002f :
             a adapter = tc.getAdapter();
             if (adapter instanceof b) {
                objArray = adapter.a(tb);
             }
          }
       }else {
          goto label_002f ;
       }
       if (objArray instanceof j0) {
          Object[] objArray1 = objArray;
          objArray1.S2(objArray);
          objArray1.b2(1);
       }
       return;
    }
}
