package com.kwai.video.ksmodelmanager.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.video.ksmodelmanager.config.CacheModelInfo;
import com.kwai.video.ksmodelmanager.ModelRepo;

public final class a implements Comparator	// class@000914
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return ModelRepo.lambda$getModelFile$0(p0, p1);
    }
}
