package fna.d0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter;
import fna.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ena.h;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import android.content.Intent;
import android.net.Uri;

public final class d0 implements View$OnClickListener	// class@002976
{
    public final GrowthCleanerSuccessPresenter b;
    public final int c;
    public final e d;

    public void d0(GrowthCleanerSuccessPresenter p0,int p1,e p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       int i = this.c + 1;
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(i), null, oh, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUIDE_TRAFFIC_ENTRY";
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("position", Integer.valueOf(i));
          uElementPack.params = jsonObject.toString();
          h.a(activity, uElementPack);
       }
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.d.f));
       intent.putExtra("CLEAN_RUBBISH", 1);
       Activity activity1 = this.b.getActivity();
       if (activity1 != null) {
          activity1.startActivity(intent);
       }
       activity = this.b.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
