package com.kuaishou.godzilla.idc.KwaiIDCHost;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;

public class KwaiIDCHost implements Serializable	// class@000898
{
    public final String mDomain;
    public final boolean mIsHttps;
    public final int mPort;
    public static final long serialVersionUID = 0xee056a59aecdec4c;

    public void KwaiIDCHost(String p0){
       super(p0, 80, false);
    }
    public void KwaiIDCHost(String p0,int p1,boolean p2){
       super();
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("domain is empty");
       }
       if (!p1) {
          p1 = (p2)? 443: 80;
       }
    label_0012 :
       if (p1 >= 0 && p1 <= 0xffff) {
          this.mDomain = p0;
          this.mPort = p1;
          this.mIsHttps = p2;
          return;
       }else {
          throw new IllegalArgumentException("scheme "+p1+" is not between "+0+" and "+0xffff);
       }
    }
    public void KwaiIDCHost(String p0,boolean p1){
       super(p0, 0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiIDCHost.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!k.a(this.mDomain, p0.mDomain) || (this.mIsHttps != p0.mIsHttps || this.mPort != p0.mPort)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, KwaiIDCHost.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mDomain,Integer.valueOf(this.mPort),Boolean.valueOf(this.mIsHttps)};
       return k.b(obj);
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, KwaiIDCHost.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "{"+"domain: ";
       String str = (TextUtils.isEmpty(this.mDomain))? "unknown": this.mDomain;
       return obj+str+", port: "+this.mPort+", isHttps: "+this.mIsHttps+"}";
    }
}
