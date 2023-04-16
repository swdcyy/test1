package com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$VpnFragment;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.download.intercept.c;
import erd.g;
import p29.b;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import android.content.Context;
import android.net.VpnService;

public class AdDownloadVpnManager$VpnFragment extends Fragment	// class@001758
{
    public FragmentActivity b;
    public String c;
    public AdDataWrapper d;
    public static final int e;

    public void AdDownloadVpnManager$VpnFragment(){
       super();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AdDownloadVpnManager$VpnFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AdDownloadVpnManager$VpnFragment.class, "2")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       AdDownloadVpnManager$VpnFragment tb = this.b;
       if (tb == null || (!tb.isFinishing() && (p0 == 16 || p0 == 17))) {
          if (p1 == -1) {
             AdDownloadVpnManager.d(this.b, this.d.getPhoto());
          }else {
             i0.a().e(655, this.d.getPhoto()).d(c.b).a();
          }
          k1.o(new b(this));
          this.b.getSupportFragmentManager().beginTransaction().u(this).m();
          AdDownloadVpnManager.c = false;
       }
    label_0077 :
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadVpnManager$VpnFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       AdDownloadVpnManager$VpnFragment tb = this.b;
       if (tb != null && !tb.isFinishing()) {
          Intent intent = VpnService.prepare(this.b);
          if (intent != null) {
             this.startActivityForResult(intent, 16);
          }else {
             this.onActivityResult(17, -1, null);
          }
       }
       return;
    }
}
