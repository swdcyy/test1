package com.kwai.video.clipkit.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.video.clipkit.ClipMVImportHandler$MVImportVideoInfo;
import com.kwai.video.clipkit.ClipMVImportHandler;

public final class a implements Comparator	// class@001a54
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return ClipMVImportHandler.lambda$calculateVideoInfos$1(p0, p1);
    }
}
