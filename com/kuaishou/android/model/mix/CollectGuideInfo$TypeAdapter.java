package com.kuaishou.android.model.mix.CollectGuideInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CollectGuideInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class CollectGuideInfo$TypeAdapter extends TypeAdapter	// class@000bed
{
    public final Gson a;
    public static final a b;

    static {
       CollectGuideInfo$TypeAdapter.b = a.get(CollectGuideInfo.class);
    }
    public void CollectGuideInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CollectGuideInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CollectGuideInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CollectGuideInfo uCollectGuid = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCollectGuid;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCollectGuid;
       }else {
          p0.c();
          CollectGuideInfo uCollectGuid1 = new CollectGuideInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x29041421:
                   if (str.equals("enableWeakGuide")) {
                      i = 0;
                   }
                   break;
                 case 0x4a28dc94:
                   if (str.equals("strongGuidePopUpTime")) {
                      i = 1;
                   }
                   break;
                 case 0x62725d22:
                   if (str.equals("enableStrongGuide")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCollectGuid1.mEnableWeakGuide = KnownTypeAdapters$g.a(p0, uCollectGuid1.mEnableWeakGuide);
                   break;
                 case 1:
                   uCollectGuid1.mStrongGuidePopUpTime = KnownTypeAdapters$n.a(p0, uCollectGuid1.mStrongGuidePopUpTime);
                   break;
                 case 2:
                   uCollectGuid1.mEnableStrongGuide = KnownTypeAdapters$g.a(p0, uCollectGuid1.mEnableStrongGuide);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCollectGuid1;
       }
    }
    public void b(b p0,CollectGuideInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectGuideInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("enableStrongGuide");
          p0.P(p1.mEnableStrongGuide);
          p0.r("strongGuidePopUpTime");
          p0.K(p1.mStrongGuidePopUpTime);
          p0.r("enableWeakGuide");
          p0.P(p1.mEnableWeakGuide);
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
