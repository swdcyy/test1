package com.taobao.gcanvas.bridges.spec.module.IGBridgeModule;
import java.lang.String;
import java.lang.Object;
import yq8.b;
import org.json.JSONObject;
import org.json.JSONArray;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule$ContextType;

public interface abstract IGBridgeModule	// class@000dfe
{

    void a(String p0);
    void b(String p0,String p1,int p2,Object p3);
    b c(String p0);
    String d(JSONObject p0);
    void disable(String p0);
    void e(String p0,double p1);
    void f(int p0);
    String g(String p0,String p1,int p2);
    void h(String p0,String p1,int p2);
    void i(JSONArray p0,Object p1);
    void j(String p0,IGBridgeModule$ContextType p1);
}
