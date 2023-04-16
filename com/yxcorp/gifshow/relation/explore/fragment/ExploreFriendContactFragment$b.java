package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$b;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$c;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$b$a;
import dac.b;
import zbc.c;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import android.view.ViewGroup;
import fac.a;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.z;
import com.yxcorp.gifshow.relation.explore.presenter.j;
import nu7.d;
import com.yxcorp.gifshow.relation.user.adapter.e;
import hac.a;
import ml8.c;

public class ExploreFriendContactFragment$b extends g	// class@0017fe
{
    public final ExploreFriendContactFragment$c w;
    public final ExploreFriendContactFragment x;

    public void ExploreFriendContactFragment$b(ExploreFriendContactFragment p0){
       this.x = p0;
       super();
       this.w = new ExploreFriendContactFragment$c(p0.I, new ExploreFriendContactFragment$b$a(this));
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       ExploreFriendContactFragment$b uob = ExploreFriendContactFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w};
       return j.a(obj);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       ExploreFriendContactFragment$b uob = ExploreFriendContactFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = (a.a())? a.i(p0, R.layout.arg_RES_7f0d021e): a.i(p0, R.layout.arg_RES_7f0d0966);
       obj = new PresenterV2();
       obj.U7(new z((a.a() ^ 0x01)));
       obj.U7(new j((a.a() ^ 0x01)));
       if (a.a()) {
          obj.U7(new d(d.y));
       }else if(e.r1()){
          obj.U7(new a());
       }
       obj.U7(new d(d.z));
       return new f(view, obj);
    }
}
