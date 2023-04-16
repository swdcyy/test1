package com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import tc.v;
import tc.h;
import id.b0;
import java.lang.String;
import id.i;
import com.facebook.cache.common.CacheKey;

public class BitmapMemoryCacheGetProducer extends BitmapMemoryCacheProducer	// class@001113
{

    public void BitmapMemoryCacheGetProducer(v p0,h p1,b0 p2){
       super(p0, p1, p2);
    }
    public String getOriginSubcategory(){
       return "pipe_ui";
    }
    public String getProducerName(){
       return "BitmapMemoryCacheGetProducer";
    }
    public i wrapConsumer(i p0,CacheKey p1,boolean p2){
       return p0;
    }
}
