package com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import wkd.b;
import te6.b;
import java.util.Iterator;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class BifrostCommonResourceEntry implements Serializable	// class@000a85
{
    public boolean mEnableWarmup;
    public String mFileExtension;
    public int mType;
    public List mUrls;
    public boolean mWarmUpNecessary;
    public static final long serialVersionUID = 0xe665bd1bc1a6cda4;

    public void BifrostCommonResourceEntry(){
       super();
    }
    public String getUrl(){
       Object[] objArray = null;
       BifrostCommonResourceEntry obj = PatchProxy.apply(objArray, this, BifrostCommonResourceEntry.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUrls;
       if (obj == null || obj.isEmpty()) {
          return objArray;
       }
       return this.mUrls.get(0);
    }
    public List getUrls(){
       return this.mUrls;
    }
    public final String getWarmupUrl(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, BifrostCommonResourceEntry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1427269270);
       Iterator iterator = this.mUrls.iterator();
       if (iterator.hasNext()) {
          String str = iterator.next();
          if (this.mType == 1 && obj.t(str)) {
             objArray = str;
          }else if(this.mType != 1){
             objArray = obj.B(str);
          }
       }
       return objArray;
    }
    public boolean isAlreadyWarmup(){
       Object obj = PatchProxy.apply(null, this, BifrostCommonResourceEntry.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.getWarmupUrl()) ^ 0x01);
    }
    public boolean isValid(){
       BifrostCommonResourceEntry obj = PatchProxy.apply(null, this, BifrostCommonResourceEntry.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUrls;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
}
