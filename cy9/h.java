package cy9.h;
import y8c.g;
import cy9.h$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy9.i;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cy9.o;
import tkd.b;
import tkd.d;
import nl9.k;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import lnc.a1;
import cy9.g;
import ml8.c;

public final class h extends g	// class@001e3a
{
    public final QPhoto w;
    public static final h$a x;

    static {
       h.x = new h$a(null);
    }
    public void h(QPhoto p0){
       a.p(p0, "mPhoto");
       super();
       this.w = p0;
    }
    public f$b d1(f$b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new i(this.w);
    }
    public int f0(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       CoCreateInfo$CoCreateMember uCoCreateMem = this.N0(p0);
       uCoCreateMem = (uCoCreateMem != null)? uCoCreateMem.mRole: null;
       uCoCreateMem = (uCoCreateMem == null)? 2: 1;
       return uCoCreateMem;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 != 2) {
          obj.U7(new o());
          obj.U7(d.a(0x61c18dc4).ET());
          a.m(p0);
          view = a.a(p0.getContext(), R.layout.arg_RES_7f0d06a5);
          a.o(view, "KwaiLayoutInflater.infla¡­item_my_co_creator_panel\)");
          view.setLayoutParams(new ViewGroup$LayoutParams(n.z(p0.getContext()), a1.d(R.dimen.arg_RES_7f070337)));
       }else {
          a.m(p0);
          view = a.a(p0.getContext(), R.layout.arg_RES_7f0d0794);
          a.o(view, "KwaiLayoutInflater.infla¡­_invitation_to_be_accept\)");
          obj.U7(new g());
          view.setLayoutParams(new ViewGroup$LayoutParams(n.z(p0.getContext()), a1.d(R.dimen.arg_RES_7f07030f)));
       }
       return new f(view, obj);
    }
}
