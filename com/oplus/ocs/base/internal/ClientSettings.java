package com.oplus.ocs.base.internal.ClientSettings;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class ClientSettings	// class@000af8
{
    public String a;
    public int b;
    public List c;

    public void ClientSettings(String p0){
       super();
       this.a = p0;
       this.b = 0x186ab;
       this.c = new ArrayList();
    }
    public void ClientSettings(String p0,int p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public List getList(){
       return this.c;
    }
    public String getPackageName(){
       return this.a;
    }
    public int getVersionCode(){
       return this.b;
    }
}
