package com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.j;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import bd.d;
import android.net.Uri;
import java.io.InputStream;
import java.lang.String;

public class q extends j	// class@001143
{
    public final ContentResolver c;

    public void q(Executor p0,b p1,ContentResolver p2){
       super(p0, p1);
       this.c = p2;
    }
    public d c(ImageRequest p0){
       return this.d(this.c.openInputStream(p0.s()), -1);
    }
    public String e(){
       return "QualifiedResourceFetchProducer";
    }
}
