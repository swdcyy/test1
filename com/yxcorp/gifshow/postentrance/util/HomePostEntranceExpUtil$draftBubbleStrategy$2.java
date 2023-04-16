package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$draftBubbleStrategy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import xf6.l;
import o56.a;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class HomePostEntranceExpUtil$draftBubbleStrategy$2 extends Lambda implements a	// class@001081
{
    public static final HomePostEntranceExpUtil$draftBubbleStrategy$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$draftBubbleStrategy$2.INSTANCE = new HomePostEntranceExpUtil$draftBubbleStrategy$2();
    }
    public void HomePostEntranceExpUtil$draftBubbleStrategy$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$draftBubbleStrategy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = l.e("key_post_entrance_draft_remind_bubble_ab_config", -1);
       if (!a.d() || i < 0) {
          i = f.f("draftBubbleStrategy", 0);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
