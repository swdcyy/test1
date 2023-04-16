package com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGzoneTabServerInfo implements Serializable, a	// class@000e0a
{
    public String mLink;
    public String mName;
    public boolean mPreload;
    public List mSubTabs;
    public LiveGzoneTabServerInfo$TabDetail mTabDetail;
    public String mTabId;
    public String mType;
    public static final long serialVersionUID = 0xedc5c5930cc99cb4;

    public void LiveGzoneTabServerInfo(String p0){
       super();
       this.mType = p0;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTabServerInfo.class, "1")) {
          return;
       }
       LiveGzoneTab$TabType cHAT = LiveGzoneTab$TabType.CHAT;
       if ((cHAT.mTypeValue).equals(this.mType)) {
          this.mTabId = cHAT.mTypeValue;
       }
       if (!TextUtils.x(this.mTabId)) {
          return;
       }else if((LiveGzoneTab$TabType.H5.mTypeValue).equals(this.mType)){
          this.mTabId = this.mName;
       }else {
          this.mTabId = String.valueOf(this.mType);
       }
       return;
    }
}
