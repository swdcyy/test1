package kgd.l1;
import a17.b$b;
import com.yxcorp.plugin.setting.entries.holder.m0$a;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.plugin.setting.entries.holder.m0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import e17.i;
import e17.s;
import k2b.e0;
import sgd.b;

public final class l1 implements b$b	// class@0017a1
{
    public final m0$a a;

    public void l1(m0$a p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       l1 ta = this.a;
       Objects.requireNonNull(ta);
       m0$a uoa = m0$a.class;
       int i = 0x7f1038e7;
       if (!p2) {
          if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs("message_privacy", Integer.valueOf(p2), ta, uoa, "6") && ta.r.e != 1)) {
             if (!p0.C(ta.getActivity())) {
                s.e(i);
             }else {
                b.k(ta.r.a, "WHO_CAN_MEASSAGE_ME", 6);
                ta.P8("message_privacy", (p2 + 1));
             }
          }
       }else {
          int i1 = 2;
          if (p2 == 1) {
             if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs("message_privacy", Integer.valueOf(p2), ta, uoa, "7") && ta.r.e != i1)) {
                if (!p0.C(ta.getActivity())) {
                   s.e(i);
                }else {
                   b.k(ta.r.a, "WHO_CAN_MEASSAGE_ME", 8);
                   ta.P8("message_privacy", (p2 + 1));
                }
             }
          }else if(p2 != i1 || (PatchProxy.isSupport(uoa) && (PatchProxy.applyVoidTwoRefs("message_privacy", Integer.valueOf(p2), ta, uoa, "8") || ta.r.e == 3))){
             if (!p0.C(ta.getActivity())) {
                s.e(i);
             }else {
                b.k(ta.r.a, "WHO_CAN_MEASSAGE_ME", 7);
                ta.P8("message_privacy", (p2 + 1));
             }
          }
       }
       return;
    }
}
