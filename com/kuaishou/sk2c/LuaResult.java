package com.kuaishou.sk2c.LuaResult;
import java.lang.String;
import java.lang.Object;

public class LuaResult	// class@000f31
{
    public String errorMessage;
    public boolean success;

    public void LuaResult(boolean p0,String p1){
       super();
       this.success = p0;
       this.errorMessage = p1;
    }
}
