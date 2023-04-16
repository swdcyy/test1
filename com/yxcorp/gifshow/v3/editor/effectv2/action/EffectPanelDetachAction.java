package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPanelDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import kqc.c;
import uxb.e$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import uxb.f;
import dqc.a;
import hqc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import fqc.a;
import java.lang.Enum;
import kqc.g;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import hqc.c;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import kqc.d;
import kqc.b;
import kqc.e;
import kqc.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import eqc.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import q87.c;
import raa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import raa.c;
import raa.g;
import raa.i;
import maa.a;
import raa.e;
import kba.a;
import java.util.Objects;
import java.lang.Boolean;
import qaa.a;
import wba.m;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import ooc.g1;
import java.util.ArrayList;
import dqc.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import qr4.e$j;
import qr4.e$q;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPanelDetachAction$a;
import java.lang.Runnable;
import ekd.k1;

public final class EffectPanelDetachAction extends EditSdkAction	// class@000f2c
{
    public final List effectList;
    public final e$a enterCoverPointTrackInfo;
    public final c rootState;
    public final boolean save;
    public final double videoLength;

    public void EffectPanelDetachAction(boolean p0,List p1,c p2,double p3,e$a p4){
       a.p(p1, "effectList");
       a.p(p2, "rootState");
       a.p(p4, "enterCoverPointTrackInfo");
       super();
       this.save = p0;
       this.effectList = p1;
       this.rootState = p2;
       this.videoLength = p3;
       this.enterCoverPointTrackInfo = p4;
    }
    public void EffectPanelDetachAction(boolean p0,List p1,c p2,double p3,e$a p4,int p5,u p6){
       if (p5 & 0x10) {
          p4 = f.a();
       }
       super(p0, p1, p2, p3, p4);
       return;
    }
    public final a findEffectTimelineDataByAdvEffect(a p0,c p1){
       Iterator iterator1;
       Object obj2;
       int i3;
       EffectGroupType obj = PatchProxy.applyTwoRefs(p0, p1, this, EffectPanelDetachAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.g();
       if (obj != null) {
          int i = a.a[obj.ordinal()];
          String str = "advEffect is unexpected ";
          int i1 = 0;
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         Iterator iterator = p1.j().d().iterator();
                         while (true) {
                            if (!iterator.hasNext()) {
                               throw new IllegalStateException(str+p0.a);
                            }
                            Object obj1 = iterator.next();
                            int i2 = i1 + 1;
                            if (i1 < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            if (obj1.G() == p0.a) {
                               break ;
                            }else {
                               i1 = i2;
                            }
                         }
                         return p1.j().d().get(i1);
                      }
                   }else {
                      iterator1 = p1.f().b().iterator();
                      while (true) {
                         if (!iterator1.hasNext()) {
                            throw new IllegalStateException(str+p0.a);
                         }
                         obj2 = iterator1.next();
                         i3 = i1 + 1;
                         if (i1 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         if (obj2.G() == p0.a) {
                            break ;
                         }else {
                            i1 = i3;
                         }
                      }
                      return obj2;
                   }
                }else {
                   iterator1 = p1.e().b().iterator();
                   while (true) {
                      if (!iterator1.hasNext()) {
                         throw new IllegalStateException(str+p0.a);
                      }
                      obj2 = iterator1.next();
                      i3 = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      if (obj2.G() == p0.a) {
                         break ;
                      }else {
                         i1 = i3;
                      }
                   }
                   return obj2;
                }
             }else {
                iterator1 = p1.h().b().iterator();
                while (true) {
                   if (!iterator1.hasNext()) {
                      throw new IllegalStateException(str+p0.a);
                   }
                   obj2 = iterator1.next();
                   i3 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (obj2.G() == p0.a) {
                      break ;
                   }else {
                      i1 = i3;
                   }
                }
                return obj2;
             }
          }else {
             iterator1 = p1.d().b().iterator();
             while (true) {
                if (!iterator1.hasNext()) {
                   throw new IllegalStateException(str+p0.a);
                }
                obj2 = iterator1.next();
                i3 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (obj2.G() == p0.a) {
                   break ;
                }else {
                   i1 = i3;
                }
             }
             return obj2;
          }
       }
       throw new IllegalStateException("advEffect.mEffectGroupType is unexpected "+p0.g());
    }
    public final List getEffectList(){
       return this.effectList;
    }
    public final e$a getEnterCoverPointTrackInfo(){
       return this.enterCoverPointTrackInfo;
    }
    public final c getRootState(){
       return this.rootState;
    }
    public final boolean getSave(){
       return this.save;
    }
    public final double getVideoLength(){
       return this.videoLength;
    }
    public void performAction(c p0,c p1){
       a obj1;
       boolean b;
       a a;
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectPanelDetachAction.class, str)) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "EffectMagicSelectAction";
       a.D().w(str1, "performAction save:"+this.save+", effectList:"+this.effectList+", videoLength:"+this.videoLength+", enterCoverPointTrackInfo:"+this.enterCoverPointTrackInfo, objArray);
       String str2 = "";
       a obj = null;
       if (this.save != null) {
          a.b(p0).f();
          a.k(p0).f();
          a.s(p0).f();
          a.v(p0).f();
          a.c(p0).f();
          a.l(p0).f();
          a.a.u(p0).f();
          int i1 = 1;
          if ((a.g(this.rootState.j().b(), f.a()) ^ i1) && (a.g(this.enterCoverPointTrackInfo, f.a()) ^ i1)) {
             EffectPanelDetachAction tenterCoverP = this.enterCoverPointTrackInfo;
             e$a uoa1 = this.rootState.j().b();
             Objects.requireNonNull(tenterCoverP);
             obj1 = PatchProxy.applyOneRefs(uoa1, tenterCoverP, e$a.class, str);
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                a.p(uoa1, "another");
                b = (a.g(tenterCoverP.f, uoa1.f) && !tenterCoverP.c - uoa1.c)? true: false;
             }
             if (!b) {
                Object[] objArray1 = new Object[i];
                a.D().w(str1, "performAction reset cover, enterCoverTimePoint:"+this.rootState.j().c(), objArray1);
                a.f(p0).c0();
                m.b(a.f(p0), i1, i, 4, obj);
                a.f(p0).f();
                if (this.rootState.j().c() - (double)i > 0) {
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100b65));
                }
             }
          }
       label_0146 :
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(obj, a, uoa, "11")) {
             g1.e(str2, "FINISH_EFFECT_DIALOG");
          }
       }else {
          a.b(p0).j();
          a.k(p0).j();
          a.s(p0).j();
          a.v(p0).j();
          a.c(p0).j();
          a.l(p0).j();
          a.a.u(p0).j();
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(obj, a, uoa, "12")) {
             g1.e(str2, "CANCEL_EFFECT_DIALOG");
          }
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = this.effectList.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          v3 = obj1 instanceof c;
          if (i) {
             obj = obj1;
             if (obj.n() != null) {
                MagicEmoji$MagicFace magicFace = obj.n();
                a.m(magicFace);
                obj = this.findEffectTimelineDataByAdvEffect(obj1, this.rootState);
                double d = (double)1000;
                double d1 = obj.h() * d;
                double d2 = obj.g();
                d2 = d2 - obj.h();
                d2 = d2 * d;
                long l = (long)d2;
                uArrayList1.add(b.n(magicFace, (long)d1, l, ""));
             }
          }
          if (!i) {
             e$j oj = new e$j();
             oj.d = obj1.j();
             oj.a = obj1.k();
             EffectGroupType uEffectGroup = obj1.g();
             a.o(uEffectGroup, "it.effectGroupType");
             oj.e = uEffectGroup.getType();
             oj.c = (long)obj1.a;
             oj.b = new e$q();
             obj1 = this.findEffectTimelineDataByAdvEffect(obj1, this.rootState);
             oj.b.a = obj1.h();
             oj.b.b = obj1.g();
             uArrayList.add(oj);
          }
       }
       k1.o(new EffectPanelDetachAction$a(uArrayList, p0, uArrayList1));
       return;
    }
}
