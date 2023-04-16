package com.yxcorp.gifshow.profile.collect.model.POIModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class POIModel implements Serializable	// class@0012c4
{
    public String mAddress;
    public CDNUrl[] mCoverUrl;
    public List mDisplayInfo;
    public String mDistance;
    public String mId;
    public String mLink;
    public String mName;
    public CDNUrl[] mTitleIcon;
    public static final long serialVersionUID = 0x90bf53286b0003d9;

    public void POIModel(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, POIModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.equals(this.mId, p0.mId);
    }
}
