package com.yxcorp.gifshow.edit.previewer.utils.c;
import java.util.Comparator;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.previewer.utils.d;

public final class c implements Comparator	// class@001b71
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (d.d(p0) - d.d(p1));
    }
}
