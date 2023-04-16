package com.yxcorp.gifshow.camera.record.widget.f;
import erd.g;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog;
import u07.t$a;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.pendant.PendantAvatarInfo;
import java.lang.CharSequence;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import ki9.h;
import u07.u;
import ki9.i;
import w07.m;
import w07.l;
import w07.a;
import ki9.j;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ki9.k;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import ki9.l;
import ki9.m;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class f implements g	// class@000fe8
{
    public final PendantAvatarDialog$b b;

    public void f(PendantAvatarDialog$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          f tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, PendantAvatarDialog$b.class, "2")) {
             PendantAvatarDialog$b b = tb.b;
             if (b != null && !PatchProxy.applyVoidOneRefs(p0, b, PendantAvatarDialog.class, "3")) {
                PendantAvatarDialog b1 = b.b;
                String str = "activity";
                if (b1 == null) {
                   a.S(str);
                }
                t$a uoa = new t$a(b1);
                uoa.X0(b.e.title);
                uoa.z0(b.e.subTitle);
                uoa.S0(R.string.arg_RES_7f100490);
                PendantAvatarDialog b2 = b.b;
                if (b2 == null) {
                   a.S(str);
                }
                uoa.C0(new BitmapDrawable(b2.getResources(), p0));
                uoa.V0(true);
                uoa.z(false);
                uoa.u0(h.b);
                uoa.s0(i.b);
                uoa.a0(new m());
                uoa.a0(new a());
                uoa.L(new j(p0));
                uoa.G(k.a);
                uoa.O(l.a);
                uoa.Y(new m(b));
             }
             tb.a();
          }
       }
       return;
    }
}
