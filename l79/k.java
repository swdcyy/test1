package l79.k;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import r79.a;
import q79.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o79.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import u07.t$a;
import android.app.Activity;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import j79.l0;

public final class k implements Observer	// class@002cc0
{
    public final AlbumSelectedContainer b;

    public void k(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k.class, "1")) {
       }else {
          k tb = this.b;
          int i = p0.getFirst().intValue();
          p0 = p0.getSecond();
          Objects.requireNonNull(tb);
          AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
          if (!PatchProxy.isSupport(uAlbumSelect) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, tb, uAlbumSelect, "33")) {
             Log.b("MediaSelectManager", "onSelectItemAdd: error="+i+" message="+p0);
             AlbumSelectedContainer u = tb.u;
             if (u == null) {
                a.S("mViewModel");
             }
             a f = u.s0().f;
             if (i) {
                if (!PatchProxy.applyVoidTwoRefs(f, p0, tb, uAlbumSelect, "32") && !TextUtils.x(p0)) {
                   Integer integer = (f != null)? Integer.valueOf(f.a): null;
                   t$a uoa = 1;
                   if (integer != null && integer.intValue() == uoa) {
                      FragmentActivity activity = tb.U.getActivity();
                      if (activity != null) {
                         uoa = new t$a(activity);
                         uoa.W0(R.string.arg_RES_7f101892);
                         if (p0 == null) {
                            a.L();
                         }
                         uoa.z0(p0);
                         uoa.S0(R.string.arg_RES_7f1018a3);
                         f.e(uoa).Y(PopupInterface.a);
                      }
                   }else if(integer != null && !integer.intValue()){
                      if (p0 == null) {
                         a.L();
                      }
                      s.h(p0);
                   }else if(p0 == null){
                      a.L();
                   }
                   s.h(p0);
                }
             label_00d3 :
                if (i == -1 && (tb.N != null && tb.U.Bh() != null)) {
                   tb.N = false;
                   MediaPreviewFragment mediaPreview = tb.U.Bh();
                   if (mediaPreview != null) {
                      l0 ol0 = mediaPreview.gh();
                      if (ol0 != null) {
                         ol0.P0(false);
                      }
                   }
                   AlbumSelectedContainer.c0(tb, true, true, false, false, 12, null);
                   tb.d0();
                }
             }
          }
       label_0104 :
          PatchProxy.onMethodExit(k.class, "1");
       }
       return;
    }
}
