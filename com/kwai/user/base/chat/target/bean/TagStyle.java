package com.kwai.user.base.chat.target.bean.TagStyle;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import com.kwai.user.base.chat.target.bean.Int32Color;

public final class TagStyle implements Serializable	// class@00197a
{
    public Int32Color mBackgroundColor;
    public Int32Color mFontColor;
    public static final long serialVersionUID = 0x690f28c19b1d86e0;

    public void TagStyle(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TagStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || TagStyle.class != p0.getClass()) {
          return false;
       }
       if (!d.a(this.mFontColor, p0.mFontColor) || !d.a(this.mBackgroundColor, p0.mBackgroundColor)) {
          b = false;
       }
       return b;
    }
    public boolean isValid(){
       boolean b;
       TagStyle obj = PatchProxy.apply(null, this, TagStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mFontColor;
       if (obj != null && obj.isValid()) {
          obj = this.mBackgroundColor;
          if (obj != null && obj.isValid()) {
             b = true;
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
}
