package com.yxcorp.gifshow.detail.helper.c$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.detail.helper.c;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import tkd.b;
import tkd.d;
import ayb.i;

public class c$a implements FollowHelper$a	// class@00156c
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,g p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0) {
          c.a(12, this.a.c.mEntity);
          c$a ta = this.a;
          d.a(0x4f878389).dO(ta.i, ta.c.getUserName());
       }
       return;
    }
}
