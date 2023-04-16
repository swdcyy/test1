package com.kuaishou.android.model.mix.ColumnMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ColumnMeta;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class ColumnMeta$TypeAdapter extends TypeAdapter	// class@000bf7
{
    public final Gson a;
    public static final a b;

    static {
       ColumnMeta$TypeAdapter.b = a.get(ColumnMeta.class);
    }
    public void ColumnMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ColumnMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ColumnMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ColumnMeta uColumnMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uColumnMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uColumnMeta;
       }else {
          p0.c();
          ColumnMeta uColumnMeta1 = new ColumnMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x852ea487:
                   if (str.equals("detailTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xa8cddcb4:
                   if (str.equals("showCoverOrder")) {
                      i = 1;
                   }
                   break;
                 case 0xa8e28a7f:
                   if (str.equals("coverIconUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x165e3e00:
                   if (str.equals("coverInnerMainTitle")) {
                      i = 3;
                   }
                   break;
                 case 0x22d66ccf:
                   if (str.equals("coverSubTitle")) {
                      i = 4;
                   }
                   break;
                 case 0x3a5335f7:
                   if (str.equals("coverInnerSubTitle")) {
                      i = 5;
                   }
                   break;
                 case 0x3e41e228:
                   if (str.equals("coverMainTitle")) {
                      i = 6;
                   }
                   break;
                 case 0x49c9fdd7:
                   if (str.equals("coverOrder")) {
                      i = 7;
                   }
                   break;
                 case 0x75f912e8:
                   if (str.equals("coverDesc")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uColumnMeta1.mDetailTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uColumnMeta1.mShowCoverOrder = KnownTypeAdapters$g.a(p0, uColumnMeta1.mShowCoverOrder);
                   break;
                 case 2:
                   uColumnMeta1.mCoverIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uColumnMeta1.mInnerMainTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uColumnMeta1.mCoverSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uColumnMeta1.mInnerSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uColumnMeta1.mCoverMainTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uColumnMeta1.mCoverOrder = KnownTypeAdapters$k.a(p0, uColumnMeta1.mCoverOrder);
                   break;
                 case 8:
                   uColumnMeta1.mCoverDesc = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uColumnMeta1;
       }
    }
    public void b(b p0,ColumnMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ColumnMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverMainTitle != null) {
             p0.r("coverMainTitle");
             TypeAdapters.A.write(p0, p1.mCoverMainTitle);
          }
          if (p1.mCoverSubTitle != null) {
             p0.r("coverSubTitle");
             TypeAdapters.A.write(p0, p1.mCoverSubTitle);
          }
          p0.r("coverOrder");
          p0.K((long)p1.mCoverOrder);
          p0.r("showCoverOrder");
          p0.P(p1.mShowCoverOrder);
          if (p1.mCoverIconUrl != null) {
             p0.r("coverIconUrl");
             TypeAdapters.A.write(p0, p1.mCoverIconUrl);
          }
          if (p1.mCoverDesc != null) {
             p0.r("coverDesc");
             TypeAdapters.A.write(p0, p1.mCoverDesc);
          }
          if (p1.mInnerMainTitle != null) {
             p0.r("coverInnerMainTitle");
             TypeAdapters.A.write(p0, p1.mInnerMainTitle);
          }
          if (p1.mInnerSubTitle != null) {
             p0.r("coverInnerSubTitle");
             TypeAdapters.A.write(p0, p1.mInnerSubTitle);
          }
          if (p1.mDetailTitle != null) {
             p0.r("detailTitle");
             TypeAdapters.A.write(p0, p1.mDetailTitle);
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
