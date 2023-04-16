package cd9.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import lnc.a1;
import android.view.ViewStub;
import cd9.i;
import android.view.View$OnTouchListener;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutPanel;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import com.kwai.robust.PatchProxyResult;
import h80.h;
import h80.k;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.content.Context;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class e implements View$OnClickListener	// class@0005a4
{
    public final DuetLayoutManager b;

    public void e(DuetLayoutManager p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       DuetLayoutManager a;
       DuetLayoutManager$LayoutMode uP;
       DuetLayoutManager$LayoutMode dOWN;
       DuetLayoutManager$LayoutMode iN;
       e tb = this.b;
       Objects.requireNonNull(tb);
       DuetLayoutManager uDuetLayoutM = DuetLayoutManager.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, tb, uDuetLayoutM, str)) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("same_frame_origin_layout_tip", true);
          g.a(uEditor);
          a = tb.A;
          if (a != null) {
             a.setVisibility(8);
          }
          if (tb.u == null) {
             if (!PatchProxy.isSupport(uDuetLayoutM) || (PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb, uDuetLayoutM, "6") || (a1.i(tb.e) && tb.u == null))) {
                ViewStub viewStub = tb.e.findViewById(R.id.sameframe_container_stub);
                int i = 0x7f0a36e7;
                View view = tb.e.findViewById(i);
                View view1 = tb.e.findViewById(R.id.sameframe_container);
                if (viewStub != null) {
                   viewStub = viewStub.inflate();
                   view1 = viewStub.findViewById(R.id.sameframe_container);
                   view = viewStub.findViewById(i);
                   view.setOnTouchListener(new i(tb));
                }
                int i1 = 0;
                n.Y(view1, i1, i1);
                n.Y(view, i1, i1);
                DuetLayoutPanel uDuetLayoutP = new DuetLayoutPanel();
                tb.u = uDuetLayoutP;
                if (!PatchProxy.applyVoidOneRefs(tb, uDuetLayoutP, DuetLayoutPanel.class, str)) {
                   uDuetLayoutP.p = tb;
                   uDuetLayoutP.q = tb.i2();
                   DuetLayoutManager$LayoutMode[] layoutModeAr = PatchProxy.apply(null, tb, uDuetLayoutM, "11");
                   if (layoutModeAr != PatchProxyResult.class) {
                   }else {
                      h oh = k.c();
                      int[] ointArray = 5;
                      if (tb.w != null) {
                         uP = DuetLayoutManager$LayoutMode.UP;
                         dOWN = DuetLayoutManager$LayoutMode.DOWN;
                         iN = DuetLayoutManager$LayoutMode.IN;
                         if (oh != null && (oh.a() != null && oh.a().length >= ointArray)) {
                            uP.mIconLargeRes = oh.a()[i1];
                            dOWN.mIconLargeRes = oh.a()[1];
                            iN.mIconLargeRes = oh.a()[4];
                         }
                      label_00e8 :
                         layoutModeAr = new DuetLayoutManager$LayoutMode[]{uP,dOWN,iN};
                      }else {
                         uP = DuetLayoutManager$LayoutMode.LEFT;
                         dOWN = DuetLayoutManager$LayoutMode.RIGHT;
                         iN = DuetLayoutManager$LayoutMode.IN;
                         if (oh != null && (oh.a() != null && oh.a().length >= ointArray)) {
                            uP.mIconLargeRes = oh.a()[2];
                            dOWN.mIconLargeRes = oh.a()[3];
                            iN.mIconLargeRes = oh.a()[4];
                         }
                      label_011e :
                         layoutModeAr = new DuetLayoutManager$LayoutMode[]{uP,dOWN,iN};
                      }
                   }
                   uDuetLayoutP.r = layoutModeAr;
                }
                e uoe = tb.k2().beginTransaction();
                uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
                uoe.v(R.id.sameframe_container, tb.u);
                uoe.m();
                RxBus.f.b(new PanelShowEvent(CameraPageType.VIDEO, PanelShowEvent$PanelType.SAME_FRAME_LAYOUT_PANEL, tb.e, true));
                if (!PatchProxy.applyVoid(null, null, CameraLogger.class, "39")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.type = 1;
                   uElementPack.action = 406;
                   uElementPack.name = "click_layout";
                   u1.u(true, uElementPack, new ClientContent$ContentPackage());
                }
             }
          }else {
             tb.m2(true, true);
          }
       }
    label_0177 :
       return;
    }
}
