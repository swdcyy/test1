package com.kwai.performance.component.manager.receiver.base.DispatchReceiver;
import android.content.BroadcastReceiver;
import java.util.Map;
import android.content.Context;
import android.content.Intent;
import java.lang.System;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import android.content.IntentFilter;
import android.content.ContentResolver;
import java.lang.String;
import com.kwai.performance.component.manager.receiver.base.a;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public abstract class DispatchReceiver extends BroadcastReceiver	// class@000d7c
{
    public static final int a;

    public void DispatchReceiver(){
       super();
    }
    public abstract Map a();
    public void onReceive(Context p0,Intent p1){
       System.currentTimeMillis();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a().entrySet().iterator();
       while (true) {
          IntentFilter intentFilter = null;
          boolean b = true;
          while (true) {
             if (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (uEntry.getValue().match(p0.getContentResolver(), p1, b, "DispatchReceiver") >= 0) {
                   uArrayList.add(uEntry);
                   if (intentFilter || uEntry.getValue().getPriority()) {
                      intentFilter = 1;
                   }else {
                      continue ;
                   }
                }
             }else if(intentFilter != null && uArrayList.size() > b){
                Collections.sort(uArrayList, a.b);
             }
             System.currentTimeMillis();
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().getKey().onReceive(p0, p1);
             }
             System.currentTimeMillis();
             return;
          }
       }
    }
}
