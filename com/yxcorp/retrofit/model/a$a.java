package com.yxcorp.retrofit.model.a$a;
import byd.a;
import com.yxcorp.retrofit.model.a;
import java.lang.Object;
import retrofit2.a;
import java.lang.Throwable;
import retrofit2.p;
import njd.a;
import okhttp3.Response;

public class a$a implements a	// class@00097a
{
    public final a b;
    public final a c;

    public void a$a(a p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(a p0,Throwable p1){
       this.b.onFailure(p0, p1);
    }
    public void onResponse(a p0,p p1){
       Object obj = p1.a();
       if (obj instanceof a) {
          obj.o(p1.g());
       }
       this.b.onResponse(p0, p1);
       return;
    }
}
