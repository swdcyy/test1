package com.yxcorp.gifshow.activity.info.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.activity.info.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.activity.info.ActivityInfoStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import flb.a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.util.Collections;
import brd.t;
import flb.c;
import erd.g;
import t45.d;
import brd.z;
import flb.d;
import flb.e;
import crd.b;

public class b extends ConfigAutoParseJsonConsumer	// class@001352
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          a e = a.e;
          ActivityInfoStartupCommonPojo mActivityInf = p0.mActivityInfoListVersion;
          p0 = p0.mActivityInfoList;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidTwoRefs(mActivityInf, p0, e, a.class, "4")) {
             String str = e.b();
             if (p0 != null || !TextUtils.n(mActivityInf, str)) {
                if (p0 == null) {
                   p0 = Collections.emptyList();
                }
                t.just(p0).doOnNext(c.b).observeOn(d.c).subscribe(new d(mActivityInf), e.b);
             }
          }
       }
       return;
    }
}
