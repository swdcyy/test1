package com.yxcorp.gifshow.photoad.game.e;
import oxb.j;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import mxb.j0;
import mxb.i0;
import oxb.n;
import erd.g;
import oxb.k;
import oxb.l;
import nxb.a;
import oxb.m;
import oxb.o;

public class e extends j	// class@000f93
{

    public void e(AdDataWrapper p0){
       super(p0);
    }
    public boolean b(){
       return false;
    }
    public void c(GameCenterDownloadParams$DownloadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.c(p0);
       if (p0 == null || (!TextUtils.x(p0.mStage) && this.a.getPhoto() != null)) {
          GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
          Objects.requireNonNull(mStage);
          int i = -1;
          switch (mStage.hashCode()){
              case 0xae7a2e7a:
                if (mStage.equals("cancel")) {
                   i = 0;
                }
                break;
              case 0xc84dc82d:
                if (mStage.equals("resume")) {
                   i = 1;
                }
                break;
              case 0xdc453139:
                if (mStage.equals("complete")) {
                   i = 2;
                }
                break;
              case 0x65825f6:
                if (mStage.equals("pause")) {
                   i = 3;
                }
                break;
              case 0x68ac462:
                if (mStage.equals("start")) {
                   i = 4;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                i0.a().e(35, this.a.getPhoto()).d(new o(p0)).a();
                break;
              case 1:
                i0.a().e(34, this.a.getPhoto()).d(new m(p0)).a();
                break;
              case 2:
                a.d(this.a.getPackageName(), this.a, p0.mUrl, i0.a().e(31, this.a.getPhoto()).d(new l(p0)));
                break;
              case 3:
                i0.a().e(33, this.a.getPhoto()).d(new k(p0)).a();
                break;
              case 4:
                if (!p0.mTotalBytes - null) {
                   i0.a().e(30, this.a.getPhoto()).d(new n(p0)).a();
                }
                break;
              default:
          }
       }
       return;
    }
}
