package com.yxcorp.gifshow.widget.a;
import ea.a;
import tyc.g;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import lnc.a1;
import android.widget.TextView;
import tyc.a;
import android.view.View$OnClickListener;
import tyc.b;

public final class a implements a	// class@0018ec
{
    public final g a;

    public void a(g p0){
       this.a = p0;
    }
    public final void a(View p0){
       a ta = this.a;
       g f = (!TextUtils.x(ta.f))? ta.f: a1.p(R.string.arg_RES_7f103e89);
       p0.findViewById(R.id.title).setText(f);
       p0.findViewById(R.id.optionspicker).setBackgroundResource(R.drawable.arg_RES_7f081ac7);
       p0.findViewById(R.id.cancel).setOnClickListener(new a(ta));
       p0.findViewById(R.id.finish).setOnClickListener(new b(ta));
       return;
    }
}
