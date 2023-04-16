package com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter$mReceiver$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter;
import android.content.Context;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import m3a.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import m3a.c;
import java.util.Objects;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.ActionType;
import java.lang.Enum;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import o3a.a;
import m3a.q;
import com.yxcorp.gifshow.entity.QPhoto;
import m3a.s;
import k2b.e0;
import java.util.Iterator;
import java.lang.Iterable;
import m3a.b;
import o56.a;
import ekd.p0;
import m3a.r;
import java.lang.Boolean;
import java.util.List;

public final class SmallWindowActionPresenter$mReceiver$1 extends BroadcastReceiver	// class@001645
{
    public final SmallWindowActionPresenter a;

    public void SmallWindowActionPresenter$mReceiver$1(SmallWindowActionPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       c a;
       t ot1;
       Object[] objArray1;
       Iterator iterator;
       QPhoto qPhoto;
       o oo;
       StringBuilder str1;
       String str2;
       Object[] objArray2;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SmallWindowActionPresenter$mReceiver$1.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       Object[] objArray = new Object[0];
       o.C().w("SmallWindowActionPresenter", "onReceive: "+p1.getAction(), objArray);
       a = c.a;
       String action = p1.getAction();
       Objects.requireNonNull(a);
       object oobject = PatchProxy.applyOneRefs(action, a, c.class, "5");
       String str = 2;
       objArray = null;
       if (oobject != patchProxyRe) {
       }else if(action != null){
          ActionType[] uActionTypeA = ActionType.values();
          int len = uActionTypeA.length;
          int i2 = 0;
          while (true) {
             if (i2 < len) {
                object oobject1 = uActionTypeA[i2];
                if (StringsKt__StringsKt.O2(action, oobject1.name(), 0, str, objArray)) {
                   oobject = oobject1;
                }else {
                   i2 = i2 + 1;
                }
             }
          }
       }
       oobject = objArray;
       if (oobject != null) {
          int i = a.a[oobject.ordinal()];
          action = "playNext: network not connect";
          if (i != 1) {
             if (i != str) {
                if (i != 3) {
                   if (i == 4) {
                      SmallWindowActionPresenter.P8(this.a).d();
                      q.a.a(SmallWindowActionPresenter.P8(this.a).a(), SmallWindowActionPresenter.R8(this.a).b(), "PAUSE");
                   }
                }else {
                   ot1 = SmallWindowActionPresenter.P8(this.a);
                   Objects.requireNonNull(ot1);
                   if (!PatchProxy.applyVoid(objArray, ot1, ot, "10")) {
                      objArray1 = new Object[0];
                      o.C().w("SmallWindowPlayController", "notifyPlay", objArray1);
                      iterator = ot1.c.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().b(true);
                      }
                   }
                   q.a.a(SmallWindowActionPresenter.P8(this.a).a(), SmallWindowActionPresenter.R8(this.a).b(), "PLAY");
                }
             }else if(p0.C(a.B)){
                ot1 = SmallWindowActionPresenter.P8(this.a);
                Objects.requireNonNull(ot1);
                if (!PatchProxy.applyVoid(objArray, ot1, ot, "12")) {
                   qPhoto = ot1.b();
                   oo = o.C();
                   str1 = "notifyPlayNext ";
                   if (qPhoto != null) {
                      str2 = r.a(qPhoto);
                   }
                   objArray2 = new Object[0];
                   oo.w("SmallWindowPlayController", str1+str2, objArray2);
                   if (qPhoto != null) {
                      iterator = ot1.c.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().a(qPhoto);
                      }
                   }
                }
             }else {
                objArray1 = new Object[0];
                o.C().w("SmallWindowActionPresenter", action, objArray1);
             }
             q.a.a(SmallWindowActionPresenter.P8(this.a).a(), SmallWindowActionPresenter.R8(this.a).b(), "NEXT");
          }else if(p0.C(a.B)){
             ot1 = SmallWindowActionPresenter.P8(this.a);
             Objects.requireNonNull(ot1);
             if (!PatchProxy.applyVoid(objArray, ot1, ot, "13")) {
                qPhoto = PatchProxy.apply(objArray, ot1, ot, "7");
                if (qPhoto != patchProxyRe) {
                }else {
                   qPhoto = PatchProxy.apply(objArray, ot1, ot, "9");
                   if (qPhoto != patchProxyRe) {
                      b = qPhoto.booleanValue();
                   }else {
                      t a1 = ot1.a;
                      b = ((a1 - 1) >= 0 && (a1 - true) < ot1.b.size())? true: false;
                   }
                   if (b) {
                      Object[] objArray3 = new Object[0];
                      o.C().w("SmallWindowPlayController", "getLastPhoto: "+r.a(ot1.b.get((ot1.a - true)))+", index "+(ot1.a - true), objArray3);
                      int i1 = ot1.a - 1;
                      ot1.a = i1;
                      qPhoto = ot1.b.get(i1);
                   }else {
                      objArray1 = new Object[0];
                      o.C().w("SmallWindowPlayController", "getLastPhoto: null", objArray1);
                      Object[] objArray4 = objArray;
                   }
                }
                oo = o.C();
                str1 = "notifyPlayLast ";
                if (qPhoto != null) {
                   str2 = r.a(qPhoto);
                }
                objArray2 = new Object[0];
                oo.w("SmallWindowPlayController", str1+str2, objArray2);
                if (qPhoto != null) {
                   iterator = ot1.c.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().c(qPhoto);
                   }
                }
             }
          }else {
             objArray1 = new Object[0];
             o.C().w("SmallWindowActionPresenter", action, objArray1);
          }
          q.a.a(SmallWindowActionPresenter.P8(this.a).a(), SmallWindowActionPresenter.R8(this.a).b(), "PRE");
       }
       return;
    }
}
