package com.yxcorp.gifshow.profile.util.t;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.ProfilePendantWearResponse;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.s;

public final class t implements g	// class@0015e5
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       int i = (p0.mWear != null)? 0x7f103ee4: 0x7f103ee1;
       i.d(R.style.arg_RES_7f11066a, a1.p(i));
       if (p0.mWear != null) {
          RxBus.f.b(s.a("PENDANT_DIALOG"));
       }
       return;
    }
}
