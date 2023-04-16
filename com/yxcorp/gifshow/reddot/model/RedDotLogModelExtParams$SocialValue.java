package com.yxcorp.gifshow.reddot.model.RedDotLogModelExtParams$SocialValue;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import fg6.a;
import com.google.gson.Gson;

public class RedDotLogModelExtParams$SocialValue implements Serializable	// class@0017d0
{
    public int mFollowBoxCount;
    public int mInteractionBoxCount;
    public int mMessageGroup;
    public int mMessagePersonal;
    public int mMessagePublicGroup;
    public int mMessageStrangeChat;
    public int mMessagesCount;
    public int mSystemNoticeBox;
    public static final long serialVersionUID = 0x7036b3854fb9e490;

    public void RedDotLogModelExtParams$SocialValue(int p0,int p1,int p2){
       super();
       this.mMessagesCount = p0;
       this.mInteractionBoxCount = p1;
       this.mFollowBoxCount = p2;
    }
    public void RedDotLogModelExtParams$SocialValue(int p0,int p1,int p2,int p3){
       super();
       this.mMessagePublicGroup = p0;
       this.mMessageGroup = p1;
       this.mMessageStrangeChat = p2;
       this.mMessagePersonal = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotLogModelExtParams$SocialValue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mMessagesCount != p0.mMessagesCount || (this.mInteractionBoxCount != p0.mInteractionBoxCount || (this.mFollowBoxCount != p0.mFollowBoxCount || (this.mSystemNoticeBox != p0.mSystemNoticeBox || (this.mMessagePublicGroup != p0.mMessagePublicGroup || (this.mMessageGroup != p0.mMessageGroup || (this.mMessageStrangeChat != p0.mMessageStrangeChat || this.mMessagePersonal != p0.mMessagePersonal))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RedDotLogModelExtParams$SocialValue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mMessagesCount),Integer.valueOf(this.mInteractionBoxCount),Integer.valueOf(this.mFollowBoxCount),Integer.valueOf(this.mSystemNoticeBox),Integer.valueOf(this.mMessagePublicGroup),Integer.valueOf(this.mMessageGroup),Integer.valueOf(this.mMessageStrangeChat),Integer.valueOf(this.mMessagePersonal)};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotLogModelExtParams$SocialValue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
