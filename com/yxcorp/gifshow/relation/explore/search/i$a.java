package com.yxcorp.gifshow.relation.explore.search.i$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.search.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.explore.search.a;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.google.gson.JsonObject;
import fg6.a;
import com.yxcorp.gifshow.relation.explore.search.a$a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class i$a extends m	// class@00187e
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       n.C(this.c.getActivity());
       i$a tc = this.c;
       Objects.requireNonNull(tc);
       i oi = i.class;
       Object[] objArray = null;
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, tc, oi, str)) {
          if (!PatchProxy.applyVoid(objArray, tc, oi, "8")) {
             d.a(-1718536792).Y7(tc.getActivity(), ProfileStartParam.l(tc.x));
          }
          i y = tc.y;
          if (!PatchProxy.applyVoidOneRefs(y, objArray, a.class, str)) {
             ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
             uAreaPackage.name = "SEARCH_RESULT";
             uAreaPackage.params = a.a;
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("area_name", "SEARCH_RESULT");
             jsonObject.G("element_params", a.a.x(new a$a(y, a.b, false)));
             CommonParams uCommonParam = new CommonParams();
             uCommonParam.mEntryTag = ImmutableMap.builder().c("element_action", new g("USER_CARD")).c("page_name", new g("SEARCH_RESULT_GENERAL")).c("params", jsonObject).a();
             u1.O("", null, "", 1, false, a.a(y, "USER_CARD"), uAreaPackage, null, null, false, uCommonParam, null);
          }
       }
       return;
    }
}
