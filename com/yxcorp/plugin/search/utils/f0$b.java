package com.yxcorp.plugin.search.utils.f0$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.search.utils.f0;
import com.yxcorp.plugin.search.utils.f0$c;
import java.util.List;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.QRecoTag;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Integer;
import o07.o;

public class f0$b implements PopupInterface$h	// class@000797
{
    public final f0$c b;
    public final List c;
    public final f0 d;

    public void f0$b(f0 p0,f0$c p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
          return;
       }
       f0$b tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       tb = this.d;
       if (tb.i == null) {
          f0$b tc = this.c;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(tc, tb, f0.class, "14")) {
             int i = 0;
             int i1 = 0;
             while (i < tc.size()) {
                FeedNegativeFeedback$NegativeReason negativeReas = tc.get(i);
                if (negativeReas != null) {
                   negativeReas = negativeReas.mDetailReason;
                   if (negativeReas != null) {
                      int i2 = 0;
                      while (i2 < negativeReas.size()) {
                         QRecoTag qRecoTag = negativeReas.get(i2);
                         if (qRecoTag != null) {
                            i1 = i1 + 1;
                            qRecoTag.mPos = i1;
                            tb.e(qRecoTag, 0);
                         }
                         i2 = i2 + 1;
                      }
                   }
                }
                i = i + 1;
             }
          }
          tb.i = true;
       }
       this.d.a.h0().requestDisallowInterceptTouchEvent(true);
       return;
    }
    public void H(c p0,int p1){
       f0$b uob = f0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       f0.k = null;
       f0$b tb = this.b;
       if (tb != null) {
          boolean b = (p1 == 4)? true: false;
          tb.b(b);
       }
       this.d.a.h0().requestDisallowInterceptTouchEvent(false);
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
