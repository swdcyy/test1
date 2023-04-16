package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import i5b.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import i5b.h;
import k2b.e0;
import i5b.c;
import java.util.Objects;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMediaArrayList;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.d;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import i5b.i;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;

public class SwapPresenter$a implements d$a	// class@001c29
{
    public final SwapPresenter a;

    public void SwapPresenter$a(SwapPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,QMedia p1,int p2){
       boolean i2;
       BaseFragment uBaseFragmen;
       SwapPresenter swapPresente = SwapPresenter.class;
       if (PatchProxy.isSupport(SwapPresenter$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, SwapPresenter$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().s("SwapPresenter", "OnSwapItemClickListener onItemClick position:  "+p0+"  type:"+p2, objArray);
       int i1 = 1;
       if (p2 != i1) {
          if (p2 == 3 && !PermissionUtils.a(this.a.getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
             this.a.V8();
          }
       }else if(p1 == null){
          return;
       }else {
          j a = j.a;
          a.b(this.a.M.b(), p0, p1, false, this.a.M.h());
          if (this.a.N.j()) {
             SwapPresenter$a ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.isSupport(swapPresente) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p0), ta, swapPresente, "3")) {
                i2 = ta.R.u1().contains(p1) ^ i1;
                if (i2 && ta.R.u1().sizeOfNotEmpty() >= ta.N.c()) {
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103120));
                }else {
                   ta.S.f(p1, p0, i2);
                   ta.l9();
                }
             }
          }else {
             SwapPresenter$a ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.isSupport(swapPresente) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p0), ta1, swapPresente, "2")) {
                if (p0 == ta1.R.t1()) {
                   i2 = ta1.N.e();
                   if (!i2 || p0) {
                      uBaseFragmen = ta1.M.b();
                      String str = ta1.M.h();
                      Objects.requireNonNull(a);
                      if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, str, a, j.class, "4")) {
                         a.p(uBaseFragmen, "page");
                         a.p(str, "magicId");
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "PRODUCE_MAGIC_FACE_ALBUM_CANCEL";
                         i3 oi3 = i3.f();
                         oi3.d("magic_face_id", str);
                         a.o(oi3, "JsonStringBuilder.newIns¡­\"magic_face_id\", magicId\)");
                         uElementPack.params = oi3.e();
                         u1.L("", uBaseFragmen, i1, uElementPack, null);
                      }
                      if (i2) {
                         uBaseFragmen = ta1.R.t1();
                         ta1.R.v1(i);
                         ta1.R.l0(i);
                         if (uBaseFragmen >= 0 && uBaseFragmen < ta1.R.getItemCount()) {
                            ta1.R.l0(uBaseFragmen);
                         }
                         p1 = ta1.R.s1();
                         uBaseFragmen = 0;
                      }else {
                         ta1.R.v1(-1);
                         ta1.R.l0(ta1.M.e());
                         ta1.M.m(-1);
                         ta1.S.c(p1, i);
                         ta1.M.l(i);
                      }
                   }
                }
                ta1.M.m(uBaseFragmen);
                ta1.S.c(p1, i1);
             }
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SwapPresenter$a.class, "2")) {
          return;
       }
       if (this.a.N.j()) {
          this.a.l9();
       }
       return;
    }
}
