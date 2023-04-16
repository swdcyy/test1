package h63.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import h3.a;
import b63.a;
import i63.b;
import java.util.ArrayList;
import android.util.SparseArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import android.os.Bundle;
import com.kwai.live.gzone.tab.page.a;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.lang.RuntimeException;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup;
import lnc.i3;
import android.view.View;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.util.Objects;
import java.util.Set;
import b63.a$a;
import java.lang.Boolean;
import android.content.Context;
import android.view.ViewParent;

public class a extends a implements PagerSlidingTabStrip$d$b	// class@002c6f
{
    public final List d;
    public final List e;
    public SparseArray f;
    public b g;
    public int h;
    public a i;
    public b j;

    public void a(a p0,b p1){
       super();
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.f = new SparseArray();
       this.g = null;
       this.i = p0;
       this.j = p1;
    }
    public b A(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0 || p0 >= this.d.size()) {
          return null;
       }else {
          return this.d.get(p0);
       }
    }
    public void B(List p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       this.d.clear();
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          if (p0 != null) {
             int i = this.d.size();
             int i1 = p0.size() + i;
             for (int i2 = i; i2 < i1; i2 = i2 + 1) {
                int i3 = i2 - i;
                this.f.put(i2, p0.get(i3).l());
             }
             StringBuilder str = "";
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                str = str+"page:"+uob.hashCode()+",id:";
                str = (uob.t() != null)? str+uob.t().e(): str+"null";
                str = str+";";
             }
             b.c0(LiveLogTag.GZONE, "tabPage appendPages", "ids", str);
             this.d.addAll(p0);
             this.q();
          }else {
             throw new RuntimeException("pages should not be null for appendPages\(\)");
          }
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d.isEmpty()) {
          return null;
       }else if(p0 < 0 || p0 >= this.d.size()){
          return null;
       }else {
          return this.d.get(p0).u();
       }
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (i >= this.d.size()) {
             return -1;
          }
          b uob = this.d.get(i);
          if (uob.u() != null && p0.equals(uob.u().c())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public String d(int p0){
       String obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PagerSlidingTabStrip$d uod = this.b(p0);
       obj = "";
       if (uod != null && uod.c() != null) {
          obj = uod.c();
       }
       return obj;
    }
    public PagerSlidingTabStrip$d e(String p0){
       b uob;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = this.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uob = obj.next();
          if (uob.u() != null && p0.equals(uob.u().c())) {
             break ;
          }
       }
       return uob.u();
    }
    public int getCurrentIndex(){
       return this.h;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "8")) {
          return;
       }
       i3 oi3 = i3.f();
       String str = null;
       String str1 = (p2.t() != null)? p2.t().e(): str;
       oi3.d("tabId", str1);
       CharSequence uCharSequenc = (p2.u() != null)? p2.u().f(): str;
       oi3.d("tabName", String.valueOf(uCharSequenc));
       oi3.c("indexOfChild", Integer.valueOf(p0.indexOfChild(p2.o())));
       oi3.c("indexItem", Integer.valueOf(this.e.indexOf(p2)));
       String str2 = oi3.toString();
       b.c0(LiveLogTag.GZONE, "page destroyItem unbind", "extInfo", str2);
       if (p2.h()) {
          str1 = "componentPageAdapter";
          ClientContent$LiveStreamPackage liveStreamPa = p2.j.a();
          if (!PatchProxy.applyVoidFourRefs(str1, "destroyItem", str2, liveStreamPa, null, a.class, "47")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_GZONE_CATCH_EXCEPTION_INFO";
             i3 oi31 = i3.f();
             oi31.d("tag", str1);
             oi31.d("methodName", "destroyItem");
             oi31.d("params", str2);
             uElementPack.params = oi31.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }else if(PatchProxy.applyVoid(str, p2, a.class, "11")){
          p2.i(LiveGzoneTabState$State.UNBIND);
       }
       p0.removeView(p2.o());
       a ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoidOneRefs(p2, ti, a.class, "2")) {
          ti.b.remove(p2);
          Iterator iterator = ti.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p2);
          }
       }
       this.e.remove(p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public int k(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.d.isEmpty() && p0 instanceof b) {
          int i = this.d.indexOf(p0);
          if (i >= 0) {
             return i;
          }
       }
       return -2;
    }
    public Object o(ViewGroup p0,int p1){
       b uob;
       boolean b;
       View view;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, a.class, "6");
          if (uob != patchProxyRe) {
          }else {
          label_001c :
             uob = this.d.get(p1);
             this.i.a(uob, p1);
             Objects.requireNonNull(uob);
             Object obj = PatchProxy.apply(null, uob, LiveGzoneLifeStatePage.class, "1");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(uob.b.index() >= LiveGzoneTabState$State.CREATE.index()){
                b = true;
             }else {
                b = false;
             }
             if (!b) {
                Context context = p0.getContext();
                if (!PatchProxy.applyVoidTwoRefs(context, p0, uob, uoa, "9")) {
                   uob.e = context;
                   uob.f = p0;
                   uob.i(LiveGzoneTabState$State.CREATE);
                }
             }
             if (this.e.contains(uob)) {
                b.c0(LiveLogTag.GZONE, "instantiateItem contains tab", "unbind:", Boolean.valueOf(uob.h()));
             }else {
                uob.s(false);
                uob.i = p1;
                if (uob.o() != null) {
                   view = uob.o();
                   if (!PatchProxy.applyVoidTwoRefs(view, p0, this, a.class, "7") && view.getParent() != p0) {
                      if (view.getParent() != null) {
                         view.getParent().removeView(view);
                      }
                      p0.addView(view);
                   }
                   if (!PatchProxy.applyVoid(null, uob, uoa, "10")) {
                      uob.i(LiveGzoneTabState$State.BIND);
                   }
                   this.e.add(uob);
                }else {
                   throw new RuntimeException("LiveGzoneComponentPage is empty please check view");
                }
             }
          }
       }else {
          goto label_001c ;
       }
       return uob;
    }
    public boolean p(View p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p1.o() == p0)? true: false;
       return b;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "9")) {
          return;
       }
       a tg = this.g;
       if (p2 != tg) {
          if (tg != null) {
             tg.s(false);
          }
          if (p2 != null) {
             tg = this.j;
             if (tg == null || tg.K0()) {
                p2.s(true);
             }
          }
          this.g = p2;
          this.h = p1;
       }
       return;
    }
    public b z(){
       return this.g;
    }
}
