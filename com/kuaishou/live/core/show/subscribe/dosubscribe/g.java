package com.kuaishou.live.core.show.subscribe.dosubscribe.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.view.View$OnClickListener;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import rk2.x;
import rk2.v;
import o07.n;

public final class g implements PopupInterface$f	// class@0010e4
{
    public final View$OnClickListener b;
    public final Activity c;

    public void g(View$OnClickListener p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.g(p1, R.layout.arg_RES_7f0d09dc, p2, false);
       view.findViewById(R.id.title).setText(R.string.arg_RES_7f1028ab);
       view.findViewById(R.id.sub_title).setText(R.string.arg_RES_7f1028a9);
       view.findViewById(R.id.dialog_cancel_image_button).setOnClickListener(new x(p0));
       TextView textView = view.findViewById(R.id.open_button);
       textView.setText(R.string.arg_RES_7f1028aa);
       textView.setOnClickListener(new v(this.b, this.c, p0));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
