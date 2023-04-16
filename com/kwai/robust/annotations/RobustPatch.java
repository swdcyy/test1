package com.kwai.robust.annotations.RobustPatch;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract RobustPatch implements Annotation	// class@00140e
{

    int access();
    String clazz();
    String descriptor();
    int id();
    String name();
}
