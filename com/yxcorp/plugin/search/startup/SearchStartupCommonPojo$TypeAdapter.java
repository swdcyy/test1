package com.yxcorp.plugin.search.startup.SearchStartupCommonPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.plugin.search.startup.SearchStartupCommonPojo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import com.yxcorp.plugin.search.startup.SearchStartEndTime;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SearchStartupCommonPojo$TypeAdapter extends TypeAdapter	// class@000768
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       SearchStartupCommonPojo$TypeAdapter.d = a.get(SearchStartupCommonPojo.class);
    }
    public void SearchStartupCommonPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(FeedNegativeFeedback.class));
       this.c = p0.j(a.get(SearchStartEndTime.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SearchStartupCommonPojo$TypeAdapter.class, "2");
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
             obj = new SearchStartupCommonPojo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa4e69653:
                      if (str.equals("searchFeedbackPageUrl")) {
                         i = 0;
                      }
                      break;
                    case 0xa9535045:
                      if (str.equals("searchHomeSpringSceneTime")) {
                         i = 1;
                      }
                      break;
                    case 0xafecfbd4:
                      if (str.equals("recoAfterPlayTriggerTime")) {
                         i = 2;
                      }
                      break;
                    case 0xc75ff809:
                      if (str.equals("searchLiveReserveFollowToastMills")) {
                         i = 3;
                      }
                      break;
                    case 0xd6c70b23:
                      if (str.equals("searchUserTabFoldGetMoreThreshold")) {
                         i = 4;
                      }
                      break;
                    case 0xf1f648c3:
                      if (str.equals("searchKboxEventAllShowCount")) {
                         i = 5;
                      }
                      break;
                    case 0xf323f1c7:
                      if (str.equals("searchSinglePhotoWidthRation")) {
                         i = 6;
                      }
                      break;
                    case 0xfdcba3f3:
                      if (str.equals("searchPageNegativeFeedbackConfig")) {
                         i = 7;
                      }
                      break;
                    case 0x30b61e:
                      if (str.equals("searchShowPhotoDurationSeconds")) {
                         i = 8;
                      }
                      break;
                    case 0x41858df:
                      if (str.equals("searchUserTabPymkDailyCount")) {
                         i = 9;
                      }
                      break;
                    case 0xaba72c0:
                      if (str.equals("searchLiveReservePermissionMills")) {
                         i = 10;
                      }
                      break;
                    case 0x10479c11:
                      if (str.equals("searchFeedBackEntrancePos")) {
                         i = 11;
                      }
                      break;
                    case 0x1efa2c00:
                      if (str.equals("searchKboxEventShowCount")) {
                         i = 12;
                      }
                      break;
                    case 0x1f66fb90:
                      if (str.equals("recoAfterPlayMaxCards")) {
                         i = 13;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSearchFeedbackPageUrl = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mHomeSpringSceneTime = this.c.read(p0);
                      break;
                    case 2:
                      obj.mRecoAfterPlayTriggerTime = KnownTypeAdapters$n.a(p0, obj.mRecoAfterPlayTriggerTime);
                      break;
                    case 3:
                      obj.mSearchLiveReserveFollowToastMills = KnownTypeAdapters$j.a(p0, obj.mSearchLiveReserveFollowToastMills);
                      break;
                    case 4:
                      obj.mSearchUserTabFoldGetMoreThreshold = KnownTypeAdapters$k.a(p0, obj.mSearchUserTabFoldGetMoreThreshold);
                      break;
                    case 5:
                      obj.mSearchKboxEventAllShowCount = KnownTypeAdapters$k.a(p0, obj.mSearchKboxEventAllShowCount);
                      break;
                    case 6:
                      obj.mSearchSinglePhotoWidthRation = KnownTypeAdapters$j.a(p0, obj.mSearchSinglePhotoWidthRation);
                      break;
                    case 7:
                      obj.mFeedNegativeFeedback = this.b.read(p0);
                      break;
                    case 8:
                      obj.mSearchShowPhotoDurationSeconds = KnownTypeAdapters$k.a(p0, obj.mSearchShowPhotoDurationSeconds);
                      break;
                    case 9:
                      obj.mSearchUserTabPymkDailyCount = KnownTypeAdapters$k.a(p0, obj.mSearchUserTabPymkDailyCount);
                      break;
                    case 10:
                      obj.mSearchLiveReservePermissionMills = KnownTypeAdapters$j.a(p0, obj.mSearchLiveReservePermissionMills);
                      break;
                    case 11:
                      obj.mSearchFeedbackAccessPos = KnownTypeAdapters$k.a(p0, obj.mSearchFeedbackAccessPos);
                      break;
                    case 12:
                      obj.mSearchKboxEventShowCount = KnownTypeAdapters$k.a(p0, obj.mSearchKboxEventShowCount);
                      break;
                    case 13:
                      obj.mRecoAfterPlayMaxCards = KnownTypeAdapters$k.a(p0, obj.mRecoAfterPlayMaxCards);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchStartupCommonPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSearchFeedbackPageUrl != null) {
             p0.r("searchFeedbackPageUrl");
             TypeAdapters.A.write(p0, p1.mSearchFeedbackPageUrl);
          }
          p0.r("searchFeedBackEntrancePos");
          p0.K((long)p1.mSearchFeedbackAccessPos);
          p0.r("recoAfterPlayTriggerTime");
          p0.K(p1.mRecoAfterPlayTriggerTime);
          p0.r("searchUserTabPymkDailyCount");
          p0.K((long)p1.mSearchUserTabPymkDailyCount);
          p0.r("recoAfterPlayMaxCards");
          p0.K((long)p1.mRecoAfterPlayMaxCards);
          p0.r("searchShowPhotoDurationSeconds");
          p0.K((long)p1.mSearchShowPhotoDurationSeconds);
          p0.r("searchUserTabFoldGetMoreThreshold");
          p0.K((long)p1.mSearchUserTabFoldGetMoreThreshold);
          p0.r("searchKboxEventShowCount");
          p0.K((long)p1.mSearchKboxEventShowCount);
          p0.r("searchKboxEventAllShowCount");
          p0.K((long)p1.mSearchKboxEventAllShowCount);
          if (p1.mFeedNegativeFeedback != null) {
             p0.r("searchPageNegativeFeedbackConfig");
             this.b.write(p0, p1.mFeedNegativeFeedback);
          }
          if (p1.mHomeSpringSceneTime != null) {
             p0.r("searchHomeSpringSceneTime");
             this.c.write(p0, p1.mHomeSpringSceneTime);
          }
          p0.r("searchSinglePhotoWidthRation");
          p0.J((double)p1.mSearchSinglePhotoWidthRation);
          p0.r("searchLiveReserveFollowToastMills");
          p0.J((double)p1.mSearchLiveReserveFollowToastMills);
          p0.r("searchLiveReservePermissionMills");
          p0.J((double)p1.mSearchLiveReservePermissionMills);
          p0.j();
       }
       return;
    }
}
