package b53.d0;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.barrage.l;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class d0 implements View$OnLayoutChangeListener	// class@000305
{
    public final l b;
    public final ViewGroup c;

    public void d0(l p0,ViewGroup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       d0 tb = this.b;
       d0 tc = this.c;
       tc.removeOnLayoutChangeListener(tb.F);
       a uoa = new a(tb.getActivity());
       uoa.K0(KwaiBubbleOption.g);
       uoa.F0(a1.p(R.string.arg_RES_7f100764));
       uoa.o0(tb.y);
       uoa.C0(a1.e(4.00f));
       uoa.T(3000);
       uoa.C(tc);
       uoa.E(false);
       tb.E = p.m(uoa);
    }
}
