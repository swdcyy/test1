package com.yxcorp.gifshow.reminder.friend.relation.FriendTabExploreFriendActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.reminder.friend.relation.FriendTabExploreFriendActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ekd.i;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import zf6.l;
import android.content.Intent;
import ekd.j0;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.graphics.drawable.Drawable;
import zf6.j;
import bec.a;
import android.view.View$OnClickListener;
import bec.b;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment;
import com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment$a;
import com.yxcorp.gifshow.reminder.friend.manager.friend.FriendTabManagerFriendFragment;
import com.yxcorp.gifshow.reminder.friend.manager.friend.FriendTabManagerFriendFragment$a;
import androidx.fragment.app.Fragment;

public final class FriendTabExploreFriendActivity extends GifshowActivity	// class@001ae1
{
    public static final FriendTabExploreFriendActivity$a y;

    static {
       FriendTabExploreFriendActivity.y = new FriendTabExploreFriendActivity$a(null);
    }
    public void FriendTabExploreFriendActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FriendTabExploreFriendActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       int i;
       FriendTabExploreFriendActivity uFriendTabEx = FriendTabExploreFriendActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFriendTabEx, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       this.setContentView(R.layout.arg_RES_7f0d0535);
       if (!PatchProxy.applyVoid(null, this, uFriendTabEx, "2") && i.c()) {
          View view = this.findViewById(R.id.status_bar_padding_view);
          if (view != null) {
             view.getLayoutParams().height = n.A(this);
             view.setVisibility(false);
          }
          i.h(this, false, l.r());
       }
       boolean b = j0.a(this.getIntent(), "extra-args-show-pymk", false);
       if (!PatchProxy.isSupport(uFriendTabEx) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uFriendTabEx, "3")) {
          KwaiActionBar kwaiActionBa = this.findViewById(R.id.title_root);
          if (kwaiActionBa != null) {
             i = (b)? 0x7f1010e4: 0x7f1010a8;
             kwaiActionBa = kwaiActionBa.q(i);
             if (kwaiActionBa != null) {
                kwaiActionBa = kwaiActionBa.j(j.n(this, R.drawable.arg_RES_7f080623, 0x7f060148));
                if (kwaiActionBa != null) {
                   kwaiActionBa = kwaiActionBa.o(j.n(this, R.drawable.arg_RES_7f08062d, 0x7f060148));
                   if (kwaiActionBa != null) {
                      kwaiActionBa.l(new a(this));
                      kwaiActionBa.post(b.b);
                   }
                }
             }
          }
       }
    label_00a6 :
       e uoe = this.getSupportFragmentManager().beginTransaction();
       FriendTabFindFriendListFragment uFriendTabFi = (b)? FriendTabFindFriendListFragment.v.a(false): FriendTabManagerFriendFragment.w.a();
       uoe.v(R.id.fragment_container, uFriendTabFi);
       uoe.m();
       return;
    }
}
