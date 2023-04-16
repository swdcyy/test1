package com.kwai.slide.play.detail.negative.feedback.content.FeedbackAnim;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FeedbackAnim extends Enum	// class@00182e
{
    public static final FeedbackAnim[] $VALUES;
    public static final FeedbackAnim HIDE;
    public static final FeedbackAnim SHOW;

    static {
       FeedbackAnim uFeedbackAni = new FeedbackAnim("SHOW", 0);
       FeedbackAnim.SHOW = uFeedbackAni;
       FeedbackAnim uFeedbackAni1 = new FeedbackAnim("HIDE", 1);
       FeedbackAnim.HIDE = uFeedbackAni1;
       FeedbackAnim[] uFeedbackAni2 = new FeedbackAnim[]{uFeedbackAni,uFeedbackAni1};
       FeedbackAnim.$VALUES = uFeedbackAni2;
    }
    public void FeedbackAnim(String p0,int p1){
       super(p0, p1);
    }
    public static FeedbackAnim valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedbackAnim.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FeedbackAnim.class, p0);
    }
    public static FeedbackAnim[] values(){
       Object obj = PatchProxy.apply(null, null, FeedbackAnim.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedbackAnim.$VALUES.clone();
    }
}
