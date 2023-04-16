package ax8.a;
import erd.g;
import ax8.e;
import java.lang.Object;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$EntranceInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import java.util.List;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogItemInfo;
import java.util.Arrays;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.graphics.Typeface;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import lnc.a1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.a;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class a implements g	// class@000329
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mShareBusinessLinkInfo;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "9")) {
       }else {
          Object[] objArray = new Object[0];
          a.b().w("ShareProducerPresenter", "updateBusinessLinkInfo\(\) called with: info = ["+p0+"]", objArray);
          tb.B = p0;
          if (p0 == null || !p0.hasLinkInfo()) {
             tb.q.setVisibility(8);
          }else {
             tb.q.setVisibility(0);
             ShareBusinessLinkInfo mEntrance = p0.mEntrance;
             if (mEntrance != null) {
                tb.x.setText(mEntrance.mTitle);
                tb.y.setText(p0.mEntrance.mPlaceHolder);
             }
             String[] stringArray = new String[p0.mDialog.mItems.size()];
             for (int i = 0; i < p0.mDialog.mItems.size(); i = i + 1) {
                stringArray[i] = p0.mDialog.mItems.get(i).mEntryId;
             }
             String str = Arrays.toString(stringArray);
             Drawable uDrawable = null;
             if (!PatchProxy.applyVoidOneRefs(str, uDrawable, uoe, "11")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RELATE_SERVER_CARD";
                i3 oi3 = i3.f();
                oi3.d("sub_type", str);
                uElementPack.params = oi3.e();
                u1.u0(3, uElementPack, uDrawable);
             }
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "10")) {
                float f = 16.00f;
                Typeface typeface = Typeface.defaultFromStyle(0);
                int color = a.b().getResources().getColor(R.color.arg_RES_7f061641);
                int i1 = a1.d(R.dimen.arg_RES_7f0702b8);
                Drawable drawable = ContextCompat.getDrawable(a.b(), R.drawable.arg_RES_7f081f88);
                if (drawable != null) {
                   uDrawable = a.r(drawable);
                   a.n(uDrawable, ContextCompat.getColor(a.b(), R.color.arg_RES_7f0606b9));
                }
                if (tb.z != null) {
                   p0 = p0.mEntrance;
                   if (p0 != null) {
                      p0 = (k.d())? p0.mDarkIcon: p0.mIcon;
                      if (!TextUtils.x(p0)) {
                         tb.z.L(p0);
                      }
                   }
                }
                if (tb.A instanceof ImageView) {
                   p0 = ContextCompat.getDrawable(a.b(), R.drawable.arg_RES_7f081cb5);
                   if (p0 != null) {
                      uDrawable = a.r(p0);
                      a.n(uDrawable, ContextCompat.getColor(a.b(), R.color.arg_RES_7f0616aa));
                   }
                }
                p0 = new View[]{tb.z};
                n.Z(0, p0);
                tb.x.setTextSize(2, f);
                tb.x.setTypeface(typeface);
                tb.y.setTextColor(color);
                p0 = tb.A.getLayoutParams();
                if (p0 instanceof ViewGroup$MarginLayoutParams) {
                   p0.leftMargin = 0;
                   p0.width = i1;
                   p0.height = i1;
                   tb.A.requestLayout();
                }
                p0 = tb.A;
                if (p0 instanceof ImageView && uDrawable != null) {
                   p0.setImageDrawable(uDrawable);
                }
             }
          }
       }
       return;
    }
}
