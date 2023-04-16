package com.kwai.android.common.utils.ActivityStack;
import java.util.ArrayList;
import com.kwai.android.common.utils.ActivityStack$1;
import java.lang.Object;
import android.app.Activity;
import com.kwai.android.common.utils.ActivityStack$OnStackChangedListener;
import com.kwai.android.common.utils.ComparableWeakRef;
import java.util.List;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.lang.Class;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Iterator;
import java.lang.Exception;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.Handler;
import android.os.Looper;
import com.kwai.android.common.utils.b;
import java.lang.Runnable;
import com.kwai.android.common.utils.a;
import b45.b;
import b45.c;
import b45.a;

public class ActivityStack	// class@000999
{
    public static final List INSTANCE_STACK;
    public static final Application$ActivityLifecycleCallbacks LIFECYCLE_CALLBACKS;
    public static final List LISTENERS;
    public static final List RESUME_LIST;
    public static boolean isBackground;
    public static boolean isInit;

    static {
       ActivityStack.INSTANCE_STACK = new ArrayList();
       ActivityStack.RESUME_LIST = new ArrayList();
       ActivityStack.LISTENERS = new ArrayList();
       ActivityStack.LIFECYCLE_CALLBACKS = new ActivityStack$1();
    }
    public void ActivityStack(){
       super();
    }
    public static void a(Activity p0){
       ActivityStack.lambda$notifyPushListener$0(p0);
    }
    public static void addStackChangedListener(ActivityStack$OnStackChangedListener p0){
       List lISTENERS = ActivityStack.LISTENERS;
       _monitor_enter(lISTENERS);
       lISTENERS.add(new ComparableWeakRef(p0));
       _monitor_exit(lISTENERS);
    }
    public static void b(Activity p0){
       ActivityStack.lambda$notifyGonnaEmptyListener$2(p0);
    }
    public static void c(){
       ActivityStack.lambda$notifyAppResume$4();
    }
    public static void clearUpByIndex(int p0){
       List iNSTANCE_STA = ActivityStack.INSTANCE_STACK;
       _monitor_enter(iNSTANCE_STA);
       if (p0 < 0) {
          _monitor_exit(iNSTANCE_STA);
          return;
       }else if(p0 >= iNSTANCE_STA.size()){
          p0 = iNSTANCE_STA.size() - 1;
       }
       int i = p0;
       while (i >= 0) {
          Activity uActivity = ActivityStack.INSTANCE_STACK.get(i).get();
          if (uActivity != null) {
             uActivity.finish();
          }
          i = i - 1;
       }
       if (p0) {
          ActivityStack.INSTANCE_STACK.subList(0, p0).clear();
       }else {
          ActivityStack.INSTANCE_STACK.clear();
       }
       _monitor_exit(iNSTANCE_STA);
       return;
    }
    public static void d(){
       ActivityStack.lambda$notifyAppPause$3();
    }
    public static void e(Activity p0){
       ActivityStack.lambda$notifyPopListener$1(p0);
    }
    public static void exitApplication(){
       ActivityStack.exitApplication(true);
    }
    public static void exitApplication(boolean p0){
       int i;
       Activity uActivity;
       List iNSTANCE_STA = ActivityStack.INSTANCE_STACK;
       _monitor_enter(iNSTANCE_STA);
       ArrayList uArrayList = new ArrayList(iNSTANCE_STA);
       if (p0) {
          i = uArrayList.size() - 1;
          while (i >= 0) {
             uActivity = uArrayList.get(i).get();
             if (uActivity != null) {
                uActivity.finish();
             }
             i--;
          }
       }else {
          i = 0;
          while (i < uArrayList.size()) {
             uActivity = uArrayList.get(i).get();
             if (uActivity != null) {
                uActivity.finish();
             }
             i++;
          }
       }
       ActivityStack.INSTANCE_STACK.clear();
       _monitor_exit(iNSTANCE_STA);
       return;
    }
    public static int indexOf(Activity p0){
       return new ArrayList(ActivityStack.INSTANCE_STACK).indexOf(new ComparableWeakRef(p0));
    }
    public static int indexOf(Class p0){
       ArrayList uArrayList = new ArrayList(ActivityStack.INSTANCE_STACK);
       int i = 0;
       while (true) {
          if (i >= uArrayList.size()) {
             return -1;
          }
          Activity uActivity = uArrayList.get(i).get();
          if (uActivity != null && uActivity.getClass().equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static void init(Application p0){
       if (ActivityStack.isInit) {
          return;
       }
       ActivityStack.isInit = true;
       p0.registerActivityLifecycleCallbacks(ActivityStack.LIFECYCLE_CALLBACKS);
       return;
    }
    public static boolean isBackground(){
       return ActivityStack.isBackground;
    }
    public static void lambda$notifyAppPause$3(){
       Iterator iterator = new ArrayList(ActivityStack.LISTENERS).iterator();
       while (iterator.hasNext()) {
          ComparableWeakRef uComparableW = iterator.next();
          try{
             ActivityStack$OnStackChangedListener onStackChang = uComparableW.get();
             if (onStackChang != null) {
                onStackChang.onAppPause();
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             goto label_000b ;
          }
       }
       return;
    }
    public static void lambda$notifyAppResume$4(){
       Iterator iterator = new ArrayList(ActivityStack.LISTENERS).iterator();
       while (iterator.hasNext()) {
          ComparableWeakRef uComparableW = iterator.next();
          try{
             ActivityStack$OnStackChangedListener onStackChang = uComparableW.get();
             if (onStackChang != null) {
                onStackChang.onAppResume();
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             goto label_000b ;
          }
       }
       return;
    }
    public static void lambda$notifyGonnaEmptyListener$2(Activity p0){
       Iterator iterator = new ArrayList(ActivityStack.LISTENERS).iterator();
       while (iterator.hasNext()) {
          ComparableWeakRef uComparableW = iterator.next();
          try{
             ActivityStack$OnStackChangedListener onStackChang = uComparableW.get();
             if (onStackChang != null) {
                onStackChang.onStackGonnaEmpty(p0);
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             goto label_000b ;
          }
       }
       return;
    }
    public static void lambda$notifyPopListener$1(Activity p0){
       Iterator iterator = new ArrayList(ActivityStack.LISTENERS).iterator();
       while (iterator.hasNext()) {
          ComparableWeakRef uComparableW = iterator.next();
          try{
             ActivityStack$OnStackChangedListener onStackChang = uComparableW.get();
             if (onStackChang != null) {
                onStackChang.onPop(p0);
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             goto label_000b ;
          }
       }
       return;
    }
    public static void lambda$notifyPushListener$0(Activity p0){
       Iterator iterator = new ArrayList(ActivityStack.LISTENERS).iterator();
       while (iterator.hasNext()) {
          ComparableWeakRef uComparableW = iterator.next();
          try{
             ActivityStack$OnStackChangedListener onStackChang = uComparableW.get();
             if (onStackChang != null) {
                onStackChang.onPush(p0);
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             goto label_000b ;
          }
       }
       return;
    }
    public static int lastIndexOf(Activity p0){
       return new ArrayList(ActivityStack.INSTANCE_STACK).lastIndexOf(new ComparableWeakRef(p0));
    }
    public static int lastIndexOf(Class p0){
       ArrayList uArrayList = new ArrayList(ActivityStack.INSTANCE_STACK);
       int i = uArrayList.size() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          Activity uActivity = uArrayList.get(i).get();
          if (uActivity != null && uActivity.getClass().equals(p0)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return i;
    }
    public static void logI(String p0){
    }
    public static String logStack(){
       StringBuilder str = "stack_bottom";
       Iterator iterator = new ArrayList(ActivityStack.INSTANCE_STACK).iterator();
       while (iterator.hasNext()) {
          Activity uActivity = iterator.next().get();
          if (uActivity != null) {
             str = str+"->"+uActivity.getClass().getSimpleName();
          }
       }
       str = str+"->stack_head";
       ActivityStack.logI(str);
       return str;
    }
    public static void notifyAppPause(){
       new Handler(Looper.getMainLooper()).post(b.b);
    }
    public static void notifyAppResume(){
       new Handler(Looper.getMainLooper()).post(a.b);
    }
    public static void notifyGonnaEmptyListener(Activity p0){
       new Handler(Looper.getMainLooper()).post(new b(p0));
    }
    public static void notifyPopListener(Activity p0){
       new Handler(Looper.getMainLooper()).post(new c(p0));
    }
    public static void notifyPushListener(Activity p0){
       new Handler(Looper.getMainLooper()).post(new a(p0));
    }
    public static Activity popInstance(){
       return ActivityStack.popInstance((ActivityStack.INSTANCE_STACK.size() - 1), false);
    }
    public static Activity popInstance(int p0,boolean p1){
       if (p0 < 0) {
          return null;
       }
       List iNSTANCE_STA = ActivityStack.INSTANCE_STACK;
       if (p0 >= iNSTANCE_STA.size()) {
          return null;
       }
       _monitor_enter(iNSTANCE_STA);
       try{
          Activity uActivity = iNSTANCE_STA.remove(p0).get();
          while (uActivity == null) {
             List iNSTANCE_STA1 = ActivityStack.INSTANCE_STACK;
             if (p0 < iNSTANCE_STA1.size()) {
                uActivity = iNSTANCE_STA1.remove(p0).get();
             }else if(uActivity == null){
                _monitor_exit(iNSTANCE_STA);
                return null;
             }else if(p1){
                p0--;
                ActivityStack.clearUpByIndex(p0);
             }
             ActivityStack.logI("popInstance:"+uActivity.getClass().getSimpleName());
             ActivityStack.logStack();
             ActivityStack.notifyPopListener(uActivity);
             if (!ActivityStack.size()) {
                ActivityStack.notifyGonnaEmptyListener(uActivity);
             }
             _monitor_exit(iNSTANCE_STA);
             return uActivity;
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          _monitor_exit(iNSTANCE_STA);
          return null;
       }
    }
    public static void pushInstance(Activity p0){
       List iNSTANCE_STA = ActivityStack.INSTANCE_STACK;
       _monitor_enter(iNSTANCE_STA);
       iNSTANCE_STA.add(new ComparableWeakRef(p0));
       ActivityStack.logI("pushInstance:"+p0.getClass().getSimpleName());
       ActivityStack.logStack();
       ActivityStack.notifyPushListener(p0);
       _monitor_exit(iNSTANCE_STA);
    }
    public static void removeAllStackChangedListener(){
       List lISTENERS = ActivityStack.LISTENERS;
       _monitor_enter(lISTENERS);
       lISTENERS.clear();
       _monitor_exit(lISTENERS);
    }
    public static void removeResume(Activity p0){
       List rESUME_LIST = ActivityStack.RESUME_LIST;
       _monitor_enter(rESUME_LIST);
       rESUME_LIST.remove(new ComparableWeakRef(p0));
       if (rESUME_LIST.isEmpty()) {
          ActivityStack.logI("App pause");
          ActivityStack.isBackground = true;
          ActivityStack.notifyAppPause();
       }else {
          ActivityStack.logI("removeResumeFromResultList:"+p0.getClass().getSimpleName());
       }
       _monitor_exit(rESUME_LIST);
       return;
    }
    public static void removeStackChangedListener(ActivityStack$OnStackChangedListener p0){
       List lISTENERS = ActivityStack.LISTENERS;
       _monitor_enter(lISTENERS);
       lISTENERS.remove(new ComparableWeakRef(p0));
       _monitor_exit(lISTENERS);
    }
    public static void saveResume(Activity p0){
       List rESUME_LIST = ActivityStack.RESUME_LIST;
       _monitor_enter(rESUME_LIST);
       rESUME_LIST.add(new ComparableWeakRef(p0));
       if (rESUME_LIST.isEmpty()) {
          ActivityStack.logI("App resume");
          ActivityStack.isBackground = false;
          ActivityStack.notifyAppResume();
       }else {
          ActivityStack.logI("saveResumeToResumeList:"+p0.getClass().getSimpleName());
       }
       _monitor_exit(rESUME_LIST);
       return;
    }
    public static int size(){
       return ActivityStack.INSTANCE_STACK.size();
    }
    public static int sizeOf(Class p0){
       ArrayList uArrayList = new ArrayList(ActivityStack.INSTANCE_STACK);
       int i = 0;
       int i1 = 0;
       while (i < uArrayList.size()) {
          Activity uActivity = uArrayList.get(i).get();
          if (uActivity != null && (uActivity.getLocalClassName()).equals(p0.getSimpleName())) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public static Activity takeInstance(){
       return ActivityStack.takeInstance((ActivityStack.INSTANCE_STACK.size() - 1));
    }
    public static Activity takeInstance(int p0){
       ArrayList uArrayList = new ArrayList(ActivityStack.INSTANCE_STACK);
       if (p0 < 0 || p0 >= uArrayList.size()) {
          return null;
       }
       return uArrayList.get(p0).get();
    }
}
