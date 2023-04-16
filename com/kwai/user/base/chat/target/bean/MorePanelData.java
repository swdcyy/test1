package com.kwai.user.base.chat.target.bean.MorePanelData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;

public final class MorePanelData implements Serializable	// class@001979
{
    public String mActionUrl;
    public String mIconDarkUrl;
    public String mIconUrl;
    public String mKey;
    public I18NText mPanelText;
    public static final long serialVersionUID = 0x568af162d36ab287;

    public void MorePanelData(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MorePanelData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || MorePanelData.class != p0.getClass()) {
          return false;
       }
       if (!d.a(this.mKey, p0.mKey) || (!d.a(this.mPanelText, p0.mPanelText) || (!d.a(this.mIconUrl, p0.mIconUrl) || (!d.a(this.mIconDarkUrl, p0.mIconDarkUrl) || !d.a(this.mActionUrl, p0.mActionUrl))))) {
          b = false;
       }
       return b;
    }
}
