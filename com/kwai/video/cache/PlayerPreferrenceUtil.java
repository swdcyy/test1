package com.kwai.video.cache.PlayerPreferrenceUtil;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.StringBuilder;
import com.kwai.video.hodor.util.Timber;
import com.kwai.video.cache.AwesomeCache$VodAdaptive;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class PlayerPreferrenceUtil	// class@0019f8
{
    public Context mContext;
    public Boolean mInited;
    public String vodAdaptiveHisData;
    public static PlayerPreferrenceUtil instance;

    public void PlayerPreferrenceUtil(){
       super();
       this.vodAdaptiveHisData = "";
       this.mInited = Boolean.FALSE;
    }
    public static PlayerPreferrenceUtil getInstance(){
       Object obj = PatchProxy.apply(null, null, PlayerPreferrenceUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PlayerPreferrenceUtil.instance == null) {
          PlayerPreferrenceUtil.instance = new PlayerPreferrenceUtil();
       }
       return PlayerPreferrenceUtil.instance;
    }
    public String getVodAdaptiveData(Context p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, PlayerPreferrenceUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.init(p0);
       int i = 0;
       if (this.mInited.booleanValue()) {
          this.vodAdaptiveHisData = o.c(this.mContext, "vod_adaptive_data", i).getString("history_data", "");
       }
       obj = new Object[i];
       Timber.d("PlayerPreferrenceUtil getVodAdaptiveData mInited:"+this.mInited+", historyData: "+this.vodAdaptiveHisData, obj);
       return this.vodAdaptiveHisData;
    }
    public final void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerPreferrenceUtil.class, "2")) {
          return;
       }
       if (!this.mInited.booleanValue() && p0 != null) {
          this.mContext = p0.getApplicationContext();
          this.mInited = Boolean.TRUE;
          Object[] objArray = new Object[0];
          Timber.d("PlayerPreferrenceUtil init", objArray);
       }
       return;
    }
    public void saveVodAdaptiveData(){
       if (PatchProxy.applyVoid(null, this, PlayerPreferrenceUtil.class, "4")) {
          return;
       }
       String historyData = AwesomeCache$VodAdaptive.getHistoryData();
       if (this.mInited.booleanValue() && !TextUtils.isEmpty(historyData)) {
          SharedPreferences$Editor uEditor = o.c(this.mContext, "vod_adaptive_data", 0).edit();
          uEditor.putString("history_data", historyData);
          g.a(uEditor);
       }
       return;
    }
}
