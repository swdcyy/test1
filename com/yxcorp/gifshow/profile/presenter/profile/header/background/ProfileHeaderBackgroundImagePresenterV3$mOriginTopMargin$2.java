package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Integer;

public final class ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2 extends Lambda implements a	// class@0014b2
{
    public static final ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2 INSTANCE;

    static {
       ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2.INSTANCE = new ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2();
    }
    public void ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2(){
       super(0);
    }
    public final int invoke(){
       c obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3$mOriginTopMargin$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       return ((n.A(obj.a()) + a1.d(0x7f070fdf)) + a1.d(0x7f0702cc));
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
