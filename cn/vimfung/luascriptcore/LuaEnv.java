package cn.vimfung.luascriptcore.LuaEnv;
import java.lang.Object;
import android.content.Context;

public final class LuaEnv	// class@000d36
{
    public Context _androidApplicationContext;
    public static final LuaEnv _env;

    static {
       LuaEnv._env = new LuaEnv();
    }
    public void LuaEnv(){
       super();
       this._androidApplicationContext = null;
    }
    public static LuaEnv defaultEnv(){
       return LuaEnv._env;
    }
    public Context getAndroidApplicationContext(){
       return this._androidApplicationContext;
    }
    public void setAndroidApplicationContext(Context p0){
       this._androidApplicationContext = p0.getApplicationContext();
    }
}
