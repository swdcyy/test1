package com.yxcorp.gifshow.homepage.serchcard.e$b;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.homepage.serchcard.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import java.util.Objects;
import java.lang.Integer;
import java.util.List;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ga5.j;
import com.yxcorp.gifshow.homepage.serchcard.ItemState;

public class e$b implements RecyclerView$o	// class@0017fe
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       if (p0 instanceof TextView) {
          e$b tb = this.b;
          e g = tb.G;
          if (g != null) {
             SearchCardMeta mRelateSearc = g.mRelateSearchWordList;
             e h = tb.H;
             e k = tb.K;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidFourRefs(mRelateSearc, Integer.valueOf(h), k, p0, tb, e.class, "9")) {
                int i = mRelateSearc.size();
                if (i > 0) {
                   float f = (float)(((j.d(tb.getActivity()) - e.N) - (e.O * 2)) / 2);
                   ItemState unKnow = (!k.size())? ItemState.unKnow: k.get((h - 1));
                   ItemState left = ItemState.left;
                   if (unKnow == left) {
                      k.add(h, ItemState.right);
                   }else {
                      int i1 = h + 1;
                      if (i1 < i) {
                         boolean b = tb.X8(f, mRelateSearc, i1, p0);
                         if (tb.X8(f, mRelateSearc, h, p0) && b) {
                            k.add(h, left);
                         }else {
                            k.add(h, ItemState.row);
                         }
                      }else {
                         k.add(h, ItemState.row);
                      }
                   }
                }
             }
             e$b tb1 = this.b;
             tb1.H = tb1.H + 1;
          }
       }
       return;
    }
}
