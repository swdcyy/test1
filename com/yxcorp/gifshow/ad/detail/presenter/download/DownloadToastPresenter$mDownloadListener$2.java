package com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter$mDownloadListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter;
import java.lang.Object;
import nxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class DownloadToastPresenter$mDownloadListener$2 extends Lambda implements a	// class@001651
{
    public final DownloadToastPresenter this$0;

    public void DownloadToastPresenter$mDownloadListener$2(DownloadToastPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       Object obj = PatchProxy.apply(null, this, DownloadToastPresenter$mDownloadListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this.this$0.getActivity());
    }
}
