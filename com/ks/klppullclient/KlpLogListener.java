package com.ks.klppullclient.KlpLogListener;
import com.ks.klppullclient.KlpLogLevel;
import java.lang.String;

public interface abstract KlpLogListener	// class@000742
{

    void onLog(KlpLogLevel p0,String p1,long p2);
}
