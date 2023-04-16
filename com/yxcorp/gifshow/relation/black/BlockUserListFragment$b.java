package com.yxcorp.gifshow.relation.black.BlockUserListFragment$b;
import qvb.f;
import com.yxcorp.gifshow.relation.black.BlockUserListFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import rfc.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.BlockUserResponse;
import cjd.e;
import erd.o;

public class BlockUserListFragment$b extends f	// class@0017dd
{
    public final BlockUserListFragment p;

    public void BlockUserListFragment$b(BlockUserListFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, BlockUserListFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4a533fa);
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.i(objArray).map(new e());
    }
}
