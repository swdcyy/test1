package com.kwai.feature.component.photofeatures.reward.fragment.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment$a;
import com.kwai.feature.component.photofeatures.reward.fragment.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.component.photofeatures.reward.fragment.d;
import com.kwai.feature.component.photofeatures.reward.fragment.e;
import com.kwai.feature.component.photofeatures.reward.fragment.f;
import com.kwai.feature.component.photofeatures.reward.fragment.g;
import com.kwai.feature.component.photofeatures.reward.fragment.h;
import com.kwai.feature.component.photofeatures.reward.fragment.i;
import com.kwai.feature.component.photofeatures.reward.fragment.j;
import com.kwai.feature.component.photofeatures.reward.fragment.k;
import com.kwai.feature.component.photofeatures.reward.fragment.a;
import com.kwai.feature.component.photofeatures.reward.fragment.b;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@001237
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("REWARD_BEFORE_REWARD_GIFT_SUBJECT", new c(this, p1));
       p0.i("DETAIL_REWARD_COIN_BALANCE_UPDATE_EVENT", new d(this, p1));
       p0.i("DETAIL_REWARD_PHOTO_FRAGMENT", new e(this, p1));
       p0.i("REWARD_GIFT_BAG", new f(this, p1));
       p0.i("REWARD_GIFT_SELECT_SUBJECT", new g(this, p1));
       p0.i("DETAIL_REWARD_PANEL_INFO", new h(this, p1));
       p0.i("REWARD_DIALOG", new i(this, p1));
       p0.i("DETAIL_REWARD_PHOTO", new j(this, p1));
       p0.i("REWARD_GIFT_COUNT_CHANGE_SUBJECT", new k(this, p1));
       a uoa = new a(this, p1);
       String str = "REWARD_PANEL_CLOSE_LISTENERS";
       try{
          p0.i(str, uoa);
          p0.h(RewardPhotoPanelDialogFragment$a.class, new b(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
