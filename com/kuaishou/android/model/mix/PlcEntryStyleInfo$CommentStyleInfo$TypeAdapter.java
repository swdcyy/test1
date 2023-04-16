package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter extends TypeAdapter	// class@000d7f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter.e = a.get(PlcEntryStyleInfo$CommentStyleInfo.class);
    }
    public void PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PlcEntryStyleInfo$ActionInfo$TypeAdapter.e);
       this.c = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
       this.d = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PlcEntryStyleInfo$CommentStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$CommentStyleInfo uCommentStyl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentStyl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentStyl;
       }else {
          p0.c();
          PlcEntryStyleInfo$CommentStyleInfo uCommentStyl1 = new PlcEntryStyleInfo$CommentStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8e0b7758:
                   if (str.equals("enableLabelArrow")) {
                      i = 0;
                   }
                   break;
                 case 0xbdd05fff:
                   if (str.equals("labels")) {
                      i = 1;
                   }
                   break;
                 case 0xddec2b4c:
                   if (str.equals("tagPackage")) {
                      i = 2;
                   }
                   break;
                 case 0xebb6525f:
                   if (str.equals("commentAreaStyleType")) {
                      i = 3;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 4;
                   }
                   break;
                 case 0x302bcfe:
                   if (str.equals("category")) {
                      i = 5;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 6;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 7;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommentStyl1.mEnableLabelArrow = KnownTypeAdapters$g.a(p0, uCommentStyl1.mEnableLabelArrow);
                   break;
                 case 1:
                   uCommentStyl1.mLabels = this.d.read(p0);
                   break;
                 case 2:
                   uCommentStyl1.mTagPackage = this.c.read(p0);
                   break;
                 case 3:
                   uCommentStyl1.mStyleType = KnownTypeAdapters$k.a(p0, uCommentStyl1.mStyleType);
                   break;
                 case 4:
                   uCommentStyl1.mTagInfoText = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCommentStyl1.mCategoryText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCommentStyl1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCommentStyl1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCommentStyl1.mActionInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentStyl1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$CommentStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          p0.r("commentAreaStyleType");
          p0.K((long)p1.mStyleType);
          if (p1.mActionInfo != null) {
             p0.r("actionInfo");
             this.b.write(p0, p1.mActionInfo);
          }
          if (p1.mTagPackage != null) {
             p0.r("tagPackage");
             this.c.write(p0, p1.mTagPackage);
          }
          if (p1.mCategoryText != null) {
             p0.r("category");
             TypeAdapters.A.write(p0, p1.mCategoryText);
          }
          if (p1.mTagInfoText != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTagInfoText);
          }
          if (p1.mLabels != null) {
             p0.r("labels");
             this.d.write(p0, p1.mLabels);
          }
          p0.r("enableLabelArrow");
          p0.P(p1.mEnableLabelArrow);
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
