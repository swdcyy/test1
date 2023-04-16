package oxb.j;
import yka.c;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import yka.b;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.gifshow.photoad.download.h;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import g59.u;
import crd.b;
import java.lang.Exception;
import java.lang.Throwable;

public class j implements c	// class@003ac8
{
    public AdDataWrapper a;

    public void j(AdDataWrapper p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return b.b(this);
    }
    public boolean b(){
       return b.a(this);
    }
    public void c(GameCenterDownloadParams$DownloadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (p0 == null || (!TextUtils.x(p0.mStage) && this.a.getPhoto() != null)) {
          String url = this.a.getUrl();
          int i = url.hashCode();
          GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
          Objects.requireNonNull(mStage);
          int i1 = -1;
          GameCenterDownloadParams$DownloadInfo uDownloadInf = 1;
          switch (mStage.hashCode()){
              case 0xae7a2e7a:
                if (mStage.equals("cancel")) {
                   i1 = 0;
                }
                break;
              case 0xc454c22d:
                if (mStage.equals("progress")) {
                   i1 = 1;
                }
                break;
              case 0xc84dc82d:
                if (mStage.equals("resume")) {
                   i1 = 2;
                }
                break;
              case 0xdc453139:
                if (mStage.equals("complete")) {
                   i1 = 3;
                }
                break;
              case 0x5c4d208:
                if (mStage.equals("error")) {
                   i1 = 4;
                }
                break;
              case 0x65825f6:
                if (mStage.equals("pause")) {
                   i1 = 5;
                }
                break;
              case 0x68ac462:
                if (mStage.equals("start")) {
                   i1 = 6;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                h.n().b(i).subscribe(Functions.d(), u.a);
                break;
              case 1:
                h.n().A(i, p0.mSoFarBytes, p0.mTotalBytes).subscribe(Functions.d(), u.a);
                break;
              case 2:
                h.n().t(i, p0.mSoFarBytes, p0.mTotalBytes).subscribe(Functions.d(), u.a);
                break;
              case 3:
                h.n().e(i).subscribe(Functions.d(), u.a);
                break;
              case 4:
                h.n().d(i, p0.mTotalBytes, new Exception(p0.mMsg)).subscribe(Functions.d(), u.a);
                break;
              case 5:
                h.n().r(i, p0.mSoFarBytes, p0.mTotalBytes).subscribe(Functions.d(), u.a);
                break;
              case 6:
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(url);
                uDownloadReq.setDestinationFileName(this.a.getAppName());
                uDownloadReq.setBizInfo(":ks-features:ft-commercial:commercial-libraries:commercial-download", "commercial_game_center", null);
                uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                DownloadManager.C("commercial_game_center", null);
                uDownloadReq.setNeedCDNReport(uDownloadInf);
                h.n().w(i, uDownloadReq, this.a).subscribe(Functions.d(), u.a);
                break;
              default:
          }
       }
       return;
    }
}
