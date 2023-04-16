package com.RNFetchBlob.RNFetchBlobReq$1;
import okhttp3.Interceptor;
import com.RNFetchBlob.RNFetchBlobReq;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.String;
import java.util.ArrayList;

public class RNFetchBlobReq$1 implements Interceptor	// class@000d59
{
    public final RNFetchBlobReq a;

    public void RNFetchBlobReq$1(RNFetchBlobReq p0){
       this.a = p0;
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       this.a.t.add(p0.request().url().toString());
       return p0.proceed(p0.request());
    }
}
