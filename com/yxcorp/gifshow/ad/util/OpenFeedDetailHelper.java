package com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper;
import java.lang.Object;
import android.view.View;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import vm5.h$a;
import com.smile.gifshow.annotation.provider.v2.a;
import vl8.c;
import tkd.b;
import tkd.d;
import vm5.h;
import android.app.Activity;
import java.lang.StringBuilder;
import java.lang.Exception;
import yx.j0;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$c;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$d;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$e;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$f;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$g;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$h;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$i;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$j;
import com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$a;

public final class OpenFeedDetailHelper	// class@001878
{
    public static final OpenFeedDetailHelper INSTANCE;

    static {
       OpenFeedDetailHelper.INSTANCE = new OpenFeedDetailHelper();
    }
    public void OpenFeedDetailHelper(){
       super();
    }
    public static final void openFeedDetailList(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, OpenFeedDetailHelper.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "videoFeeds");
       Context uContext = p0.getContext();
       if (uContext != null) {
          if (p1.isEmpty()) {
             return;
          }else {
             ArrayList uArrayList = new ArrayList(u.Y(p1, 10));
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(new QPhoto(iterator.next()));
             }
             h$a uoa = new h$a();
             uoa.P = new int[2]{1,1};
             Object[] objArray = new Object[]{OpenFeedDetailHelper.INSTANCE.buildWrapper(uArrayList)};
             uoa.u(objArray);
             try{
                objArray = -2112484039;
                d.a(objArray).C4(uContext, uArrayList.get(0), p0, p0, uoa);
             }catch(java.lang.Exception e8){
                objArray = new Object[0];
                j0.c("anywhere", "openFeedDetailList failed by : "+e8.getMessage(), objArray);
             }
          }
       }
    }
    public final a buildWrapper(List p0){
       a obj = PatchProxy.applyOneRefs(p0, this, OpenFeedDetailHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.h(User.class, new OpenFeedDetailHelper$b());
       obj.h(CommonMeta.class, new OpenFeedDetailHelper$c());
       obj.i("FRAGMENT", new OpenFeedDetailHelper$d(p0));
       obj.i("SLIDE_PLAY_BUSINESS", new OpenFeedDetailHelper$e());
       obj.i("HOT_CLICK_TO_NASA_SLIDE_PLAY", new OpenFeedDetailHelper$f());
       obj.i("LOCAL_CLICK_TO_NASA_SLIDE_PLAY", new OpenFeedDetailHelper$g());
       obj.i("ATLAS_SEARCH_RELATED_PHOTO_SLIDE_SAME_STEAM", new OpenFeedDetailHelper$h());
       obj.i("SCHOOL_CLICK_TO_SLIDE_PLAY", new OpenFeedDetailHelper$i());
       obj.i("UNIVERSAL_TAB_CLICK_TO_SLIDE_PLAY", new OpenFeedDetailHelper$j());
       obj.i("ADAPTER_POSITION", new OpenFeedDetailHelper$a());
       return obj;
    }
}
