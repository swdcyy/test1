package boc.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicModelConfig;
import java.lang.Object;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import boc.b0;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class f implements Runnable	// class@000441
{
    public final MagicEmojiResourceHelper$MagicModelConfig b;

    public void f(MagicEmojiResourceHelper$MagicModelConfig p0){
       this.b = p0;
    }
    public final void run(){
       SharedPreferences a;
       String str = a.a.q(this.b);
       try{
          a = b0.a;
          g.a(b0.a.edit().putString("magic_model_list", str));
       }catch(java.lang.Exception e0){
          PostUtils.D("ks://magic_model_list", "writeError", e0);
       }
       return;
    }
}
