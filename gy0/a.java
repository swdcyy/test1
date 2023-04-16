package gy0.a;
import aq5.b;
import com.kuaishou.live.audience.component.comments.send.a;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import m91.b;
import java.util.List;
import hx1.a;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import b61.a;
import ne1.a;
import com.yxcorp.gifshow.model.CDNUrl;
import ne1.b;

public final class a implements b	// class@0025a4
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       p0 = this.b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, a.class, "2")) {
       }else if(p0.M.Y0.r2(AudienceBizRelation.SPECIAL_ROLE)){
          a o = p0.O;
          UserExtraInfo$RoleInfo mHeadUrls = a.a(p0.M.r2.Bi()).mHeadUrls;
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(mHeadUrls, o, a.class, "1")) {
             o.a.n(mHeadUrls);
          }
          p0.O.b(R.string.arg_RES_7f10381f);
       }else {
          p0.O.b(R.string.arg_RES_7f101e5d);
       }
       return;
    }
}
