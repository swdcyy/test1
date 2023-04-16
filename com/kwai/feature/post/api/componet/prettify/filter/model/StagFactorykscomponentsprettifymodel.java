package com.kwai.feature.post.api.componet.prettify.filter.model.StagFactorykscomponentsprettifymodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig$TypeAdapter;

public final class StagFactorykscomponentsprettifymodel implements j	// class@0012f4
{

    public void StagFactorykscomponentsprettifymodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsprettifymodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == RecoFiltersResponse.class) {
          return new RecoFiltersResponse$TypeAdapter(p0);
       }
       if (rawType == FilterGroupResponse.class) {
          return new FilterGroupResponse$TypeAdapter(p0);
       }
       if (rawType == FilterGroup.class) {
          return new FilterGroup$TypeAdapter(p0);
       }
       if (rawType == FilterConfig.class) {
          return new FilterConfig$TypeAdapter(p0);
       }
       return null;
    }
}
