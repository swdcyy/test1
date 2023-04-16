package kx1.d;
import mx1.a;
import kx1.e;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mx1.g;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.lang.Iterable;
import qk.m;
import mx1.b;
import ok.h;
import mx1.f;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import kx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import ox1.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import nx1.q;
import java.util.LinkedList;
import java.util.Iterator;
import px1.a;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import nx1.l;
import ok.o;
import com.google.common.base.Optional;
import nx1.j;
import nx1.m;
import com.kuaishou.tk.api.b;
import nx1.n;
import rx4.j;
import java.util.Collections;
import lx1.c;

public final class d implements a	// class@002e1a
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void a(){
       e e;
       j obj;
       Iterator iterator1;
       d a = this.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, a, e.class, "5")) {
       }else {
          e d = a.d;
          Objects.requireNonNull(d);
          String str = "3";
          ImmutableList immutableLis = PatchProxy.apply(objArray, d, g.class, str);
          if (immutableLis != patchProxyRe) {
          }else {
             immutableLis = m.s(d.c.values()).F(b.b).E(f.b);
             LiveConfigStartupResponse$LiveInteractiveWidgetConfig mWidgetShowL = a.a().mWidgetShowLimit;
             if (mWidgetShowL <= null) {
                mWidgetShowL = 3;
             }
             if (immutableLis.size() > mWidgetShowL) {
                immutableLis = immutableLis.subList(0, mWidgetShowL);
             }
          }
          b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "notifyWidgetDataUpdate", "widgetList", a.a(immutableLis));
          e = a.e;
          Objects.requireNonNull(e);
          q oq = q.class;
          if (!PatchProxy.applyVoidOneRefs(immutableLis, e, oq, "2")) {
             e.a.clear();
             e.a.addAll(immutableLis);
             LinkedList linkedList = new LinkedList(e.c);
             LinkedList linkedList1 = new LinkedList();
             Iterator iterator = e.c.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                q a1 = e.a;
                obj = PatchProxy.applyTwoRefs(a1, uoa, e, oq, "8");
                if (obj != patchProxyRe) {
                }else {
                   obj = m.s(a1).r(new l(e, uoa)).orNull();
                }
                if (obj != null) {
                   b.d0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "find reusable item", "itemOldWidget", uoa.j().widgetId, "itemNewWidget", obj.widgetId);
                   uoa.c();
                   uoa.k(obj);
                   linkedList1.add(uoa);
                   e.a.remove(obj);
                }
             }
             q a2 = e.a;
             if (!PatchProxy.applyVoidOneRefs(a2, e, oq, str)) {
                b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "preLoadTask start", "widgetList", a.a(a2));
                LinkedList linkedList2 = new LinkedList(e.b);
                LinkedList linkedList3 = new LinkedList();
                iterator = a2.iterator();
                while (iterator.hasNext()) {
                   LiveInteractiveWidgetProto$LiveInteractiveWidget liveInteract = iterator.next();
                   obj = PatchProxy.applyTwoRefs(linkedList2, liveInteract, e, oq, "7");
                   if (obj != patchProxyRe) {
                   }else {
                      obj = m.s(linkedList2).r(new m(e, liveInteract)).orNull();
                   }
                   if (obj == null) {
                      linkedList3.add(liveInteract);
                   }else {
                      linkedList2.remove(obj);
                   }
                }
                b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "preLoadTask, real need load list", "widgetList", a.a(linkedList3));
                if (b.b().d()) {
                   iterator1 = linkedList3.iterator();
                   while (iterator1.hasNext()) {
                      e.b.add(e.a(iterator1.next()));
                   }
                }else {
                   b.b().a(new n(e, linkedList3));
                }
             }
             e.c.clear();
             e.c.addAll(linkedList1);
             Collections.sort(e.c);
             e.f.E();
             iterator1 = linkedList.iterator();
             while (iterator1.hasNext()) {
                a uoa1 = iterator1.next();
                if (!e.c.contains(uoa1)) {
                   uoa1.g();
                }
             }
          }
       }
       return;
    }
}
