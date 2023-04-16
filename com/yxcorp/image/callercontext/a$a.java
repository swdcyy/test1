package com.yxcorp.image.callercontext.a$a;
import java.lang.Object;
import com.yxcorp.image.callercontext.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.image.callercontext.SubSolution;
import com.yxcorp.image.callercontext.UpBizFt;

public class a$a	// class@001a03
{
    public String a;
    public Object b;
    public ImageSource c;
    public String d;
    public SubSolution e;
    public String f;
    public UpBizFt g;
    public String h;
    public String i;

    public void a$a(){
       super();
       this.a = "";
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public a$a b(String p0){
       this.d = p0;
       return this;
    }
    public a$a c(String p0){
       this.f = p0;
       return this;
    }
    public a$a d(ImageSource p0){
       this.c = p0;
       return this;
    }
    public a$a e(SubSolution p0){
       this.e = p0;
       return this;
    }
    public a$a f(UpBizFt p0){
       this.g = p0;
       return this;
    }
}
