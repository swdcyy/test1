package x87.a;
import h97.j;
import com.kwai.logger.upload.retrieve.azeroth.g;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import t87.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig;
import java.lang.Class;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Config;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$ConfigItem;
import java.util.EnumMap;
import java.util.Set;
import java.util.Iterator;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$a;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Action;
import java.util.List;

public final class a implements j	// class@0027c0
{
    public final g a;

    public void a(g p0){
       this.a = p0;
    }
    public final void onConfigChanged(String p0){
       ObiwanConfig obiwanConfig;
       ObiwanConfig config;
       a ta = this.a;
       d.a("ObiwanUploader", "Azeroth received config:"+p0);
       if (TextUtils.isEmpty(p0)) {
       }else {
          try{
             obiwanConfig = new Gson().h(p0, ObiwanConfig.class);
          }catch(java.lang.Exception e5){
             d.b("ObiwanUploader", "parse start up config:"+e5);
             obiwanConfig = new ObiwanConfig();
          }
          config = obiwanConfig.config;
          if (config != null) {
             if (config.checkInterval != AzerothConfigPuller.b.checkInterval) {
                Set set = AzerothConfigPuller.a.get(AzerothConfigPuller$ConfigItem.CHECK_INTERVAL);
                if (set != null && set.size() > 0) {
                   Iterator iterator = set.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a();
                   }
                }
             }
             AzerothConfigPuller.b = config;
          }
          obiwanConfig = obiwanConfig.action;
          if (obiwanConfig != null) {
             ta.a(obiwanConfig.taskList);
          }
       }
       return;
    }
}
