package com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$1;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cn2.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import gj0.e;
import java.util.ArrayList;
import js6.a;
import gj0.d;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.wish.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.i;
import ym2.g$b;
import o63.a;
import lp3.c;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.os.Build$VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import wm2.b;
import android.os.MessageQueue$IdleHandler;

public class LiveAudienceWishRoomKrnDialogPresenter extends f implements g	// class@001295
{
    public i K;
    public a0 L;
    public d M;
    public a N;
    public LifecycleEventObserver O;
    public g$b P;
    public LiveAudienceWishRoomKrnDialogPresenter$b Q;
    public static boolean R = false;
    public static String sLivePresenterClassName;

    public void LiveAudienceWishRoomKrnDialogPresenter(){
       super();
       this.O = new LiveAudienceWishRoomKrnDialogPresenter$1(this);
       this.Q = new LiveAudienceWishRoomKrnDialogPresenter$a(this);
    }
    public void Q(boolean p0){
       LiveAudienceWishRoomKrnDialogPresenter liveAudience = LiveAudienceWishRoomKrnDialogPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       LiveAudienceWishRoomKrnDialogPresenter tM = this.M;
       if (tM != null) {
          tM.getLifecycle().removeObserver(this.O);
       }
       return;
    }
    public final void a9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceWishRoomKrnDialogPresenter.class, "4")) {
          return;
       }
       String str = i.d(this.L.c.mEntity);
       if (!TextUtils.x(str)) {
          Uri uri = x0.f(str);
          if (uri != null) {
             String str1 = x0.a(uri, "bundleid");
             str = x0.a(uri, "componentname");
             if (!TextUtils.x(str1) && !TextUtils.x(str)) {
                if (!PatchProxy.applyVoidTwoRefs(str, str1, objArray, i.class, "12")) {
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(new e(str, ""));
                   a.b.o4(new d(str1, JsFramework.REACT.name(), uArrayList));
                }
                LiveAudienceWishRoomKrnDialogPresenter.R = true;
             }
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceWishRoomKrnDialogPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceWishRoomKrnDialogPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceWishRoomKrnDialogPresenter.class, new d());
       }else {
          obj.put(LiveAudienceWishRoomKrnDialogPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishRoomKrnDialogPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       this.L = this.q8(a0.class);
       this.P = this.q8(g$b.class);
       return;
    }
    public void x(boolean p0){
       LiveAudienceWishRoomKrnDialogPresenter liveAudience = LiveAudienceWishRoomKrnDialogPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "2")) {
          return;
       }
       this.N = this.K.a(a.class);
       if (a.t().u("SOURCE_LIVE").d("enableWishRoomKrnPreload", false) && !LiveAudienceWishRoomKrnDialogPresenter.R) {
          if (Build$VERSION.SDK_INT >= 23) {
             Looper.getMainLooper().getQueue().addIdleHandler(new b(this));
          }else {
             this.a9();
          }
       }
       return;
    }
}
