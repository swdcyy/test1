package com.kuaishou.merchant.home2.feed.model.CardStyle;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class CardStyle implements Serializable	// class@001799
{
    public String mCardBgImgUrl;
    public String mColorEndBg;
    public String mColorStartBg;
    public String mIconImgUrl;
    public String mIconText;
    public int mLiveLabel;
    public static final CardStyle EMPTY;
    public static final long serialVersionUID;

    static {
       CardStyle.EMPTY = new CardStyle();
    }
    public void CardStyle(){
       super();
    }
    public boolean hasColorBg(){
       Object obj = PatchProxy.apply(null, this, CardStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mColorStartBg) && !TextUtils.isEmpty(this.mColorEndBg))? true: false;
       return b;
    }
}
