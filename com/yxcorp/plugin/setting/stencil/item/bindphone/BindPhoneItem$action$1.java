package com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import da6.f;
import ihc.a;
import android.content.Context;
import java.lang.CharSequence;
import e17.i;
import android.text.TextUtils;
import u07.t$a;
import android.app.Activity;
import nsd.r0;
import java.util.Arrays;
import bhd.a;
import u07.u;
import u07.t;
import u07.j;
import java.lang.Integer;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Number;
import wkd.b;
import com.kwai.component.menudot.b;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.kwai.feature.api.social.login.model.BindPhoneParams$ActionBarType;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import bhd.b;
import java.util.Map;
import n3d.a;

public final class BindPhoneItem$action$1 extends Lambda implements l	// class@000921
{
    public final BindPhoneItem this$0;

    public void BindPhoneItem$action$1(BindPhoneItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindPhoneItem$action$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       BindPhoneItem$action$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       BindPhoneItem uBindPhoneIt = BindPhoneItem.class;
       if (!PatchProxy.applyVoid(null, tthis$0, uBindPhoneIt, "3")) {
          if (f.a()) {
             i.d(R.style.arg_RES_7f110669, tthis$0.b.getString(R.string.arg_RES_7f104a7b));
          }else {
             String str = tthis$0.q();
             if (!TextUtils.isEmpty(str)) {
                if (!PatchProxy.applyVoidOneRefs(str, tthis$0, uBindPhoneIt, "4")) {
                   t$a uoa = new t$a(tthis$0.c);
                   uoa.X0(tthis$0.c.getString(R.string.arg_RES_7f1004fd));
                   String str1 = tthis$0.c.getString(R.string.arg_RES_7f100937);
                   a.o(str1, "activity.getString\(R.str¡­urrent_bind_phone_format\)");
                   Object[] objArray = new Object[]{tthis$0.p(str)};
                   str = String.format(str1, Arrays.copyOf(objArray, 1));
                   a.o(str, "java.lang.String.format\(format, *args\)");
                   uoa.z0(str);
                   uoa.S0(R.string.arg_RES_7f1004fc);
                   uoa.Q0(R.string.cancel);
                   uoa.u0(new a(tthis$0));
                   j.d(uoa);
                }
             }else {
                Integer redDotType = tthis$0.q.getRedDotType();
                boolean b = (redDotType != null)? b.a(0x34c80eb4).i(redDotType.intValue()): false;
                BindPhoneParams$b uob = new BindPhoneParams$b();
                uob.m(1);
                uob.i(b);
                uob.o(0);
                uob.h(9);
                uob.n(1);
                uob.k(1);
                uob.f(BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_PAGE_FIRST);
                uob.c(BindPhoneParams$ActionBarType.TYPE_BACK);
                d.a(-1712118428).ew(tthis$0.b, uob.a(), null, "setting_page_bind", new b(tthis$0));
             }
          }
       }
       return;
    }
}
