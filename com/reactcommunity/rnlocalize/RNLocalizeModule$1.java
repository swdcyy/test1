package com.reactcommunity.rnlocalize.RNLocalizeModule$1;
import android.content.BroadcastReceiver;
import com.reactcommunity.rnlocalize.RNLocalizeModule;
import android.content.Context;
import android.content.Intent;
import java.lang.String;

public class RNLocalizeModule$1 extends BroadcastReceiver	// class@000b55
{
    public final RNLocalizeModule a;

    public void RNLocalizeModule$1(RNLocalizeModule p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1.getAction() != null) {
          this.a.onLocalizationDidChange();
       }
       return;
    }
}
