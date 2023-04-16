package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel;
import java.lang.Object;
import ut1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import ut1.k;
import ut1.l;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveMultiPkMvpViewModel$b implements Observer	// class@001637
{
    public final LiveMultiPkMvpViewModel b;

    public void LiveMultiPkMvpViewModel$b(LiveMultiPkMvpViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       MutableLiveData mutableLiveD;
       l ol;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkMvpViewModel$b.class, "1")) {
       }else if(p0 != null){
          LiveMultiPkMvpViewModel$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiPkMvpViewModel.class, "4")) {
             Iterator iterator = p0.l().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                List list = null;
                if (TextUtils.n(uEntry.getKey(), String.valueOf(p0.b()))) {
                   mutableLiveD = tb.r0(tb.a);
                   ol = uEntry.getValue().f().get(p0.a());
                   if (ol != null) {
                      list = ol.b();
                   }
                   mutableLiveD.setValue(list);
                }else {
                   mutableLiveD = tb.r0(tb.b);
                   Map map = uEntry.getValue().f();
                   String str = PatchProxy.apply(list, tb, LiveMultiPkMvpViewModel.class, "1");
                   if (str == PatchProxyResult.class) {
                      str = tb.c.getValue();
                   }
                   ol = map.get(str);
                   if (ol != null) {
                      list = ol.b();
                   }
                   mutableLiveD.setValue(list);
                }
             }
          }
       }
       return;
    }
}
