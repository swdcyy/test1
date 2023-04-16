package com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public class AuctionSettingFragment$a extends m	// class@001bb3
{
    public final AuctionSettingFragment c;

    public void AuctionSettingFragment$a(AuctionSettingFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuctionSettingFragment$a.class, "1")) {
          return;
       }
       c fragmentMana = this.c.getFragmentManager();
       if (fragmentMana != null && !fragmentMana.popBackStackImmediate()) {
          e uoe = fragmentMana.beginTransaction();
          uoe.y(R.anim.arg_RES_7f010109, 0x7f010112);
          uoe.u(this.c).m();
       }
       return;
    }
}
