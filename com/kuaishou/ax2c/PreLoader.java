package com.kuaishou.ax2c.PreLoader;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.ax2c.Ax2cThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.kuaishou.ax2c.PreLoader$MaxPriorityThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import java.util.List;
import java.lang.String;
import java.util.concurrent.Future;
import com.kuaishou.ax2c.TagFuture;
import com.kuaishou.ax2c.PreloadParam;
import android.content.MutableContextWrapper;
import android.content.Context;
import com.kuaishou.ax2c.PreLoader$2;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import android.util.Pair;
import com.kuaishou.ax2c.AX2C;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.ThreadLocal;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;
import java.lang.ref.WeakReference;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.ax2c.PreLoader$3;
import androidx.lifecycle.LifecycleObserver;
import java.util.Map;
import com.kuaishou.ax2c.PreLoader$1;
import java.lang.Runnable;
import android.view.ViewStub;
import android.view.ViewParent;
import java.lang.StringBuilder;
import android.view.ViewGroup$LayoutParams;

public class PreLoader	// class@000fbd
{
    public final ConcurrentHashMap clearLayoutRecord;
    public final List ctxRef;
    public final Ax2cThreadPoolExecutor executorService;
    public final Map indexMap;
    public LayoutInflaterDelegate mInflaterDelegate;
    public final ConcurrentHashMap map;
    public final ConcurrentHashMap resToCurrentMap;
    public static PreLoader instance;

