package com.yxcorp.gifshow.v3.editor.cover.u;
import kb.b;
import com.yxcorp.gifshow.v3.editor.cover.s;
import axc.j;
import brd.v;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.g;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import bd.b;
import im8.f;
import android.graphics.Bitmap;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView;
import ppc.w;
import com.yxcorp.gifshow.v3.editor.cover.t;
import erd.g;
import crd.b;
import brd.t;
import ooc.c;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u extends b	// class@000ee0
{
    public final j a;
    public final v b;
    public final s c;

    public void u(s p0,j p1,v p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.b.onNext(Boolean.FALSE);
       this.b.onComplete();
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       if (p0.getResult() != null) {
          a uoa = p0.getResult().j();
          if (uoa instanceof b) {
             u tc = this.c;
             s s = tc.s;
             if (s != null) {
                s.set(tc.Y0);
             }
             tc = this.c;
             s = tc.t;
             if (s != null) {
                s.set(tc.X0);
             }
             tc = this.c;
             tc.u.set(tc.Z0);
             tc = this.a;
             Bitmap uBitmap = uoa.g();
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidOneRefs(uBitmap, tc, j.class, "2")) {
                a.p(uBitmap, "imageBitmap");
                tc.b = uBitmap;
             }
             this.b.onNext(Boolean.TRUE);
             this.b.onComplete();
             u tc1 = this.c;
             s s1 = tc1.S;
             if (s1 != null) {
                s1.addOnItemTouchListener(tc1.a1);
             }
             tc1 = this.c;
             s1 = tc1.z;
             if (s1 != null) {
                tc1.A = s1.subscribe(new w(this), t.b);
             }
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, objArray, c.class, "11")) {
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putInt("cover_material_guide_bubble_count", (a.n() + 1));
                g.a(uEditor);
             }
             if (!PatchProxy.applyVoid(objArray, objArray, g1.class, "39")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GUIDE_SET_COVER_TITLE_POPUP";
                uElementPack.type = 17;
                u1.u0(4, uElementPack, new ClientContent$ContentPackage());
             }
          }
       }else {
          this.b.onNext(Boolean.FALSE);
          this.b.onComplete();
       }
       return;
    }
}
