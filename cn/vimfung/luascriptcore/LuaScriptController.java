package cn.vimfung.luascriptcore.LuaScriptController;
import cn.vimfung.luascriptcore.LuaBaseObject;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public class LuaScriptController extends LuaBaseObject	// class@000d41
{

    public void LuaScriptController(int p0){
       super(p0);
    }
    public static LuaScriptController create(){
       return LuaNativeUtil.createScriptController();
    }
    public void forceExit(){
       LuaNativeUtil.scriptControllerForceExit(this);
    }
    public void setTimeout(int p0){
       LuaNativeUtil.scriptControllerSetTimeout(this, p0);
    }
}
