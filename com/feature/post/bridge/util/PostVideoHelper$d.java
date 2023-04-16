package com.feature.post.bridge.util.PostVideoHelper$d;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import lnc.a1;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public class PostVideoHelper$d	// class@0014c3
{
    public long a;
    public long b;
    public long c;
    public String mMagicFaceId;
    public long mMagicFaceTimeCost;
    public String mMusicId;
    public long mMusicTimeCost;
    public int mMusicType;
    public long mTotalTimeCost;

    public void PostVideoHelper$d(JsCameraCallbackParams$Param p0){
       super();
       String str = "";
       this.mMagicFaceId = str;
       this.mMusicId = str;
       if (p0 == null) {
          return;
       }
       this.mMagicFaceId = TextUtils.k(p0.mMagicFaceId);
       this.mMusicId = TextUtils.k(p0.mMusicId);
       this.mMusicType = p0.mMusicType;
       if (!TextUtils.x(this.mMagicFaceId) || !TextUtils.x(this.mMusicId)) {
          this.a = a1.k();
       }
       return;
    }
    public void a(){
       if (this.a - null <= 0) {
          return;
       }
       Object[] objArray = new Object[0];
       l.D().w("PostVideoHelper", "onResourceFinishLoad diff is "+a1.o(this.a), objArray);
       this.mTotalTimeCost = a1.o(this.a);
       u1.R("postVideoResourceTimeCost", a.a.q(this), 7);
       return;
    }
}
