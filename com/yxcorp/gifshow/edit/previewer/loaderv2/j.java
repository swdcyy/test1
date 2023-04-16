package com.yxcorp.gifshow.edit.previewer.loaderv2.j;
import java.util.Comparator;
import java.lang.Object;
import android.util.Pair;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.Timestamp;

public final class j implements Comparator	// class@001b42
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p0.second.getAttributes().getCreatedAt().getSeconds() - p1.second.getAttributes().getCreatedAt().getSeconds());
    }
}
