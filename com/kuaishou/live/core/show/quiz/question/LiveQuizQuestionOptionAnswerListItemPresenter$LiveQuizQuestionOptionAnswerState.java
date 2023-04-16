package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState extends Enum	// class@000e38
{
    public static final LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState[] $VALUES;
    public static final LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState DISABLE;
    public static final LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState NORMAL;
    public static final LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState SELECTED;

    static {
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState liveQuizQues = new LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState("NORMAL", 0);
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.NORMAL = liveQuizQues;
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState liveQuizQues1 = new LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState("DISABLE", 1);
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.DISABLE = liveQuizQues1;
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState liveQuizQues2 = new LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState("SELECTED", 2);
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.SELECTED = liveQuizQues2;
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState[] liveQuizQues3 = new LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState[]{liveQuizQues,liveQuizQues1,liveQuizQues2};
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.$VALUES = liveQuizQues3;
    }
    public void LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.class, p0);
    }
    public static LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.$VALUES.clone();
    }
}
