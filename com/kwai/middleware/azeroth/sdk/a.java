package com.kwai.middleware.azeroth.sdk.a;
import java.lang.Runnable;
import java.util.HashMap;
import java.lang.Object;
import com.kwai.middleware.azeroth.Azeroth2;
import com.kwai.middleware.azeroth.AzerothStorage;
import java.util.Objects;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.lang.String;
import q97.c;
import java.lang.Throwable;
import xb7.a;
import kotlin.jvm.internal.a;

public final class a implements Runnable	// class@000f1d
{
    public final HashMap b;

    public void a(HashMap p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       try{
          Azeroth2 b = Azeroth2.B;
          AzerothStorage uAzerothStor = b.p();
          a tb = this.b;
          Objects.requireNonNull(uAzerothStor);
          if (tb == null) {
          }else {
             str = b.k().r(tb, AzerothStorage.b);
          label_0025 :
             String str1 = str;
             a.h(str1, "json");
             a.d(uAzerothStor.a(), "KEY_SDK_CONFIG_MAP", str1, false, 4, null);
             return;
          }
       }catch(java.lang.Exception e0){
          Azeroth2.B.h().c(e0);
       }
       str = "";
       goto label_0025 ;
    }
}
