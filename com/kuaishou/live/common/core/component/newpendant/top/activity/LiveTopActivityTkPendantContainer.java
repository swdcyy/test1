package com.kuaishou.live.common.core.component.newpendant.top.activity.LiveTopActivityTkPendantContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class LiveTopActivityTkPendantContainer extends FrameLayout	// class@0016b7
{
    public final FrameLayout b;
    public c c;
    public static final int d;

    public void LiveTopActivityTkPendantContainer(Context p0){
       super(p0, null);
    }
    public void LiveTopActivityTkPendantContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveTopActivityTkPendantContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setClipChildren(false);
       this.setClipToPadding(false);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0e08, this);
       this.b = this.findViewById(0x7f0a26a5);
    }
}
