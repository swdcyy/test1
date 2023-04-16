package com.kuaishou.webkit.adapter.RenderProcessGoneDetailAdapter;
import com.kuaishou.webkit.RenderProcessGoneDetail;
import android.webkit.RenderProcessGoneDetail;

public class RenderProcessGoneDetailAdapter extends RenderProcessGoneDetail	// class@0012ab
{
    public RenderProcessGoneDetail mStub;

    public void RenderProcessGoneDetailAdapter(RenderProcessGoneDetail p0){
       super();
       this.mStub = p0;
    }
    public boolean didCrash(){
       return this.mStub.didCrash();
    }
    public int rendererPriorityAtExit(){
       return this.mStub.rendererPriorityAtExit();
    }
}
