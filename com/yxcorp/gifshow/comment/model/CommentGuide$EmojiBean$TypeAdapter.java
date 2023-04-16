package com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean;
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

public final class CommentGuide$EmojiBean$TypeAdapter extends TypeAdapter	// class@0010e5
{
    public final Gson a;
    public static final a b;

    static {
       CommentGuide$EmojiBean$TypeAdapter.b = a.get(CommentGuide$EmojiBean.class);
    }
    public void CommentGuide$EmojiBean$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CommentGuide$EmojiBean$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new CommentGuide$EmojiBean();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("emojiKey")) {
                   if (!str1.equals("emojiUrl")) {
                      p0.Q();
                   }else {
                      obj.mUrl = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mkey = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentGuide$EmojiBean$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mkey != null) {
             p0.r("emojiKey");
             TypeAdapters.A.write(p0, p1.mkey);
          }
          if (p1.mUrl != null) {
             p0.r("emojiUrl");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          p0.j();
       }
       return;
    }
}
