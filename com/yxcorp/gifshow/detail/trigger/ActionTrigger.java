package com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import java.lang.Object;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$d;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$h;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$c;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$g;
import java.util.BitSet;

public class ActionTrigger	// class@001a1a
{
    public ActionTrigger$g a;
    public ActionTrigger$a b;
    public List c;
    public ActionTrigger$h d;
    public ActionTrigger$f e;
    public List f;
    public ActionTrigger$b g;
    public ActionTrigger$e h;
    public QPhoto i;
    public BitSet j;
    public boolean k;

    public void ActionTrigger(){
       super();
       this.b = new ActionTrigger$a();
       this.c = new ArrayList();
       this.f = new ArrayList();
       this.j = null;
       ActionTrigger$d uod = new ActionTrigger$d();
       this.e = uod;
       this.g = uod.c(this);
    }
    public void ActionTrigger(ActionTrigger$f p0){
       super();
       this.b = new ActionTrigger$a();
       this.c = new ArrayList();
       this.f = new ArrayList();
       this.j = null;
       this.e = p0;
       this.g = p0.c(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ActionTrigger.class, "9")) {
          return;
       }
       ActionTrigger td = this.d;
       if (td != null && !td.a()) {
          td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(null, td, ActionTrigger$h.class, "8")) {
             td.b(false);
             k1.m(td);
          }
          td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.isSupport(ActionTrigger$h.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, td, ActionTrigger$h.class, "3")) {
             Iterator iterator = td.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().a = true;
             }
          }
       }
       this.d = null;
       return;
    }
    public void b(){
       boolean b1;
       boolean b2;
       Iterator iterator1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ActionTrigger uActionTrigg = ActionTrigger.class;
       if (PatchProxy.applyVoid(null, this, uActionTrigg, "7")) {
          return;
       }
       ActionTrigger tc = this.c;
       if (tc == null || (tc.isEmpty() || (this.e != null && (this.d() && (this.k != null && this.b.i == null))))) {
          if (!this.f.isEmpty()) {
             this.f.clear();
          }
          Iterator iterator = this.c.iterator();
          String str = "6";
          boolean b = false;
          while (iterator.hasNext()) {
             ActionTrigger$c uoc = iterator.next();
             if (uoc.g == null && (uoc.b != null || uoc.c())) {
                continue ;
             }else if(uoc.a == null){
                ActionTrigger tb = this.b;
                Object obj = PatchProxy.applyOneRefs(tb, uoc, ActionTrigger$c.class, "2");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   obj = PatchProxy.applyOneRefs(tb, uoc, ActionTrigger$c.class, "3");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(uoc.c != null || uoc.a(tb)){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   uoc.c = b2;
                   if (uoc.d == null) {
                      Object obj1 = PatchProxy.applyOneRefs(tb, uoc, ActionTrigger$c.class, str);
                      b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): true;
                      if (!b1) {
                         b1 = false;
                      label_00b0 :
                         uoc.d = b1;
                         if (uoc.f == null) {
                            obj1 = PatchProxy.applyOneRefs(tb, uoc, ActionTrigger$c.class, "4");
                            b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): true;
                            if (!b1) {
                               b1 = false;
                            label_00cc :
                               uoc.f = b1;
                               if (uoc.e == null) {
                                  obj1 = PatchProxy.applyOneRefs(tb, uoc, ActionTrigger$c.class, "7");
                                  b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): true;
                                  if (!b1) {
                                     b1 = false;
                                  label_00e6 :
                                     uoc.e = b1;
                                     if (uoc.f != null && (uoc.c != null && (uoc.d != null && b1))) {
                                        b1 = true;
                                     }else {
                                        b1 = false;
                                     }
                                  }
                               }
                               b1 = true;
                               goto label_00e6 ;
                            }
                         }
                         b1 = true;
                         goto label_00cc ;
                      }
                   }
                   b1 = true;
                   goto label_00b0 ;
                   uoc.a = b1;
                }
                if (!b1) {
                label_00fe :
                   if (b) {
                      this.f.add(uoc);
                   }
                }
             }
             b = true;
             goto label_00fe ;
          }
          if (!this.f.isEmpty()) {
             tc = this.f;
             if (PatchProxy.applyVoidOneRefs(tc, this, uActionTrigg, "8") || (this.e == null || (this.b.i == null && this.a != null))) {
                if (!this.d()) {
                   uActionTrigg = this.d;
                   if (uActionTrigg != null) {
                      Object obj2 = PatchProxy.apply(null, uActionTrigg, ActionTrigger$h.class, str);
                      if (obj2 != patchProxyRe) {
                         b = obj2.booleanValue();
                      }else if(!uActionTrigg.a() && uActionTrigg.b.get(b).g != null){
                         b = true;
                      }
                      if (b) {
                      label_0179 :
                         if (this.d() && this.k != null) {
                            iterator1 = tc.iterator();
                            while (iterator1.hasNext()) {
                               iterator1.next().b = true;
                            }
                         }else {
                            iterator1 = tc.iterator();
                            while (iterator1.hasNext()) {
                               iterator1.next().a = true;
                            }
                         }
                      }
                   }
                   ActionTrigger$h oh = new ActionTrigger$h(new ArrayList(tc), this.a);
                   this.d = oh;
                   if (!PatchProxy.applyVoid(null, oh, ActionTrigger$h.class, "7")) {
                      oh.b(true);
                      k1.r(oh, 0);
                   }
                }else {
                   goto label_0179 ;
                }
             }
          }
       }
    label_01a9 :
       return;
    }
    public ActionTrigger$b c(){
       return this.g;
    }
    public boolean d(){
       ActionTrigger obj = PatchProxy.apply(null, this, ActionTrigger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj == null) {
          return (this.b.h.isEmpty() ^ 0x01);
       }
       return this.b.h.intersects(obj);
    }
}
