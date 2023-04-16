package me9.c$d;
import erd.o;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicExtraDependentDataResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import java.util.List;
import j8c.a;
import w46.b;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public final class c$d implements o	// class@002fe4
{
    public final MagicEmoji$MagicFace b;

    public void c$d(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       List data;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          int i = 0;
          if (p0.getData() == null) {
             obj = new Object[i];
             a.D().t("MagicRequestDependencyHandler", "onMagicResourceRequest request data is null", obj);
             obj = null;
          }else {
             ArrayList uArrayList = new ArrayList();
             data = p0.getData();
             if (data == null || data.isEmpty()) {
                i = 1;
             }
             if (!i) {
                p0 = p0.getData();
                a.m(p0);
                uArrayList.addAll(p0);
             }
             p0 = this.b.mExtraParams;
             if (p0 != null) {
                p0 = p0.mRunTimeData;
                if (p0 != null) {
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.c0("key", "runtimeData");
                   jsonObject.G("payload", a.a.x(p0));
                   uArrayList.add(jsonObject);
                }
             }
             p0 = new JsonObject();
             p0.G("data", a.a.x(uArrayList));
             obj = p0;
          }
       }
       return obj;
    }
}
