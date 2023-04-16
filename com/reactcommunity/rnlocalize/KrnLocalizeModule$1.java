package com.reactcommunity.rnlocalize.KrnLocalizeModule$1;
import android.content.BroadcastReceiver;
import com.reactcommunity.rnlocalize.KrnLocalizeModule;
import android.content.Context;
import android.content.Intent;
import java.lang.String;

public class KrnLocalizeModule$1 extends BroadcastReceiver	// class@000b53
{
    public final KrnLocalizeModule a;

    public void KrnLocalizeModule$1(KrnLocalizeModule p0){
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
