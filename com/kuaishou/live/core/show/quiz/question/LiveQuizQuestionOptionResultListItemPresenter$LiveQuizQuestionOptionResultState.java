package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState extends Enum	// class@000e3a
{
    public static final LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState[] $VALUES;
    public static final LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState NORMAL;
    public static final LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState RIGHT;
    public static final LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState WRONG;

    static {
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState liveQuizQues = new LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState("NORMAL", 0);
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.NORMAL = liveQuizQues;
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState liveQuizQues1 = new LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState("RIGHT", 1);
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.RIGHT = liveQuizQues1;
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState liveQuizQues2 = new LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState("WRONG", 2);
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.WRONG = liveQuizQues2;
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState[] liveQuizQues3 = new LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState[]{liveQuizQues,liveQuizQues1,liveQuizQues2};
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.$VALUES = liveQuizQues3;
    }
    public void LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.class, p0);
    }
    public static LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.$VALUES.clone();
    }
}
