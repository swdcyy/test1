package com.yxcorp.gifshow.detail.common.information.cocreate.panel.a$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;

public class a$a implements FollowHelper$a	// class@00140c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,g p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$a.class, "1")) {
          return;
       }
       p1.a.fireSync();
       return;
    }
}
