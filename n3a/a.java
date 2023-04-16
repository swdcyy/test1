package n3a.a;
import xx6.f$b;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession;
import java.lang.Object;
import xx6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import m3a.r;
import com.yxcorp.utility.Log;
import java.lang.System;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import wd5.m;
import wd5.b;
import m3a.q;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wd5.d;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.log.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import yd5.a;
import xd5.c;
import xd5.a;
import wd5.r;
import fyd.a;
import lnc.i3;
import i3a.b;
import gm5.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public final class a implements f$b	// class@0030d4
{
    public final SmallWindowPlaySession b;

    public void a(SmallWindowPlaySession p0){
       this.b = p0;
       super();
    }
    public void onSessionReport(e p0){
       q a;
       Object[] objArray;
       ClientStat$VideoStatEvent videoStatEve;
       Object obj = this;
       ClientStat$StatPackage obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, "1")) {
          return;
       }
       a.p(obj1, "data");
       Log.g("SmallWindowPlaySession", "onSessionReport: "+r.a(obj.b.c));
       obj.b.a.setLeaveTime(System.currentTimeMillis());
       obj.b.a.bindDataSaver(new m(obj1));
       a = q.a;
       a b = obj.b;
       SmallWindowPlaySession c = b.c;
       SmallWindowPlaySession b1 = b.b;
       SmallWindowPlaySession a1 = b.a;
       SmallWindowPlaySession f = b.f;
       SmallWindowPlaySession g = b.g;
       SmallWindowPlaySession h = b.h;
       Objects.requireNonNull(a);
       q oq = q.class;
       int i = 7;
       int i1 = 4;
       if (PatchProxy.isSupport(oq)) {
          objArray = new Object[i];
          objArray[0] = c;
          objArray[1] = b1;
          objArray[2] = obj1;
          objArray[3] = a1;
          objArray[i1] = Integer.valueOf(f);
          objArray[5] = g;
          objArray[6] = Boolean.valueOf(h);
          if (PatchProxy.applyVoid(objArray, a, oq, "2")) {
          label_01bd :
             return;
          }
       }
       a.p(c, "photo");
       a.p(b1, "fragment");
       a.p(obj1, "sessionData");
       a.p(a1, "provider");
       a.p(g, "page2");
       if (PatchProxy.isSupport(oq)) {
          objArray = new Object[i];
          objArray[0] = c;
          objArray[1] = b1;
          objArray[2] = obj1;
          objArray[3] = a1;
          objArray[4] = Integer.valueOf(f);
          objArray[5] = g;
          objArray[6] = Boolean.valueOf(h);
          videoStatEve = PatchProxy.apply(objArray, a, oq, "3");
          if (videoStatEve != PatchProxyResult.class) {
          label_0180 :
             obj1 = new ClientStat$StatPackage();
             obj1.videoStatEvent = videoStatEve;
             Log.g("SmallWindowLogUtils", " on upload stat sessionUuid "+videoStatEve.sessionUuid+" photoid "+videoStatEve.photoId);
             u1.F0(new StatMetaData().setStatPackage(obj1).setFeedLogCtx(c.getFeedLogCtx()));
             goto label_01bd ;
          }
       }
       videoStatEve = new ClientStat$VideoStatEvent();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.category = 4;
       urlPackage.page = f;
       urlPackage.page2 = g;
       urlPackage.subPages = d.a(c);
       Object obj2 = b.a(0x4b316083);
       a.o(obj2, "Singleton.get\(\n        I¡­nager::class.java\n      \)");
       urlPackage.topPage = TextUtils.k(obj2.R0());
       if (urlPackage.expTagList == null && b1.getActivity() != null) {
          urlPackage.expTagList = b.a(0xe0ff4fb).c(b1);
       }
       videoStatEve.urlPackage = urlPackage;
       r.a(c, a1, new a(obj1), urlPackage).b(videoStatEve);
       e c1 = obj1.c;
       videoStatEve.smallWindowPlayDuration = c1;
       videoStatEve.detailPlayedDuration = c1;
       i3 oi3 = i3.f();
       oi3.d("small_window_play", "OPEN");
       String str = (h != null)? "SHARE": "OTHER";
       oi3.d("small_window_launch_type", str);
       String str1 = "TRUE";
       str = (b.j())? str1: "FALSE";
       oi3.d("is_small_window_function_active", str);
       if (!b.t(c)) {
          str1 = "FALSE";
       }
       oi3.d("is_vip_content", str1);
       oi3.d("copyright_content_view_type", b.d(c));
       videoStatEve.expParams = TextUtils.k(oi3.e());
       goto label_0180 ;
    }
}
