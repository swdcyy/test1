package com.kwai.nearby.local.presenter.v$b;
import q96.d;
import java.lang.Object;
import com.kwai.nearby.local.presenter.v$a;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import mc7.i;
import java.lang.Integer;
import java.lang.System;
import q96.c;

public class v$b implements d	// class@000fd8
{

    public void v$b(){
       super();
    }
    public void v$b(v$a p0){
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       if (PatchProxy.isSupport(v$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, v$b.class, "1")) {
          return;
       }
       if (!LocalConfigKeyHelper.i()) {
          return;
       }
       i.f(0);
       i.e(0);
       return;
    }
    public void onError(int p0,String p1){
       if (PatchProxy.isSupport(v$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, v$b.class, "2")) {
          return;
       }
       if (!LocalConfigKeyHelper.i()) {
          return;
       }
       if (p0 == 0x271d) {
          i.f(System.currentTimeMillis());
          i.e((i.b() + 1));
       }else {
          i.f(0);
          i.e(0);
       }
       return;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
