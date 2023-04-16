package com.kwai.moved.components.util.c;
import io.reactivex.g;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import brd.v;
import kzc.d;
import android.app.Activity;
import u07.t$a;
import w07.n;
import w07.l;
import w07.i;
import ac7.d;
import u07.u;
import ac7.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class c implements g	// class@000f68
{
    public final FragmentActivity b;
    public final int c;

    public void c(FragmentActivity p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       d uod = new d(this.b);
       uod.S0(R.string.arg_RES_7f10017c);
       uod.Q0(R.string.arg_RES_7f10017b);
       uod.y0(this.c);
       uod.W0(R.string.arg_RES_7f100179);
       uod.a0(new n());
       uod.a0(new i());
       uod.u0(new d(p0));
       uod.J(new c(p0));
       uod.v(true);
       uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d02f0));
       uod.Y(PopupInterface.a);
    }
}
