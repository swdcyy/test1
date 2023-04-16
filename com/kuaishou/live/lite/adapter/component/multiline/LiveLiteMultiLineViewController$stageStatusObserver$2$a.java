package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController$stageStatusObserver$2$a;
import ee3.d0;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController$stageStatusObserver$2;
import java.lang.Object;
import ee3.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController;
import lh3.b;
import sz1.e;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import h83.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import nh3.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.util.List;
import java.util.ArrayList;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import f02.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.Iterator;
import fe3.e;
import fe3.g;
import fe3.d;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;
import f02.b;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import androidx.lifecycle.LiveData;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import ee3.j0;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import androidx.constraintlayout.widget.ConstraintLayout;
import h83.c;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import msd.a;
import fe3.b;
import h83.b;
import java.lang.Runnable;

public final class LiveLiteMultiLineViewController$stageStatusObserver$2$a implements d0	// class@001e0b
{
    public final LiveLiteMultiLineViewController$stageStatusObserver$2 a;

    public void LiveLiteMultiLineViewController$stageStatusObserver$2$a(LiveLiteMultiLineViewController$stageStatusObserver$2 p0){
       this.a = p0;
       super();
    }
    public final void a(b0 p0){
       a a;
       j0 obj2;
       LiveLiteMultiLineViewController$stageStatusObserver$2 this$0;
       int len;
       int i;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteMultiLineViewController$stageStatusObserver$2$a.class, str)) {
          return;
       }
       a.p(obj1, "status");
       b uob = obj.a.this$0.r.gc();
       if (uob != null) {
          SCInteractiveChatRoomInfo sCInteractiv = uob.b();
          if (sCInteractiv != null) {
             a = a.a;
             Objects.requireNonNull(a);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             a uoa = a.class;
             b uob1 = PatchProxy.applyTwoRefs(obj1, sCInteractiv, a, uoa, str);
             boolean b = false;
             if (uob1 != patchProxyRe) {
             }else {
                a.p(obj1, "stageStatus");
                a.p(sCInteractiv, "scRoomInfo");
                InteractiveChatLayoutConfig interactiveC = new InteractiveChatLayoutConfig();
                SCInteractiveChatRoomInfo roomInfo = sCInteractiv.roomInfo;
                InteractiveChatRoomInfo layoutConfig = roomInfo.layoutConfig;
                interactiveC.windowInfo = layoutConfig.windowInfo;
                interactiveC.canvasSize = layoutConfig.canvasSize;
                layoutConfig = roomInfo.bizIdentity;
                InteractiveChatBizIdentity bizId = layoutConfig.bizId;
                InteractiveChatBizIdentity chatId = layoutConfig.chatId;
                InteractiveChatBizIdentity bizType = layoutConfig.bizType;
                InteractiveChatRoomInfo userInfo = roomInfo.userInfo;
                a.o(userInfo, "scRoomInfo.roomInfo.userInfo");
                ArrayList uArrayList2 = PatchProxy.applyOneRefs(userInfo, a, uoa, "2");
                if (uArrayList2 != patchProxyRe) {
                }else {
                   uArrayList2 = new ArrayList();
                   len = userInfo.length;
                   for (i = 0; i < len; i = i + 1) {
                      uArrayList2.add(new c(userInfo[i]));
                   }
                }
                Object obj3 = uArrayList2;
                b uob2 = new b(bizId, chatId, bizType, obj3, interactiveC, sCInteractiv.roomInfo.version, sCInteractiv.extraInfoPb);
                uob1 = a.j(sCInteractiv);
                uArrayList2 = new ArrayList();
                a.o(uob1, "roomInfo");
                InteractiveChatLayoutConfig windowInfo = uob1.e().windowInfo;
                len = windowInfo.length;
                i = 0;
                while (i < len) {
                   object oobject = windowInfo[i];
                   Iterator iterator2 = obj1.a.e().iterator();
                   while (iterator2.hasNext()) {
                      e uoe = iterator2.next();
                      g og = uoe.a();
                      d uod = uoe.b();
                      if (uod != null && a.g(String.valueOf(oobject.userId), uod.b())) {
                         oobject.x = og.c();
                         oobject.y = og.d();
                         oobject.width = og.b();
                         oobject.height = og.a();
                         a.o(oobject, "layoutConfig");
                         uArrayList2.add(oobject);
                      }
                   }
                   i = i + 1;
                }
                InteractiveChatWindow[] interactiveC1 = new InteractiveChatWindow[uArrayList2.size()];
                len = uArrayList2.size();
                for (i = 0; i < len; i = i + 1) {
                   interactiveC1[i] = uArrayList2.get(i);
                }
                v17.e().windowInfo = interactiveC1;
                uob1 = v17;
             }
             if (uob1.e() != null && uob1.e().canvasSize != null) {
                obj.a.this$0.n.d(uob1.e().canvasSize.width, uob1.e().canvasSize.height);
             }
             obj.a.this$0.k.setValue(a.d(uob1));
             b.Z(LiveLiteLogTag.LITE_MULTI_LINE, "participant: "+obj.a.this$0.k.getValue()+", stage layout:"+obj1.a);
             obj.a.this$0.m.setValue(sCInteractiv.roomInfo.layoutConfig);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = obj1.b.iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (obj2.d != null) {
                   uArrayList.add(obj2);
                }
             }
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                obj2 = iterator1.next().b;
                String str1 = (obj2 != null)? obj2.b(): null;
                if (str1 != null) {
                   uArrayList1.add(str1);
                }
             }
             obj.a.this$0.l.setValue(uArrayList1);
             if (obj.a.this$0.o.compareAndSet(b, true)) {
                this$0 = obj.a.this$0;
                LiveLiteMultiLineViewController$stageStatusObserver$2 this$01 = obj.a.this$0;
                this$0.y2(LiveLiteMultiLineViewController.V2(this$0).getOverlayContainer(), new c(this$01.k, this$01.l, this$01.m, this$01.t));
                obj.a.this$0.u.invoke();
             }
             this$0 = obj.a.this$0;
             Objects.requireNonNull(this$0);
             if (!PatchProxy.applyVoidOneRefs(obj1, this$0, LiveLiteMultiLineViewController.class, "5") && obj1.a.b().b() == 2) {
                LiveLiteMultiLineViewController j = this$0.j;
                if (j == null) {
                   a.S("renderArea");
                }
                j.post(new b(this$0, obj1));
             }
          }
       }
       return;
    }
}
