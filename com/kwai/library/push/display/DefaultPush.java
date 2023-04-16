package com.kwai.library.push.display.DefaultPush;
import com.kwai.library.push.display.Push;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.display.DefaultPush$dataBinder$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwai.library.push.display.PushDataBinder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import iy6.j;

public final class DefaultPush extends Push	// class@0008ab
{
    public final p h;

    public void DefaultPush(InAppNotification p0){
       a.p(p0, "data");
       super(p0);
       this.h = s.c(DefaultPush$dataBinder$2.INSTANCE);
    }
    public void a(View p0,InAppNotification p1){
       a.p(p0, "contentView");
       a.p(p1, "data");
       this.n().a(p0, p1);
    }
    public View c(LayoutInflater p0){
       a.p(p0, "layoutInflater");
       View view = p0.inflate(R.layout.arg_RES_7f0d0882, null);
       if (view != null) {
          Context context = view.getContext();
          a.o(context, "context");
          view.setPadding(0, j.b(context), 0, 0);
       }
       return view;
    }
    public void h(){
       this.n().g();
    }
    public final PushDataBinder n(){
       return this.h.getValue();
    }
}
