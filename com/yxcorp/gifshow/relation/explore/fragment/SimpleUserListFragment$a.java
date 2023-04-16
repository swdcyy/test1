package com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment$a;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.c0;
import ecc.w;
import ecc.n0;
import ml8.c;

public class SimpleUserListFragment$a extends g	// class@00180d
{
    public final SimpleUserListFragment w;

    public void SimpleUserListFragment$a(SimpleUserListFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       SimpleUserListFragment$a uoa = SimpleUserListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new c0());
       obj.U7(new w());
       obj.U7(new n0());
       return new f(a.i(p0, 0x7f0d0965), obj);
    }
}
