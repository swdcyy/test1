package com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class CoverCommonTagLabelModel$FootExtraText$TypeAdapter extends TypeAdapter	// class@000c1f
{
    public final Gson a;
    public static final a b;

    static {
       CoverCommonTagLabelModel$FootExtraText$TypeAdapter.b = a.get(CoverCommonTagLabelModel$FootExtraText.class);
    }
    public void CoverCommonTagLabelModel$FootExtraText$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverCommonTagLabelModel$FootExtraText a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagLabelModel$FootExtraText$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagLabelModel$FootExtraText uFootExtraTe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFootExtraTe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFootExtraTe;
       }else {
          p0.c();
          CoverCommonTagLabelModel$FootExtraText uFootExtraTe1 = new CoverCommonTagLabelModel$FootExtraText();
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
                 case 0xfb3f2dd2:
                   if (str.equals("maskAlpha")) {
                      i = 1;
                   }
                   break;
                 case 0xfb5cabd7:
                   if (str.equals("maskColor")) {
                      i = 2;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFootExtraTe1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFootExtraTe1.mMaskAlpha = KnownTypeAdapters$j.a(p0, uFootExtraTe1.mMaskAlpha);
                   break;
                 case 2:
                   uFootExtraTe1.mMaskColor = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFootExtraTe1.mText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFootExtraTe1;
       }
    }
    public void b(b p0,CoverCommonTagLabelModel$FootExtraText p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagLabelModel$FootExtraText$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          if (p1.mMaskColor != null) {
             p0.r("maskColor");
             TypeAdapters.A.write(p0, p1.mMaskColor);
          }
          p0.r("maskAlpha");
          p0.J((double)p1.mMaskAlpha);
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
