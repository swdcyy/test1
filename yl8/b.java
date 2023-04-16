package yl8.b;
import java.lang.String;
import erd.g;
import brd.t;

public interface abstract b	// class@0028c9
{

    void b();
    void fireSync();
    String getBizId();
    void onSync(b p0);
    void startSync(g p0);
    void startSyncWithActivity(t p0);
    void startSyncWithFragment(t p0);
    void startSyncWithFragment(t p0,g p1);
    void sync(b p0);
}
