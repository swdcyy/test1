package ced.f0;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import com.yxcorp.gifshow.detail.qphotoplayer.a;
import tl8.d;
import ok.h;
import tl8.e;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import tkd.b;
import tkd.d;
import vm5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;

public final class f0 implements View$OnClickListener	// class@000552
{
    public final o b;

    public void f0(o p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, o.class, "4")) {
       }else {
          TagInfo mInitiatorPh = tb.p.mInitiatorPhoto;
          QPhoto mEntity = mInitiatorPh.mEntity;
          if (mEntity instanceof VideoFeed && j.h(e.h(mEntity, VideoMeta.class, a.b))) {
             ExceptionHandler.handleCaughtException(new IllegalArgumentException("video cdnUrls empty"));
          }else {
             tb.getActivity().startActivityForResult(d.a(-1818031860).tF(tb.getActivity(), new PhotoDetailParam(mInitiatorPh), objArray), 1025);
          }
       }
       return;
    }
}
