package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class GameZoneModels$GzoneLiveCornerMarker implements Serializable	// class@0012c6
{
    public CDNUrl[] mBgUrl;
    public String mDesc;
    public int mHeight;
    public String mTextColor;
    public String mType;
    public int mWidth;
    public static final long serialVersionUID = 0x98abd4d3a4073c07;

    public void GameZoneModels$GzoneLiveCornerMarker(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GameZoneModels$GzoneLiveCornerMarker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof GameZoneModels$GzoneLiveCornerMarker) {
          return TextUtils.n(this.mDesc, p0.mDesc);
       }
       return false;
    }
}
