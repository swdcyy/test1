package com.yxcorp.gifshow.follow.stagger.data.e;
import erd.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.follow.stagger.data.i;
import gha.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public final class e implements g	// class@001174
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoid(null, null, p.class, "11")) {
       }else {
          c.j(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("FollowTabNotify"), "clearFollowTabShowHead", "type", "image");
          p.a = "";
       }
       return;
    }
}
