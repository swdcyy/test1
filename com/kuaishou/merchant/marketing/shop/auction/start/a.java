package com.kuaishou.merchant.marketing.shop.auction.start.a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.auction.start.a$b;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.marketing.shop.auction.start.AuctionPublish;
import com.kuaishou.merchant.live.basic.model.UploadImageResponse;
import brd.w;
import u14.b;
import u14.a;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;

public class a	// class@001bca
{
    public final a$b a;
    public b b;
    public final a$b c;
    public b d;
    public final PublishSubject e;

    public void a(){
       super();
       this.a = new a$b("UploadImage");
       this.c = new a$b("SendAudit");
       this.e = PublishSubject.g();
    }
    public static w a(String p0,AuctionPublish p1,UploadImageResponse p2){
       return a.a().a(p0, QCurrentUser.me().getName(), p1.mAuditId, p2.mImageUrl, p1.getCategoryIds(), 101);
    }
}
