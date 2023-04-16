package com.yxcorp.gifshow.v3.editor.sticker.s$a;
import wpc.y;
import com.yxcorp.gifshow.v3.editor.sticker.s;
import java.lang.Object;
import wpc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lwc.d;
import brd.a0;
import t45.d;
import brd.z;
import itc.g0;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.sticker.r;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.sticker.q;
import t36.f$a;
import t36.f;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import uld.g;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;
import faa.a;
import q87.c;
import ntc.b;
import erd.o;
import ntc.c;
import kotlin.jvm.internal.a;
import itc.d0;
import com.yxcorp.gifshow.v3.editor.sticker.o;

public class s$a implements y	// class@00128d
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.b(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "2")) {
          return;
       }
       if (this.a.A.b()) {
          s$a ta = this.a;
          ta.X7(ta.A.e().G(d.a).n(new g0(this)).R(Functions.d(), r.b));
       }else {
          this.a.B.s0(q.a);
       }
       return;
    }
    public void c(boolean p0){
       s$a uoa = s$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       s os = s.class;
       if (!PatchProxy.isSupport(os) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, os, "4")) {
          if (uoa.x.getSelectDrawer() != null && uoa.x.getSelectDrawer() instanceof EditStickerBaseDrawer) {
             uoa.x.R();
          }
          if (uoa.u.a.c()) {
             uoa.A.a("SinglePicStickerEditPresenter");
             os = uoa.u;
             Objects.requireNonNull(os);
             a0 uoa0 = PatchProxy.apply(null, os, StickerElementViewModel.class, "15");
             if (uoa0 != PatchProxyResult.class) {
             }else {
                os.i.setValue(Boolean.TRUE);
                Object[] objArray = new Object[0];
                a.D().w("StickerElementViewModel", "waitAllTaskComplete start", objArray);
                uoa0 = os.a.h().G(d.a).C(b.b).m(new c(os));
                a.o(uoa0, "decorationDrawerFileMana¡­Complete complete\"\)\n    }");
             }
             uoa.X7(uoa0.G(d.a).n(new d0(uoa, p0)).R(Functions.d(), o.b));
          }else if(p0){
             uoa.P8(p0);
          }
       }
       return;
    }
}
