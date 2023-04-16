package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2;
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
import xf6.d;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2 extends Lambda implements a	// class@001086
{
    public static final HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2.INSTANCE = new HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2();
    }
    public void HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2(){
       super(0);
    }
    public final int invoke(){
       int i;
       c obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          i = l.e("key_post_entrance_new_user_bubble_ab_config", 0);
          i = (i)? i - 1: a.t().a("bubbleStyleOptimization", 0);
       }else {
          i = a.t().a("bubbleStyleOptimization", 0);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
