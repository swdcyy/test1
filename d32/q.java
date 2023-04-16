package d32.q;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo$LiveAnnounceLabel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.String;
import com.yxcorp.utility.TextUtils;

public final class q implements h	// class@002438
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.tag = p0.mLabelContent;
       moreInfoPack.vlaue = TextUtils.k(p0.mLabelColor);
       return moreInfoPack;
    }
}
