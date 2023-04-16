package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionPresenter;
import com.smile.gifmaker.mvps.presenter.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionPresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j4b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionPresenter$onBind$1;
import p4b.i;
import msd.l;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import android.view.View;
import kotlin.jvm.internal.a;
import android.view.ViewStub;
import android.widget.LinearLayout;
import p4b.h;
import android.view.View$OnClickListener;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public final class MagicEditionPresenter extends a	// class@001bcb
{
    public LinearLayout r;
    public final boolean s;
    public static final MagicEditionPresenter$a t;

    static {
       MagicEditionPresenter.t = new MagicEditionPresenter$a(null);
    }
    public void MagicEditionPresenter(boolean p0){
       super();
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MagicEditionPresenter.class, "1")) {
          return;
       }
       this.R8(this.s);
       this.X7(f.a(e.class, new i(new MagicEditionPresenter$onBind$1(this))));
       return;
    }
    public final void R8(boolean p0){
       MagicEditionPresenter tr1;
       LinearLayout linearLayout;
       MagicEditionPresenter magicEdition = MagicEditionPresenter.class;
       if (PatchProxy.isSupport(magicEdition) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, magicEdition, "3")) {
          return;
       }
       int i = 0;
       if (p0) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, magicEdition, "2")) {
             magicEdition = this.r;
             if (magicEdition == null && magicEdition == null) {
                View view = this.m8();
                a.o(view, "getRootView\(\)");
                ViewStub viewStub = view.findViewById(R.id.magic_edit_btn_stub_v2);
                if (viewStub != null) {
                   view = viewStub.inflate();
                   if (view != null) {
                      linearLayout = view.findViewById(R.id.magic_edit_root);
                   label_0050 :
                      this.r = linearLayout;
                      if (linearLayout != null) {
                         linearLayout.setOnClickListener(h.b);
                      }
                   }
                }
                linearLayout = objArray;
                goto label_0050 ;
             }
          }
          b uob = b.D();
          StringBuilder str = "±‡º≠∞¥≈•œ‘ æ mView obj: ";
          MagicEditionPresenter tr = this.r;
          if (tr != null) {
             objArray = tr.toString();
          }
          Object[] objArray1 = new Object[i];
          uob.w("MagicEditionPresenter", str+objArray, objArray1);
          tr1 = this.r;
          if (tr1 != null) {
             tr1.setVisibility(i);
          }
       }else {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicEditionPresenter", "±‡º≠∞¥≈•≤ªœ‘ æ", objArray2);
          tr1 = this.r;
          if (tr1 != null) {
             tr1.setVisibility(8);
          }
       }
       return;
    }
}
