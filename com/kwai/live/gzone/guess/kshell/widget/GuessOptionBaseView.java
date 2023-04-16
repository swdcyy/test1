package com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.UserBetOption;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView$a;

public abstract class GuessOptionBaseView extends FrameLayout	// class@000d73
{

    public void GuessOptionBaseView(Context p0){
       super(p0);
    }
    public void GuessOptionBaseView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GuessOptionBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(boolean p0){
    }
    public void b(int p0){
    }
    public abstract void c(BetOptionInfo p0,UserBetOption p1,KShellGuessQuestionStatus p2);
    public abstract void setResultStatus(KShellGuessResultStatus p0);
    public void setStateListener(GuessOptionBaseView$a p0){
    }
}
