package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;
import ihc.c;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$action$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.a;
import brd.t;
import gr8.b;
import brd.x;
import t45.d;
import brd.z;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$b;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import pv5.a;
import cjd.e;
import erd.o;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$c;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$d;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import com.kwai.framework.accountsecurity.d;
import android.content.Context;
import lhc.b;

public final class AccountSecurityItem extends c	// class@00090b
{
    public final l s;
    public static final AccountSecurityItem$a t;

    static {
       AccountSecurityItem.t = new AccountSecurityItem$a(null);
    }
    public void AccountSecurityItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.s = new AccountSecurityItem$action$1(this);
    }
    public l getAction(){
       return this.s;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, AccountSecurityItem.class, "2")) {
          return;
       }
       this.p();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, AccountSecurityItem.class, "3")) {
          return;
       }
       RxBus.f.f(a.class).compose(this.m()).observeOn(d.a).subscribe(new AccountSecurityItem$b(this));
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, AccountSecurityItem.class, "1")) {
          return;
       }
       d.a(-867089262).Sw().map(new e()).compose(this.l()).subscribe(new AccountSecurityItem$c(this), new AccountSecurityItem$d(this));
       return;
    }
    public final void p(){
       String str;
       if (PatchProxy.applyVoid(null, this, AccountSecurityItem.class, "5")) {
          return;
       }
       MutableLiveData status = this.getStatus();
       if (d.c() == 1) {
          str = this.b.getString(R.string.arg_RES_7f10004f);
       }else if(d.c() == -1){
          str = this.b.getString(R.string.arg_RES_7f10005c);
       }else {
          str = "";
       }
       a.o(str, "when {\n        AccountSe¡­     \"\"\n        }\n      }");
       b.a(status, str);
       return;
    }
}
