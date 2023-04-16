package com.kuaishou.android.model.mix.QComment$CommentMarqueeTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
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

public final class QComment$CommentMarqueeTag$TypeAdapter extends TypeAdapter	// class@000dc6
{
    public final Gson a;
    public static final a b;

    static {
       QComment$CommentMarqueeTag$TypeAdapter.b = a.get(QComment$CommentMarqueeTag.class);
    }
    public void QComment$CommentMarqueeTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public QComment$CommentMarqueeTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QComment$CommentMarqueeTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QComment$CommentMarqueeTag uCommentMarq = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentMarq;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentMarq;
       }else {
          p0.c();
          QComment$CommentMarqueeTag uCommentMarq1 = new QComment$CommentMarqueeTag();
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
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 1;
                   }
                   break;
                 case 0xf3ca161e:
                   if (str.equals("bgColor")) {
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
                   uCommentMarq1.mTageType = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCommentMarq1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCommentMarq1.mBgColor = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCommentMarq1.mTagText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentMarq1;
       }
    }
    public void b(b p0,QComment$CommentMarqueeTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QComment$CommentMarqueeTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTageType != null) {
             p0.r("tagType");
             TypeAdapters.A.write(p0, p1.mTageType);
          }
          if (p1.mTagText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mTagText);
          }
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          if (p1.mBgColor != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBgColor);
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
