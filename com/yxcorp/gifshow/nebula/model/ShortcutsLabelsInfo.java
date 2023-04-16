package com.yxcorp.gifshow.nebula.model.ShortcutsLabelsInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShortcutsLabelsInfo implements Serializable	// class@002153
{
    public String mIcon;
    public int mIndex;
    public String mKey;
    public String mText;
    public String mUri;
    public static final long serialVersionUID = 0xa1f4d92d7eaec0f2;

    public void ShortcutsLabelsInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShortcutsLabelsInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShortcutsLabelsInfo{mIndex="+this.mIndex+", mKey=\'"+this.mKey+'''+", mIcon=\'"+this.mIcon+'''+", mText=\'"+this.mText+'''+", mUri=\'"+this.mUri+'''+'}';
    }
}
