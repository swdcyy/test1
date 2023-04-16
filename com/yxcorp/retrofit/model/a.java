package com.yxcorp.retrofit.model.a;
import retrofit2.a;
import java.lang.Object;
import retrofit2.p;
import njd.a;
import okhttp3.Response;
import byd.a;
import com.yxcorp.retrofit.model.a$a;
import okhttp3.Request;

public class a implements a	// class@00097b
{
    public final a mRawCall;

    public void a(a p0){
       super();
       this.mRawCall = p0;
    }
    public void cancel(){
       this.mRawCall.cancel();
    }
    public Object clone(){
       return this.clone();
    }
    public a clone(){
       return new a(this.mRawCall.clone());
    }
    public p execute(){
       p op = this.mRawCall.execute();
       Object obj = op.a();
       if (obj instanceof a) {
          obj.o(op.g());
       }
       return op;
    }
    public void h4(a p0){
       this.mRawCall.h4(new a$a(this, p0));
    }
    public boolean isCanceled(){
       return this.mRawCall.isCanceled();
    }
    public boolean isExecuted(){
       return this.mRawCall.isExecuted();
    }
    public Request request(){
       return this.mRawCall.request();
    }
}
