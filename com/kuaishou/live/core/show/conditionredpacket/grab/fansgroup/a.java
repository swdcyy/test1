package com.kuaishou.live.core.show.conditionredpacket.grab.fansgroup.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import p91.m;
import z52.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import tw1.d;
import c62.a;
import android.view.View$OnClickListener;
import android.os.Message;
import lp3.e;
import ry1.b;
import lp3.c;
import u52.y;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import java.lang.CharSequence;

public class a extends e	// class@000a94
{
    public boolean I;
    public static String sLivePresenterClassName = "LiveConditionRedPacketFansGroupCurrentInfoBottomLayoutPresenter";

    public void a(){
       super();
       this.I = true;
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f101fd5);
    }
    public void X8(LiveConditionRedPacketInfo p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       if (!this.u.e()) {
          super.X8(p0);
       }else if(!a.a(p0)){
          this.B.setVisibility(8);
          this.C.setVisibility(8);
          return;
       }else if(this.I != null){
          this.I = false;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
             d.i(this.u.a(), p0.c, 9);
          }
       }
       this.B.setVisibility(false);
       this.C.setVisibility(false);
       this.B.setText(R.string.arg_RES_7f1040c4);
       this.B.setOnClickListener(new a(this, p0));
       return;
    }
    public void Y8(LiveConditionRedPacketInfo p0,Message p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (this.u.e()) {
          super.Y8(p0, p1);
          return;
       }else if(!y.f(this.u.t5().a(b.class))){
          super.Y8(p0, p1);
       }else {
          this.D.setVisibility(0);
          if (Boolean.TRUE.equals(p0.q.getValue())) {
             this.D.setText(a1.p(R.string.arg_RES_7f101fdb));
          }else {
             this.D.setText(a1.p(R.string.arg_RES_7f101fce));
          }
       }
       return;
    }
}
