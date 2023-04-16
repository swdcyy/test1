package com.tencent.mm.opensdk.diffdev.DiffDevOAuthFactory;
import java.lang.Object;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.diffdev.a.a;

public class DiffDevOAuthFactory	// class@000e78
{
    public static IDiffDevOAuth v1Instance;

    public void DiffDevOAuthFactory(){
       super();
    }
    public static IDiffDevOAuth getDiffDevOAuth(){
       return DiffDevOAuthFactory.getDiffDevOAuth(1);
    }
    public static IDiffDevOAuth getDiffDevOAuth(int p0){
       Log.v("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth, version = "+p0);
       int i = 1;
       if (p0 > i) {
          Log.e("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth fail, unsupported version = "+p0);
          return null;
       }else if(p0 != i){
          return null;
       }else if(DiffDevOAuthFactory.v1Instance == null){
          DiffDevOAuthFactory.v1Instance = new a();
       }
       return DiffDevOAuthFactory.v1Instance;
    }
}
