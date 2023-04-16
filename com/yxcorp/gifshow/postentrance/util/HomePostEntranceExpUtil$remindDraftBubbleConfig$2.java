package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$remindDraftBubbleConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jzb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class HomePostEntranceExpUtil$remindDraftBubbleConfig$2 extends Lambda implements a	// class@001087
{
    public static final HomePostEntranceExpUtil$remindDraftBubbleConfig$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$remindDraftBubbleConfig$2.INSTANCE = new HomePostEntranceExpUtil$remindDraftBubbleConfig$2();
    }
    public void HomePostEntranceExpUtil$remindDraftBubbleConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$remindDraftBubbleConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("postEntranceDraftBubbleConfig", c.class, new c());
    }
}
