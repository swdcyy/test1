package com.kuaishou.godzilla.idc.KwaiIDCStorage;
import java.util.List;
import java.lang.String;

public interface abstract KwaiIDCStorage	// class@00089b
{

    List readDefaultHosts();
    List readHostTypes();
    List readHosts(String p0);
    List readHostsBatch(List p0);
    int readPosition(String p0);
    int[] readPositionBatch(List p0);
    void storeHostTypes(List p0);
    void storeHosts(String p0,List p1);
    void storePosition(String p0,int p1);
}
