package com.yxcorp.gifshow.ad.award.flow.model.CardStyle;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.CardStyle$a;
import nsd.u;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;

public final class CardStyle implements Serializable	// class@0014fb
{
    public final String bgColorEnd;
    public final String bgColorStart;
    public final String cardBgImgUrl;
    public final String iconImgUrl;
    public final String iconText;
    public final Integer liveLabel;
    public static final CardStyle$a Companion;
    public static final long serialVersionUID;

    static {
       CardStyle.Companion = new CardStyle$a(null);
    }
    public void CardStyle(String p0,String p1,String p2,String p3,String p4,Integer p5){
       super();
       this.iconImgUrl = p0;
       this.iconText = p1;
       this.bgColorStart = p2;
       this.bgColorEnd = p3;
       this.cardBgImgUrl = p4;
       this.liveLabel = p5;
    }
    public final boolean hasColorBg(){
       CardStyle obj = PatchProxy.apply(null, this, CardStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.bgColorStart;
       boolean b = false;
       obj = (obj == null || !obj.length())? 1: null;
       if (!obj) {
          obj = this.bgColorEnd;
          obj = (obj == null || !obj.length())? 1: 0;
          if (!obj) {
             b = true;
          }
       }
       return b;
    }
}
