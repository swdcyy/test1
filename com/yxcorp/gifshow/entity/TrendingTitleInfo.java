package com.yxcorp.gifshow.entity.TrendingTitleInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;

public class TrendingTitleInfo implements Serializable	// class@000d86
{
    public String mBackgroundUrl;
    public String mDarkBackgroundUrl;
    public String mEnTitle;
    public int mIconHeight;
    public String mIconUrl;
    public int mIconWidth;
    public String mTcTitle;
    public String mTitle;
    public String mTrendingType;
    public static final long serialVersionUID = 0x96271398f95a1032;

    public void TrendingTitleInfo(){
       super();
    }
    public String getTitle(){
       Object obj = PatchProxy.apply(null, this, TrendingTitleInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 2) {
          return this.mTcTitle;
       }
       if (i != 3) {
          return this.mTitle;
       }
       return this.mEnTitle;
    }
}
