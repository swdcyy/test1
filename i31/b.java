package i31.b;
import lf3.g;
import i31.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveTopUserForbidden$SCTopUserForbiddenDialog;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.common.c;
import z12.x;
import u07.t$a;
import u07.f;
import i31.e;
import u07.u;
import i31.a;
import i31.d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;
import lf3.f;

public final class b implements g	// class@002819
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "4")) {
       }else if(p0 == null || !TextUtils.equals(p0.liveStreamId, tb.q.getLiveStreamId())){
          Activity activity = tb.getActivity();
          if (activity != null) {
             x.f(tb.s);
             t$a uoa = f.d(new t$a(activity));
             uoa.w0(false);
             uoa.B0(R.drawable.arg_RES_7f0805d2);
             uoa.V0(true);
             uoa.s0(e.b);
             uoa.X0(p0.title);
             uoa.M = 0x7f0812a7;
             uoa.N = new a(tb, p0, activity);
             uoa.z0(p0.desc);
             uoa.T0(p0.button);
             uoa.u0(new d(tb, p0));
             uoa.v(true);
             tb.s = uoa.Y(PopupInterface.a);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
