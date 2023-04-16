package e3b.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import k2b.k2;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a	// class@00260a
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final CommonParams a(BaseFeed p0,int p1){
       String obj;
       CommonParams uCommonParam;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "baseFeed";
       a.p(p0, obj);
       if (PatchProxy.isSupport(uoa)) {
          uCommonParam = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), null, null, a.class, "5");
          if (uCommonParam != patchProxyRe) {
          label_00c0 :
             return uCommonParam;
          }
       }
       a.p(p0, obj);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("photo_type", Integer.valueOf(r1.S1(p0).toInt()));
       jsonObject.c0("photo_identity", TextUtils.I(p0.getId()));
       jsonObject.c0("photo_exp_tag", r1.M0(p0));
       jsonObject.a0("photo_index", Integer.valueOf(p1));
       jsonObject.c0("photo_llsid", r1.w0(p0).mListLoadSequenceID);
       jsonObject.c0("photo_s_author_id", r1.U1(p0));
       uCommonParam = new CommonParams();
       ImmutableMap$b uob = ImmutableMap.builder().c("element_action", new g("CLICK_TAG"));
       k2 ok2 = u1.j();
       if (ok2 != null) {
          ok2 = ok2.d;
          if (ok2 != null) {
          label_00ab :
             uCommonParam.mEntryTag = uob.c("page_name", new g(ok2)).c("params", jsonObject).a();
             goto label_00c0 ;
          }
       }
       obj = "";
       goto label_00ab ;
    }
    public static final CommonParams b(QPhoto p0){
       CommonParams uCommonParam = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCommonParam, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          BaseFeed entity = p0.getEntity();
          if (entity != null) {
             uCommonParam = a.a(entity, (r1.y1(entity) + 1));
          }
       }
       return uCommonParam;
    }
    public static final CommonParams c(QPhoto p0,int p1){
       a uoa = a.class;
       CommonParams uCommonParam = null;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uCommonParam, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          BaseFeed entity = p0.getEntity();
          if (entity != null) {
             uCommonParam = a.a(entity, p1);
          }
       }
       return uCommonParam;
    }
}
