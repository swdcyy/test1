package kgd.c2;
import a17.b$b;
import com.yxcorp.plugin.setting.entries.holder.v0$a;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import e17.i;
import e17.s;
import com.yxcorp.plugin.setting.entries.holder.v0;
import android.widget.TextView;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;

public final class c2 implements b$b	// class@00177e
{
    public final v0$a a;

    public void c2(v0$a p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       c2 ta = this.a;
       Objects.requireNonNull(ta);
       v0$a uoa = v0$a.class;
       if (!p2) {
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, uoa, "5")) {
             if (!p0.C(ta.getActivity())) {
                s.e(R.string.arg_RES_7f1038e7);
             }else {
                ta.r.e.o(ta.p, "not_public_collect", false, null, false);
                ta.R8(p2);
                b.k(ta.r.a, "WHO_CAN_VIEW_MYCOLLECT", 6);
             }
          }
       }else if(p2 != 1 || (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), ta, uoa, "6"))){
          if (!p0.C(ta.getActivity())) {
             s.e(R.string.arg_RES_7f1038e7);
          }else {
             ta.r.e.o(ta.p, "not_public_collect", true, null, false);
             ta.R8(p2);
             b.k(ta.r.a, "WHO_CAN_VIEW_MYCOLLECT", 5);
          }
       }
       return;
    }
}
