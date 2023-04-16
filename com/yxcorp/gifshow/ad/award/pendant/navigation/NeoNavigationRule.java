package com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;

public final class NeoNavigationRule implements Serializable	// class@001522
{
    public String cover;
    public String img;
    public String link;
    public static final NeoNavigationRule$a Companion;
    public static final long serialVersionUID;

    static {
       NeoNavigationRule.Companion = new NeoNavigationRule$a(null);
    }
    public void NeoNavigationRule(){
       super();
       this.img = "";
       this.cover = "";
       this.link = "";
    }
    public final boolean isLegal(){
       NeoNavigationRule obj = PatchProxy.apply(null, this, NeoNavigationRule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (this.img.length() > 0)? 1: null;
       if (obj) {
          obj = (this.link.length() > 0)? 1: 0;
          if (obj) {
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
}
