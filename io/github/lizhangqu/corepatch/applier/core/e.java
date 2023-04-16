package io.github.lizhangqu.corepatch.applier.core.e;
import io.github.lizhangqu.corepatch.applier.a;
import java.lang.Object;
import java.io.File;
import io.github.lizhangqu.corepatch.applier.ApplierException;
import java.lang.String;
import java.io.InputStream;
import java.io.OutputStream;

public final class e implements a	// class@00103b
{

    public void e(){
       super();
    }
    public void a(File p0,File p1,File p2){
       throw new ApplierException("not support");
    }
    public void b(File p0){
    }
    public void c(File p0,InputStream p1,OutputStream p2){
       throw new ApplierException("not support");
    }
    public String d(File p0){
       throw new ApplierException("not support");
    }
    public boolean isSupport(){
       return false;
    }
}
