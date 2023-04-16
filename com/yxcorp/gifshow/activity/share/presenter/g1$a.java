package com.yxcorp.gifshow.activity.share.presenter.g1$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.activity.share.presenter.g1;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import com.yxcorp.gifshow.visible.ShareVisibleRepo;

public class g1$a implements ViewModelProvider$Factory	// class@0013e4
{
    public final g1 a;

    public void g1$a(g1 p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g1$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new ShareVisibleViewModel(this.a.x);
    }
}
