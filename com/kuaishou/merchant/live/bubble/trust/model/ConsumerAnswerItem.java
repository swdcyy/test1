package com.kuaishou.merchant.live.bubble.trust.model.ConsumerAnswerItem;
import java.io.Serializable;
import java.lang.Object;

public class ConsumerAnswerItem implements Serializable	// class@0018f2
{
    public int[] answerIds;
    public int questionId;
    public static final long serialVersionUID = 0xc404b8b6c7acf545;

    public void ConsumerAnswerItem(){
       super();
       this.questionId = 0;
    }
}
