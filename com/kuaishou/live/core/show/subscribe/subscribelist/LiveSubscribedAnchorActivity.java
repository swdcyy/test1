package com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribedAnchorActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.Window;
import android.widget.RelativeLayout;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import lnc.a1;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribeAnchorListFragment;

public class LiveSubscribedAnchorActivity extends GifshowActivity implements d	// class@001167
{
    public TextView A;
    public LiveSubscribeAnchorListFragment y;
    public KwaiActionBar z;
    public static final int B;

    public void LiveSubscribedAnchorActivity(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribedAnchorActivity.class, "3")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a3f6a);
       this.A = m1.f(p0, 0x7f0a38a7);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveSubscribedAnchorActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       LiveSubscribedAnchorActivity liveSubscrib = LiveSubscribedAnchorActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveSubscrib, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       this.setContentView(R.layout.arg_RES_7f0d0dfb);
       this.doBindView(this.getWindow().getDecorView());
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, liveSubscrib, "4")) {
          if (!PatchProxy.applyVoid(objArray, this, liveSubscrib, "5")) {
             this.z.q(R.string.arg_RES_7f102bce);
             this.z.setVisibility(0);
             this.z.j(j.n(this, R.drawable.arg_RES_7f08068e, 0x7f060148));
             this.z.r(a1.p(R.string.arg_RES_7f102bce));
             this.z.m(-1);
          }
          this.A.setText(R.string.arg_RES_7f102bc2);
          if (this.y != null) {
             this.getSupportFragmentManager().beginTransaction().p(this.y).m();
          }
          this.y = new LiveSubscribeAnchorListFragment();
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.content_fragment, this.y);
          uoe.m();
       }
       return;
    }
}
