package com.hpplay.sdk.source.process.LelinkSourceSdkImp$3;
import com.hpplay.sdk.source.browse.api.AuthListener;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.api.IBindSdkListener;

public class LelinkSourceSdkImp$3 implements AuthListener	// class@00068c
{
    public final LelinkSourceSdkImp a;

    public void LelinkSourceSdkImp$3(LelinkSourceSdkImp p0){
       this.a = p0;
       super();
    }
    public void onAuthFailed(int p0){
       a.f("LelinkSourceSDK", "   onAuthFailed "+p0);
       LelinkSourceSdkImp mAuthListene = this.a.mAuthListener;
       if (mAuthListene != null) {
          mAuthListene.onAuthFailed(p0);
       }
       boolean b = false;
       if (p0 != 402 && p0 != -101) {
          b = true;
       }
       LelinkSourceSdkImp mBindSdkList = this.a.mBindSdkListener;
       if (mBindSdkList != null) {
          mBindSdkList.onBindCallback(b);
       }
       return;
    }
    public void onAuthSuccess(String p0,String p1){
       a.f("LelinkSourceSDK", " onAuthSuccess success ");
       LelinkSourceSdkImp mAuthListene = this.a.mAuthListener;
       if (mAuthListene != null) {
          mAuthListene.onAuthSuccess(p0, p1);
       }
       this.a.mBindSdkListener.onBindCallback(true);
       return;
    }
}
