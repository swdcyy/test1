package com.kuaishou.webkit.internal.annotation.IntDef;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract IntDef implements Annotation	// class@001324
{

    boolean flag();
    String[] prefix();
    String[] suffix();
    int[] value();
}
