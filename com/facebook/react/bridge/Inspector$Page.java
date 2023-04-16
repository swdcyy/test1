package com.facebook.react.bridge.Inspector$Page;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Inspector$Page	// class@0011c8
{
    public final int mId;
    public final String mTitle;
    public final String mVM;

    public void Inspector$Page(int p0,String p1,String p2){
       super();
       this.mId = p0;
       this.mTitle = p1;
       this.mVM = p2;
    }
    public int getId(){
       return this.mId;
    }
    public String getTitle(){
       return this.mTitle;
    }
    public String getVM(){
       return this.mVM;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Inspector$Page.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Page{mId="+this.mId+", mTitle=\'"+this.mTitle+'''+'}';
    }
}
