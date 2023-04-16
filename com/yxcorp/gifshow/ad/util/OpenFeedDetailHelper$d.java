package com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.util.FakeDetailListFragment;

public final class OpenFeedDetailHelper$d extends Accessor	// class@001871
{
    public final List c;

    public void OpenFeedDetailHelper$d(List p0){
       this.c = p0;
       super();
    }
    public Object get(){
       FakeDetailListFragment uFakeDetailL = PatchProxy.apply(null, this, OpenFeedDetailHelper$d.class, "1");
       if (uFakeDetailL != PatchProxyResult.class) {
       }else {
          uFakeDetailL = new FakeDetailListFragment(this.c);
       }
       return uFakeDetailL;
    }
}
