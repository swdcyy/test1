package a1c.d;
import lc9.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import lnc.a1;
import lc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import kotlin.jvm.internal.a;
import b1c.a$a;
import b1c.a;
import b1c.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import a1c.b;
import io.reactivex.g;
import j8c.a;
import q87.c;
import z0c.m;
import oc9.w;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import com.yxcorp.gifshow.prettify.e;
import oc9.q;
import d1c.c;
import com.yxcorp.gifshow.prettify.filter.repo.b;
import com.yxcorp.gifshow.camera.record.autoapply.exception.AutoApplyException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jd.c;
import n0c.a;

public class d implements b	// class@000022
{
    public FilterConfig a;

    public void d(){
       super();
    }
    public String a(Object p0,int p1,boolean p2){
       FilterConfig obj;
       Object[] objArray;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, d.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.r(p0)) {
          return "";
       }else {
          obj = p0.mDisplayName;
          if (p1 == 1 || p1 == 2) {
             return this.o(p0, 0, p2);
          }else if(p1 == 4){
             objArray = new Object[]{obj};
             return String.format(a1.p(0x7f100f51), objArray);
          }else if(p1 == 5){
             objArray = new Object[]{obj};
             return String.format(a1.p(0x7f100f53), objArray);
          }else if(p1 == 7){
             objArray = new Object[]{obj};
             return String.format(a1.p(0x7f1042c4), objArray);
          }else {
             return "";
          }
       }
    }
    public void b(Object p0,int p1){
       a.d(this, p0, p1);
    }
    public t c(Object p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       FilterStateManager uFilterState = this.s(p1);
       if (uFilterState != null) {
          obj = PatchProxy.applyOneRefs(p0, uFilterState, FilterStateManager.class, "14");
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             a.p(p0, "filter");
             p0 = uFilterState.b(new a$a(p0, false));
             uFilterState.h(p0);
             p0.c().c();
          }
       }
       return t.just(Boolean.TRUE);
    }
    public int d(Object p0,b p1){
       return a.b(this, p0, p1);
    }
    public void e(Object p0){
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       FilterStateManager uFilterState = this.s(p0);
       if (uFilterState != null && !PatchProxy.applyVoid(null, uFilterState, FilterStateManager.class, "15")) {
          uFilterState.h(uFilterState.b(new a$a(null, true)));
       }
       return;
    }
    public void g(Object p0,int p1){
       a.e(this, p0, p1);
    }
    public boolean h(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.r(p0)) {
          return false;
       }
       return (n.l(p0) ^ 0x01);
    }
    public String i(Object p0,int p1){
       return a.a(this, p0, p1);
    }
    public CDNUrl[] j(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r(p0)) {
          return e0.h(p0.mThumbImageUrl);
       }
       p0 = new CDNUrl[0];
       return p0;
    }
    public void k(Object p0,b p1){
    }
    public t l(Object p0,b p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       this.a = p0;
       return t.create(new b(this));
    }
    public boolean m(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public t n(Object p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       if (p0.mFilterId > null) {
          Object[] objArray = new Object[0];
          a.D().w("FilterDownloadProcessor", "getMagicAndUse:"+p0.mDisplayName, objArray);
          t ot = PatchProxy.applyOneRefs(p1, this, uod, "2");
          if (ot != patchProxyRe) {
          }else {
             Iterator iterator = p1.b().za().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   t ot1 = iterator.next();
                   if (!ot1 instanceof e) {
                      continue ;
                   }else {
                      Iterator iterator1 = ot1.getChildren().iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            ot = iterator1.next();
                            if (ot instanceof m) {
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }else {
                   ot = null;
                }
             }
          }
          if (ot != null) {
             p0 = b.a(ot.u, p0.mFilterId);
             if (p0 != null) {
                return t.just(p0);
             }
          }
       }
       return t.error(new AutoApplyException(1, a1.p(0x7f100f4e)));
    }
    public String o(Object p0,int p1,boolean p2){
       String obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, d.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       if (!this.r(p0)) {
          return str;
       }else {
          obj = a1.p(R.string.arg_RES_7f100f52);
          if (!TextUtils.x(p0.mDisplayName)) {
             str = p0.mDisplayName;
          }
          Object[] objArray = new Object[]{str,String.valueOf(p1)};
          return String.format(obj, objArray)+"%";
       }
    }
    public c p(Object p0){
       return a.c(this, p0);
    }
    public t q(Object p0,b p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       if (p0.mFilterId < null) {
          return t.error(new AutoApplyException(2, a1.p(0x7f100f4e)));
       }
       return t.just(p0);
    }
    public boolean r(Object p0){
       return p0 instanceof FilterConfig;
    }
    public final FilterStateManager s(b p0){
       FilterStateManager obj = PatchProxy.applyOneRefs(p0, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0.c(a.class) != null) {
          a uoa = p0.c(a.class);
          if (uoa != null) {
             obj = uoa.c();
          }
       }
       return obj;
    }
}
