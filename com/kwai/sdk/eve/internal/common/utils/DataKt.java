package com.kwai.sdk.eve.internal.common.utils.DataKt;
import zk.d;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import com.kuaishou.eve.packageinfo.model.TypeAdapterKt;
import java.lang.reflect.Type;
import java.lang.Object;
import q50.c;
import com.kuaishou.eve.packageinfo.model.FilterAction;
import com.kwai.sdk.eve.internal.common.utils.DataKt$a;
import el.a;
import com.kwai.sdk.eve.internal.pack.api.TypeAdapterKt;
import com.kwai.sdk.eve.internal.common.utils.DataKt$b;
import com.kwai.sdk.eve.internal.common.utils.DataKt$c;
import com.kwai.sdk.eve.internal.common.utils.DataKt$d;
import com.kwai.sdk.eve.internal.common.utils.DataKt$e;
import com.google.gson.b;
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponseKt;
import com.kwai.sdk.eve.internal.common.utils.DataKt$f;
import com.kwai.sdk.eve.internal.common.utils.DataKt$g;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponseKt;
import njd.a;
import com.yxcorp.retrofit.model.ResponseDeserializer;
import ml5.a;
import com.kwai.sdk.eve.internal.common.utils.DataKt$gson$8;
import ml5.c;
import com.kwai.sdk.eve.internal.common.utils.DataKt$gson$9;
import com.kwai.eve.blockdata.BlockData;
import com.kwai.sdk.eve.internal.common.utils.DataKt$gson$10;
import com.google.gson.Gson;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DataKt	// class@0014a1
{
    public static final Gson a;

    static {
       d uod = new d();
       uod.f(TypedExecutable.class, TypeAdapterKt.a);
       uod.f(c.class, TypeAdapterKt.b);
       uod.f(FilterAction.class, TypeAdapterKt.c);
       uod.f(new DataKt$a().getType(), TypeAdapterKt.a);
       uod.f(new DataKt$b().getType(), TypeAdapterKt.b);
       uod.f(new DataKt$c().getType(), TypeAdapterKt.c);
       uod.f(new DataKt$d().getType(), TypeAdapterKt.d);
       uod.f(new DataKt$e().getType(), UserProfileFeatureResponseKt.getUserProfileFeatureAdapter());
       uod.f(new DataKt$f().getType(), UserProfileFeatureResponseKt.getUserProfileFeatureRetrofitAdapter());
       uod.f(new DataKt$g().getType(), FeatureCalculateConfigResponseKt.getFeatureCalculateConfigAdapter());
       uod.f(a.class, new ResponseDeserializer());
       uod.f(a.class, new DataKt$gson$8());
       uod.f(c.class, new DataKt$gson$9());
       uod.f(BlockData.class, new DataKt$gson$10());
       Gson gson = uod.b();
       a.o(gson, "GsonBuilder\(\)\n  .registe¡­  }\n    }\n  \)\n  .create\(\)");
       DataKt.a = gson;
    }
    public static final Gson a(){
       return DataKt.a;
    }
}
