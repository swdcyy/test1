package cy0.a;
import android.view.View$OnClickListener;
import cy0.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.merchant.LiveMerchantLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import fy0.b$b;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import by0.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class a implements View$OnClickListener	// class@001e9f
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       a tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, tb, uoe, "7")) {
       }else {
          b.P(LiveMerchantLogTag.CUSTOMER_SERVICE.appendTag("LiveAudienceMerchantCSFloatEditorPresenter"), "toggleCustomerServiceBtn");
          e y = tb.y;
          y.setSelected((y.mIsSelected ^ 1));
          tb.q.h((tb.y.mIsSelected ^ 1));
          y = tb.r;
          String str = (tb.y.mIsSelected != null)? a1.p(R.string.arg_RES_7f103485): tb.q.g();
          y.setHint(str);
          y = tb.s;
          if (y != null) {
             i = (tb.y.mIsSelected != null)? 0: 8;
             y.setVisibility(i);
          }
          y = tb.t;
          if (y != null) {
             i = (tb.y.mIsSelected != null)? 0x7f080ebd: 0x7f080ebe;
             y.setImageResource(i);
          }
          CustomerServiceCommentInfo mIsSelected = tb.y.mIsSelected;
          ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(mIsSelected), liveStreamPa, null, uoa, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "BUTTON_ASK_CS";
             i3 oi3 = i3.f();
             String str1 = (mIsSelected != null)? "ASK_CS": "CANCEL_ASK_CS";
             oi3.d("clickType", str1);
             oi3.c("entrance_position", Integer.valueOf(1));
             uElementPack.params = oi3.e();
             a.b(liveStreamPa, uElementPack);
          }
          if (!PatchProxy.applyVoid(null, tb, uoe, "11") && !a.x()) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("live_audience_merchant_editor_cs_clicked", 1);
             g.a(uEditor);
          }
       }
       return;
    }
}
