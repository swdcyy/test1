package com.kuaishou.live.core.show.quiz.model.LiveQuizReviveCardResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.j$b;
import ok.j;

public class LiveQuizReviveCardResponse implements Serializable	// class@000e29
{
    public String mInvitationCode;
    public int mQuizAvailableReviveCard;
    public int mTotalAvailableReviveCard;
    public static final long serialVersionUID = 0xef8dd3a050a42cd2;

    public void LiveQuizReviveCardResponse(){
       super();
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveQuizReviveCardResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.a("mTotalAvailableReviveCard", this.mTotalAvailableReviveCard);
       obj.a("mQuizAvailableReviveCard", this.mQuizAvailableReviveCard);
       obj.c("mInvitationCode", this.mInvitationCode);
       return obj.toString();
    }
}
