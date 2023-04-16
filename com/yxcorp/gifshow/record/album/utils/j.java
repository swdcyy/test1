package com.yxcorp.gifshow.record.album.utils.j;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.yxcorp.gifshow.record.album.utils.g0;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.record.album.utils.g0$a;
import java.lang.Enum;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.concurrent.atomic.AtomicBoolean;
import kzc.d;
import android.app.Activity;
import u07.t$a;
import p8c.c;
import u07.u;
import com.yxcorp.gifshow.record.album.utils.f0;
import com.kwai.library.widget.popup.common.c$b;
import p8c.k;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import p8c.r;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import wh5.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import brd.z;
import io.reactivex.android.schedulers.a;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.record.album.utils.s;
import crd.b;
import com.yxcorp.gifshow.record.album.utils.d;
import p8c.q;
import p8c.m;
import p8c.t;

public final class j implements g	// class@00176d
{
    public final RxFragmentActivity b;
    public final int c;
    public final b d;
    public final c e;

    public void j(RxFragmentActivity p0,int p1,b p2,c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       String str4;
       String str5;
       String str6;
       int i;
       AtomicBoolean uAtomicBoole;
       Object[] objArray2;
       d uod;
       AtomicBoolean uAtomicBoole1;
       j oj1;
       f0 uof0;
       j oj = this;
       j b = oj.b;
       j c = oj.c;
       j d = oj.d;
       j e = oj.e;
       c obj = p0;
       g0 og0 = g0.class;
       Object[] objArray = new Object[0];
       String str = "DraftRecoverUtil";
       a.D().w(str, "recover edit exists, flag is "+obj, objArray);
       String str1 = ", ask user.";
       String str2 = ", is new + ";
       String str3 = ", type ";
       if (g0$a.b[obj.ordinal()] != 1) {
          if (PatchProxy.isSupport(og0)) {
             str4 = str3;
             str5 = str2;
             str6 = str1;
             if (!PatchProxy.applyVoidFourRefs(b, Integer.valueOf(c), d, e, 0, g0.class, "5")) {
             }
          }else {
             str4 = str3;
             str5 = str2;
             str6 = str1;
             int i2 = 1;
          }
       }else {
          str4 = str3;
          str5 = str2;
          str6 = str1;
          if (!PatchProxy.isSupport(og0) || (!PatchProxy.applyVoidFourRefs(b, Integer.valueOf(c), d, e, null, g0.class, "10") && !c.b())) {
             if (!DraftUtils.f(e)) {
                objArray2 = new Object[0];
                a.D().w(str, "recoverRecord Found crashed workspace is null or asset is empty", objArray2);
                DraftFileManager.E().p(e).compose(b.E2(ActivityEvent.PAUSE)).observeOn(a.c()).subscribe(Functions.d(), s.b);
             }else {
                int i1 = 0;
                Object[] objArray1 = new Object[i1];
                a.D().w(str, "recoverRecord Found crashed workspace "+e.D0()+str4+e.a1().name()+str5+(DraftFileManager.E().H(e).exists() ^ 0x01)+str6, objArray1);
                AtomicBoolean uAtomicBoole2 = new AtomicBoolean(i1);
                if (g0.b) {
                   objArray2 = new Object[i1];
                   a.D().w(str, "recoverRecord has canceled", objArray2);
                }else {
                   d uod1 = new d(b);
                   uod1.Z0(90);
                   uod1.W0(R.string.arg_RES_7f100818);
                   uod1.S0(R.string.arg_RES_7f1041f9);
                   uod1.Q0(R.string.arg_RES_7f1041f7);
                   uod1.y0(R.string.arg_RES_7f1047e1);
                   d uod2 = new d(uAtomicBoole2, e, b, c, d);
                   uod1.u0(str);
                   uod1.t0(new q(uAtomicBoole2, e, b));
                   uod1.z(false);
                   uod1.L(new m(b, e));
                   uod1.Y(new t(e));
                }
             }
          }
       }
       return;
    }
}
