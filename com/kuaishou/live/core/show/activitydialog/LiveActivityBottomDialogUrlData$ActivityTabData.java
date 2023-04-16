package com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialogUrlData$ActivityTabData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveActivityBottomDialogUrlData$ActivityTabData	// class@000926
{
    public String mBundleId;
    public JsonElement mData;
    public boolean mIsHide;
    public String mPosition;
    public int mSelectedIndex;
    public int mTabHeight;
    public String viewKey;

    public void LiveActivityBottomDialogUrlData$ActivityTabData(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveActivityBottomDialogUrlData$ActivityTabData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityTabData{mPosition=\'"+this.mPosition+'''+", mTabHeight="+this.mTabHeight+", mSelectedIndex="+this.mSelectedIndex+", mData="+this.mData+", mBundleId=\'"+this.mBundleId+'''+", viewKey=\'"+this.viewKey+'''+'}';
    }
}
