package com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment$a;
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
import com.yxcorp.gifshow.detail.player.panel.savetraffic.PhotoSaveTrafficControlFragment$c;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public final class PhotoSaveTrafficControlFragment extends BottomSheetFragment	// class@001632
{
    public PhotoSaveTrafficControlFragment$b z;
    public static final PhotoSaveTrafficControlFragment$a A;

    static {
       PhotoSaveTrafficControlFragment.A = new PhotoSaveTrafficControlFragment$a(null);
    }
    public void PhotoSaveTrafficControlFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoSaveTrafficControlFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d050a, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoSaveTrafficControlFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = p0.findViewById(R.id.save_traffic_wifi);
       a.o(view, "view.findViewById<TextVi¡­>\(R.id.save_traffic_wifi\)");
       TextPaint paint = view.getPaint();
       a.o(paint, "view.findViewById<TextVi¡­.save_traffic_wifi\).paint");
       paint.setFakeBoldText(true);
       view = p0.findViewById(R.id.save_traffic_mobile);
       a.o(view, "view.findViewById<TextVi¡­R.id.save_traffic_mobile\)");
       paint = view.getPaint();
       a.o(paint, "view.findViewById<TextVi¡­ave_traffic_mobile\).paint");
       paint.setFakeBoldText(true);
       SlipSwitchButton slipSwitchBu = p0.findViewById(R.id.save_traffic_switch_btn);
       slipSwitchBu.g(b.i(), false, false);
       slipSwitchBu.setOnSwitchChangeListener2(new PhotoSaveTrafficControlFragment$c(this));
       return;
    }
}
