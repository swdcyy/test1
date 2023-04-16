package com.kuaishou.live.gzone.v2.profile.f;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import tkd.b;
import tkd.d;
import fs3.g;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import oz1.b;
import u07.t$a;
import android.app.Activity;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.CharSequence;
import e63.v;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class f implements DialogInterface$OnClickListener	// class@001ce9
{
    public final e b;

    public void f(e p0){
       this.b = p0;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       f tb;
       e uoe = e.class;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (p1 == 0x7f104a8e) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, uoe, "38")) {
             tb.d9();
             d.a(-1695065466).W(tb.r.getLiveStreamId(), tb.r.getUserProfile().mProfile);
             b.f(tb.r.getLiveStreamId());
          }
       }else if(p1 == 0x7f101d16 || p1 == 0x7f10406c){
          this.b.y9();
       }else if(p1 == 0x7f10406b){
          this.b.o9();
       }else if(p1 == 0x7f100103){
          this.b.W8();
       }else if(p1 == 0x7f102cfb || p1 == 0x7f102cfd){
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, uoe, "40")) {
             t$a uoa = new t$a(tb.p);
             uoe = tb.p;
             int i = (tb.r.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? 0x7f101ff7: 0x7f101fed;
             Object[] objArray1 = new Object[]{tb.r.getUserProfile().mProfile.mName};
             uoa.X0(uoe.getString(i, objArray1));
             uoa.S0(R.string.arg_RES_7f103a83);
             uoa.Q0(R.string.cancel);
             uoa.u0(new v(tb));
             uoa.v(1);
             j.d(uoa);
          }
       }else if(p1 == 0x7f102225){
          this.b.e9();
       }else if(p1 == 0x7f1028af){
          this.b.C9();
       }
       return;
    }
}
