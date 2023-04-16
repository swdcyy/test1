package com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.comment.config.RecommendGodComment;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class CommentStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@0010ab
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CommentStartupCommonPojo$TypeAdapter.c = a.get(CommentStartupCommonPojo.class);
    }
    public void CommentStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(RecommendGodComment.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CommentStartupCommonPojo$TypeAdapter.class, "2");
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
             obj = new CommentStartupCommonPojo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa1cf2183:
                      if (str.equals("enableShowGodComment")) {
                         i = 0;
                      }
                      break;
                    case 0xb0252365:
                      if (str.equals("godCommentConfig")) {
                         i = 1;
                      }
                      break;
                    case 0xb744f3da:
                      if (str.equals("enableCommentShowUpload")) {
                         i = 2;
                      }
                      break;
                    case 0xc7ebfb48:
                      if (str.equals("foldupCommentThreshold")) {
                         i = 3;
                      }
                      break;
                    case 0x49cc3b3a:
                      if (str.equals("godCommentShowType")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableShowGodComment = KnownTypeAdapters$g.a(p0, obj.mEnableShowGodComment);
                      break;
                    case 1:
                      obj.mOneClickRecommendGodComment = this.b.read(p0);
                      break;
                    case 2:
                      obj.mEnableCommentShowUpload = KnownTypeAdapters$g.a(p0, obj.mEnableCommentShowUpload);
                      break;
                    case 3:
                      obj.mFoldupCommentThreshold = KnownTypeAdapters$k.a(p0, obj.mFoldupCommentThreshold);
                      break;
                    case 4:
                      obj.mGodCommentShowType = KnownTypeAdapters$k.a(p0, obj.mGodCommentShowType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("foldupCommentThreshold");
          p0.K((long)p1.mFoldupCommentThreshold);
          p0.r("enableCommentShowUpload");
          p0.P(p1.mEnableCommentShowUpload);
          p0.r("enableShowGodComment");
          p0.P(p1.mEnableShowGodComment);
          p0.r("godCommentShowType");
          p0.K((long)p1.mGodCommentShowType);
          if (p1.mOneClickRecommendGodComment != null) {
             p0.r("godCommentConfig");
             this.b.write(p0, p1.mOneClickRecommendGodComment);
          }
          p0.j();
       }
       return;
    }
}
