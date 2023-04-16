package com.kwai.plugin.dva.feature.core.loader.classloader.classindex.IClassIndexProvider;
import java.util.Collection;

public interface abstract IClassIndexProvider	// class@001315
{
    public static final String CLASS_INDEX_NAME = "com.kwai.plugin.dva.feature.core.loader.classloader.classindex.ClassIndexProvider";

    Collection getClassIndexes();
}
