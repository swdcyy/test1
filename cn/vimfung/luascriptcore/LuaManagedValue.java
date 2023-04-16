package cn.vimfung.luascriptcore.LuaManagedValue;
import cn.vimfung.luascriptcore.LuaBaseObject;
import cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaContext;

public class LuaManagedValue extends LuaBaseObject	// class@000d3d
{
    public LuaContext _context;
    public LuaValue _source;

    public void LuaManagedValue(LuaValue p0,LuaContext p1){
       super();
       this._source = p0;
       this._context = p1;
       p1.retainValue(p0);
    }
    public void finalize(){
       this._context.releaseValue(this._source);
       super.finalize();
    }
    public LuaValue getSource(){
       return this._source;
    }
}
