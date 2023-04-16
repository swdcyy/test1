package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import com.kwai.framework.model.user.RichTextMeta;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter$c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter$d;
import java.util.Map;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter$a;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter$b;

public final class CoverCommonTagLabelModel$TypeAdapter extends TypeAdapter	// class@000c33
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public static final a l;

    static {
       CoverCommonTagLabelModel$TypeAdapter.l = a.get(CoverCommonTagLabelModel.class);
    }
    public void CoverCommonTagLabelModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(CoverCommonTagLabelModel$LeftIconWh$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(a.get(Object.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter, new KnownTypeAdapters$e());
       this.f = p0.j(CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter.c);
       this.g = p0.j(a.get(RichTextMeta.class));
       typeAdapter = p0.j(CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter.c);
       this.h = typeAdapter;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.j = p0.j(CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter.b);
       this.k = p0.j(CoverCommonTagLabelModel$FootExtraText$TypeAdapter.b);
    }
    public CoverCommonTagLabelModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel uCoverCommon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverCommon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverCommon;
       }else {
          p0.c();
          CoverCommonTagLabelModel uCoverCommon1 = new CoverCommonTagLabelModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9f815b92:
                   if (str.equals("disableTag")) {
                      i = 0;
                   }
                   break;
                 case 0xa3ac65f4:
                   if (str.equals("tagType")) {
                      i = 1;
                   }
                   break;
                 case 0xa8f5d50a:
                   if (str.equals("rightSideExtraText")) {
                      i = 2;
                   }
                   break;
                 case 0xb6ef9307:
                   if (str.equals("extParams")) {
                      i = 3;
                   }
                   break;
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 4;
                   }
                   break;
                 case 0xcbb9b889:
                   if (str.equals("textV2")) {
                      i = 5;
                   }
                   break;
                 case 0xf0e6c55d:
                   if (str.equals("extraText")) {
                      i = 6;
                   }
                   break;
                 case 0xf41d9016:
                   if (str.equals("bgImage")) {
                      i = 7;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 8;
                   }
                   break;
                 case 0x5fcf7bf:
                   if (str.equals("isDot")) {
                      i = 9;
                   }
                   break;
                 case 0x704f48f:
                   if (str.equals("footExtraText")) {
                      i = 10;
                   }
                   break;
                 case 0x75475df:
                   if (str.equals("isTextLight")) {
                      i = 11;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 12;
                   }
                   break;
                 case 0x2bef49e4:
                   if (str.equals("customIconType")) {
                      i = 13;
                   }
                   break;
                 case 0x42cb480b:
                   if (str.equals("leftHeadUrls")) {
                      i = 14;
                   }
                   break;
                 case 0x5fb48e90:
                   if (str.equals("enableTextShadow")) {
                      i = 15;
                   }
                   break;
                 case 0x6667f520:
                   if (str.equals("leftIcon")) {
                      i = 16;
                   }
                   break;
                 case 0x6c1e2ac8:
                   if (str.equals("photo_source")) {
                      i = 17;
                   }
                   break;
                 case 0x6c3f3811:
                   if (str.equals("leftIconWh")) {
                      i = 18;
                   }
                   break;
                 case 0x7c50b6f8:
                   if (str.equals("darkModeStyle")) {
                      i = 19;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverCommon1.disableTag = KnownTypeAdapters$g.a(p0, uCoverCommon1.disableTag);
                   break;
                 case 1:
                   uCoverCommon1.tagType = KnownTypeAdapters$k.a(p0, uCoverCommon1.tagType);
                   break;
                 case 2:
                   uCoverCommon1.mRightSideExtraText = this.j.read(p0);
                   break;
                 case 3:
                   uCoverCommon1.extParams = this.e.read(p0);
                   break;
                 case 4:
                   uCoverCommon1.textColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCoverCommon1.mTextV2 = this.g.read(p0);
                   break;
                 case 6:
                   uCoverCommon1.mExtraText = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCoverCommon1.bgImage = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$TypeAdapter$d(this)).a(p0);
                   break;
                 case 8:
                   uCoverCommon1.text = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCoverCommon1.mIsDot = KnownTypeAdapters$g.a(p0, uCoverCommon1.mIsDot);
                   break;
                 case 10:
                   uCoverCommon1.mFootExtraText = this.k.read(p0);
                   break;
                 case 11:
                   uCoverCommon1.mIsTextLight = KnownTypeAdapters$g.a(p0, uCoverCommon1.mIsTextLight);
                   break;
                 case 12:
                   uCoverCommon1.linkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uCoverCommon1.mCustomIconType = KnownTypeAdapters$k.a(p0, uCoverCommon1.mCustomIconType);
                   break;
                 case 14:
                   uCoverCommon1.mHeadUrlModels = this.i.read(p0);
                   break;
                 case 15:
                   uCoverCommon1.mEnableTextShadow = KnownTypeAdapters$g.a(p0, uCoverCommon1.mEnableTextShadow);
                   break;
                 case 16:
                   uCoverCommon1.leftIcon = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$TypeAdapter$c(this)).a(p0);
                   break;
                 case 17:
                   uCoverCommon1.photoSource = TypeAdapters.A.read(p0);
                   break;
                 case 18:
                   uCoverCommon1.mLeftIconWh = this.c.read(p0);
                   break;
                 case 19:
                   uCoverCommon1.darkModeStyle = this.f.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverCommon1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("tagType");
          p0.K((long)p1.tagType);
          p0.r("disableTag");
          p0.P(p1.disableTag);
          if (p1.text != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.text);
          }
          if (p1.textColorStr != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.textColorStr);
          }
          if (p1.linkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.linkUrl);
          }
          if (p1.leftIcon != null) {
             p0.r("leftIcon");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$TypeAdapter$a(this)).b(p0, p1.leftIcon);
          }
          if (p1.mLeftIconWh != null) {
             p0.r("leftIconWh");
             this.c.write(p0, p1.mLeftIconWh);
          }
          if (p1.bgImage != null) {
             p0.r("bgImage");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$TypeAdapter$b(this)).b(p0, p1.bgImage);
          }
          if (p1.extParams != null) {
             p0.r("extParams");
             this.e.write(p0, p1.extParams);
          }
          if (p1.photoSource != null) {
             p0.r("photo_source");
             TypeAdapters.A.write(p0, p1.photoSource);
          }
          if (p1.darkModeStyle != null) {
             p0.r("darkModeStyle");
             this.f.write(p0, p1.darkModeStyle);
          }
          if (p1.mTextV2 != null) {
             p0.r("textV2");
             this.g.write(p0, p1.mTextV2);
          }
          p0.r("enableTextShadow");
          p0.P(p1.mEnableTextShadow);
          p0.r("customIconType");
          p0.K((long)p1.mCustomIconType);
          if (p1.mHeadUrlModels != null) {
             p0.r("leftHeadUrls");
             this.i.write(p0, p1.mHeadUrlModels);
          }
          p0.r("isTextLight");
          p0.P(p1.mIsTextLight);
          if (p1.mExtraText != null) {
             p0.r("extraText");
             TypeAdapters.A.write(p0, p1.mExtraText);
          }
          if (p1.mRightSideExtraText != null) {
             p0.r("rightSideExtraText");
             this.j.write(p0, p1.mRightSideExtraText);
          }
          if (p1.mFootExtraText != null) {
             p0.r("footExtraText");
             this.k.write(p0, p1.mFootExtraText);
          }
          p0.r("isDot");
          p0.P(p1.mIsDot);
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
