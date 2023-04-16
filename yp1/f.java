package yp1.f;
import re3.d;
import msd.a;
import sz1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import fe3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import fe3.b;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import fe3.e;
import fe3.f;
import fe3.c;
import fe3.d;
import fe3.g;
import java.lang.Number;
import va1.n0;
import java.lang.Integer;
import com.kuaishou.live.livestage.VideoScaleMode;
import nsd.u;
import java.util.Collection;
import lh3.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Float;
import java.lang.Math;
import qsd.d;

public abstract class f implements d	// class@0048b4
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final e e;

    public void f(a p0,a p1,a p2,a p3,e p4){
       a.p(p0, "getBottomBarYPosition");
       a.p(p1, "isRecruitPanelMode");
       a.p(p2, "getRecruitPanelTopPosition");
       a.p(p3, "getAnchorUserId");
       a.p(p4, "multiInteractManager");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public LayoutConfig a(LayoutConfig p0,a p1){
       boolean b;
       int i1;
       Object obj5;
       Iterator iterator1;
       g og;
       e uoe1;
       String str1;
       int i2;
       float f;
       LayoutConfig layoutConfig;
       Iterator iterator4;
       Object obj = this;
       Object obj1 = p0;
       List obj2 = p1;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uof, "1");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       a.p(obj1, "layoutConfig");
       a.p(obj2, "renderAreaSize");
       int i = 1;
       if (p0.c() != i) {
          b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout do not transform", "layoutConfig", p0, "renderAreaSize", p1);
          return obj1;
       }else {
          b = obj.b.invoke().booleanValue();
          g obj4 = obj.d.invoke();
          obj3 = p0.b();
          List list = p0.e();
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          String str = null;
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             f uof1 = uoe.d();
             c uoc = uoe.g();
             d uod = uoe.h();
             if (uod != null) {
                str = uod.b();
             }
             i1 = a.g(obj4, str) ^ i;
             if (i1) {
                obj5 = obj4;
                iterator1 = iterator;
                og = obj.c(uoe.e(), p0.d(), obj2);
             }else if(b){
                g og1 = uoe.e();
                g og2 = PatchProxy.applyTwoRefs(og1, obj2, obj, uof, "2");
                if (og2 != patchProxyRe) {
                   obj5 = obj4;
                   iterator1 = iterator;
                }else {
                   i = obj.c.invoke().intValue();
                   if (i > 0) {
                      i2 = n0.f() / 2;
                      iterator1 = iterator;
                      f = (float)i2 / 0x3f100000;
                      obj5 = obj4;
                      g og3 = new g(0, i, i2, (int)f);
                      b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout transformRecruitRect", "renderAreaSize", p1, "originRect", og1, "transformRect", og3, "screenRecruitPanelTopPosition", Integer.valueOf(i));
                      og2 = og3;
                   }else {
                      obj5 = obj4;
                      iterator1 = iterator;
                      og2 = new g(0, 0, p1.d(), p1.c());
                   }
                }
                og = og2;
             }else {
                obj5 = obj4;
                iterator1 = iterator;
                obj4 = PatchProxy.applyTwoRefs(uoe.e(), obj2, obj, uof, "3");
                if (obj4 != patchProxyRe) {
                }else {
                   obj4 = new g(0, 0, p1.d(), p1.c());
                }
                og = obj4;
             }
             uoe1 = new e(uof1, uoc, og, uoe.h(), null, 16, null);
             uArrayList.add(v10);
             iterator = iterator1;
             obj4 = obj5;
             i = 1;
             str1 = 10;
          }
          obj5 = obj4;
          layoutConfig = new LayoutConfig(obj3, obj2, uArrayList, p0.c());
          b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout", "renderAreaSize", p1, "origin", p0, "transform", layoutConfig, "isRecruitPanelMode", Boolean.valueOf(b));
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!obj.e.gc().a(qCurrentUser.getId())) {
             return layoutConfig;
          }
          Object obj6 = obj5;
          int i3 = 10;
          LayoutConfig layoutConfig1 = layoutConfig;
          int i4 = 1;
          Object obj7 = PatchProxy.applyThreeRefs(obj5, layoutConfig, p1, this, f.class, "5");
          if (obj7 != patchProxyRe) {
             layoutConfig = obj7;
          }else {
             int i5 = obj.a.invoke().intValue();
             if (i5 > 0) {
                int i6 = (layoutConfig1.d().c() * i5) / p1.c();
                Iterator iterator2 = layoutConfig1.e().iterator();
                i2 = 0;
                while (iterator2.hasNext()) {
                   d e uoe2 = iterator2.next();
                   int i7 = uoe2.e().d() + uoe2.e().a();
                   uoe2 = uoe2.h();
                   String uoe21 = (uoe2 != null)? uoe2.b(): str;
                   i = a.g(obj6, uoe21) ^ i4;
                   if (i && i7 > i2) {
                      i2 = i7;
                   }
                }
                int i8 = i6 - i2;
                b uob = layoutConfig1.b();
                a uoa = layoutConfig1.d();
                obj2 = layoutConfig1.e();
                ArrayList uArrayList1 = new ArrayList(u.Y(obj2, i3));
                Iterator iterator3 = obj2.iterator();
                while (iterator3.hasNext()) {
                   e uoe3 = iterator3.next();
                   f uof2 = uoe3.d();
                   c uoc1 = uoe3.g();
                   d uod1 = uoe3.h();
                   str1 = (uod1 != null)? uod1.b(): str;
                   i1 = a.g(obj6, str1) ^ i4;
                   if (i1) {
                      i4 = uoe3.e().d() + i8;
                      iterator4 = iterator3;
                      og = new g(uoe3.e().c(), i4, uoe3.e().b(), uoe3.e().a());
                   }else {
                      iterator4 = iterator3;
                      og = new g(uoe3.e().c(), uoe3.e().d(), uoe3.e().b(), uoe3.e().a());
                   }
                   uoe1 = new e(uof2, uoc1, og, uoe3.h(), null, 16, null);
                   uArrayList1.add(i3);
                   iterator3 = iterator4;
                   i4 = 1;
                }
                b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout", "additionalY", Integer.valueOf(i8), "screenBottomBarYPosition", Integer.valueOf(i5), "windowBottomBarYPosition", Integer.valueOf(i6), "maxBottom", Integer.valueOf(i2));
                layoutConfig = new LayoutConfig(uob, uoa, uArrayList1, layoutConfig1.c());
             }else {
                layoutConfig = layoutConfig1;
             }
          }
          b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout", "renderAreaSize", p1, "origin", p0, "transformY", layoutConfig, "isRecruitPanelMode", Boolean.valueOf(b));
          return layoutConfig;
       }
    }
    public final int b(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uof, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (int)(float)Math.ceil((double)p0);
       if (i % 2) {
          i++;
       }
       return i;
    }
    public abstract g c(g p0,a p1,a p2);
    public final g d(g p0,a p1,a p2){
       float f;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "origin");
       a.p(p1, "originCanvasSize");
       a.p(p2, "newCanvasSize");
       f = (0x3f800000 / (float)p1.c()) * (float)p2.c();
       float f1 = (float)p0.a() * f;
       float f2 = ((float)p0.b() * f1) / (float)p0.a();
       return new g(d.H0((((float)p2.d() - ((float)((p1.d() - p0.c()) - p0.b()) * f)) - f2)), d.H0(((float)p0.d() * f)), this.b(f2), this.b(f1));
    }
}
