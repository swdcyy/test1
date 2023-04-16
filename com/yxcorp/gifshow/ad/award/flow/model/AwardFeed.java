package com.yxcorp.gifshow.ad.award.flow.model.AwardFeed;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.AwardFeed$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import com.yxcorp.gifshow.ad.award.flow.model.CardStyle;
import java.util.List;
import com.yxcorp.gifshow.ad.award.flow.model.TagInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class AwardFeed implements Serializable	// class@0014f7
{
    public final List activityInfoList;
    public final CDNUrl[] avatarCdns;
    public final CardStyle cardStyle;
    public final String nickName;
    public final String onlineNum;
    public final QPhoto photo;
    public final CDNUrl[] picCdns;
    public final double ratio;
    public final TagInfo tagInfo;
    public final int type;
    public static final AwardFeed$a Companion;
    public static final AwardFeed EMPTY;
    public static final long serialVersionUID;

    static {
       AwardFeed.Companion = new AwardFeed$a(null);
       AwardFeed uAwardFeed = new AwardFeed(0, null, null, null, null, 0, null, null, null, null, 1023, null);
       AwardFeed.EMPTY = v0;
    }
    public void AwardFeed(){
       super(0, null, null, null, null, 0, null, null, null, null, 1023, null);
    }
    public void AwardFeed(int p0,QPhoto p1,CDNUrl[] p2,CDNUrl[] p3,String p4,double p5,String p6,CardStyle p7,List p8,TagInfo p9){
       super();
       this.type = p0;
       this.photo = p1;
       this.picCdns = p2;
       this.avatarCdns = p3;
       this.nickName = p4;
       this.ratio = p5;
       this.onlineNum = p6;
       this.cardStyle = p7;
       this.activityInfoList = p8;
       this.tagInfo = p9;
    }
    public void AwardFeed(int p0,QPhoto p1,CDNUrl[] p2,CDNUrl[] p3,String p4,double p5,String p6,CardStyle p7,List p8,TagInfo p9,int p10,u p11){
       int i = p10;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = 0;
       int i3 = (i & 0x02)? i2: p1;
       int i4 = (i & 0x04)? i2: p2;
       int i5 = (i & 0x08)? i2: p3;
       int i6 = (i & 0x10)? i2: p4;
       int i7 = (i & 0x20)? 0: p5;
       int i8 = (i & 0x40)? i2: p6;
       int i9 = (i & 0x0080)? i2: p7;
       int i10 = (i & 0x0100)? i2: p8;
       if (!(i & 0x0200)) {
          i2 = p9;
       }
       super(i1, i3, i4, i5, i6, i7, i8, i9, i10, i2);
       return;
    }
    public final boolean isAd(){
       AwardFeed obj = PatchProxy.apply(null, this, AwardFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.photo;
       boolean b = (obj != null)? obj.isAd(): false;
       return b;
    }
    public final boolean isLiveFeed(){
       AwardFeed obj = PatchProxy.apply(null, this, AwardFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.photo;
       boolean b = (obj != null)? obj.isLiveStream(): false;
       return b;
    }
}
