package com.kuaishou.android.model.mix.PhotoRelationEntrance$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.RichTextMeta;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
import com.google.gson.stream.b;

public final class PhotoRelationEntrance$TypeAdapter extends TypeAdapter	// class@000d64
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoRelationEntrance$TypeAdapter.d = a.get(PhotoRelationEntrance.class);
    }
    public void PhotoRelationEntrance$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(RichTextMeta.class));
       this.c = p0.j(PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter.b);
    }
    public PhotoRelationEntrance a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoRelationEntrance$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoRelationEntrance photoRelatio = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoRelatio;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoRelatio;
       }else {
          p0.c();
          PhotoRelationEntrance photoRelatio1 = new PhotoRelationEntrance();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb6ef9307:
                   if (str.equals("extParams")) {
                      i = 0;
                   }
                   break;
                 case 0xefa709e0:
                   if (str.equals("darkIconUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 2;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoRelatio1.mExtParams = this.c.read(p0);
                   break;
                 case 1:
                   photoRelatio1.mDarkIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   photoRelatio1.mText = this.b.read(p0);
                   break;
                 case 3:
                   photoRelatio1.mLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   photoRelatio1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoRelatio1;
       }
    }
    public void b(b p0,PhotoRelationEntrance p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoRelationEntrance$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mDarkIconUrl != null) {
             p0.r("darkIconUrl");
             TypeAdapters.A.write(p0, p1.mDarkIconUrl);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mText != null) {
             p0.r("text");
             this.b.write(p0, p1.mText);
          }
          if (p1.mExtParams != null) {
             p0.r("extParams");
             this.c.write(p0, p1.mExtParams);
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
