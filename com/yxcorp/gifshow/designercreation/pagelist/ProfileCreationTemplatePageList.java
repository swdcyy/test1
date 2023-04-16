package com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import o3c.p;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import jw9.a;
import qvb.n0;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplateResponse;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList$onCreateRequest$1;
import kw9.a;
import msd.l;
import erd.g;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList$onCreateRequest$2;

public final class ProfileCreationTemplatePageList extends p	// class@001308
{
    public final String p;

    public void ProfileCreationTemplatePageList(String p0){
       a.p(p0, "mUserId");
       super();
       this.p = p0;
    }
    public t I1(){
       String cursor;
       a obj = PatchProxy.apply(null, this, ProfileCreationTemplatePageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x263459e4);
       ProfileCreationTemplatePageList tp = this.p;
       if (!this.K() && this.L0() != null) {
          KwaiTemplateResponse kwaiTemplate = this.L0();
          a.o(kwaiTemplate, "latestPage");
          cursor = kwaiTemplate.getCursor();
       }else {
          cursor = "0";
       }
       t ot = obj.a(tp, cursor).doOnNext(new a(new ProfileCreationTemplatePageList$onCreateRequest$1(this))).doOnError(new a(new ProfileCreationTemplatePageList$onCreateRequest$2(this)));
       a.o(ot, "Singleton.get\(ProfileCre¡­ror\(this::onNetworkError\)");
       return ot;
    }
}
