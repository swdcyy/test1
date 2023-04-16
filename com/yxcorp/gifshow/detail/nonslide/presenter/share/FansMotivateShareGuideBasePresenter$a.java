package com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter$a;
import aic.c;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.DialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import uhc.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.fans.util.FansSharePreference;
import java.lang.reflect.Type;
import java.util.Map;
import uw9.c;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.share.fans.util.FansSharePreference$GuideRecord;
import android.app.Dialog;
import com.yxcorp.gifshow.guide.ShareMyFeedGuideConfig;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import z2a.j;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.k;

public class FansMotivateShareGuideBasePresenter$a extends c	// class@0015d9
{
    public final FansMotivateShareGuideBasePresenter i;

    public void FansMotivateShareGuideBasePresenter$a(FansMotivateShareGuideBasePresenter p0,GifshowActivity p1,PhotoDetailParam p2){
       this.i = p0;
       super(p1, p2);
    }
    public void i(DialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansMotivateShareGuideBasePresenter$a.class, "1")) {
          return;
       }
       this.i.W8();
       return;
    }
    public void j(DialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansMotivateShareGuideBasePresenter$a.class, "2")) {
          return;
       }
       String photoId = this.i.I.getPhotoId();
       boolean b = true;
       if (!PatchProxy.applyVoidOneRefs(photoId, null, a.class, "10")) {
          a.p(photoId, "photoId");
          Map map = c.h(FansSharePreference.b);
          if (map == null) {
             map = new LinkedHashMap();
          }
          FansSharePreference$GuideRecord guideRecord = map.get(photoId);
          if (guideRecord == null) {
             guideRecord = new FansSharePreference$GuideRecord();
          }
          guideRecord.mPopGuideCount = guideRecord.mPopGuideCount + b;
          guideRecord.mBubbleShowed = false;
          map.put(photoId, guideRecord);
          c.D(map);
       }
       if (p0 != null) {
          Dialog dialog = p0.getDialog();
          if (dialog != null) {
             dialog.setCanceledOnTouchOutside(b);
          }
       }
       FansMotivateShareGuideBasePresenter$a ti = this.i;
       ti.A = t.timer((long)ti.K.mDuration, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new j(this));
       return;
    }
}
