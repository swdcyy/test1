package com.yxcorp.gifshow.relation.black.BlockUserListFragment$a;
import y8c.g;
import com.yxcorp.gifshow.relation.black.BlockUserListFragment;
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
import nl8.p;
import com.yxcorp.gifshow.relation.black.f;
import x9c.a;
import ml8.c;

public class BlockUserListFragment$a extends g	// class@0017dc
{
    public final BlockUserListFragment w;

    public void BlockUserListFragment$a(BlockUserListFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       p obj;
       BlockUserListFragment$a uoa = BlockUserListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new p();
       obj.n(0, new f());
       obj.n(0, new a());
       return new f(a.i(p0, 0x7f0d12f6), obj);
    }
}
