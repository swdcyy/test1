package com.yxcorp.plugin.setting.stencil.item.logout.LogoutItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.logout.LogoutItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import ihc.b;
import android.app.Activity;
import chd.d;
import java.util.ArrayList;
import mz6.b;
import android.content.Context;
import tkd.b;
import tkd.d;
import pv5.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import wh5.c;
import mz6.a;
import mz6.b$d;
import com.yxcorp.plugin.setting.stencil.item.logout.a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import sgd.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class LogoutItem$action$1 extends Lambda implements l	// class@000924
{
    public final LogoutItem this$0;

    public void LogoutItem$action$1(LogoutItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       a uoa;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LogoutItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       LogoutItem$action$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, LogoutItem.class, str) && !tthis$0.k().isFinishing()) {
          FragmentActivity uFragmentAct = tthis$0.k();
          if (!PatchProxy.applyVoidOneRefs(uFragmentAct, null, d.class, str)) {
             ArrayList uArrayList = new ArrayList();
             b uob = new b(uFragmentAct);
             List list = d.a(0x6154d94e).k6();
             if (q.f(list) || list.size() == 1) {
                uob.n(R.string.arg_RES_7f1030c1);
                if (c.n()) {
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f100110);
                   uoa.e(R.string.arg_RES_7f100110);
                   uArrayList.add(uoa.a());
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f1030bd);
                   uoa.e(R.string.arg_RES_7f1030bd);
                   uArrayList.add(uoa.a());
                }else if(c.n()){
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f100110);
                   uoa.e(R.string.arg_RES_7f100110);
                   uArrayList.add(uoa.a());
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f1030bd);
                   uoa.o(R.color.arg_RES_7f060056);
                   uoa.e(R.string.arg_RES_7f1030bd);
                   uArrayList.add(uoa.a());
                }else {
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f1030bd);
                   uoa.o(R.color.arg_RES_7f060056);
                   uoa.e(R.string.arg_RES_7f1030bd);
                   uArrayList.add(uoa.a());
                }
             }else {
                uob.n(R.string.arg_RES_7f105263);
                if (c.n()) {
                   uoa = a.b();
                   uoa.g(R.string.arg_RES_7f104b71);
                   uoa.o(R.color.arg_RES_7f060056);
                   uoa.e(R.string.arg_RES_7f104b71);
                   uArrayList.add(uoa.a());
                }
                uoa = a.b();
                uoa.g(R.string.arg_RES_7f1030bd);
                uoa.e(R.string.arg_RES_7f1030bd);
                uArrayList.add(uoa.a());
             }
             uob.b(uArrayList);
             uob.l(new a(list, uFragmentAct));
             uob.q();
             if (!PatchProxy.applyVoidOneRefs(list, null, c.class, "8")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = (q.f(list) || list.size() == 1)? "ADD_ACCOUNT": "CHANGE_ACCOUNT_BUTTON";
                u1.u0(3, uElementPack, null);
             }
          }
       }
       return;
    }
}
