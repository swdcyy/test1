package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import android.widget.ProgressBar;

public final class MockViewPresenter$b implements Observer	// class@0011d2
{
    public final MockViewPresenter b;

    public void MockViewPresenter$b(MockViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockViewPresenter$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().w("MockFeedViewModel", "upload Progress update:"+p0, objArray);
          if (p0.intValue() > -1) {
             MockViewPresenter q = this.b.q;
             if (q != null) {
                a.o(p0, "it");
                q.setProgress(p0.intValue());
             }
          }
          PatchProxy.onMethodExit(MockViewPresenter$b.class, "1");
       }
       return;
    }
}
