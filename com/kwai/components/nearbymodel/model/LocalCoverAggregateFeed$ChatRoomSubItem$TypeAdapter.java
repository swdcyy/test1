package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$ChatRoomSubItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateDarkLightModel;
import com.google.gson.stream.b;

public final class LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter extends TypeAdapter	// class@000c71
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter.c = a.get(LocalCoverAggregateFeed$ChatRoomSubItem.class);
    }
    public void LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalCoverAggregateFeed$CoverAggregateDarkLightModel$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter.class, "2");
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
             obj = new LocalCoverAggregateFeed$ChatRoomSubItem();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xea1f2349:
                      if (str.equals("subTitleA")) {
                         i = 0;
                      }
                      break;
                    case 0xea1f234a:
                      if (str.equals("subTitleB")) {
                         i = 1;
                      }
                      break;
                    case 0xeb084a38:
                      if (str.equals("coverUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 3;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitleA = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mSubTitleB = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mCoverUrl = this.b.read(p0);
                      break;
                    case 3:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalCoverAggregateFeed$ChatRoomSubItem$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mCoverUrl != null) {
             p0.r("coverUrl");
             this.b.write(p0, p1.mCoverUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitleA != null) {
             p0.r("subTitleA");
             TypeAdapters.A.write(p0, p1.mSubTitleA);
          }
          if (p1.mSubTitleB != null) {
             p0.r("subTitleB");
             TypeAdapters.A.write(p0, p1.mSubTitleB);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.j();
       }
       return;
    }
}