    public void PreLoader(){
       super();
       this.map = new ConcurrentHashMap();
       Ax2cThreadPoolExecutor uAx2cThreadP = new Ax2cThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new PreLoader$MaxPriorityThreadFactory());
       this.executorService = v0;
       this.ctxRef = new ArrayList();
       this.indexMap = new ConcurrentHashMap();
       this.resToCurrentMap = new ConcurrentHashMap();
       this.clearLayoutRecord = new ConcurrentHashMap();
    }
    public static PreLoader getInstance(){
       if (PreLoader.instance == null) {
          PreLoader preLoader = PreLoader.class;
          _monitor_enter(preLoader);
          if (PreLoader.instance == null) {
             PreLoader.instance = new PreLoader();
          }
          _monitor_exit(preLoader);
       }
       return PreLoader.instance;
    }
    public final boolean checkPreloadUnusedRes(){
       Iterator iterator = this.map.keySet().iterator();
       boolean b = false;
       int i = 0;
       while (iterator.hasNext()) {
          List list = this.map.get(Integer.valueOf(iterator.next().intValue()));
          if (list != null) {
             i = i + list.size();
          }
       }
       if (i > 15) {
          b = true;
       }
       return b;
    }
    public void clear(int p0,String p1){
       List list = this.map.get(Integer.valueOf(p0));
       if (list != null && list.size()) {
          Iterator iterator = list.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Future uFuture = iterator.next();
             if (uFuture instanceof TagFuture && (uFuture.mTag).equals(p1)) {
                uFuture.cancel(false);
                break ;
             }
             i = i + 1;
          }
          if (i < list.size()) {
             list.remove(i);
             if (!list.size()) {
                this.map.remove(Integer.valueOf(p0));
             }
          }
       }
       if (this.getActiveAndWaitTaskNum() > 0) {
          this.clearLayoutRecord.put(p1, Integer.valueOf(p0));
       }
       return;
    }
    public void clear(int[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.map.remove(Integer.valueOf(p0[i]));
       }
       this.getActiveAndWaitTaskNum();
       return;
    }
    public void clearAll(){
       Iterator iterator = this.map.keySet().iterator();
       while (iterator.hasNext()) {
          this.map.remove(Integer.valueOf(iterator.next().intValue()));
       }
       this.getActiveAndWaitTaskNum();
       return;
    }
    public final Future doLoad(int p0,PreloadParam p1){
       MutableContextWrapper mutableConte = (p1.useMutableContext != null)? new MutableContextWrapper(p1.context): p1.context;
       PreloadParam tag = p1.tag;
       PreLoader$2 u2 = new PreLoader$2(this, p1, p0, mutableConte, tag);
       return this.executorService.submit(v8, tag);
    }
    public final void ensureResMapValid(int p0){
       if (this.resToCurrentMap.get(Integer.valueOf(p0)) == null) {
          this.resToCurrentMap.put(Integer.valueOf(p0), Integer.valueOf(0));
       }
       return;
    }
    public final int getActiveAndWaitTaskNum(){
       return (this.executorService.getQueue().size() + this.executorService.getActiveCount());
    }
    public View getOrWait(Context p0,int p1,ViewGroup p2,boolean p3){
       return this.getOrWait(p0, p1, p2, p3, true, null);
    }
    public View getOrWait(Context p0,int p1,ViewGroup p2,boolean p3,boolean p4){
       return this.getOrWait(p0, p1, p2, p3, p4, null);
    }
    public View getOrWait(Context p0,int p1,ViewGroup p2,boolean p3,boolean p4,PreLoader$InflateListener p5){
       String str = "InterruptedException";
       try{
          List list = this.map.get(Integer.valueOf(p1));
          if (list == null || !list.size()) {
             if (p5 != null) {
                p5.onFallback("future is null");
             }
             return new AX2C(p0, this.mInflaterDelegate).inflateSync(p1, p2, p3, p4, p5);
          }else if(list.size() == 1){
             this.map.remove(Integer.valueOf(p1));
          }
          Pair pair = list.remove(0).get();
          Pair first = pair.first;
          if (first instanceof MutableContextWrapper) {
             first.setBaseContext(p0);
          }
          first = pair.second;
          if (first == null) {
             if (p5 != null) {
                p5.onFallback("view is null");
             }
             return new AX2C(p0, this.mInflaterDelegate).inflateSync(p1, p2, p3, p4, p5);
          }else if(p2 != null && p3){
             p2.addView(first);
          }
          return pair.second;
       }catch(java.lang.InterruptedException e0){
          if (p5) {
             p5.onFallback(e0);
          }
          return new AX2C(p0, this.mInflaterDelegate).inflateSync(p1, p2, p3, false, p5);
       }catch(java.util.concurrent.ExecutionException e0){
          if (p5) {
             p5.onFallback(e0);
          }
          return new AX2C(p0, this.mInflaterDelegate).inflateSync(p1, p2, p3, false, p5);
       }
    }
    public boolean hasPreloadTask(int p0){
       List list = this.map.get(Integer.valueOf(p0));
       boolean b = (list != null && list.size() > 0)? true: false;
       return b;
    }
    public void injectLooper(){
       try{
          Field declaredFiel = Looper.class.getDeclaredField("sThreadLocal");
          declaredFiel.setAccessible(true);
          Object obj = declaredFiel.get(Looper.getMainLooper());
          if (obj instanceof ThreadLocal) {
             obj.set(Looper.getMainLooper());
          }
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }
       return;
    }
    public final void observeContextLifeCycle(Context p0){
       Iterator iterator = this.ctxRef.iterator();
       while (true) {
          if (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc.get() != null && weakReferenc.get() == p0) {
                return;
             }
             continue ;
          }else {
             this.ctxRef.add(new WeakReference(p0));
             if (p0 instanceof ComponentActivity) {
                p0.getLifecycle().addObserver(new PreLoader$3(this, p0));
                break ;
             }
             break ;
          }
       }
       return;
    }
    public void preload(PreloadParam p0){
       PreloadParam context = p0.context;
       if (p0.forceUpgradeLimit == null && this.checkPreloadUnusedRes()) {
          p0 = p0.inflateListener;
          if (p0 != null) {
             p0.onFallback("Preloader obtain objects over max limit");
          }
          return;
       }else {
          Iterator iterator = p0.layoutIds.iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             this.ensureResMapValid(i);
             Integer integer = this.resToCurrentMap.get(Integer.valueOf(i));
             int i1 = 0;
             if (integer == null) {
                integer = Integer.valueOf(i1);
             }
             if (integer.intValue() >= p0.maxCount) {
                PreloadParam inflateListe = p0.inflateListener;
                if (inflateListe != null) {
                   inflateListe.onFallback("Max count limit");
                }
             }else {
                int i2 = integer.intValue() + 1;
                this.resToCurrentMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                List list = this.map.get(Integer.valueOf(i));
                if (list == null) {
                   list = new ArrayList();
                }
                while (i1 < p0.repeatCount) {
                   list.add(this.doLoad(i, p0));
                   i1 = i1 + 1;
                }
                this.map.put(Integer.valueOf(i), list);
                if (context instanceof ComponentActivity) {
                   this.registerContextMap(context, i);
                   this.observeContextLifeCycle(context);
                }
             }
          }
          return;
       }
    }
    public int preloadFinishCount(int p0){
       List list = this.map.get(Integer.valueOf(p0));
       int i = 0;
       if (list != null && list.size() > 0) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isDone()) {
                i = i + 1;
             }
          }
       }
       return i;
    }
    public void reduceResMapCount(int p0){
       Integer integer = this.resToCurrentMap.get(Integer.valueOf(p0));
       if (integer == null) {
          return;
       }
       if (integer.intValue() == 1) {
          this.resToCurrentMap.remove(Integer.valueOf(p0));
       }else {
          this.resToCurrentMap.put(Integer.valueOf(p0), Integer.valueOf((integer.intValue() - 1)));
       }
       return;
    }
    public final void registerContextMap(Context p0,int p1){
       ArrayList uArrayList;
       Iterator iterator = this.indexMap.keySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             Context uContext = iterator.next();
             if (uContext == p0) {
                List list = this.indexMap.get(uContext);
                if (list != null) {
                   list.add(Integer.valueOf(p1));
                   break ;
                }else {
                   uArrayList = new ArrayList();
                   uArrayList.add(Integer.valueOf(p1));
                   this.indexMap.put(p0, uArrayList);
                   break ;
                }
             }
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(Integer.valueOf(p1));
             this.indexMap.put(p0, uArrayList);
             return;
          }
       }
       return;
    }
    public void setInflaterDelegate(LayoutInflaterDelegate p0){
       this.mInflaterDelegate = p0;
    }
    public void stringPreLoader(Context p0,int p1){
       this.executorService.submit(new PreLoader$1(this, p0, p1));
    }
    public void viewStub(Context p0,ViewStub p1,int p2,PreLoader$InflateListener p3){
       this.viewStub(p0, p1, p2, true, p3);
    }
    public void viewStub(Context p0,ViewStub p1,int p2,boolean p3,PreLoader$InflateListener p4){
       View orWait = this.getOrWait(p0, p2, null, false, p3, p4);
       ViewGroup parent = p1.getParent();
       if (parent == null) {
          if (p4 != null) {
             p4.onFallback("viewstub: "+p1+" parent is null");
          }
          return;
       }else {
          int i = parent.indexOfChild(p1);
          parent.removeViewInLayout(p1);
          ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
          if (layoutParams != null) {
             parent.addView(orWait, i, layoutParams);
          }else {
             parent.addView(orWait, i);
          }
          return;
       }
    }
}
