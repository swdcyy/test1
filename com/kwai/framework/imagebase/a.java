package com.kwai.framework.imagebase.a;
import e0d.d$d;
import java.lang.Object;
import java.util.concurrent.Executor;
import android.content.ContentResolver;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import x66.e;

public final class a implements d$d	// class@000b58
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final LocalVideoThumbnailProducer a(Executor p0,ContentResolver p1){
       return new e(p0, p1);
    }
}
