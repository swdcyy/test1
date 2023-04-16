package com.yxcorp.retrofit.idc.models.Host;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import ok.k;

public class Host implements Serializable	// class@0013d7
{
    public String mHost;
    public boolean mIsHttps;
    public static final long serialVersionUID = 0x7868c63189d30aca;

    public void Host(String p0){
       super(p0, false);
    }
    public void Host(String p0,boolean p1){
       super();
       this.mHost = p0;
       this.mIsHttps = p1;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mIsHttps != p0.mIsHttps || !TextUtils.equals(p0.mHost, this.mHost)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.mHost,Boolean.valueOf(this.mIsHttps)};
       return k.b(objArray);
    }
    public String toString(){
       return this.mHost;
    }
}
