package com.kuaishou.live.core.show.stayinfo.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.stayinfo.b;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import java.lang.Object;

public class a extends Accessor	// class@0010b1
{
    public final LiveAudienceStayInfoDispatcherPresenter c;
    public final b d;

    public void a(b p0,LiveAudienceStayInfoDispatcherPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.W;
    }
}
