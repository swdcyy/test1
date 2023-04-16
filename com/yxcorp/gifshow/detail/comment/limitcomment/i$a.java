package com.yxcorp.gifshow.detail.comment.limitcomment.i$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.detail.comment.limitcomment.i;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import crd.b;
import lnc.b9;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import dx9.f;
import dx9.e;
import erd.g;

public class i$a implements SlipSwitchButton$b	// class@001380
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       i$a uoa = i$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, str)) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ONLY_FRIENDS_COMMENT_MYTALK_BUTTON";
          JsonObject jsonObject = new JsonObject();
          String str1 = (ta.r.getSwitch())? "CHECKED": "UNCHECKED";
          jsonObject.c0("status", str1);
          uElementPack.params = jsonObject.toString();
          u1.u(1, uElementPack, objArray);
       }
       b9.a(this.a.s);
       ta = this.a;
       KwaiApiService kwaiApiServi = b.a(0x330163e);
       if (!p1) {
          str = "0";
       }
       ta.s = kwaiApiServi.changePrivateOption("enable_moment_comment_deny", str).subscribe(new f(p1), new e(this, p1));
       return;
    }
}
