package com.kwai.live.gzone.propshop.h$b;
import vq5.b;
import com.kwai.live.gzone.propshop.h;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.propshop.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z61.b;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;
import u37.d;
import u37.e;
import fq5.b;
import brd.t;
import cjd.e;
import erd.o;
import v67.e;
import io.reactivex.internal.functions.Functions;
import erd.g;

public class h$b implements b	// class@000de6
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       if (p0.isHierarchical() && a1.i(this.a.getActivity())) {
          c uoc = this.a.X8();
          Objects.requireNonNull(uoc);
          b uob = PatchProxy.apply(null, uoc, c.class, "3");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = uoc.b.mIsVisible;
          }
          if (!uob.booleanValue()) {
             p0.C = true;
             return;
          }else {
             String str = x0.a(p0, "extinfo");
             if (TextUtils.x(str)) {
                this.a.Y8();
             }else {
                h$b ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidOneRefs(str, ta, h.class, "5") && ta.R8()) {
                   b9.a(ta.E);
                   ta.E = e.b().i(ta.s.getLiveStreamId(), str).map(new e()).subscribe(new e(ta), Functions.e);
                }
             }
          }
       }
    label_009a :
       return;
    }
}
