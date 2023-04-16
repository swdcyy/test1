package g7a.w0;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import g7a.v0;
import g7a.x0;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import g7a.k;
import com.yxcorp.gifshow.detail.slidev2.presenter.r;

public class w0	// class@002402
{

    public void w0(){
       super();
    }
    public static void a(PhotoDetailParam p0,NasaBizParam p1,MainThreadScatterPresenterGroup p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, w0.class, "1")) {
          return;
       }
       if (c.b()) {
          return;
       }
       p2.a(new NasaCommentCreatorPresenter());
       p2.a(new d());
       p2.a(new v0());
       p2.a(new x0());
       if (p1.getNasaSlideParam().isDetailPage() && (!p1.getNasaSlideParam().isSerialStyle() && (p1.getNasaSlideParam().mIsUserStatusNasaDetail != null || (p1.getNasaSlideParam().mIsFriendsNasaDetail == null || (p1.getNasaSlideParam().mIsFriendsUpdatedNasaDetail != null && (p1.getNasaSlideParam().mIsNewsSlideNasaDetail == null && (p1.getNasaSlideParam().isFromProfileNews() || (!p1.getNasaSlideParam().isFromNewsEntrance() || (p1.getNasaSlideParam().isRankGatherPage() || p1.getNasaSlideParam().isChannelPage()))))))))) {
          p2.a(new a());
          p2.a(new NasaCommentExternalEditorPresenter());
       }else if(p0.isOverAllUseNasa != null){
          p2.a(new a());
          p2.a(new NasaCommentExternalEditorPresenter());
       }else if(p1.getNasaSlideParam().isFromNewsEntrance() || p1.getNasaSlideParam().isFromProfileNews()){
          p2.a(new a());
          p2.a(new NasaCommentExternalEditorPresenter());
       }
       if (p1.getNasaSlideParam().isFromProfile() || p1.getNasaSlideParam().isFromNotify()) {
          p2.a(new k());
       }
       if (p1.getNasaSlideParam().isFromViewerKwaiLink()) {
          p2.a(new r());
       }
       return;
    }
}
