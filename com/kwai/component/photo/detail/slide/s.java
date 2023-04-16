package com.kwai.component.photo.detail.slide.s;
import ok.x;
import java.lang.Object;
import le5.f;
import xf6.d;
import java.lang.String;
import com.kwai.framework.abtest.f;
import java.lang.Boolean;

public final class s implements x	// class@000aa7
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = d.e();
       if (i != 1) {
          uBoolean = (i != 2 && i != 3)? Boolean.valueOf(f.a("wechat_Move_Down")): Boolean.TRUE;
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
