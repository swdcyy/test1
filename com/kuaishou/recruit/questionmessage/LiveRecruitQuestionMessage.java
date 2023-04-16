package com.kuaishou.recruit.questionmessage.LiveRecruitQuestionMessage;
import j51.a;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;

public class LiveRecruitQuestionMessage extends QLiveMessage implements a	// class@000ee8
{
    public String bizId;
    public String mButtonContent;
    public String mButtonRouterUrl;
    public String mPrefix;
    public a mShowCallback;

    public void LiveRecruitQuestionMessage(){
       super();
    }
    public void onMessageShow(){
       if (PatchProxy.applyVoid(null, this, LiveRecruitQuestionMessage.class, "1")) {
          return;
       }
       LiveRecruitQuestionMessage tmShowCallba = this.mShowCallback;
       if (tmShowCallba != null) {
          tmShowCallba.accept(this);
       }
       return;
    }
}
