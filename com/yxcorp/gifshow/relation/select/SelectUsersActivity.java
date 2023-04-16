package com.yxcorp.gifshow.relation.select.SelectUsersActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.relation.select.SelectFriendPanelFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class SelectUsersActivity extends GifshowActivity	// class@001984
{
    public SelectFriendPanelFragment y;
    public SelectUsersBundle z;
    public static final int A;

    public void SelectUsersActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, SelectUsersActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SelectUsersActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getLogExtraParams();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SelectUsersActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "CHOOSE_FRIENDS";
    }
    public void onCreate(Bundle p0){
       SelectUsersActivity selectUsersA = SelectUsersActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, selectUsersA, "2")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, selectUsersA, "3")) {
          SelectUsersBundle selectUsersB = j0.e(this.getIntent(), "key_select_users_bundle");
          this.z = selectUsersB;
          if (selectUsersB == null) {
             this.z = new SelectUsersBundle();
          }
       }
       this.setContentView(R.layout.arg_RES_7f0d14ab);
       if (!PatchProxy.applyVoid(objArray, this, selectUsersA, "4")) {
          SelectFriendPanelFragment selectFriend = new SelectFriendPanelFragment();
          this.y = selectFriend;
          selectFriend.setArguments(this.getIntent().getExtras());
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.container_layout, this.y);
          uoe.m();
       }
       return;
    }
}
