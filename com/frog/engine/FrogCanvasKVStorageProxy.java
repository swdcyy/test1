package com.frog.engine.FrogCanvasKVStorageProxy;
import java.lang.String;
import org.json.JSONObject;

public interface abstract FrogCanvasKVStorageProxy	// class@0014ef
{

    void clean();
    JSONObject get(String p0);
    String[] getAllKeys();
    long getTotalSize();
    void init(String p0);
    void remove(String p0);
    void save(String p0,JSONObject p1);
}
