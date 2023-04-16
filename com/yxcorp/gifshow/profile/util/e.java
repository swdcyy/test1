package com.yxcorp.gifshow.profile.util.e;
import erd.g;
import java.lang.Object;
import com.kwai.framework.model.response.PersonalRecoResponse;
import y95.a;
import java.lang.String;

public final class e implements g	// class@0015d6
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       if (p0.isSuccess()) {
          a.d(p0.userRecoBit);
          a.c(String.valueOf(p0.deviceBit));
       }
       return;
    }
}
