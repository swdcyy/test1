package com.kwai.library.push.display.ButtonPush;
import com.kwai.library.push.display.Push;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.display.ButtonPush$commonDataBinder$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwai.library.push.display.PushDataBinder;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import iy6.j;
import com.kwai.library.push.display.ButtonPush$a;
import android.view.View$OnClickListener;

public final class ButtonPush extends Push	// class@0008a9
{
    public final p h;

    public void ButtonPush(InAppNotification p0){
       a.p(p0, "data");
       super(p0);
       this.h = s.c(ButtonPush$commonDataBinder$2.INSTANCE);
    }
    public void a(View p0,InAppNotification p1){
       a.p(p0, "contentView");
       a.p(p1, "data");
       this.n().a(p0, p1);
       TextView textView = p0.findViewById(R.id.btn);
       String btnTxt = p1.getBtnTxt();
       int i = 1;
       int i1 = 0;
       if (btnTxt != null) {
          btnTxt = (btnTxt.length() > 0)? 1: 0;
          if (btnTxt == i) {
          label_002f :
             if (!i) {
                i1 = 8;
             }
             textView.setVisibility(i1);
             if (i) {
                textView.setText(p1.getBtnTxt());
             }
             return;
          }
       }
       i = 0;
       goto label_002f ;
    }
    public View c(LayoutInflater p0){
       a.p(p0, "layoutInflater");
       View view = p0.inflate(R.layout.arg_RES_7f0d0883, null);
       Context context = view.getContext();
       a.o(context, "context");
       view.setPadding(0, j.b(context), 0, 0);
       view.findViewById(R.id.btn).setOnClickListener(new ButtonPush$a(this));
       return view;
    }
    public void h(){
       this.n().g();
    }
    public final PushDataBinder n(){
       return this.h.getValue();
    }
}
