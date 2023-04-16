package com.kwai.video.ksmemorykit.a;
import java.util.Comparator;
import java.lang.Object;
import java.util.Map$Entry;
import com.kwai.video.ksmemorykit.EditorMemoryProjectCreator;

public final class a implements Comparator	// class@00090c
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return EditorMemoryProjectCreator.lambda$createProjectFromAnalyzeResult$0(p0, p1);
    }
}
