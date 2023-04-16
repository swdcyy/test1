package com.yxcorp.gifshow.activity.info.ActivityInfoStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.activity.info.ActivityInfoStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.google.gson.stream.b;

public final class ActivityInfoStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@00134e
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ActivityInfoStartupCommonPojo$TypeAdapter.d = a.get(ActivityInfoStartupCommonPojo.class);
    }
    public void ActivityInfoStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(ActivityInfo.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityInfoStartupCommonPojo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ActivityInfoStartupCommonPojo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("activityInfoList")) {
                   if (!str1.equals("activityInfoListVersion")) {
                      p0.Q();
                   }else {
                      obj.mActivityInfoListVersion = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mActivityInfoList = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityInfoStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mActivityInfoList != null) {
             p0.r("activityInfoList");
             this.c.write(p0, p1.mActivityInfoList);
          }
          if (p1.mActivityInfoListVersion != null) {
             p0.r("activityInfoListVersion");
             TypeAdapters.A.write(p0, p1.mActivityInfoListVersion);
          }
          p0.j();
       }
       return;
    }
}
