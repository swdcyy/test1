package fs2.v;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import java.util.Objects;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import fs2.e;
import fs2.d;
import java.lang.Enum;
import yx2.d;
import yx2.h;
import lnc.i3;
import qrd.l1;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import msd.l;
import e17.i;

public final class v implements View$OnClickListener	// class@0029bd
{
    public final VoicePartyKtvSingModeBottomDialogFragment b;

    public void v(VoicePartyKtvSingModeBottomDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       KtvSingMode mV;
       int i;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (p0.C(uoc.a())) {
          v tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, VoicePartyKtvSingModeBottomDialogFragment.class, "10")) {
             VoicePartyKtvSingModeBottomDialogFragment b = tb.B;
             if (b == null) {
                a.S("mvView");
             }
             if (b.isSelected()) {
                mV = KtvSingMode.MV;
             }else {
                b = tb.D;
                if (b == null) {
                   a.S("videoSelectView");
                }
                if (b.isSelected()) {
                   mV = KtvSingMode.VIDEO;
                }
             }
             VoicePartyKtvSingModeBottomDialogFragment k = tb.K;
             Objects.requireNonNull(k);
             if (!PatchProxy.applyVoidOneRefs(mV, k, e.class, "3")) {
                a.p(mV, "mode");
                i = d.a[mV.ordinal()];
                if (i != 1) {
                   if (i == 2) {
                      str = "VOICE_MODE";
                   }
                }else {
                   str = "VIDEO_MODE";
                }
                d uod = k.e("VOICE_PARTY_KTV_MODE_CONFIRM_BUTTON");
                i3 oi3 = i3.f();
                oi3.d("mode_type", str);
                str = oi3.e();
                a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
                uod.a(str);
                uod.f();
             }
             tb.dismissAllowingStateLoss();
             tb.L.invoke(mV);
          }
       }else {
          a.o(i.a(R.style.arg_RES_7f110668, 0x7f1038e7), "KSToast.applyStyle\(R.sty¡­ring.network_unavailable\)");
       }
       return;
    }
}
