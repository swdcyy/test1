package bz9.h;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Dialog;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import androidx.fragment.app.Fragment;
import xa5.a;
import xx9.a;
import ro5.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import jf5.a;
import rf5.u;
import qo5.a;
import uo5.a;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import oo5.a;

public final class h	// class@000531
{
    public SwipeLayout a;
    public k b;
    public final m0 c;
    public final SlidePageConfig d;

    public void h(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super();
       this.c = p0;
       this.d = p1;
       this.a = w9.c(p0.a);
    }
    public final m0 a(){
       return this.c;
    }
    public final void b(){
       boolean b;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "4")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, oh, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          oh = this.b;
          b = (oh != null && oh.isShowing() == true)? true: false;
       }
       if (b) {
          oh = this.b;
          if (oh != null) {
             oh.dismiss();
          }
       }
       return;
    }
    public final void c(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "3")) {
          return;
       }
       int i = 5;
       if (a.h(this.c.b) && !this.c.r.c()) {
          a.o(this.c.b, p0, i);
       }
       oh = this.a;
       if (oh != null) {
          oh.n(p0, 6);
       }
       a b = this.c.b;
       a.o(b, "callerContext.mFragment");
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(b.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.d(p0, 4);
       }
       this.c.v.R.F(p0, i);
       if (a.j(this.c.b)) {
          a.c(this.c.b, p0);
       }
       a.c(this.c.a, p0, 2);
       if (this.c.r.c() && p0) {
          return;
       }else {
          b = this.c.b;
          a.o(b, "callerContext.mFragment");
          if (f.b(b.getActivity())) {
             a.n(this.c.b, p0);
             a.i(this.c.b, p0, 15);
          }
          return;
       }
    }
}
