package f3a.l$g;
import android.view.View$OnClickListener;
import f3a.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.content.ClipboardManager;
import android.content.ClipData;
import lnc.a1;
import e17.i;
import e0a.j;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import u07.t$a;
import android.app.Activity;
import f3a.p;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import f3a.o;
import u07.u;
import f3a.q;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;

public final class l$g implements View$OnClickListener	// class@00228f
{
    public final l b;

    public void l$g(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       StringBuilder str1;
       Iterator iterator;
       Object[] objArray2;
       t$a uoa;
       l q;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, l$g.class, "1")) {
          return;
       }
       boolean i = 0x7f11066a;
       if (l.P8(this.b).isSelected()) {
          String str = this.b.V8(true);
          Object[] objArray = null;
          if (!TextUtils.isEmpty(str)) {
             Context context = this.b.getContext();
             Object[] systemServic = (context != null)? context.getSystemService("clipboard"): objArray;
             Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
             ClipData uClipData = ClipData.newPlainText("Label", str);
             try{
                systemServic.setPrimaryClip(uClipData);
                i.d(i, a1.p(R.string.arg_RES_7f1038f2));
                l$g tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, e0, "6")) {
                   i = j.b();
                   int i1 = 0;
                   Object[] objArray1 = new Object[i1];
                   String str2 = "OcrUiPresenter";
                   o.C().w(str2, "showPostEnterDialog enableCopyTextEnter:"+i, objArray1);
                   if (!i) {
                      objArray2 = new Object[i1];
                      o.C().w(str2, "showPostEnterDialog disable", objArray2);
                   }else if(!j.s()){
                      objArray2 = new Object[i1];
                      o.C().w(str2, "showPostEnterDialog button style", objArray2);
                   }else {
                      i = j.u();
                      l key = tb.w;
                      if (key == null) {
                         a.S("mFragment");
                      }
                      FragmentActivity activity = key.getActivity();
                      if (activity != null) {
                         uoa = new t$a(activity);
                         uoa.L(new p(R.layout.arg_RES_7f0d02f3));
                         uoa.X0(a1.p(R.string.arg_RES_7f100830));
                         uoa.z0(a1.p(R.string.arg_RES_7f104fbf));
                         uoa.B0(R.drawable.arg_RES_7f080621);
                         uoa.T0(a1.p(R.string.arg_RES_7f1047b2));
                         uoa.u0(new o(tb, i));
                         uoa.s0(q.b);
                      }else {
                         uoa = objArray;
                      }
                      String str3 = "COPY_SUCCESS_DIALOG";
                      if (!PatchProxy.applyVoidTwoRefs("3716331", str3, tb, e0, "16")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = str3;
                         l r = tb.w;
                         if (r == null) {
                            a.S("mFragment");
                         }
                         Objects.requireNonNull(r, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
                         l ol1 = r;
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         q = tb.q;
                         if (q == null) {
                            a.S("mPhoto");
                         }
                         uContentPack.photoPackage = w1.f(q.mEntity);
                         u1.D0("3716331", ol1, 4, uElementPack, uContentPack, null);
                      }
                      if (uoa != null) {
                         t ot = uoa.b0();
                         if (ot != null) {
                            ot.Z();
                         }
                      }
                   }
                }
             }catch(java.lang.SecurityException e0){
             }
          }
       }else {
          a.o(i.d(i, a1.p(R.string.arg_RES_7f103a72)), "KSToast.applyStyle\(R.sty¡­g.ocr_select_text_first\)\)");
       }
       return;
    }
}
