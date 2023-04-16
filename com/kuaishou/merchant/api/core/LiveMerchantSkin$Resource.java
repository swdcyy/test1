package com.kuaishou.merchant.api.core.LiveMerchantSkin$Resource;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import qkd.b;

public class LiveMerchantSkin$Resource implements Serializable	// class@001506
{
    public File mDir;
    public String mDirname;
    public File mFile;
    public String mFilename;
    public final LiveMerchantSkin this$0;
    public static final long serialVersionUID = 0x6dd0830d18aae18a;

    public void LiveMerchantSkin$Resource(LiveMerchantSkin p0,String p1,String p2){
       this.this$0 = p0;
       super();
       this.mDirname = p1;
       this.mFilename = p2;
    }
    public File getDir(){
       File uFile;
       LiveMerchantSkin obj = PatchProxy.apply(null, this, LiveMerchantSkin$Resource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDir == null) {
          obj = (TextUtils.x(this.mDirname))? this.this$0.mRoot: new File(this.this$0.mRoot, this.mDirname);
          this.mDir = obj;
       }
       return this.mDir;
    }
    public File getFile(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantSkin$Resource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFile == null) {
          this.mFile = new File(this.getDir(), this.mFilename);
       }
       return this.mFile;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantSkin$Resource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.S(this.getDir()) && b.S(this.getFile()))? true: false;
       return b;
    }
}
