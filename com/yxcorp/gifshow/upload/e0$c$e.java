package com.yxcorp.gifshow.upload.e0$c$e;
import erd.g;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import retrofit2.HttpException;
import retrofit2.p;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.upload.e0;
import java.util.Objects;
import dnc.d2;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;

public class e0$c$e implements g	// class@001e71
{
    public final e0$c b;

    public void e0$c$e(e0$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str1;
       String str2;
       String str3;
       e0 a;
       e0$c g;
       e0$c b;
       d2 uod2;
       Object[] objArray;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, e0$c$e.class, "1")) {
       }else {
          String str = "";
          if (obj instanceof HttpException) {
             try{
                p0 = obj.response().g();
                str1 = p0.request().url().host();
                try{
                   str = p0.o(p0.request().url().url().toString());
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
                str1 = e0;
             }
             str2 = e0;
             str3 = str1;
          }else if(obj instanceof KwaiException){
             p0 = obj.mResponse;
             if (p0 != null) {
                p0 = p0.n();
                str2 = p0.o(p0.request().url().url().toString());
                str3 = p0.request().url().host();
             }
          }
          str3 = str;
          str2 = str3;
       }
    label_00dc :
       return;
    }
}
