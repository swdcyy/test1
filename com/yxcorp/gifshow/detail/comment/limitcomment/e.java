package com.yxcorp.gifshow.detail.comment.limitcomment.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.comment.limitcomment.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import r1a.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import brd.t;
import xf5.a;
import cjd.e;
import erd.o;
import dx9.b;
import com.yxcorp.gifshow.detail.comment.limitcomment.h;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class e implements View$OnClickListener	// class@00137b
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, g.class, "5")) {
       }else {
          int i = (tb.r + tb.t.c().size()) - tb.t.b().size();
          g s = tb.s;
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(s), objArray, uoa, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CONFIRM";
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("choose_number", Integer.valueOf(i));
             jsonObject.a0("total_number", Integer.valueOf(s));
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, objArray);
          }
          tb.X7(a.e(tb.P8(tb.t.c()), tb.P8(tb.t.b())).map(new e()).subscribe(new b(tb), new h(tb)));
       }
       return;
    }
}
