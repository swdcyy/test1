package com.yxcorp.utility.repo.a$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.utility.repo.a;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.utility.repo.ParamsHolder;
import java.lang.Integer;
import java.util.Objects;
import vkd.a;
import java.lang.Runnable;
import t45.c;

public class a$a implements Application$ActivityLifecycleCallbacks	// class@0009d5
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (p1 != null && p1.getBoolean("KEY_REPO_NEED_RESTORE", false)) {
          this.b.d();
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       a$a tb = this.b;
       a a = tb.a;
       _monitor_enter(a);
       String str = String.valueOf(p0.hashCode());
       Set set = tb.d.remove(str);
       if (set != null) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             ParamsHolder paramsHolder = iterator.next();
             ParamsHolder mOwners = paramsHolder.mOwners;
             if (mOwners != null) {
                mOwners.remove(str);
                if (paramsHolder.mOwners.isEmpty()) {
                   tb.c.add(Integer.valueOf(paramsHolder.mParams.hashCode()));
                }
             }
          }
          set.clear();
       }
       _monitor_exit(a);
       return;
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
       a a = this.b.a;
       _monitor_enter(a);
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          ParamsHolder paramsHolder = this.b.b.get(Integer.valueOf(i));
          if (paramsHolder != null) {
             paramsHolder = paramsHolder.mOwners;
             if (paramsHolder != null && paramsHolder.isEmpty()) {
                this.b.b.remove(Integer.valueOf(i));
             }
          }
       }
       _monitor_exit(a);
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a a = this.b.a;
       _monitor_enter(a);
       if (this.b.d.containsKey(String.valueOf(p0.hashCode()))) {
          p1.putBoolean("KEY_REPO_NEED_RESTORE", true);
          a$a tb = this.b;
          Objects.requireNonNull(tb);
          c.a(new a(tb));
       }
       _monitor_exit(a);
       return;
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
