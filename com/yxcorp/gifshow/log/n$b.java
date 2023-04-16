package com.yxcorp.gifshow.log.n$b;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.lang.Object;
import java.lang.ref.WeakReference;

public class n$b	// class@001b20
{
    public String a;
    public ClientEvent$ClickEvent b;
    public WeakReference c;
    public CommonParams d;
    public ClientContentWrapper$ContentWrapper e;
    public boolean f;

    public void n$b(String p0,ClientEvent$ClickEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5){
       super();
       this.a = p0;
       this.b = p1;
       this.f = p3;
       this.e = p4;
       this.d = p5;
       this.c = new WeakReference(p2);
    }
}
