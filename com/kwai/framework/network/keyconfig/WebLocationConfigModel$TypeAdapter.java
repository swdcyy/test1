package com.kwai.framework.network.keyconfig.WebLocationConfigModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.WebLocationConfigModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class WebLocationConfigModel$TypeAdapter extends TypeAdapter	// class@000c1f
{
    public final Gson a;
    public static final a b;

    static {
       WebLocationConfigModel$TypeAdapter.b = a.get(WebLocationConfigModel.class);
    }
    public void WebLocationConfigModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, WebLocationConfigModel$TypeAdapter.class, "2");
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
             obj = new WebLocationConfigModel();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("latlonAllEnable")) {
                   if (!str1.equals("llAllEnable")) {
                      p0.Q();
                   }else {
                      obj.llAllEnable = KnownTypeAdapters$g.a(p0, obj.llAllEnable);
                   }
                }else {
                   obj.latLonAllEnable = KnownTypeAdapters$g.a(p0, obj.latLonAllEnable);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebLocationConfigModel$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("latlonAllEnable");
          p0.P(p1.latLonAllEnable);
          p0.r("llAllEnable");
          p0.P(p1.llAllEnable);
          p0.j();
       }
       return;
    }
}
