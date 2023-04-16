package b77.e$b;
import erd.g;
import b77.e;
import java.lang.Object;
import com.kwai.live.gzone.api.model.LiveGzoneMedalInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mkc.b;
import android.view.View;
import mkc.c;
import java.util.List;
import com.kwai.live.gzone.api.model.LiveGzoneMedalInfoResponse$a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import b77.b;
import android.view.View$OnClickListener;
import b77.c;
import b77.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import dz1.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class e$b implements g	// class@0003d3
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i2;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
       }else {
          e$b tb = this.b;
          Objects.requireNonNull(tb);
          Object[] objArray = null;
          int i = 0;
          int i1 = 1;
          if (!PatchProxy.applyVoid(objArray, tb, uoe, "11")) {
             b[] uobArray = new b[i1];
             uobArray[i] = b.g;
             c.d(tb.C, uobArray);
             i2 = 8;
             tb.C.setVisibility(i2);
             tb.D.setVisibility(i2);
          }
          this.b.v = p0.getMedalOptions();
          e v = this.b.v;
          if (v != null) {
             i2 = 2;
             if (v.size() == i2) {
                tb = this.b;
                tb.r.P(tb.v.get(i).mIcon);
                tb = this.b;
                tb.s.P(tb.v.get(i1).mIcon);
                tb = this.b;
                tb.t.setText(tb.v.get(i).mName);
                tb = this.b;
                tb.u.setText(tb.v.get(i1).mName);
                if (TextUtils.isEmpty(p0.getChooseId())) {
                   this.b.V8(i2);
                   tb = this.b;
                   LiveGzoneMedalInfoResponse$a mId = tb.v.get(i).mId;
                   LiveGzoneMedalInfoResponse$a mId1 = this.b.v.get(i1).mId;
                   if (!PatchProxy.applyVoidTwoRefs(mId, mId1, tb, uoe, "12")) {
                      tb.y.setEnabled(i1);
                      tb.w.setEnabled(i1);
                      tb.x.setEnabled(i1);
                      tb.w.setOnClickListener(new b(tb));
                      tb.x.setOnClickListener(new c(tb));
                      tb.y.setOnClickListener(new g(tb, mId, mId1));
                   }
                }else {
                   this.b.V8(3);
                   if (TextUtils.equals(p0.getChooseId(), this.b.v.get(i).mId)) {
                      this.b.P8();
                   }else {
                      this.b.R8();
                   }
                }
             }
          }
          int i3 = TextUtils.isEmpty(p0.getChooseId()) ^ i1;
          ClientContent$LiveStreamPackage liveStreamPa = this.b.p.a();
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i3), liveStreamPa, objArray, uoa, "22")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MEDAL_PANEL";
             i3 oi3 = i3.f();
             i3 = (i3)? "received": "not_received";
             oi3.d("panel_stasus", i3);
             uElementPack.params = oi3.e();
             i3 = new ClientContent$ContentPackage();
             i3.liveStreamPackage = liveStreamPa;
             u1.u0(3, uElementPack, i3);
          }
       }
       return;
    }
}
