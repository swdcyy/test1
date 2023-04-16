package com.kuaishou.live.core.show.quiz.model.LiveQuizMyStatusResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.j$b;
import ok.j;

public class LiveQuizMyStatusResponse implements Serializable	// class@000e24
{
    public String mCorrectOptionId;
    public String mEraserKey;
    public String mInvitationCode;
    public int mLatestQuestionNumber;
    public String mMyOptionId;
    public int mQuizAvailableReviveCard;
    public int mTotalAvailableReviveCard;
    public boolean mUseReviveCardInLastQuestion;
    public static final long serialVersionUID = 0x93f6a29b652c08c0;

    public void LiveQuizMyStatusResponse(){
       super();
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveQuizMyStatusResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.a("mLatestQuestionNumber", this.mLatestQuestionNumber);
       obj.c("mMyOptionId", this.mMyOptionId);
       obj.c("mCorrectOptionId", this.mCorrectOptionId);
       obj.d("mUseReviveCardInLastQuestion", this.mUseReviveCardInLastQuestion);
       obj.a("mQuizAvailableReviveCard", this.mQuizAvailableReviveCard);
       obj.c("mInvitationCode", this.mInvitationCode);
       obj.c("mEraserKey", this.mEraserKey);
       return obj.toString();
    }
}
