package com.yxcorp.gifshow.prettify.body.ui.a$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import y0c.f;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import y0c.f$a;

public final class a$e implements PopupInterface$d	// class@00113d
{
    public final FragmentActivity a;

    public void a$e(FragmentActivity p0){
       this.a = p0;
       super();
    }
    public final void a(c p0,int p1){
       a$e uoe = a$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "p0");
       a$e ta = this.a;
       Objects.requireNonNull(ta, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       f.a.b(ta, "cancel");
       return;
    }
}
