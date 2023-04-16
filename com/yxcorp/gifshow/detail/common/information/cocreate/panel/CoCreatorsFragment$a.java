package com.yxcorp.gifshow.detail.common.information.cocreate.panel.CoCreatorsFragment$a;
import qvb.f;
import java.util.List;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.CoCreatorsFragment$FakeCoCreatorsResponse;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CoCreatorsFragment$a extends f	// class@00140a
{
    public CoCreatorsFragment$FakeCoCreatorsResponse p;

    public void CoCreatorsFragment$a(List p0){
       super();
       this.p = new CoCreatorsFragment$FakeCoCreatorsResponse(p0);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, CoCreatorsFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(this.p);
    }
}
