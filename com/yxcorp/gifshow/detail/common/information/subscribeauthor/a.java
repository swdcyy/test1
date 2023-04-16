package com.yxcorp.gifshow.detail.common.information.subscribeauthor.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.f;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import qp7.b;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import psb.c;
import brd.t;
import xy9.d;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.c;
import crd.b;

public final class a implements g	// class@001456
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.isFollowingOrFollowRequesting()) {
          SubscribeAuthorGuideManager.f.put(tb.x.getId(), Boolean.TRUE);
       }else if(tb.m != null){
          tb.b0();
       }
       if (SubscribeAuthorGuideManager.a(tb.t)) {
          b.a(0x1e7ef171).l(tb.t.getUserId(), false).subscribe(new d(tb), c.b);
       }
       return;
    }
}
