package cl9.u2;
import erd.g;
import cl9.y2;
import java.lang.Object;
import nk9.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import yk9.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Number;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import u07.t$a;
import cl9.s2;
import u07.x;
import u07.f;
import cl9.r2;
import u07.u;
import cl9.x2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import gk9.c;
import brd.t;
import gk9.b;
import cjd.e;
import erd.o;
import cl9.v2;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class u2 implements g	// class@000671
{
    public final y2 b;

    public void u2(y2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String obj;
       t obj1;
       int i;
       u2 tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y2 oy2 = y2.class;
       if (p0 != null && TextUtils.n(tb.q.getId(), p0.a.getId())) {
          Object[] objArray = null;
          if (p0.b != null) {
             p0 = p0.a;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, oy2, "6") && p0 != null) {
                tb.r.k("TOP_COMMENT", p0, tb.getActivity().N2());
                obj = PatchProxy.apply(objArray, tb, oy2, "7");
                boolean b = true;
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   oy2 = tb.s;
                   obj1 = PatchProxy.applyOneRefs(oy2, objArray, d.class, "23");
                   if (obj1 != patchProxyRe) {
                      i = obj1.intValue();
                   }else {
                      i = oy2.q().getCount();
                      int i1 = 0;
                      int i2 = 0;
                      while (i2 < i) {
                         QComment item = oy2.q().getItem(i2);
                         QComment mType = item.mType;
                         if (mType != b && (mType == 10 && item.isTopComment())) {
                            i1 = i1 + 1;
                         }
                         i2 = i2 + 1;
                      }
                      i = i1;
                   }
                   if (i < b) {
                      b = false;
                   }
                }
                if (b) {
                   t$a uoa = new t$a(tb.getActivity());
                   uoa.W0(R.string.arg_RES_7f104287);
                   uoa.y0(R.string.arg_RES_7f104289);
                   uoa.Q0(R.string.cancel);
                   uoa.S0(R.string.arg_RES_7f103a83);
                   uoa.M0(new s2(tb, p0));
                   p0 = f.e(uoa);
                   p0.u0(new r2(tb));
                   p0.t0(new r2(tb));
                   p0.Y(new x2(tb));
                }else {
                   tb.R8(p0, false);
                }
             }
          }else {
             p0 = p0.a;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, oy2, "11") && p0 != null) {
                tb.r.k("CANCEL_TOP_COMMENT", p0, tb.getActivity().N2());
                obj = p0.getPhotoId();
                String id = p0.getId();
                obj1 = PatchProxy.applyTwoRefs(obj, id, objArray, c.class, "18");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = c.f().i(obj, id);
                }
                tb.X7(obj1.map(new e()).subscribe(new v2(tb, p0), Functions.e));
             }
          }
       }
       return;
    }
}
