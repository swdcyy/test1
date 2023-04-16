package com.kuaishou.live.core.show.conditionredpacket.grab.normal.e;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import p91.m;
import java.lang.Long;
import java.lang.CharSequence;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import lnc.a1;
import z52.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.d;
import ok.h;
import tw1.d;
import e62.h;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e extends b	// class@000a9d
{
    public LiveConditionRedPacketNormalCurrentInfoDialogFragment$a H;
    public boolean I;
    public static String sLivePresenterClassName = "LiveConditionRedPacketNormalCurrentInfoBottomLayoutPresenter";

    public void e(){
       super();
       this.I = true;
    }
    public boolean R8(LiveConditionRedPacketInfo p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return this.t.e();
    }
    public void S8(long p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, e.class, "3")) {
          return;
       }
       b tF = this.F;
       if (tF == null) {
          return;
       }
       this.b9(tF);
       return;
    }
    public void V8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.b9(p0);
       return;
    }
    public void X8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.B.setText(p0.k);
       return;
    }
    public void Y8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       this.B.setVisibility(0);
       if (p0.s.getValue() == null) {
          return;
       }
       this.B.setText(a1.q(R.string.arg_RES_7f1025f3, p0.s.getValue().intValue()));
       return;
    }
    public final void b9(LiveConditionRedPacketInfo p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "7")) {
          return;
       }
       if (!this.t.e()) {
          return;
       }
       Object[] objArray = null;
       if (a.a(p0)) {
          this.z.setText(R.string.arg_RES_7f1040c4);
          this.z.setVisibility(0);
          if (!PatchProxy.applyVoid(objArray, this, uoe, "9") && this.I != null) {
             this.I = false;
             d.i(this.t.a(), Optional.fromNullable(this.F).transform(d.b).or(""), 16);
          }
          this.z.setOnClickListener(new h(this, p0));
          this.A.setVisibility(0);
       }else {
          this.z.setVisibility(8);
          this.z.setOnClickListener(objArray);
          this.A.setVisibility(8);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.s8(LiveConditionRedPacketNormalCurrentInfoDialogFragment$a.class);
       return;
    }
}
