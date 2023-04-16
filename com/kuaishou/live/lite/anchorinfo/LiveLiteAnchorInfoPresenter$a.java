package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$a;
import z1.a;
import com.kuaishou.live.lite.anchorinfo.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import o83.e;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.a;

public final class LiveLiteAnchorInfoPresenter$a implements a	// class@001e3e
{
    public final b a;

    public void LiveLiteAnchorInfoPresenter$a(b p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAnchorInfoPresenter$a.class, "1")) {
       }else {
          LiveLiteAnchorInfoPresenter$a ta = this.a;
          a.m(p0);
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "4")) {
             ta.l.a("reloadAnchorInfoAreaItems", new e(ta, p0));
          }
       }
       return;
    }
}
