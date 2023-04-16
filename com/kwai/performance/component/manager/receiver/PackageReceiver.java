package com.kwai.performance.component.manager.receiver.PackageReceiver;
import com.kwai.performance.component.manager.receiver.base.DispatchReceiver;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.util.List;
import java.util.Map;

public class PackageReceiver extends DispatchReceiver	// class@001051
{
    public static final List b;
    public static final Map c;
    public static boolean d;

    static {
       ArrayList uArrayList = new ArrayList();
       PackageReceiver.b = uArrayList;
       PackageReceiver.c = new ConcurrentHashMap();
       PackageReceiver.d = false;
       uArrayList.add("android.intent.action.PACKAGE_ADDED");
       uArrayList.add("android.intent.action.PACKAGE_REPLACED");
       uArrayList.add("android.intent.action.PACKAGE_REMOVED");
       uArrayList.add("android.intent.action.PACKAGE_CHANGED");
    }
    public void PackageReceiver(){
       super();
    }
    public Map a(){
       return PackageReceiver.c;
    }
}
