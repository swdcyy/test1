package cn.vimfung.luascriptcore.LuaTuple;
import cn.vimfung.luascriptcore.LuaBaseObject;
import java.util.ArrayList;
import java.lang.Object;
import cn.vimfung.luascriptcore.LuaValue;

public class LuaTuple extends LuaBaseObject	// class@000d42
{
    public ArrayList _returnValues;

    public void LuaTuple(){
       super();
       this._returnValues = new ArrayList();
    }
    public void addReturnValue(Object p0){
       this._returnValues.add(new LuaValue(p0));
    }
    public int count(){
       return this._returnValues.size();
    }
    public Object getReturnValueByIndex(int p0){
       return this._returnValues.get(p0).toObject();
    }
}
