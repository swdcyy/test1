package com.kuaishou.network.testconfig.b;
import yf6.h;
import java.lang.Object;
import android.view.View;
import yf6.g;
import java.lang.String;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;
import android.widget.RelativeLayout;
import ao4.a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.button.SlipSwitchButton;
import o56.c;
import o56.a;
import xf6.l;
import ao4.b;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import android.widget.LinearLayout;
import com.kuaishou.network.testconfig.b$a;

public class b implements h	// class@000a3c
{
    public RelativeLayout b;
    public SlipSwitchButton c;
    public LinearLayout d;

    public void b(){
       super();
    }
    public void a(View p0,boolean p1){
       g.a(this, p0, p1);
    }
    public String getTitle(){
       return "ÍøÂç";
    }
    public View newPage(ViewGroup p0){
       boolean b;
       LinearLayout obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d15c9);
       RelativeLayout relativeLayo = view.findViewById(R.id.region_info_group);
       this.b = relativeLayo;
       relativeLayo.setOnClickListener(new a(p0.getContext()));
       this.c = view.findViewById(0x7f0a0d37);
       b = a.a().c();
       this.c.setSwitch(l.c("enable_api_region_scheduling", (b ^ 0x01)));
       this.c.setEnabled(b);
       if (b) {
          this.c.setOnSwitchChangeListener(new b(this));
       }
       obj = view.findViewById(R.id.ll_trigger_request_with_server_timing_header);
       this.d = obj;
       obj.setOnClickListener(new b$a(this));
       return view;
    }
    public void onConfirm(){
    }
}
