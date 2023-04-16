package com.kwai.framework.model.decompose.internal.ContainerDeserializer;
import com.google.gson.b;
import com.kwai.framework.model.decompose.internal.ContainerDeserializer$a;
import nsd.u;
import fa6.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.bifrost.utils.BifrostActivityExt;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import com.kwai.component.bifrost.utils.BifrostActivityExt$BifrostActivityExtWrapper;
import fa6.b;
import com.kwai.component.commenttopbar.utils.CommentToBarExt;
import com.kwai.component.commenttopbar.utils.CommentToBarExt$CommentTopBarBizTypeWrapper;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta;
import com.kwai.components.nearbymodel.model.NearbyPhotoMeta;
import com.kwai.components.nearbymodel.model.PoiMeta;
import com.kwai.feature.api.corona.model.CoronaFeatureApiCommonMeta;
import com.kwai.feature.api.corona.model.CoronaMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import com.kwai.feature.api.feed.home.model.NasaSlideCommonMeta;
import com.kwai.feature.api.social.followSlide.model.FollowCommonMeta;
import com.kwai.feature.api.social.followStagger.model.FollowVideoMeta;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import com.yxcorp.gifshow.comment.model.CommentGuide;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;
import com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch;
import com.yxcorp.gifshow.detail.model.meta.DetailCommonMeta;
import com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta;
import com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta;
import com.yxcorp.gifshow.profile.model.ProfilePhotoMeta;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import com.yxcorp.gifshow.share.model.guide.ShareGuide;
import zk.d;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler;
import zk.j;
import com.kwai.framework.model.decompose.internal.ContainerDeserializer$gson$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.reflect.Type;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import com.google.gson.a;
import fa6.a;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.util.Objects;
import java.util.Map;
import ga6.e;
import ga6.a;
import mkd.a;

public class ContainerDeserializer implements b	// class@001699
{
    public final d a;
    public final p b;
    public static final ContainerDeserializer$a c;

    static {
       ContainerDeserializer.c = new ContainerDeserializer$a(null);
       String str = "1";
       if (PatchProxy.applyVoid(null, null, c.class, str)) {
       }else if(PatchProxy.applyVoid(null, null, BifrostActivityExt.class, str)){
          e uoe1 = new e(BifrostActivityExt$BifrostActivityExtWrapper.class, "", "matchBifrostActivity");
          uoe1.a(null);
          c.a.e(PhotoMeta.class, uoe1);
       }
       if (!PatchProxy.applyVoid(null, null, CommentToBarExt.class, str)) {
          e uoe = new e(CommentToBarExt$CommentTopBarBizTypeWrapper.class, "", "commentTopBarPriority");
          uoe.a(null);
          c.a.e(PhotoMeta.class, uoe);
       }
       GeneralBottomBarInfo.register();
       NearbyCommonMeta.register();
       NearbyPhotoMeta.register();
       PoiMeta.register();
       CoronaFeatureApiCommonMeta.register();
       CoronaMeta.register();
       DanmakuInfo.register();
       NasaSlideCommonMeta.register();
       FollowCommonMeta.register();
       FollowVideoMeta.register();
       TagStickerInfo.register();
       CommentGuide.register();
       CoronaCommonMeta.register();
       CommentGuessSearch.register();
       DetailCommonMeta.register();
       DetailPhotoMeta.register();
       GameZoneModels.register();
       LiveGzoneAudienceCustomSkinConfig.register();
       SearchMeta.register();
       UserProfileCommonMeta.register();
       ProfilePhotoMeta.register();
       UserProfileMeta.register();
       UserProfileResponseMeta.register();
       ShareGuide.register();
    }
    public void ContainerDeserializer(){
       super();
       d uod = new d();
       uod.g(GsonLifeCycleEnabler.d());
       this.a = uod;
       this.b = s.c(new ContainerDeserializer$gson$2(this));
    }
    public final ContainerDeserializer a(Type p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContainerDeserializer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "typeOfT");
       a.p(p1, "typeAdapter");
       this.a.f(p0, p1);
       return this;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContainerDeserializer.class, "2");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          Object[] objArray = null;
          obj = PatchProxy.apply(objArray, this, ContainerDeserializer.class, "1");
          if (obj != patchProxyRe) {
          }else {
             obj = this.b.getValue();
          }
          Object obj1 = obj.j(a.get(p1)).fromJsonTree(p0);
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type C");
          obj = obj1;
          a.a(obj, obj.getDataMap$framework_model_release(), p1, p0, p2, false);
          if (obj1 instanceof a) {
             objArray = obj1;
          }
          if (objArray != null) {
             objArray.afterDeserialize();
          }
       }
       return obj;
    }
}
