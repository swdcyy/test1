package com.kuaishou.live.core.show.vote.widget.LiveGzoneAbstractVoteProgress;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;

public abstract class LiveGzoneAbstractVoteProgress extends ProgressBar	// class@00124c
{

    public void LiveGzoneAbstractVoteProgress(Context p0){
       super(p0);
    }
    public void LiveGzoneAbstractVoteProgress(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveGzoneAbstractVoteProgress(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract boolean a();
    public abstract boolean b();
    public abstract boolean c();
    public abstract void d(int p0,int p1);
    public abstract void setCorner(int p0);
    public abstract void setSelectable(boolean p0);
    public abstract void setStrokeAbove(boolean p0);
    public abstract void setStrokeColor(int p0);
    public abstract void setVoteResult(boolean p0);
    public abstract void setWin(boolean p0);
}
