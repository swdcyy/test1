package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class MockViewPresenter$c implements Observer	// class@0011d3
{
    public final MockViewPresenter b;

    public void MockViewPresenter$c(MockViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockViewPresenter$c.class, "1")) {
       }else if(p0 != null){
          int i = 0;
          int i1 = 1;
          int i2 = (!p0.length)? 1: 0;
          if (!(i2 ^ i1)) {
             p0 = null;
          }
          if (p0 != null) {
             Object[] objArray = new Object[i];
             a.C().w("MockFeedViewModel", "upload Progress update:"+p0, objArray);
             MockViewPresenter r = this.b.r;
             if (r != null) {
                r.U(p0);
             }
          }
       }
    label_0043 :
       PatchProxy.onMethodExit(MockViewPresenter$c.class, "1");
       return;
    }
}
