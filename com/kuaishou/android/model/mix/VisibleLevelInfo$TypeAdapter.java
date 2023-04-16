package com.kuaishou.android.model.mix.VisibleLevelInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.VisibleLevelInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class VisibleLevelInfo$TypeAdapter extends TypeAdapter	// class@000e34
{
    public final Gson a;
    public static final a b;

    static {
       VisibleLevelInfo$TypeAdapter.b = a.get(VisibleLevelInfo.class);
    }
    public void VisibleLevelInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public VisibleLevelInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, VisibleLevelInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       VisibleLevelInfo visibleLevel = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return visibleLevel;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return visibleLevel;
       }else {
          p0.c();
          VisibleLevelInfo visibleLevel1 = new VisibleLevelInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 0;
                   }
                   break;
                 case 0x6219b84:
                   if (str.equals("level")) {
                      i = 1;
                   }
                   break;
                 case 0x3226ef7e:
                   if (str.equals("isPunished")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   visibleLevel1.mPunishedUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   visibleLevel1.mPunishLevel = KnownTypeAdapters$k.a(p0, visibleLevel1.mPunishLevel);
                   break;
                 case 2:
                   visibleLevel1.mIsPunished = KnownTypeAdapters$g.a(p0, visibleLevel1.mIsPunished);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return visibleLevel1;
       }
    }
    public void b(b p0,VisibleLevelInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisibleLevelInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("level");
          p0.K((long)p1.mPunishLevel);
          p0.r("isPunished");
          p0.P(p1.mIsPunished);
          if (p1.mPunishedUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mPunishedUrl);
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
