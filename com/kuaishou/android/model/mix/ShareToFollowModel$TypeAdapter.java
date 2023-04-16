package com.kuaishou.android.model.mix.ShareToFollowModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ShareToFollowModel$TypeAdapter extends TypeAdapter	// class@000dfa
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ShareToFollowModel$TypeAdapter.d = a.get(ShareToFollowModel.class);
    }
    public void ShareToFollowModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public ShareToFollowModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ShareToFollowModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ShareToFollowModel shareToFollo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return shareToFollo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return shareToFollo;
       }else {
          p0.c();
          ShareToFollowModel shareToFollo1 = new ShareToFollowModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("count")) {
                if (!str.equals("users")) {
                   p0.Q();
                }else {
                   shareToFollo1.mSharers = this.c.read(p0);
                }
             }else {
                shareToFollo1.mCount = KnownTypeAdapters$k.a(p0, shareToFollo1.mCount);
             }
          }
          p0.j();
          return shareToFollo1;
       }
    }
    public void b(b p0,ShareToFollowModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareToFollowModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("count");
          p0.K((long)p1.mCount);
          if (p1.mSharers != null) {
             p0.r("users");
             this.c.write(p0, p1.mSharers);
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
