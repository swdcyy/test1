package c99.a$a;
import erd.g;
import c99.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import kotlin.jvm.internal.a;
import v40.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import ff6.a;
import moc.b;
import e50.i;
import com.kuaishou.eve.kit.rerank.BizPage;
import j50.e;
import com.kwai.framework.model.feed.BaseFeed;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Map;
import pf5.d;
import ff6.d;
import hf6.b;
import j50.b;

public final class a$a implements g	// class@0004fc
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, str)) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          a uoa1 = PatchProxy.apply(null, p0, uoa, str);
          String str1 = "mPhotoDetailParam";
          if (uoa1 != PatchProxyResult.class) {
          }else {
             uoa1 = p0.p;
             if (uoa1 == null) {
                a.S(str1);
             }
          }
          PhotoDetailParam mPhoto = uoa1.mPhoto;
          a.o(mPhoto, "mPhotoDetailParam.mPhoto");
          if (!PatchProxy.applyVoidOneRefs(mPhoto, p0, uoa, "9")) {
             a.a.b("RankManager onPhotoLeave:  "+mPhoto.getPhotoId());
             uoa = p0.p;
             if (uoa == null) {
                a.S(str1);
             }
             DetailCommonParam detailCommon = uoa.getDetailCommonParam();
             a.o(detailCommon, "mPhotoDetailParam.detailCommonParam");
             uoa = b.c(detailCommon.getRankFetcherId(), a.class);
             if (uoa != null) {
                i oi = uoa.a();
                if (oi != null && !oi.getPlatform()) {
                   String bizId = oi.b().getBizId();
                   QPhoto mEntity = mPhoto.mEntity;
                   a.o(mEntity, "photo.mEntity");
                   e uoe = new e(mEntity);
                   p0 = p0.q;
                   if (p0 == null) {
                      a.S("mLogger");
                   }
                   uoe.h(d.a(p0.get(), mPhoto, 0, 0, 12, null));
                   p0 = oi.h();
                   if (p0 != null) {
                      p0.o0(bizId, "user_feature", uoe);
                   }
                }
             }
          }
       }
    label_00be :
       return;
    }
}
