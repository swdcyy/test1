package h22.e;
import msd.l;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import h22.a;
import t02.a0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import e17.i;
import java.lang.Boolean;

public final class e implements l	// class@002bf3
{
    public final LiveActivityRedPacketFragment$b b;

    public void e(LiveActivityRedPacketFragment$b p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (!TextUtils.isEmpty(p0)) {
          LiveActivityRedPacketFragment$b z = tb.z;
          a b1 = z.b;
          if (b1 != null) {
             b = b1.p2.r4(p0, tb.getContext());
          }else if(z.a != null){
             i.a(R.style.arg_RES_7f11066a, 0x7f1039a5);
          }
       }
       return Boolean.valueOf(b);
    }
}
