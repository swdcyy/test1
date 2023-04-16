package c24.s;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ot3.l0;
import android.net.Uri;
import ot3.h0;
import tkd.b;
import tkd.d;
import ss3.a;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import c24.s$a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.utility.n;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import c24.s$c;
import erd.g;
import crd.b;
import c24.s$b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class s implements e	// class@00049a
{

    public void s(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          int i = l0.e("rootTag", p0.c().c());
          String str = h0.a(p0.d()).get("liveStreamId");
          Fragment uFragment = d.a(0x50a4ea96).gN(str, p0.d().toString(), false);
          GifshowActivity gifshowActiv = p0.a();
          if (gifshowActiv != null) {
             DialogContainerFragment uDialogConta = new DialogContainerFragment();
             uDialogConta.Lh(new s$a(uFragment, gifshowActiv, str, i));
             uDialogConta.Kh(n.j(gifshowActiv));
             Fragment uFragment1 = uFragment;
             if (uFragment1 != null) {
                t ot = uFragment1.m();
                if (ot != null) {
                   ot.subscribe(new s$c(uDialogConta));
                }
             }
             uDialogConta.k0(new s$b(uFragment, gifshowActiv, str, i));
             uDialogConta.show(gifshowActiv.getSupportFragmentManager(), "AuctionSettingFragment");
          }
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
