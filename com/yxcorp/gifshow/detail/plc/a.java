package com.yxcorp.gifshow.detail.plc.a;
import ok.h;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Boolean;
import e0a.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class a implements h	// class@001659
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       Objects.requireNonNull(p0);
       if (!p0.equals("showsProgressBarForGallery")) {
          if (!p0.equals("showSeekbarAtFirst")) {
             p0 = Boolean.FALSE;
          }else {
             p0 = PatchProxy.apply(null, null, j.class, "3");
             boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): f.a("disableShowSeekbarAtFirstFix") ^ 0x01;
             b = Boolean.valueOf(b);
          }
       }else {
          p0 = Boolean.TRUE;
       }
       return p0;
    }
}
