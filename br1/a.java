package br1.a;
import br1.a$a;
import nsd.u;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveKwaiCDNImageView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import com.yxcorp.plugin.live.widget.LiveNumberTextView;

public final class a	// class@0003f8
{
    public final TextView a;
    public final LiveKwaiCDNImageView b;
    public final LiveMediumTextView c;
    public final LiveNumberTextView d;
    public final View e;
    public static final int f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
       a.f = a1.e(20.00f);
    }
    public void a(View p0){
       a.p(p0, "rootView");
       super();
       this.e = p0;
       this.a = p0.findViewById(0x7f0a21ac);
       this.b = p0.findViewById(0x7f0a21ad);
       this.c = p0.findViewById(0x7f0a21aa);
       this.d = p0.findViewById(0x7f0a21ab);
    }
}
