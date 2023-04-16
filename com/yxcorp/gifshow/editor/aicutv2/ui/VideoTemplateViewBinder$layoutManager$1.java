package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$layoutManager$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;

public final class VideoTemplateViewBinder$layoutManager$1 extends LinearLayoutManager	// class@001b96
{
    public final boolean r;

    public void VideoTemplateViewBinder$layoutManager$1(boolean p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollHorizontally(){
       return (this.r ^ 0x01);
    }
}
