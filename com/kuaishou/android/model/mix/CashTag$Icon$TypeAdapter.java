package com.kuaishou.android.model.mix.CashTag$Icon$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CashTag$Icon;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CashTag$Icon$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CashTag$Icon$TypeAdapter$a;

public final class CashTag$Icon$TypeAdapter extends TypeAdapter	// class@000bdc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CashTag$Icon$TypeAdapter.c = a.get(CashTag$Icon.class);
    }
    public void CashTag$Icon$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public CashTag$Icon a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CashTag$Icon$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CashTag$Icon icon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return icon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return icon;
       }else {
          p0.c();
          CashTag$Icon icon1 = new CashTag$Icon();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc78b6e94:
                   if (str.equals("txtHeightRatio")) {
                      i = 0;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 1;
                   }
                   break;
                 case 0x25e3feb1:
                   if (str.equals("cdnUrls")) {
                      i = 2;
                   }
                   break;
                 case 0x41194293:
                   if (str.equals("aspectRatio")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   icon1.mTxtHeightRatio = KnownTypeAdapters$j.a(p0, icon1.mTxtHeightRatio);
                   break;
                 case 1:
                   icon1.mUrl = this.b.read(p0);
                   break;
                 case 2:
                   icon1.mCdnUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CashTag$Icon$TypeAdapter$b(this)).a(p0);
                   break;
                 case 3:
                   icon1.mAspectRatio = KnownTypeAdapters$j.a(p0, icon1.mAspectRatio);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return icon1;
       }
    }
    public void b(b p0,CashTag$Icon p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CashTag$Icon$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUrl != null) {
             p0.r("url");
             this.b.write(p0, p1.mUrl);
          }
          if (p1.mCdnUrls != null) {
             p0.r("cdnUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new CashTag$Icon$TypeAdapter$a(this)).b(p0, p1.mCdnUrls);
          }
          p0.r("aspectRatio");
          p0.J((double)p1.mAspectRatio);
          p0.r("txtHeightRatio");
          p0.J((double)p1.mTxtHeightRatio);
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
