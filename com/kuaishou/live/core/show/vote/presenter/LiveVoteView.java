package com.kuaishou.live.core.show.vote.presenter.LiveVoteView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class LiveVoteView extends FrameLayout	// class@00123d
{

    public void LiveVoteView(Context p0){
       super(p0, null);
    }
    public void LiveVoteView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoteView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveVoteView.class, "1")) {
       }else {
          LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d0e7d, this);
       }
       return;
    }
}
