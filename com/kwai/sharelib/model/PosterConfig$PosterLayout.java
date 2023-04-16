package com.kwai.sharelib.model.PosterConfig$PosterLayout;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PosterConfig$PosterLayout implements Serializable	// class@0016e8
{
    public float mBottomMargin;
    public float mTopMargin;
    public float mWidthPercent;
    public static final long serialVersionUID = 0xee3915d873aa2402;

    public void PosterConfig$PosterLayout(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PosterConfig$PosterLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PosterLayout{mTopMargin="+this.mTopMargin+", mBottomMargin="+this.mBottomMargin+", mWidthPercent="+this.mWidthPercent+'}';
    }
}
