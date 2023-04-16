package com.kwai.feature.post.api.componet.prettify.beauty.StagFactorykscomponentsprettifymodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse;
import com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyGuideConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyGuideConfig$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$DeformMode$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyBubbleConfig$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$TypeAdapter;
import h16.g;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyGroupInfo$TypeAdapter;

public final class StagFactorykscomponentsprettifymodel implements j	// class@0012e6
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
       if (rawType == PostBeautifyResponse.class) {
          return new PostBeautifyResponse$TypeAdapter(p0);
       }
       if (rawType == MedicalBeautyConfig.class) {
          return new MedicalBeautyConfig$TypeAdapter(p0);
       }
       if (rawType == LiveBeautifyResponse.class) {
          return new LiveBeautifyResponse$TypeAdapter(p0);
       }
       if (rawType == ItemNameStyle.class) {
          return new ItemNameStyle$TypeAdapter(p0);
       }
       if (rawType == BeautyGuideConfig.class) {
          return new BeautyGuideConfig$TypeAdapter(p0);
       }
       if (rawType == BeautyFilterItem$a.class) {
          return new BeautyFilterItem$DeformMode$TypeAdapter(p0);
       }
       if (rawType == BeautyFilterItem.class) {
          return new BeautyFilterItem$TypeAdapter(p0);
       }
       if (rawType == BeautyBubbleConfig.class) {
          return new BeautyBubbleConfig$TypeAdapter(p0);
       }
       if (rawType == BeautifyTagInfo.class) {
          return new BeautifyTagInfo$TypeAdapter(p0);
       }
       if (rawType == BeautifySuiteInfo$BeautifyItem.class) {
          return new BeautifySuiteInfo$BeautifyItem$TypeAdapter(p0);
       }
       if (rawType == BeautifySuiteInfo.class) {
          return new BeautifySuiteInfo$TypeAdapter(p0);
       }
       if (rawType == g.class) {
          return new BeautifyGroupInfo$TypeAdapter(p0);
       }
       return null;
    }
}
