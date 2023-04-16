package com.middleware.security.MXSec;
import java.lang.Object;
import com.middleware.security.MXSec$c;
import android.content.Context;
import u38.c;
import java.lang.IllegalStateException;
import java.lang.String;
import x38.b;
import com.middleware.security.MXSec$b;
import t38.a;
import com.middleware.security.wrapper.IKSecurityBase;
import com.middleware.security.MXSec$a;
import u38.b;

public class MXSec	// class@000fb2
{
    public String egid;
    public Context mContext;
    public c mInitParams;
    public b mKSTEWrapper;
    public IKSecurityBase mWrapper;
    public String oaid;

    public void MXSec(){
       super();
    }
    public static MXSec get(){
       return MXSec$c.a;
    }
    public Context getContext(){
       return this.mContext;
    }
    public c getInitParams(){
       MXSec tmInitParams = this.mInitParams;
       if (tmInitParams != null) {
          return tmInitParams;
       }
       throw new IllegalStateException("IMXSecInitParams cannot not null");
    }
    public b getKSTEWrapper(){
       MXSec tmKSTEWrappe = this.mKSTEWrapper;
       if (tmKSTEWrappe == null) {
          tmKSTEWrappe = new MXSec$b(this);
       }
       return tmKSTEWrappe;
    }
    public a getMXWrapper(){
       return a.c();
    }
    public IKSecurityBase getWrapper(){
       MXSec tmWrapper = this.mWrapper;
       if (tmWrapper == null) {
          tmWrapper = new MXSec$a(this);
       }
       return tmWrapper;
    }
    public MXSec init(c p0){
       this.mInitParams = p0;
       return this;
    }
    public boolean isDebugMode(){
       return this.getInitParams().getCommonParams().isDebugMode();
    }
    public boolean isTest(){
       return this.getInitParams().getCommonParams().isTestMode();
    }
    public MXSec setKSTEWrapper(b p0){
       if (this.mKSTEWrapper != null) {
          return this;
       }
       this.mKSTEWrapper = p0;
       return this;
    }
    public MXSec setWrapper(IKSecurityBase p0){
       if (this.mWrapper != null) {
          return this;
       }
       this.mWrapper = p0;
       a uoa = a.c();
       MXSec tmWrapper = this.mWrapper;
       if (uoa.a == null) {
          uoa.a = tmWrapper;
       }
       return this;
    }
}
