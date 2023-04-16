package com.kuaishou.android.model.mix.QComment$Label$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.QComment$LabelExtra$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.QComment$LabelExtra;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Integer;
import com.google.gson.stream.b;

public final class QComment$Label$TypeAdapter extends TypeAdapter	// class@000dc9
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       QComment$Label$TypeAdapter.c = a.get(QComment$Label.class);
    }
    public void QComment$Label$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(QComment$LabelExtra$TypeAdapter.c);
    }
    public QComment$Label a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QComment$Label$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QComment$Label label = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return label;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return label;
       }else {
          p0.c();
          QComment$Label label1 = new QComment$Label();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa3ac65f4:
                   if (str.equals("tagType")) {
                      i = 0;
                   }
                   break;
                 case 0xadca6962:
                   if (str.equals("bgColorOnBlack")) {
                      i = 1;
                   }
                   break;
                 case 0xaef0a58c:
                   if (str.equals("bgColorOnWhite")) {
                      i = 2;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 3;
                   }
                   break;
                 case 0x5c79410:
                   if (str.equals("extra")) {
                      i = 4;
                   }
                   break;
                 case 0x9bc47d9:
                   if (str.equals("bubbleText")) {
                      i = 5;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 6;
                   }
                   break;
                 case 0x3660487d:
                   if (str.equals("colorOnBlack")) {
                      i = 7;
                   }
                   break;
                 case 0x378684a7:
                   if (str.equals("colorOnWhite")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   label1.mLabelType = KnownTypeAdapters.c.read(p0);
                   break;
                 case 1:
                   label1.mBackgroundBlackColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   label1.mBackgroundWhiteColor = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   label1.mLabelName = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   label1.mExtra = this.b.read(p0);
                   break;
                 case 5:
                   label1.mBubbleText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   label1.mLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   label1.mBlackColor = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   label1.mWhiteColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return label1;
       }
    }
    public void b(b p0,QComment$Label p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QComment$Label$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLabelName != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mLabelName);
          }
          if (p1.mLabelType != null) {
             p0.r("tagType");
             KnownTypeAdapters.c.write(p0, p1.mLabelType);
          }
          if (p1.mBubbleText != null) {
             p0.r("bubbleText");
             TypeAdapters.A.write(p0, p1.mBubbleText);
          }
          if (p1.mWhiteColor != null) {
             p0.r("colorOnWhite");
             TypeAdapters.A.write(p0, p1.mWhiteColor);
          }
          if (p1.mBlackColor != null) {
             p0.r("colorOnBlack");
             TypeAdapters.A.write(p0, p1.mBlackColor);
          }
          if (p1.mBackgroundWhiteColor != null) {
             p0.r("bgColorOnWhite");
             TypeAdapters.A.write(p0, p1.mBackgroundWhiteColor);
          }
          if (p1.mBackgroundBlackColor != null) {
             p0.r("bgColorOnBlack");
             TypeAdapters.A.write(p0, p1.mBackgroundBlackColor);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mExtra != null) {
             p0.r("extra");
             this.b.write(p0, p1.mExtra);
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
