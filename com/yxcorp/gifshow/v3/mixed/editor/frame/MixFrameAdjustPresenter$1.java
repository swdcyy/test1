package com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustPresenter$1;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustPresenter;
import android.content.Context;

public class MixFrameAdjustPresenter$1 extends NpaLinearLayoutManager	// class@00154b
{
    public final MixFrameAdjustPresenter r;

    public void MixFrameAdjustPresenter$1(MixFrameAdjustPresenter p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollHorizontally(){
       return false;
    }
}
