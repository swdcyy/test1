package com.kuaishou.live.core.show.myfollow.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$b;
import java.lang.Object;
import android.widget.TextView;
import lnc.a1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public final class a implements KwaiEmptyStateView$b	// class@000d48
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(TextView p0){
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607c6));
       b uob = new b();
       uob.v(a1.a(R.color.arg_RES_7f0604d9));
       uob.g(KwaiRadiusStyles.FULL);
       p0.setBackground(uob.a());
    }
}
