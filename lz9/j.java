package lz9.j;
import erd.g;
import lz9.b0;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.ArrayList;
import m9a.t;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import ak5.j;
import yca.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import bk5.c;
import m9a.t$c;
import el5.l;
import ekd.q;
import qp7.x0;
import qp7.b;
import ks7.h0;
import java.util.Objects;
import kotlin.jvm.internal.a;
import pp7.b;

public final class j implements g	// class@002ee0
{
    public final b0 b;

    public void j(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Iterator iterator;
       boolean b;
       j tb = this.b;
       b0 uob0 = b0.class;
       if (tb.t.enableShowQuickCommentGuide()) {
          int i = 0;
          p0.performHapticFeedback(i);
          p0 = null;
          if (!PatchProxy.applyVoid(p0, tb, uob0, "23")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LONG_PRESS_COMMENT_CARD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.t.mEntity);
             u1.D0("3960101", tb.A, 6, uElementPack, uContentPack, null);
          }
          String str = "9";
          if (!PatchProxy.applyVoid(p0, tb, uob0, str)) {
             int i1 = 4;
             ArrayList uArrayList = new ArrayList(i1);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             t ot = t.class;
             Object[] objArray = PatchProxy.apply(p0, p0, ot, str);
             if (objArray != patchProxyRe) {
             }else {
                ArrayList obj = PatchProxy.apply(p0, p0, ot, "6");
                if (obj != patchProxyRe) {
                   p0 = obj;
                }else {
                   Object obj1 = PatchProxy.apply(p0, p0, ot, "8");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(PatchProxy.applyVoid(p0, p0, ot, "7")){
                      if (!j.o().t()) {
                         a.a("comment_keyboard_emoji", "emoji_not_ready", "");
                      }else {
                         t.b.clear();
                         obj = new ArrayList(j.o().j());
                         if (!obj.isEmpty()) {
                            Iterator iterator3 = t.d.iterator();
                            while (iterator3.hasNext()) {
                               String str1 = iterator3.next();
                               Iterator iterator4 = obj.iterator();
                               while (true) {
                                  if (iterator4.hasNext()) {
                                     c uoc1 = iterator4.next();
                                     if (uoc1 != null && str1.equals(uoc1.b)) {
                                        t.b.add(new t$c(uoc1));
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                         }
                      }
                   }
                   iterator = t.b.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!j.o().w(iterator.next().a.a)) {
                            b = false;
                         }
                      }else {
                         b = true;
                      }
                   }
                   if (b) {
                      p0 = t.b;
                   }
                }
                obj = new ArrayList(q.i(l.b().c()));
                if (!obj.isEmpty()) {
                   if (obj.size() < i1) {
                      ArrayList uArrayList1 = new ArrayList();
                      iterator = obj.iterator();
                      while (iterator.hasNext()) {
                         uArrayList1.add(new t$c(iterator.next()));
                      }
                      p0 = p0.iterator();
                      while (p0.hasNext()) {
                         t$c uoc = p0.next();
                         Iterator iterator1 = uArrayList1.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               if (iterator1.next().a.a == uoc.a.a) {
                                  iterator1 = 1;
                               }else {
                                  continue ;
                               }
                            }else {
                               iterator1 = null;
                            }
                            if (!iterator1) {
                               uArrayList1.add(uoc);
                            }else {
                               continue ;
                            }
                         }
                      }
                      objArray = uArrayList1.subList(i, i1);
                   }else {
                      p0 = new ArrayList();
                      Iterator iterator2 = obj.subList(i, i1).iterator();
                      while (iterator2.hasNext()) {
                         p0.add(new t$c(iterator2.next()));
                      }
                   }
                }
                objArray = p0;
             }
             tb.X = objArray;
             if (objArray != null) {
                p0 = objArray.iterator();
                while (p0.hasNext()) {
                   uArrayList.add(p0.next().a.a);
                }
                p0 = tb.E();
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(uArrayList, p0, h0.class, "3")) {
                   a.p(uArrayList, "quickCommentEmojiList");
                   p0.g.f(uArrayList);
                }
             }
          }
       }
       return;
    }
}
