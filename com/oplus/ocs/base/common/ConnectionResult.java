package com.oplus.ocs.base.common.ConnectionResult;
import android.app.PendingIntent;
import java.lang.Object;
import java.lang.String;
import com.oplus.ocs.base.common.constant.CommonStatusCodes;
import android.app.Activity;
import android.content.IntentSender;
import android.content.Intent;
import com.oplus.ocs.base.utils.e$a;
import com.oplus.ocs.base.utils.e;

public class ConnectionResult	// class@000ab7
{
    public int mErrorCode;
    public PendingIntent mPendingIntent;

    public void ConnectionResult(int p0){
       super(p0, null);
    }
    public void ConnectionResult(int p0,PendingIntent p1){
       super();
       this.mErrorCode = p0;
       this.mPendingIntent = p1;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getErrorMessage(){
       return CommonStatusCodes.getStatusCodeString(this.mErrorCode);
    }
    public PendingIntent getResolution(){
       return this.mPendingIntent;
    }
    public boolean hasResolution(){
       if (this.mErrorCode != null && this.mPendingIntent != null) {
          return true;
       }
       return false;
    }
    public void startResolutionForResult(Activity p0,int p1){
       if (this.hasResolution()) {
          p0.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), p1, null, 0, 0, 0);
       }
       return;
    }
    public String toString(){
       return e.a(this).a("statusCode", CommonStatusCodes.getStatusCodeString(this.mErrorCode)).toString();
    }
}
