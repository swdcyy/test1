package com.kuaishou.android.live.model.preview.LivePreviewWidgetBackgroundModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LivePreviewWidgetBackgroundModel implements Serializable	// class@00084b
{
    public CDNUrl[] mCDNUrls;
    public String[] mColorArray;
    public int mRadiusDp;
    public static final long serialVersionUID = 0x96c655f38e519a31;

    public void LivePreviewWidgetBackgroundModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewWidgetBackgroundModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePreviewWidgetBackgroundModel{mCDNUrls="+Arrays.toString(this.mCDNUrls)+", mColorArray="+Arrays.toString(this.mColorArray)+", mRadiusDp="+this.mRadiusDp+'}';
    }
}
