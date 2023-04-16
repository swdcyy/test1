package com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2$b;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import com.kuaishou.commercial.photoreduce.a$a;
import java.util.List;
import java.util.HashMap;
import kotlin.jvm.internal.a;

public final class AdReducePopupPresenterV2$b extends GridLayoutManager$b	// class@00151a
{
    public final AdReducePopupPresenterV2 e;

    public void AdReducePopupPresenterV2$b(AdReducePopupPresenterV2 p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       a$a obj;
       AdReducePopupPresenterV2$b uob = AdReducePopupPresenterV2$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.e.v.get(0).i;
       int i = 2;
       if (obj != null) {
          p0 = p0 - 1;
          if (p0 >= 0 && p0 < obj.size()) {
             p0 = (p0 >> 1) << 1;
             int i1 = p0 + 1;
             if (i1 < obj.size()) {
                Object obj1 = this.e.w.get(obj.get(p0));
                a.m(obj1);
                if (a.t(obj1.intValue(), this.e.P8()) < 0) {
                   obj1 = this.e.w.get(obj.get(i1));
                   a.m(obj1);
                   if (a.t(obj1.intValue(), this.e.P8()) < 0) {
                      i = 1;
                   }
                }
             }
          }
       }
       return i;
    }
}
