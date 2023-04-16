package com.yxcorp.gifshow.KwaiApp$b;
import je7.b$a;
import com.yxcorp.gifshow.KwaiApp;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;

public class KwaiApp$b implements b$a	// class@001028
{
    public final List a;
    public final KwaiApp b;

    public void KwaiApp$b(KwaiApp p0){
       int i = this;
       i.b = p0;
       super();
       String[] stringArray = new String[]{"android.net.conn.CONNECTIVITY_CHANGE","com.kw.r.p","com.kw.rp.ch.action","com.kw.rr.yy.dd","com.kw.rr.tt.dd","com.kw.rr.yy.ddd","com.kw.r.p","com.kw.pp.action","com.kwai.middleware.azeroth.ACCOUNT_CHANGED","com.yxcorp.experiment.logger.LogEventHelper.logUsage","android.intent.action.PROXY_CHANGE","android.security.action.KEYCHAIN_CHANGED","android.security.action.KEY_ACCESS_CHANGED","android.security.action.TRUST_STORE_CHANGED","android.os.action.POWER_SAVE_MODE_CHANGED","android.intent.action.BATTERY_CHANGED","android.intent.action.SIM_STATE_CHANGED","android.intent.action.HEADSET_PLUG","android.media.AUDIO_BECOMING_NOISY","android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"};
       i.a = Arrays.asList(stringArray);
    }
    public boolean a(){
       return false;
    }
    public List b(){
       return this.a;
    }
    public Context getContext(){
       Object obj = PatchProxy.applyWithListener(null, this, KwaiApp$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(KwaiApp$b.class, "1");
       return a.b();
    }
}
