package com.kuaishou.live.core.show.conditionredpacket.sender.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;

public final class a implements h	// class@000ac5
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = String.valueOf(p0.mGift.mId);
       moreInfoPack.vlaue = String.valueOf(p0.mGiftCount);
       return moreInfoPack;
    }
}
