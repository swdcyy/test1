package com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KwaiAICutStyle extends AICutStyle	// class@00193e
{
    public double mCoverFrameTime;
    public List mDemoUrls;
    public int mDpi;
    public int mHeight;
    public boolean mIsMustShow;
    public KwaiAICutStyle$OpenEndInfo mStartEndInfo;
    public KwaiAICutStyle$KWaiAiCutMusic mTemplateMusic;
    public int mWidth;
    public static final long serialVersionUID = 0x3b15dfd174402420;

    public void KwaiAICutStyle(){
       super();
       this.mIsMustShow = true;
    }
    public static KwaiAICutStyle newEmptyStyle(){
       KwaiAICutStyle obj = PatchProxy.apply(null, null, KwaiAICutStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiAICutStyle();
       obj.mStyleId = "-1";
       return obj;
    }
}
