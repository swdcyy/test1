package com.yxcorp.gifshow.featured.detail.featured.presenter.n$e;
import ex6.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import wy6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zda.g1;
import com.kwai.library.slide.base.widget.SlidePlayRefreshView;

public class n$e implements a	// class@000f87
{
    public final n a;

    public void n$e(n p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, n$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g1(this);
    }
    public SlidePlayRefreshView c(){
       return this.a.q;
    }
}
