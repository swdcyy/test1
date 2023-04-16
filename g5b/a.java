package g5b.a;
import java.lang.Runnable;
import java.util.Map;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.String;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import s5b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class a implements Runnable	// class@002a7b
{
    public final Map b;

    public void a(Map p0){
       this.b = p0;
    }
    public final void run(){
       String str = new Gson().q(this.b);
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiSeekBar", "saveEffectiveIntensityConfigs"+str, objArray);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("last_magic_emoji_slimming_configs", str);
       g.a(uEditor);
    }
}
