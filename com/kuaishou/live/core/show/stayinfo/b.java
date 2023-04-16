package com.kuaishou.live.core.show.stayinfo.b;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$b;
import com.kuaishou.live.core.show.stayinfo.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek2.h;
import mm8.a;

public final class b implements b	// class@0010b2
{

    public void b(){
       super();
    }
    public void a(a p0,Object p1){
       LiveAudienceStayInfoDispatcherPresenter$b uob = LiveAudienceStayInfoDispatcherPresenter$b.class;
       a uoa = new a(this, p1);
       try{
          p0.h(uob, uoa);
          p0.h(LiveAudienceStayInfoDispatcherPresenter.class, new h(this, p1));
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
