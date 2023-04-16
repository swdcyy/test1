package com.kuaishou.android.model.mix.PhotoCommonTags$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTags;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import com.google.gson.stream.b;

public final class PhotoCommonTags$TypeAdapter extends TypeAdapter	// class@000d41
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoCommonTags$TypeAdapter.c = a.get(PhotoCommonTags.class);
    }
    public void PhotoCommonTags$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoCommonTagsStyleInfo$TypeAdapter.d);
    }
    public PhotoCommonTags a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonTags$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCommonTags photoCommonT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCommonT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCommonT;
       }else {
          p0.c();
          PhotoCommonTags photoCommonT1 = new PhotoCommonTags();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("styleInfo")) {
                p0.Q();
             }else {
                photoCommonT1.mPhotoCommonTagsStyleInfo = this.b.read(p0);
             }
          }
          p0.j();
          return photoCommonT1;
       }
    }
    public void b(b p0,PhotoCommonTags p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCommonTags$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPhotoCommonTagsStyleInfo != null) {
             p0.r("styleInfo");
             this.b.write(p0, p1.mPhotoCommonTagsStyleInfo);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
