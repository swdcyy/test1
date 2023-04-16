package com.kwai.plugin.dva.repository.model.PluginConfig;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class PluginConfig	// class@00137a
{
    public String[] a;
    public final List depends;
    public final String md5;
    public final String name;
    public final int type;
    public final String url;
    public final int version;

    public void PluginConfig(String p0,int p1,String p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public void PluginConfig(String p0,int p1,String p2,String p3,List p4){
       super(p0, p1, p2, p3, p4, 0);
    }
    public void PluginConfig(String p0,int p1,String p2,String p3,List p4,int p5){
       super();
       this.name = p0;
       this.version = p1;
       this.url = p2;
       this.md5 = p3;
       this.depends = p4;
       this.type = p5;
    }
    public String[] getUrls(){
       PluginConfig obj = PatchProxy.apply(null, this, PluginConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          _monitor_enter(this);
          if (this.a == null) {
             obj = this.url;
             if (obj == null || obj.isEmpty()) {
                String[] stringArray = new String[0];
                this.a = stringArray;
             }else {
                this.a = (this.url).split("#");
             }
          }
          _monitor_exit(this);
       }
       return this.a;
    }
}
