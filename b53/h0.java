package b53.h0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.p;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import v37.a;
import java.lang.CharSequence;
import java.lang.String;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import z12.x;
import b53.u0;

public final class h0 implements View$OnClickListener	// class@00030d
{
    public final p b;
    public final TextView c;

    public void h0(p p0,TextView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       h0 tb = this.b;
       h0 tc = this.c;
       tb.C.b(0);
       String str = (tc.getText() == null)? "": tc.getText().toString();
       u0.e(str, tb.s.Z2.a(), x.p(tb.getActivity()));
       return;
    }
}
