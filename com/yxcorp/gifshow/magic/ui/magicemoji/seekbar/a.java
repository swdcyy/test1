package com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.a;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.HashMap;
import s5b.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import g5b.b;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;

public final class a implements Callable	// class@001c06
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object call(){
       HashMap hashMap = new HashMap();
       String str = a.a.getString("last_magic_emoji_slimming_configs", "");
       if (!TextUtils.x(str)) {
          Map map = new Gson().i(str, new b().getType());
          if (map != null) {
             hashMap.putAll(map);
          }
       }
       return hashMap;
    }
}
