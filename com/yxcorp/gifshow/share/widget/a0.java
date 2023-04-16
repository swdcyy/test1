package com.yxcorp.gifshow.share.widget.a0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import com.yxcorp.gifshow.share.widget.r;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.s;
import com.yxcorp.gifshow.share.widget.t;
import com.yxcorp.gifshow.share.widget.u;
import com.yxcorp.gifshow.share.widget.v;
import com.yxcorp.gifshow.share.widget.w;
import com.yxcorp.gifshow.share.widget.x;
import com.yxcorp.gifshow.share.widget.y;
import com.yxcorp.gifshow.share.widget.z;
import com.yxcorp.gifshow.share.widget.p;
import com.yxcorp.gifshow.share.widget.q;
import java.lang.Class;
import mm8.a;

public final class a0 implements b	// class@001d1a
{

    public void a0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("IM_SHARE_OBJECT", new r(this, p1));
       p0.i("SELECT_TARGETS_CALLBACK", new s(this, p1));
       p0.i("FRAGMENT", new t(this, p1));
       p0.i("ENABLE_IM_PANEL", new u(this, p1));
       p0.i("SHARE_LOGGER", new v(this, p1));
       p0.i("OPEN_IM_PANEL_EVENT", new w(this, p1));
       p0.i("SELECT_TARGETS_PARAMS", new x(this, p1));
       p0.i("SELECTED_TARGETS", new y(this, p1));
       p0.i("SHARE_COMMENT", new z(this, p1));
       p op = new p(this, p1);
       String str = "SHARE_FRAGMENT";
       try{
          p0.i(str, op);
          p0.h(ForwardGridSectionWithImPanelFragment$d.class, new q(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
