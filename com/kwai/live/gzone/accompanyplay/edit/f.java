package com.kwai.live.gzone.accompanyplay.edit.f;
import n37.a;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.String;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import n37.k;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import lnc.a1;
import java.lang.CharSequence;
import n37.d;
import android.content.DialogInterface$OnDismissListener;
import n37.c;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import crd.b;
import lnc.b9;
import brd.t;
import n37.f;
import com.kwai.live.gzone.accompanyplay.edit.j;
import erd.g;
import h37.n0;
import n37.h;
import erd.o;
import n37.g;
import com.kwai.live.gzone.accompanyplay.edit.k;
import n37.e;
import com.kwai.live.gzone.accompanyplay.edit.l;

public final class f implements a	// class@000be4
{
    public final g a;
    public final String b;

    public void f(g p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(int p0,LiveGzoneAccompanyFleetSetting p1,LiveGzoneAccompanyGameInfo p2,k p3,boolean p4,boolean p5){
       f uof = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       f a = uof.a;
       f b = uof.b;
       Objects.requireNonNull(a);
       g og = g.class;
       int i = 3;
       int i1 = 2;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,b,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (!PatchProxy.applyVoid(objArray, a, og, "8")) {
          label_0044 :
             if (!PatchProxy.applyVoid(null, a, og, "18")) {
                a.h();
                ProgressFragment progressFrag = new ProgressFragment();
                a.b = progressFrag;
                progressFrag.Jh(a1.p(R.string.arg_RES_7f103667));
                a.b.k0(new d(a));
                a.b.oh(new c(a));
                a.b.show(a.i.getSupportFragmentManager(), "accompanySetting");
             }
             b9.a(a.c);
             b9.a(a.e);
             if (p4) {
                if (a.l(p1)) {
                   a.c = a.i(b, p1).subscribe(new f(a, p1, b, oobject1), new j(a));
                   n0.c(i, oobject1, p0, oobject.mFleetTitle, b);
                }else {
                   a.c = a.q(p1, oobject1).flatMap(new h(a, p1, oobject2, b)).subscribe(new g(a, p1, b, oobject1), new k(a));
                   n0.c(i1, oobject1, p0, oobject.mFleetTitle, b);
                }
             }else {
                e uoe = new e(a, p1, p3, p5, p2, p0, b);
                a.c = a.q(p1, oobject1).subscribe(v11, new l(a));
             }
          }
       }else {
          goto label_0044 ;
       }
       return;
    }
}
