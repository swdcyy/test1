package com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo;
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
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter$d;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter$c;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter$a;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter$b;

public final class CommentAuthorPendantInfo$TypeAdapter extends TypeAdapter	// class@000bfd
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CommentAuthorPendantInfo$TypeAdapter.c = a.get(CommentAuthorPendantInfo.class);
    }
    public void CommentAuthorPendantInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public CommentAuthorPendantInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CommentAuthorPendantInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CommentAuthorPendantInfo uCommentAuth = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentAuth;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentAuth;
       }else {
          p0.c();
          CommentAuthorPendantInfo uCommentAuth1 = new CommentAuthorPendantInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("rootCommentPendantUrls")) {
                if (!str.equals("subCommentPendantUrls")) {
                   p0.Q();
                }else {
                   uCommentAuth1.mSubCommentPendantUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CommentAuthorPendantInfo$TypeAdapter$d(this)).a(p0);
                }
             }else {
                uCommentAuth1.mRootCommentPendantUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CommentAuthorPendantInfo$TypeAdapter$c(this)).a(p0);
             }
          }
          p0.j();
          return uCommentAuth1;
       }
    }
    public void b(b p0,CommentAuthorPendantInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentAuthorPendantInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRootCommentPendantUrls != null) {
             p0.r("rootCommentPendantUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CommentAuthorPendantInfo$TypeAdapter$a(this)).b(p0, p1.mRootCommentPendantUrls);
          }
          if (p1.mSubCommentPendantUrls != null) {
             p0.r("subCommentPendantUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CommentAuthorPendantInfo$TypeAdapter$b(this)).b(p0, p1.mSubCommentPendantUrls);
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
