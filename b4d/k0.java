package b4d.k0;
import erd.g;
import b4d.n0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import uk5.b;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import xk5.c;
import xk5.a;
import android.view.ViewStub;
import android.widget.EditText;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.view.View;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.Math;

public final class k0 implements g	// class@000379
{
    public final n0 b;

    public void k0(n0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.F == null) {
          p0 = new b(tb.v.getEmotionPanelConfig(), tb.H, tb.t);
          tb.F = p0;
          p0.e(tb.E, tb.B);
       }
       if (!PatchProxy.applyVoid(null, tb, n0.class, "6")) {
          int i = tb.s.Hi();
          int i1 = 0;
          n0 c = tb.C;
          if (c != null && tb.G == 1) {
             i1 = c.getHeight();
             if (!i1) {
                i1 = n.c(tb.C.getContext(), 40.00f);
             }
             if (tb.p.mForceNewEditorStyle == null && tb.s.Bi().isEnableEmojiQuickSend()) {
                i = i + i1;
             }
          }
       label_006b :
          ViewGroup$LayoutParams layoutParams = tb.D.getLayoutParams();
          if (tb.v.isForceLandscape() || tb.D.getContext().getResources().getConfiguration().orientation == 2) {
             layoutParams.height = n.c(tb.D.getContext(), 201.50f);
          }else {
             int i2 = n.c(tb.D.getContext(), 307.50f);
             if (!tb.s.Bi().isEnableEmojiQuickSend()) {
                i2 = i2 - i1;
             }
             layoutParams.height = Math.max(i, i2);
          }
          tb.D.setLayoutParams(layoutParams);
       }
       return;
    }
}
