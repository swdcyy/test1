package com.yxcorp.gifshow.guide.ShareMyFeedGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n80.a;
import android.content.SharedPreferences;
import n80.b;
import q87.c;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.StringBuilder;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class ShareMyFeedGuideConfig implements Serializable	// class@00161f
{
    public int mDaysToWithdraw;
    public int mDelay;
    public int mDuration;
    public int mFrequenceyDaily;
    public static final long serialVersionUID = 0x8e03a5cf0daeaa54;

    public void ShareMyFeedGuideConfig(){
       super();
       this.mDelay = 3;
       this.mDuration = 8;
       this.mFrequenceyDaily = 2;
       this.mDaysToWithdraw = 7;
    }
    public boolean canSharePopGuideShow(){
       int i;
       SharedPreferences obj = PatchProxy.apply(null, this, ShareMyFeedGuideConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a;
       boolean b = false;
       if (obj.getBoolean("hasSharePopGuideHide", b)) {
          Object[] objArray = new Object[b];
          b.C().w("T401541", "已经退场", objArray);
          return b;
       }else if(DateUtils.H(obj.getLong("sharePopGuideShowStamp", 0))){
          i = a.g();
       }else {
          a.m(b);
          i = 0;
       }
       Object[] objArray1 = new Object[b];
       b.C().w("T401541", "比较次数： "+i+", "+this.mFrequenceyDaily, objArray1);
       if (i < this.mFrequenceyDaily) {
          b = true;
       }
       return b;
    }
    public void updateSharePopGuideShowCount(){
       SharedPreferences a;
       if (PatchProxy.applyVoid(null, this, ShareMyFeedGuideConfig.class, "2")) {
          return;
       }
       int i = a.g() + 1;
       a.m(i);
       a = a.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putLong("sharePopGuideShowStamp", System.currentTimeMillis());
       g.a(uEditor);
       if (i == this.mFrequenceyDaily) {
          long longx = a.getLong("lastShareTimeStamp", 0);
          if ((System.currentTimeMillis() - longx) - ((long)this.mDaysToWithdraw * 0x5265c00) > 0) {
             Object[] objArray = new Object[0];
             b.C().s("T401541", "退场机制生效： "+longx, objArray);
             a.i(1);
          }
       }
       return;
    }
}
