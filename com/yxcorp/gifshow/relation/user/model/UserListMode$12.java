package com.yxcorp.gifshow.relation.user.model.UserListMode$12;
import com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.lang.String;
import com.yxcorp.gifshow.relation.user.model.UserListMode$1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import nx5.a;

public final class UserListMode$12 extends UserListMode	// class@001a44
{

    public void UserListMode$12(String p0,int p1,String p2){
       super(p0, p1, p2, null);
    }
    public t createFragment(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserListMode$12.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x6e5f80cf).X9(p0);
    }
}