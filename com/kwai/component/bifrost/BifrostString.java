package com.kwai.component.bifrost.BifrostString;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;

public class BifrostString implements Serializable	// class@0020c7
{
    public String english;
    public String simplifiedChinese;
    public String traditionalChinese;

    public void BifrostString(){
       super();
    }
    public String getString(){
       Object obj = PatchProxy.apply(null, this, BifrostString.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d() == 1) {
          return this.simplifiedChinese;
       }
       if (a.d() == 2) {
          return this.traditionalChinese;
       }
       return this.english;
    }
}
