package com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment$c;
import androidx.viewpager2.widget.ViewPager2$h;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.sharelib.model.PainterModel;
import kotlin.jvm.internal.a;
import msd.l;
import djc.g1;
import java.util.Objects;
import java.util.Map;
import djc.n1;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import djc.f1;
import kotlin.Result;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;

public final class ImmerseSharePanelFragment$c extends ViewPager2$h	// class@001d09
{
    public final ImmerseSharePanelFragment a;

    public void ImmerseSharePanelFragment$c(ImmerseSharePanelFragment p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       ImmerseSharePanelFragment$c uoc = ImmerseSharePanelFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       PainterModel painterModel = this.a.b1.get(p0);
       ImmerseSharePanelFragment a1 = this.a.a1;
       if (a1 == null) {
          a.S("currentPainterModelSetter");
       }
       a1.invoke(painterModel);
       g1 og1 = ImmerseSharePanelFragment.hi(this.a);
       Objects.requireNonNull(og1);
       g1 og11 = g1.class;
       if (!PatchProxy.isSupport(og11) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), og1, og11, "6")) {
          n1 on1 = og1.f.get(Integer.valueOf(p0));
          if (on1 != null) {
             on1.onPageSelected(p0);
          }
          og1.g = p0;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = ImmerseSharePanelFragment.hi(this.a).K0().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof f1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          n1 value = iterator.next().getValue();
          if (value != null) {
             value.f();
             Result.constructor-impl(l1.a);
          }else {
             break ;
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder");
    }
}
