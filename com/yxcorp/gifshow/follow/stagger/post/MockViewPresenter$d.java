package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import android.view.View;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class MockViewPresenter$d implements Observer	// class@0011d4
{
    public final MockViewPresenter b;

    public void MockViewPresenter$d(MockViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockViewPresenter$d.class, "1")) {
       }else {
          a uoa = a.C();
          StringBuilder str = "observer  currentQPhoto postworkId update:";
          Object[] objArray = null;
          Integer integer = (p0 != null)? Integer.valueOf(p0.getPostWorkInfoId()): objArray;
          int i = 0;
          Object[] objArray1 = new Object[i];
          uoa.w("MockFeedViewModel", str+integer, objArray1);
          MockViewPresenter s = this.b.s;
          if (s != null && (s.getVisibility() == 8 && p0 != null)) {
             MockViewPresenter$d tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, MockViewPresenter.class, "9")) {
                k1.m(tb.u);
                k1.o(tb.u);
             }
          }else {
             k1.m(this.b.u);
          }
          s = this.b.s;
          if (s != null) {
             if (p0 == null) {
                i = 8;
             }
             s.setVisibility(i);
          }
          PatchProxy.onMethodExit(MockViewPresenter$d.class, "1");
       }
       return;
    }
}
