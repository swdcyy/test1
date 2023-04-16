package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$a;
import erd.g;
import java.lang.Object;
import ja6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k74.b;

public final class LiveSubscribePresenter$a implements g	// class@001ad4
{
    public static final LiveSubscribePresenter$a b;

    static {
       LiveSubscribePresenter$a.b = new LiveSubscribePresenter$a();
    }
    public void LiveSubscribePresenter$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePresenter$a.class, "1")) {
       }else if(!TextUtils.x(p0.a) && TextUtils.n(p0.c, "FOLLOW")){
          int i = (p0.b())? 1: 2;
          b.b(p0.a, i);
       }
       return;
    }
}
