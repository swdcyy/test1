package cn.vimfung.luascriptcore.LuaFunction;
import cn.vimfung.luascriptcore.LuaBaseObject;
import cn.vimfung.luascriptcore.LuaContext;
import cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaScriptController;
import cn.vimfung.luascriptcore.LuaNativeUtil;

public class LuaFunction extends LuaBaseObject	// class@000d3c
{
    public LuaContext _context;

    public void LuaFunction(int p0,LuaContext p1){
       super(p0);
       this._context = p1;
    }
    public LuaContext getContext(){
       return this._context;
    }
    public LuaValue invoke(LuaValue[] p0){
       return this.invoke(p0, null);
    }
    public LuaValue invoke(LuaValue[] p0,LuaScriptController p1){
       return LuaNativeUtil.invokeFunction(this._context, this, p0, p1);
    }
}
