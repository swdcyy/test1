package kj9.e;
import android.view.View$OnClickListener;
import kj9.f;
import java.lang.Object;
import android.view.View;
import hlb.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public final class e implements View$OnClickListener	// class@002ca8
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       if (TextUtils.x(tb.r.mLinkUrl)) {
       }else if(PatchProxy.applyVoid(null, tb, f.class, "4")){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CHANNEL_OPERATION_BANNER";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("banner_id", tb.r.mId);
          jsonObject.a0("banner_index", Integer.valueOf((tb.q + 1)));
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.ksOrderInfoPackage = l0.a(tb.r.mKsOrderId);
          u1.u(1, uElementPack, uContentPack);
       }
       tb.getActivity().startActivity(b.a(0x66dce92a).a(tb.getActivity(), w0.f(tb.r.mLinkUrl)));
       return;
    }
}
