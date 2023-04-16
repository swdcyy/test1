package com.kuaishou.android.model.mix.QComment$CommentBottomTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
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
import com.google.gson.stream.b;

public final class QComment$CommentBottomTag$TypeAdapter extends TypeAdapter	// class@000dc4
{
    public final Gson a;
    public static final a b;

    static {
       QComment$CommentBottomTag$TypeAdapter.b = a.get(QComment$CommentBottomTag.class);
    }
    public void QComment$CommentBottomTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public QComment$CommentBottomTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QComment$CommentBottomTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QComment$CommentBottomTag uCommentBott = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentBott;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentBott;
       }else {
          p0.c();
          QComment$CommentBottomTag uCommentBott1 = new QComment$CommentBottomTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9cc1809a:
                   if (str.equals("bgColorNight")) {
                      i = 0;
                   }
                   break;
                 case 0xab7d35f2:
                   if (str.equals("textKey")) {
                      i = 1;
                   }
                   break;
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 2;
                   }
                   break;
                 case 0xf3ca161e:
                   if (str.equals("bgColor")) {
                      i = 3;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 4;
                   }
                   break;
                 case 0x5c79410:
                   if (str.equals("extra")) {
                      i = 5;
                   }
                   break;
                 case 0x47d3b782:
                   if (str.equals("textColorNight")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommentBott1.mBgColorNightStr = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCommentBott1.mTextKey = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCommentBott1.mTextColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCommentBott1.mBgColorStr = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uCommentBott1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCommentBott1.mExtra = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCommentBott1.mTextColorNightStr = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentBott1;
       }
    }
    public void b(b p0,QComment$CommentBottomTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QComment$CommentBottomTag$TypeAdapter.class, "1")) {
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
          if (p1.mTextColorStr != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColorStr);
          }
          if (p1.mTextColorNightStr != null) {
             p0.r("textColorNight");
             TypeAdapters.A.write(p0, p1.mTextColorNightStr);
          }
          if (p1.mBgColorStr != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBgColorStr);
          }
          if (p1.mBgColorNightStr != null) {
             p0.r("bgColorNight");
             TypeAdapters.A.write(p0, p1.mBgColorNightStr);
          }
          if (p1.mExtra != null) {
             p0.r("extra");
             TypeAdapters.A.write(p0, p1.mExtra);
          }
          if (p1.mTextKey != null) {
             p0.r("textKey");
             TypeAdapters.A.write(p0, p1.mTextKey);
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
