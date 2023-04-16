package com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;
import ihc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem$action$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import lhc.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import c66.h$b;
import brd.t;
import gr8.b;
import brd.x;
import t45.d;
import brd.z;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem$a;
import erd.g;
import crd.b;
import zca.t;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import oe6.a;

public final class BindPhoneItem extends c	// class@000923
{
    public final Class s;
    public final l t;

    public void BindPhoneItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.s = BindPhoneItem.class;
       this.t = new BindPhoneItem$action$1(this);
    }
    public l getAction(){
       return this.t;
    }
    public Class getDataType(){
       return this.s;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, BindPhoneItem.class, "1")) {
          return;
       }
       String str = this.q();
       b.a(this.getStatus(), this.p(str));
       b.a(this.a(), Boolean.valueOf((TextUtils.isEmpty(str) ^ 0x01)));
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, BindPhoneItem.class, "2")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       f.f(h$b.class).compose(this.m()).observeOn(a).subscribe(new BindPhoneItem$a(this));
       f.f(t.class).compose(this.m()).observeOn(a).subscribe(new BindPhoneItem$b(this));
       return;
    }
    public final String p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BindPhoneItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 8;
       if (p0.length() < i) {
          return p0;
       }
       p0 = (p0).replace((p0.length() - i), (p0.length() - 4), "****");
       a.o(p0, "StringBuilder\(phoneNumbe¡­h - 4, \"****\"\).toString\(\)");
       return p0;
    }
    public final String q(){
       Object obj = PatchProxy.apply(null, this, BindPhoneItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e()+a.f();
    }
}
