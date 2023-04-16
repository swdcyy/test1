package com.yxcorp.gifshow.edit.previewer.utils.b;
import java.util.Comparator;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.previewer.utils.d;

public final class b implements Comparator	// class@001b70
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (d.d(p0) - d.d(p1));
    }
}
