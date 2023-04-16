package f62.i;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import f62.i$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u52.t;
import j62.a;
import java.lang.Integer;

public class i extends c	// class@0028b6
{
    public UserInfo p;
    public t q;
    public a r;
    public int s;
    public LiveUserView t;
    public TextView u;
    public static String sLivePresenterClassName = "LiveConditionRedPacketShareRecyclerUsersPresenter";

    public void i(){
       super();
    }
    public void E8(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "3")) {
          return;
       }
       i tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, oi, "4")) {
          i tt = this.t;
          if (tt != null) {
             tt.p0(tp, HeadImageSize.SMALL, false);
          }
       }
       UserInfo mName = this.p.mName;
       if (!PatchProxy.applyVoidOneRefs(mName, this, oi, "5")) {
          oi = this.u;
          if (oi != null) {
             oi.setText(mName);
          }
       }
       this.t.setOnClickListener(new i$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1ba4);
       this.u = m1.f(p0, 0x7f0a1ba5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(UserInfo.class);
       this.q = this.r8("ShareRecyclerContext");
       this.r = this.r8("ShareRecyclerRedPacketKey");
       this.s = this.r8("ADAPTER_POSITION").intValue();
       return;
    }
}
