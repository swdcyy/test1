package eja.l0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.v;
import java.lang.Object;
import java.lang.Boolean;
import iha.b;
import aja.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.FollowTabNotify;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import android.view.View;

public final class l0 implements g	// class@0026d4
{
    public final v b;

    public void l0(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b b = this.b.q.b;
       k ok = k.class;
       ClientEvent$UrlPackage obj = null;
       if (PatchProxy.applyVoidTwoRefs(obj, b, obj, ok, "16")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          String str = "REDPOINT_ENTRY_TAG";
          CommonParams uCommonParam = PatchProxy.applyTwoRefs(str, b, obj, ok, "17");
          if (uCommonParam != PatchProxyResult.class) {
          }else {
             uCommonParam = new CommonParams();
             obj = u1.k();
             if (b == null && obj != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0(str, "");
                uCommonParam.mEntryTag = ImmutableMap.builder().c(TextUtils.k(obj.page2), jsonObject).a();
             }else if(obj != null){
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.c0(str, b.toString());
                uCommonParam.mEntryTag = ImmutableMap.builder().c(TextUtils.k(obj.page2), jsonObject1).a();
             }
          }
          Object obj1 = uCommonParam;
          u1.O("", null, "", 1, 0, uElementPack, null, null, null, true, obj1, null);
       }
       return;
    }
}
