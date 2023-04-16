package com.kwai.framework.model.user.RichTextMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.RichTextMeta$Param$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.kwai.framework.model.user.User$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class RichTextMeta$TypeAdapter extends TypeAdapter	// class@001727
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public static final a h;

    static {
       RichTextMeta$TypeAdapter.h = a.get(RichTextMeta.class);
    }
    public void RichTextMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(RichTextMeta$TypeAdapter.h);
       TypeAdapter typeAdapter = p0.j(RichTextMeta$Param$TypeAdapter.c);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
       TypeAdapter typeAdapter1 = p0.j(User$TypeAdapter.G);
       this.f = typeAdapter1;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RichTextMeta$TypeAdapter.class, "2");
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
             obj = new RichTextMeta();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8e00190b:
                      if (str.equals("showUsers")) {
                         i = 0;
                      }
                      break;
                    case 0xbfeac1c3:
                      if (str.equals("interactActionUrl")) {
                         i = 1;
                      }
                      break;
                    case 0xf02977d0:
                      if (str.equals("interactRecoTextInfo")) {
                         i = 2;
                      }
                      break;
                    case 0x683188c:
                      if (str.equals("scene")) {
                         i = 3;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 4;
                      }
                      break;
                    case 0x12b01c04:
                      if (str.equals("userCount")) {
                         i = 5;
                      }
                      break;
                    case 0x333a8669:
                      if (str.equals("pageType")) {
                         i = 6;
                      }
                      break;
                    case 0x3ac11d75:
                      if (str.equals("rawText")) {
                         i = 7;
                      }
                      break;
                    case 0x6475271f:
                      if (str.equals("eventTrackInfo")) {
                         i = 8;
                      }
                      break;
                    case 0x74732ecb:
                      if (str.equals("paramList")) {
                         i = 9;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mShowUsers = this.g.read(p0);
                      break;
                    case 1:
                      obj.mInteractActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mInteractRecoTextInfo = this.b.read(p0);
                      break;
                    case 3:
                      obj.mScene = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mUserCount = KnownTypeAdapters$k.a(p0, obj.mUserCount);
                      break;
                    case 6:
                      obj.mPageType = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mRawText = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mEventTrackInfo = this.e.read(p0);
                      break;
                    case 9:
                      obj.mParamList = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RichTextMeta$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mInteractRecoTextInfo != null) {
             p0.r("interactRecoTextInfo");
             this.b.write(p0, p1.mInteractRecoTextInfo);
          }
          if (p1.mInteractActionUrl != null) {
             p0.r("interactActionUrl");
             TypeAdapters.A.write(p0, p1.mInteractActionUrl);
          }
          if (p1.mParamList != null) {
             p0.r("paramList");
             this.d.write(p0, p1.mParamList);
          }
          if (p1.mRawText != null) {
             p0.r("rawText");
             TypeAdapters.A.write(p0, p1.mRawText);
          }
          if (p1.mEventTrackInfo != null) {
             p0.r("eventTrackInfo");
             this.e.write(p0, p1.mEventTrackInfo);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mShowUsers != null) {
             p0.r("showUsers");
             this.g.write(p0, p1.mShowUsers);
          }
          p0.r("userCount");
          p0.K((long)p1.mUserCount);
          if (p1.mScene != null) {
             p0.r("scene");
             TypeAdapters.A.write(p0, p1.mScene);
          }
          if (p1.mPageType != null) {
             p0.r("pageType");
             TypeAdapters.A.write(p0, p1.mPageType);
          }
          p0.j();
       }
       return;
    }
}
