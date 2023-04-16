package com.kuaishou.live.lite.comment.model.GiftSentMessage;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import android.graphics.Bitmap;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class GiftSentMessage extends AbstractCommentMessage	// class@00080b
{
    public final Bitmap giftBitmap;
    public final int giftCount;
    public final String giftName;
    public final UserInfo userInfo;

    public void GiftSentMessage(String p0,long p1,boolean p2,UserInfo p3,String p4,int p5,Bitmap p6,LiveAudienceState p7){
       a.p(p0, "id");
       a.p(p3, "userInfo");
       a.p(p4, "giftName");
       super(p0, p1, p2, p7);
       this.userInfo = p3;
       this.giftName = p4;
       this.giftCount = p5;
       this.giftBitmap = p6;
    }
    public void GiftSentMessage(String p0,long p1,boolean p2,UserInfo p3,String p4,int p5,Bitmap p6,LiveAudienceState p7,int p8,u p9){
       LiveAudienceState liveAudience = (p8 & 0x0080)? null: p7;
       super(p0, p1, p2, p3, p4, p5, p6, liveAudience);
       return;
    }
    public final Bitmap getGiftBitmap(){
       return this.giftBitmap;
    }
    public final int getGiftCount(){
       return this.giftCount;
    }
    public final String getGiftName(){
       return this.giftName;
    }
    public final UserInfo getUserInfo(){
       return this.userInfo;
    }
}
