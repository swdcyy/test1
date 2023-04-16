package com.kuaishou.android.model.mix.CoverAnimation$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverAnimation;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class CoverAnimation$TypeAdapter extends TypeAdapter	// class@000c1d
{
    public final Gson a;
    public static final a b;

    static {
       CoverAnimation$TypeAdapter.b = a.get(CoverAnimation.class);
    }
    public void CoverAnimation$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverAnimation a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverAnimation$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverAnimation uCoverAnimat = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverAnimat;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverAnimat;
       }else {
          p0.c();
          CoverAnimation uCoverAnimat1 = new CoverAnimation();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8a6f4b58:
                   if (str.equals("transparency")) {
                      i = 0;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 1;
                   }
                   break;
                 case 0x43373f05:
                   if (str.equals("cutMode")) {
                      i = 2;
                   }
                   break;
                 case 0x45f8534b:
                   if (str.equals("animationUrl")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverAnimat1.mTransparency = KnownTypeAdapters$j.a(p0, uCoverAnimat1.mTransparency);
                   break;
                 case 1:
                   uCoverAnimat1.mCoverText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCoverAnimat1.mCutMode = KnownTypeAdapters$k.a(p0, uCoverAnimat1.mCutMode);
                   break;
                 case 3:
                   uCoverAnimat1.mAnimationUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverAnimat1;
       }
    }
    public void b(b p0,CoverAnimation p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverAnimation$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAnimationUrl != null) {
             p0.r("animationUrl");
             TypeAdapters.A.write(p0, p1.mAnimationUrl);
          }
          if (p1.mCoverText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mCoverText);
          }
          p0.r("transparency");
          p0.J((double)p1.mTransparency);
          p0.r("cutMode");
          p0.K((long)p1.mCutMode);
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
