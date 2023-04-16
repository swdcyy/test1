package cn.vimfung.luascriptcore.LuaBaseObject$1;
import java.lang.Runnable;
import cn.vimfung.luascriptcore.LuaBaseObject;
import java.lang.Object;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public class LuaBaseObject$1 implements Runnable	// class@000d33
{
    public final LuaBaseObject this$0;

    public void LuaBaseObject$1(LuaBaseObject p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       LuaNativeUtil.safelyReleaseNativeObject(this.this$0._nativeId);
    }
}
