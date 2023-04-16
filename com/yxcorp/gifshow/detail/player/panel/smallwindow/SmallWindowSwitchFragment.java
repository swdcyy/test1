package com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowSwitchFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowSwitchFragment$a;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import android.widget.TextView;
import android.text.TextPaint;
import com.kwai.library.widget.button.SlipSwitchButton;
import i3a.b;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public final class SmallWindowSwitchFragment extends BottomSheetFragment	// class@001638
{
    public SlipSwitchButton$a z;
    public static final SmallWindowSwitchFragment$a A;

    static {
       SmallWindowSwitchFragment.A = new SmallWindowSwitchFragment$a(null);
    }
    public void SmallWindowSwitchFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SmallWindowSwitchFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0513, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SmallWindowSwitchFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = p0.findViewById(R.id.small_window_switch_title);
       a.o(view, "view.findViewById<TextVi¡­mall_window_switch_title\)");
       TextPaint paint = view.getPaint();
       a.o(paint, "view.findViewById<TextVi¡­indow_switch_title\).paint");
       paint.setFakeBoldText(true);
       SlipSwitchButton slipSwitchBu = p0.findViewById(R.id.small_window_switch_btn);
       slipSwitchBu.g(b.j(), false, false);
       SmallWindowSwitchFragment tz = this.z;
       if (tz == null) {
          a.S("mSwitchChangeListener");
       }
       slipSwitchBu.setOnSwitchChangeListener2(tz);
       return;
    }
}
