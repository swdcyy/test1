package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$d;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$a;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$b;

public final class CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter extends TypeAdapter	// class@000c29
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter.c = a.get(CoverCommonTagLabelModel$LabelModeStyle.class);
    }
    public void CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public CoverCommonTagLabelModel$LabelModeStyle a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel$LabelModeStyle labelModeSty = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return labelModeSty;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return labelModeSty;
       }else {
          p0.c();
          CoverCommonTagLabelModel$LabelModeStyle labelModeSty1 = new CoverCommonTagLabelModel$LabelModeStyle();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 0;
                   }
                   break;
                 case 0xf41d9016:
                   if (str.equals("bgImage")) {
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
                 case 0x6667f520:
                   if (str.equals("leftIcon")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   labelModeSty1.textColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   labelModeSty1.bgImage = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$d(this)).a(p0);
                   break;
                 case 2:
                   labelModeSty1.text = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   labelModeSty1.linkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   labelModeSty1.leftIcon = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$c(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return labelModeSty1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel$LabelModeStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
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
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$a(this)).b(p0, p1.leftIcon);
          }
          if (p1.bgImage != null) {
             p0.r("bgImage");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter$b(this)).b(p0, p1.bgImage);
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
