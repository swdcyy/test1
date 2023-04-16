package k5a.a$a;
import d6a.a;
import k5a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import ff6.a;
import moc.b;
import e50.i;
import e50.g;
import com.kuaishou.eve.kit.rerank.model.RerankPhoto;
import com.yxcorp.gifshow.entity.QPhoto;
import m50.g;
import ff6.d;
import im8.f;
import java.lang.Boolean;
import hf6.b;
import v40.a;
import java.lang.StringBuilder;
import j50.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Map;
import pf5.d;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import j50.b;

public final class a$a extends a	// class@002be3
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       a$a tb1;
       a a;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, a$a.class, str)) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       a uoa1 = PatchProxy.apply(objArray, tb, uoa, str);
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = tb.p;
          if (uoa1 == null) {
             a.S("mPhotoDetailParam");
          }
       }
       DetailCommonParam detailCommon = uoa1.getDetailCommonParam();
       a.o(detailCommon, "mPhotoDetailParam.detailCommonParam");
       a uoa2 = b.c(detailCommon.getRankFetcherId(), a.class);
       if (uoa2 != null) {
          i oi = uoa2.a();
          if (oi != null) {
             String str1 = "mPhoto";
             if (oi.getPlatform() == 1) {
                tb1 = this.b;
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoidOneRefs(oi, tb1, uoa, "15")) {
                   uoa = tb1.s;
                   if (uoa == null) {
                      a.S(str1);
                   }
                   if (!PatchProxy.applyVoidOneRefs(uoa, oi, g.class, "6") && uoa != null) {
                      g f = oi.f;
                      if (f != null) {
                         f.i(new RerankPhoto(uoa));
                      }
                   }
                }
             }else if(!oi.getPlatform()){
                tb1 = this.b;
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoidOneRefs(oi, tb1, uoa, "14")) {
                   uoa = tb1.t;
                   if (uoa != null) {
                      b obj = uoa.get();
                      a.o(obj, "mUserFeatureReported.get\(\)");
                      if (!obj.booleanValue()) {
                         obj = oi.h();
                         if (obj != null) {
                            a = a.a;
                            StringBuilder str2 = "onPhotoLeave: ";
                            a s = tb1.s;
                            if (s == null) {
                               a.S(str1);
                            }
                            a.b(str2+s.getPhotoId());
                            a s1 = tb1.s;
                            if (s1 == null) {
                               a.S(str1);
                            }
                            QPhoto mEntity = s1.mEntity;
                            a.o(mEntity, "mPhoto.mEntity");
                            e uoe = new e(mEntity);
                            s1 = tb1.q;
                            if (s1 == null) {
                               a.S("mLogger");
                            }
                            Object obj1 = s1.get();
                            a s2 = tb1.s;
                            if (s2 == null) {
                               a.S(str1);
                            }
                            uoe.h(d.a(obj1, s2, 0, 0, 12, null));
                            obj.o0(oi.b().getBizId(), "user_feature", uoe);
                            uoa = tb1.t;
                            if (uoa == null) {
                               a.S("mUserFeatureReported");
                            }
                            uoa.set(Boolean.TRUE);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
