package com.kuaishou.live.core.show.redpacket.e;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.String;
import d61.g0;
import com.yxcorp.gifshow.models.Gift;

public final class e implements h	// class@000e7c
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       LiveGiftPackage$GiftInfo mGift = p0.mGift;
       if (mGift == null) {
          g0.d("fellow Gift is null!");
       }else {
          moreInfoPack.id = String.valueOf(mGift.mId);
       }
       moreInfoPack.vlaue = String.valueOf(p0.mGiftCount);
       return moreInfoPack;
    }
}
