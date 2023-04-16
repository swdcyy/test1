package com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class BeautifySuiteInfo$BeautifyItem$TypeAdapter extends TypeAdapter	// class@0012ce
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       BeautifySuiteInfo$BeautifyItem$TypeAdapter.c = a.get(BeautifySuiteInfo$BeautifyItem.class);
    }
    public void BeautifySuiteInfo$BeautifyItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.e, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautifySuiteInfo$BeautifyItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new BeautifySuiteInfo$BeautifyItem();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xaded1e3f:
                      if (str.equals("minValue")) {
                         i = 0;
                      }
                      break;
                    case 0xd25895af:
                      if (str.equals("valueList")) {
                         i = 1;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 2;
                      }
                      break;
                    case 0x17cbba6d:
                      if (str.equals("maxValue")) {
                         i = 3;
                      }
                      break;
                    case 0x1dc31833:
                      if (str.equals("intensity")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMinValue = KnownTypeAdapters$j.a(p0, obj.mMinValue);
                      break;
                    case 1:
                      obj.mIntensityList = this.b.read(p0);
                      break;
                    case 2:
                      obj.mBeautifyItemId = KnownTypeAdapters$k.a(p0, obj.mBeautifyItemId);
                      break;
                    case 3:
                      obj.mMaxValue = KnownTypeAdapters$j.a(p0, obj.mMaxValue);
                      break;
                    case 4:
                      obj.mBeautifyIntensity = KnownTypeAdapters$j.a(p0, obj.mBeautifyIntensity);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifySuiteInfo$BeautifyItem$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mBeautifyItemId);
          p0.r("intensity");
          p0.J((double)p1.mBeautifyIntensity);
          p0.r("maxValue");
          p0.J((double)p1.mMaxValue);
          p0.r("minValue");
          p0.J((double)p1.mMinValue);
          if (p1.mIntensityList != null) {
             p0.r("valueList");
             this.b.write(p0, p1.mIntensityList);
          }
          p0.j();
       }
       return;
    }
}
