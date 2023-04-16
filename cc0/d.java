package cc0.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import cc0.d$a;
import ok.x;
import java.lang.Object;
import com.kuaishou.growth.pendant.activity.model.ActPendantStartupResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import com.kuaishou.growth.pendant.activity.tools.PendantUriHandler;
import java.util.Objects;
import hc0.a;
import java.lang.Throwable;
import kc0.a;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantModel;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.activity.ActivityPendantViewManager;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Map;
import com.kwai.feature.api.pendant.activity.model.SuspensionModel;
import com.kwai.feature.api.pendant.activity.model.AdsorptionModel;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ie0.f;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.Collection;
import ce0.b;
import java.lang.Boolean;
import com.facebook.drawee.backends.pipeline.Fresco;
import o56.c;
import android.app.Application;
import android.content.Context;
import java.lang.System;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.facebook.imagepipeline.core.ImagePipeline;
import android.net.Uri;
import t45.d;
import brd.z;
import ie0.c;
import erd.o;
import brd.a0;
import ie0.d;
import crd.b;
import com.kuaishou.growth.pendant.core.manager.f;
import cc0.d$b;
import java.lang.Runnable;
import ekd.k1;

public final class d extends ConfigAutoParseJsonConsumer	// class@000309
{
    public static final d e;

    static {
       d.e = new d();
    }
    public void d(){
       super(d$a.b);
    }
    public void b(Object p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          int i = 2;
          if (SystemUtil.K() && a.d()) {
             Objects.requireNonNull(PendantUriHandler.c);
             if (PendantUriHandler.b) {
                a.b(a.a, "测试包强制使用kwai链配置", null, i, null);
                p0 = a.e.c();
                if (p0 != null) {
                   d.e.d(p0);
                }
             }
          }
          a = a.a;
          a.b(a, "startup:"+String.valueOf(p0), null, i, null);
          if (p0 != null) {
             ActivityPendantModel ksActivityWi = p0.getKsActivityWidget();
             if (ksActivityWi != null) {
                p0 = p0.getKsActivityWidget().getActivityId();
                ActivityPendantModel uActivityPen = a.e.c();
                String activityId = (uActivityPen != null)? uActivityPen.getActivityId(): null;
                if (a.g(p0, activityId) ^ 0x01) {
                   a.b(a, "当前挂件与下发挂件id不一致", null, i, null);
                   ActivityPendantViewManager.e.e("下发了新挂件,移除旧挂件");
                }
                d.e.d(ksActivityWi);
             }
          }
          p0 = a.e;
          _monitor_enter(p0);
          if (PatchProxy.applyVoid(null, p0, a.class, "3")) {
             _monitor_exit(p0);
          }else {
             a.b.clear();
             _monitor_exit(p0);
          }
          ActivityPendantViewManager.e.e("startup未返回挂件数据");
       }
       return;
    }
    public final void d(ActivityPendantModel p0){
       f a;
       Object[] objArray;
       t ot1;
       String id;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
          return;
       }
       a.p(p0, "data");
       a e = a.e;
       _monitor_enter(e);
       int i = 2;
       if (PatchProxy.applyVoidOneRefs(p0, e, a.class, "1")) {
          _monitor_exit(e);
       }else {
          a.p(p0, "data");
          if (p0.isLoginEffect()) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             id = qCurrentUser.getId();
          }else {
             id = "";
          }
          a.o(id, "key");
          a.b.put(id, p0);
          a.b(a.a, "保存资源位挂件信息, key="+id, null, i, null);
          _monitor_exit(e);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "4")) {
          String[] stringArray = new String[i];
          int i1 = 0;
          stringArray[i1] = p0.getSuspensionStateConfig().getIconUrl();
          i = 1;
          stringArray[i] = p0.getAdsorptionStateConfig().getIconUrl();
          List list = CollectionsKt__CollectionsKt.L(stringArray);
          a = f.a;
          Objects.requireNonNull(a);
          t ot = PatchProxy.applyOneRefs(list, a, f.class, "1");
          if (ot != PatchProxyResult.class) {
          }else if(list == null || list.isEmpty()){
             i = 0;
          }
          String str = "Observable.just\(false\)";
          if (i) {
             objArray = new Object[i1];
             b.C().w("PendantCore", "预加载失败,list为空", objArray);
             ot1 = t.just(Boolean.FALSE);
             a.o(ot1, str);
          }else if(!Fresco.hasBeenInitialized()){
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             Fresco.initialize(uoc.a());
          }
          long l = System.currentTimeMillis();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             if (str1 != null) {
                Uri uri = Uri.parse(str1);
                a.o(uri, "Uri.parse\(this\)");
                if (!Fresco.getImagePipeline().isInDiskCacheSync(uri)) {
                   uArrayList.add(str1);
                }
             }
          }
          if (uArrayList.isEmpty()) {
             objArray = new Object[i1];
             b.C().w("PendantCore", "已经全部预加载成功:"+list, objArray);
             ot1 = t.just(Boolean.FALSE);
             a.o(ot1, str);
          }else {
             ot = t.fromIterable(uArrayList).observeOn(d.b).flatMap(c.b).toList().d0().flatMap(new d(l));
             a.o(ot, "Observable.fromIterable\(…rvable.just\(true\)\n      }");
          }
          ot = ot1;
          ot.subscribe();
       }
       f.a(p0.getSuspensionStateConfig().getAnimationResourceURL(), "startup");
       f.a(p0.getAdsorptionStateConfig().getAnimationResourceURL(), "startup");
       ActivityPendantViewManager.e.h("收到startup数据");
       k1.o(new d$b(p0));
       return;
    }
}
