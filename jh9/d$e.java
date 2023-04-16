package jh9.d$e;
import android.view.View$OnClickListener;
import jh9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import c16.c;
import e17.i;
import tkd.b;
import tkd.d;
import om6.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import om6.k;
import kotlin.jvm.internal.a;

public final class d$e implements View$OnClickListener	// class@002ada
{
    public final d b;

    public void d$e(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIBRARY_AICUT_ENTRANCE";
       ClientContent$ContentPackage uContentPack = null;
       u1.L("", this.b.x, 1, uElementPack, uContentPack);
       d$e tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (!PatchProxy.applyVoid(uContentPack, tb, uod, "10")) {
          if (!c.d()) {
             i.a(R.style.arg_RES_7f110668, 0x7f100144);
          }else if(PatchProxy.applyVoid(uContentPack, tb, uod, "11")){
             Intent intent = d.a(0x2538349d).nt(tb.getActivity());
             intent.putExtra("ALBUM_BIZ_CODE", "post_aicut_album");
             intent.putExtra("albumBackButtonRes", R.drawable.arg_RES_7f0824a5);
             intent.putExtra("hideNextButton", 1);
             intent.putExtra("albumQuitAnimation", R.anim.arg_RES_7f010112);
             intent.putExtra("albumEnablePreviewNextStep", 1);
             Activity activity = tb.getActivity();
             a.m(activity);
             activity.startActivity(intent);
          }
       }
       return;
    }
}
