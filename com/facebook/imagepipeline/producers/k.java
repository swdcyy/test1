package com.facebook.imagepipeline.producers.k;
import com.facebook.imagepipeline.producers.j;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.request.ImageRequest;
import bd.d;
import java.io.FileInputStream;
import java.io.File;
import java.lang.String;
import java.io.InputStream;

public class k extends j	// class@00113a
{

    public void k(Executor p0,b p1){
       super(p0, p1);
    }
    public d c(ImageRequest p0){
       return this.d(new FileInputStream(p0.r().toString()), (int)p0.r().length());
    }
    public String e(){
       return "LocalFileFetchProducer";
    }
}
