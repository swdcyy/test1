package com.kuaishou.android.model.mix.AttachmentInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AttachmentInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.ImageLayoutInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ImageContent$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.ImageContent;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
import java.io.IOException;
import com.google.gson.stream.b;

public final class AttachmentInfo$TypeAdapter extends TypeAdapter	// class@000bc8
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       AttachmentInfo$TypeAdapter.d = a.get(AttachmentInfo.class);
    }
    public void AttachmentInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ImageLayoutInfo$TypeAdapter.b);
       this.c = p0.j(ImageContent$TypeAdapter.d);
    }
    public AttachmentInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AttachmentInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AttachmentInfo uAttachmentI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAttachmentI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAttachmentI;
       }else {
          p0.c();
          AttachmentInfo uAttachmentI1 = new AttachmentInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbddafb2a:
                   if (str.equals("layout")) {
                      i = 0;
                   }
                   break;
                 case 0xfd847087:
                   if (str.equals("previewURL")) {
                      i = 1;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 2;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 3;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAttachmentI1.setLayout(this.b.read(p0));
                   break;
                 case 1:
                   uAttachmentI1.setPreviewURL(TypeAdapters.A.read(p0));
                   break;
                 case 2:
                   uAttachmentI1.setId(TypeAdapters.A.read(p0));
                   break;
                 case 3:
                   uAttachmentI1.setType(TypeAdapters.A.read(p0));
                   break;
                 case 4:
                   uAttachmentI1.setContent(this.c.read(p0));
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          if (uAttachmentI1.getType() != null) {
             return uAttachmentI1;
          }
          throw new IOException("getType\(\) cannot be null");
       }
    }
    public void b(b p0,AttachmentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AttachmentInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.getType() != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.getType());
          }else if(p1.getType() != null){
             throw new IOException("getType\(\) cannot be null");
          }
          if (p1.getId() != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.getId());
          }
          if (p1.getPreviewURL() != null) {
             p0.r("previewURL");
             TypeAdapters.A.write(p0, p1.getPreviewURL());
          }
          if (p1.getLayout() != null) {
             p0.r("layout");
             this.b.write(p0, p1.getLayout());
          }
          if (p1.getContent() != null) {
             p0.r("content");
             this.c.write(p0, p1.getContent());
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
