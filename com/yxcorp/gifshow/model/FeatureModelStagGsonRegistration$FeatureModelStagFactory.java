package com.yxcorp.gifshow.model.FeatureModelStagGsonRegistration$FeatureModelStagFactory;
import zk.j;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.model.FeatureModelStagGsonRegistration$a;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import fa6.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.yxcorp.gifshow.model.FeatureModelStagGsonRegistration$b;
import java.lang.reflect.Type;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.yxcorp.gifshow.entity.QPhotoSerializer;
import com.yxcorp.gifshow.entity.QPhotoDeserializer;
import zk.i;
import com.google.gson.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserSerializer;
import com.kwai.framework.model.user.UserDeserializer;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.util.Objects;
import com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerSerializer;
import com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerDeserializer;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.transfer.QCommentSerializer;
import com.yxcorp.gifshow.entity.transfer.QCommentDeserializer;
import com.yxcorp.gifshow.model.response.UsersResponse;
import com.yxcorp.gifshow.model.response.UserResponseDeserializer;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.kwai.framework.model.decompose.internal.ContainerSerializer;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.FeedSerializer;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.decompose.internal.ContainerDeserializer;
import com.kuaishou.android.model.feed.FeedDeserializer;
import java.lang.StringBuilder;
import bo.t;

public class FeatureModelStagGsonRegistration$FeatureModelStagFactory implements j	// class@00122a
{
    public final Map b;

    public void FeatureModelStagGsonRegistration$FeatureModelStagFactory(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public void FeatureModelStagGsonRegistration$FeatureModelStagFactory(FeatureModelStagGsonRegistration$a p0){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       TreeTypeAdapter treeTypeAdap;
       TreeTypeAdapter treeTypeAdap1;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, FeatureModelStagGsonRegistration$FeatureModelStagFactory.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p1.getRawType();
       TypeAdapter typeAdapter = this.b.get(obj);
       if (typeAdapter != null) {
          return typeAdapter;
       }
       TypeAdapter typeAdapter1 = null;
       if (!FeatureModelStagGsonRegistration$b.a.a(obj)) {
          return typeAdapter1;
       }
       FeatureModelStagGsonRegistration$FeatureModelStagFactory tb = this.b;
       _monitor_enter(tb);
       TypeAdapter typeAdapter2 = this.b.get(obj);
       if (typeAdapter2 != null) {
          _monitor_exit(tb);
          return typeAdapter2;
       }else if(obj == QPhoto.class){
          treeTypeAdap = new TreeTypeAdapter(new QPhotoSerializer(), new QPhotoDeserializer(), p0, p1, this);
       }else if(obj == User.class){
          treeTypeAdap = new TreeTypeAdapter(new UserSerializer(), new UserDeserializer(), p0, p1, this);
       }else if(obj == CommonMeta.class){
          uoc = c.a;
          treeTypeAdap = new TreeTypeAdapter(uoc.b(), uoc.a(), p0, p1, this);
       }else if(obj == PhotoMeta.class){
          c a = c.a;
          Objects.requireNonNull(a);
          ObservableAndSyncableContainerSerializer observableAn = PatchProxy.apply(typeAdapter1, a, uoc, "8");
          if (observableAn != patchProxyRe) {
          }else {
             observableAn = new ObservableAndSyncableContainerSerializer();
          }
          Object obj1 = observableAn;
          Objects.requireNonNull(a);
          ObservableAndSyncableContainerDeserializer observableAn1 = PatchProxy.apply(typeAdapter1, a, uoc, "7");
          if (observableAn1 != patchProxyRe) {
          }else {
             observableAn1 = new ObservableAndSyncableContainerDeserializer();
          }
          treeTypeAdap = new TreeTypeAdapter(obj1, observableAn1, p0, p1, this);
       }else if(obj == QComment.class){
          treeTypeAdap1 = new TreeTypeAdapter(new QCommentSerializer(), new QCommentDeserializer(), p0, p1, this);
       }else if(obj == UsersResponse.class){
          treeTypeAdap1 = new TreeTypeAdapter(null, new UserResponseDeserializer(), p0, p1, this);
       }else if(obj == UserProfileResponse.class){
          uoc = c.a;
          ContainerDeserializer uContainerDe = uoc.a();
          ContainerDeserializer uContainerDe1 = uContainerDe.a(UserProfile.class, uoc.a());
          treeTypeAdap1 = new TreeTypeAdapter(uoc.b().a(UserProfile.class, uoc.b()).a(LiveStreamFeed.class, new FeedSerializer()).a(BaseFeed.class, new FeedSerializer()), uContainerDe1.a(LiveStreamFeed.class, new FeedDeserializer()).a(BaseFeed.class, new FeedDeserializer()), p0, p1, this);
       }else if(obj == UserProfile.class){
          uoc = c.a;
          treeTypeAdap1 = new TreeTypeAdapter(uoc.b().a(LiveStreamFeed.class, new FeedSerializer()).a(BaseFeed.class, new FeedSerializer()), uoc.a().a(LiveStreamFeed.class, new FeedDeserializer()).a(BaseFeed.class, new FeedSerializer()), p0, p1, this);
       }
       t.c("FeatureModelStagGsonRegistration", obj+" -> "+typeAdapter2);
       if (typeAdapter2 != null) {
          this.b.put(obj, typeAdapter2);
       }
       _monitor_exit(tb);
       return typeAdapter2;
    }
}
