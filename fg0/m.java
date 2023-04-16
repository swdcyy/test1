package fg0.m;
import fg0.l;
import fg0.m$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import zsd.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import ig0.e;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import hg0.b;
import java.util.Collection;
import java.util.List;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import ig0.b;
import wkd.b;
import fg0.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import dg0.b;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import ie5.e;
import java.util.Iterator;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import fg0.m$b;
import erd.r;
import fg0.m$c;
import erd.g;
import crd.b;
import gg0.f;
import gg0.m;
import gg0.a;
import gg0.c;
import gg0.j;
import gg0.h;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import hg0.a;
import com.google.common.collect.Lists;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;

public class m implements l	// class@002332
{
    public List a;
    public b b;
    public static final m$a c;

    static {
       m.c = new m$a(null);
    }
    public void m(){
       super();
       this.a = new ArrayList();
    }
    public void B(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "scheduleNextTask, nextTaskParamStr="+p0, false, 4, null);
       int i = (p0 == null || u.S1(p0))? 1: 0;
       if (i) {
          return;
       }else {
          TaskCommonParams taskCommonPa = e.d(p0);
          if (taskCommonPa != null) {
             this.h2(taskCommonPa);
          }
          return;
       }
    }
    public synchronized boolean C(RxFragmentActivity p0,int p1,String p2,String p3){
       TaskCenterLogUtil obj;
       boolean b;
       b uob;
       RxBus f;
       String mAnimResUrl;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, m.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       obj = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(obj, "TaskManagerImpl", "tryRestoreTask, page="+p1+", page2="+p2, false, 4, null);
       TaskCenterLogUtil taskCenterLo = null;
       m tb = this.b;
       if (tb != null && !this.e(tb)) {
          b = this.h(p0, p1, p2, p3);
          TaskCenterLogUtil.e(obj, "TaskManagerImpl", "tryRestoreTask failed, has running task, showPendant="+b, false, 4, null);
          return b;
       }else {
          int i = this.a.size();
          while (true) {
             i = i - 1;
             if (i < 0) {
                return taskCenterLo;
             }
             uob = this.a.get(i);
             TaskCommonParams taskCommonPa = uob.g();
             TaskCenterLogUtil b1 = TaskCenterLogUtil.b;
             TaskCenterLogUtil.d(b1, "TaskManagerImpl", "tryRestoreTask: "+taskCommonPa.getMTaskTypeId()+",taskToken="+taskCommonPa.getMTaskToken(), false, 4, null);
             if (this.e(uob)) {
                continue ;
             }else {
                TaskPendantConfig mPendantConf = taskCommonPa.getMPendantConfig();
                if (mPendantConf != null && (b.b(mPendantConf.getMShowPageList(), mPendantConf.getMShowPage2List(), p1, p2) && b.a.c(taskCommonPa, p3))) {
                   TaskCenterLogUtil.d(b1, "TaskManagerImpl", "tryRestoreTask: "+taskCommonPa.getMTaskTypeId(), false, 4, null);
                   this.b(p0, taskCommonPa);
                   b.a(0x5832311c).d(taskCommonPa);
                   f = RxBus.f;
                   TaskPendantConfig mPendantConf1 = taskCommonPa.getMPendantConfig();
                   if (mPendantConf1 != null) {
                      TaskUIConfig mUiConfig = mPendantConf1.getMUiConfig();
                      if (mUiConfig != null) {
                         mAnimResUrl = mUiConfig.getMAnimResUrl();
                         break ;
                      }
                   }
                   mAnimResUrl = null;
                   break ;
                }
             }
          }
          f.b(new b(1, mAnimResUrl));
          this.g(uob);
          f.b(new e());
          return this.h(p0, p1, p2, p3);
       }
    }
    public b D(){
       return this.b;
    }
    public synchronized final void a(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "12")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (this.d(iterator.next(), p0)) {
                return;
             }
             continue ;
          }else {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "addTask "+p0.getMTaskTypeId()+" | "+p0.getMTaskToken(), false, 4, null);
             b uob = this.c(p0);
             if (uob != null) {
                this.a.add(uob);
                break ;
             }
             break ;
          }
       }
       return;
    }
    public final void b(RxFragmentActivity p0,TaskCommonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "20")) {
          return;
       }
       p0.m().compose(p0.E2(ActivityEvent.DESTROY)).filter(new m$b(p0)).subscribe(new m$c(this, p1));
       return;
    }
    public final b c(TaskCommonParams p0){
       h oh;
       String obj = PatchProxy.applyOneRefs(p0, this, m.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = null;
       if (e.b(p0)) {
          obj = p0.getMTaskTypeId();
          if (obj != null) {
             switch (obj.hashCode()){
                 case 0x887d9817:
                   if (obj.equals("watch_live_duration")) {
                      oh = new h(p0);
                   }
                   break;
                 case 0xccaa443f:
                   if (obj.equals("browse_behind_page")) {
                      oh = new a(p0);
                   }
                   break;
                 case 0xd0cdfb24:
                   if (obj.equals("browse_page")) {
                      oh = new j(p0);
                   }
                   break;
                 case 0xd7afaa71:
                   if (obj.equals("watch_photo_duration")) {
                      if (p0.getMIsUseBehind()) {
                         oh = new a(p0);
                      }else {
                         oh = new c(p0);
                      }
                   }
                   break;
                 case 0x1cc36952:
                   if (obj.equals("watch_photo_count")) {
                      oh = new m(p0);
                   }
                   break;
                 case 0x48c1a488:
                   if (obj.equals("live_chat_duration")) {
                      oh = new f(p0);
                   }
                   break;
                 default:
             }
             uob = oh;
          }
       }
       return uob;
    }
    public final boolean d(b p0,TaskCommonParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(p0.g().getMTaskToken(), p1.getMTaskToken());
    }
    public boolean d2(GifshowActivity p0,int p1,String p2){
       TaskCommonParams obj;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, m.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       obj = e.c(p0);
       boolean b = (obj == null || !obj.getMActivityTask())? this.C(p0, p1, p2, null): this.i2(obj, p0, p1, p2);
       return b;
    }
    public final boolean e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.k() && !p0.j()) {
          return false;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "removeExpiredOrCompleteTask, isExpired="+p0.k()+", isComplete="+p0.j(), false, 4, null);
       this.e2(p0.f);
       return true;
    }
    public synchronized void e2(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       a.p(p0, "param");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "removeTask, taskToken="+p0.getMTaskToken(), false, 4, null);
       m tb = this.b;
       if (tb != null && this.d(tb, p0)) {
          tb.p();
          this.b = null;
       }
       b.a(0x5832311c).b(p0);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (this.d(uob, p0)) {
             uob.p();
             iterator.remove();
             break ;
          }
       }
       return;
    }
    public synchronized final void f(TaskCommonParams p0,boolean p1){
       b uob;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "14")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (true) {
          String str = null;
          if (iterator.hasNext()) {
             uob = iterator.next();
             if (!this.e(uob) && this.d(uob, p0)) {
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "scheduleTask, get equal task", false, 4, null);
             }
          }else {
             uob = str;
          }
          if (uob != null) {
             this.a.remove(uob);
             this.i(uob.g(), p0);
             this.j(uob, p0);
          }else {
             uob = this.c(p0);
          }
          if (uob != null) {
             this.a.add(uob);
             b.a(0x5832311c).d(p0);
             RxBus f = RxBus.f;
             TaskPendantConfig mPendantConf = p0.getMPendantConfig();
             if (mPendantConf != null) {
                TaskUIConfig mUiConfig = mPendantConf.getMUiConfig();
                if (mUiConfig != null) {
                   str = mUiConfig.getMAnimResUrl();
                }
             }
             f.b(new b(1, str));
             if (p1) {
                this.g(uob);
                break ;
             }
          }
          break ;
       }
       return;
    }
    public synchronized void f2(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       m tb = this.b;
       if (tb != null) {
          tb.p();
       }
       this.b = null;
       this.a.clear();
       return;
    }
    public final void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "13")) {
          return;
       }
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TaskManagerImpl", "scheduleTask : "+p0.g().getMTaskTypeId(), false, 4, null);
       m tb = this.b;
       if (tb != null) {
          tb.p();
       }
       this.b = p0;
       if (!PatchProxy.applyVoid(null, p0, b.class, "2")) {
          if (p0.f.isTaskComplete()) {
             TaskCenterLogUtil.e(b, "Task", "execute failed, task isTaskComplete", false, 4, null);
          }else if(p0.a != null){
             TaskCenterLogUtil.e(b, "Task", "task is already execute", false, 4, null);
          }else {
             TaskCenterLogUtil.d(b, "Task", "task: "+p0.f.getMTaskTypeId()+" | "+p0.f.getMTaskToken()+" execute", false, 4, null);
             p0.a = true;
             p0.n();
          }
       }
       return;
    }
    public void g2(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, m.class, "10")) {
          return;
       }
       List list = b.a(0x5832311c).c();
       b = (list == null || list.isEmpty())? true: false;
       if (b) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskManagerImpl", "updateTaskFromCache cacheTaskDatas is null", false, 4, null);
          return;
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "updateTaskFromCache", false, 4, null);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             this.a(iterator.next());
          }
          return;
       }
    }
    public final boolean h(RxFragmentActivity p0,int p1,String p2,String p3){
       b obj;
       a$a uoa;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, m.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.D();
       if (!obj instanceof a) {
          uoa = null;
       }
       b uob = uoa;
       boolean b = (uob != null)? uob.t(p0, p1, p2, p3, false): false;
       return b;
    }
    public void h2(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       a.p(p0, "nextTaskParam");
       m tb = this.b;
       if (tb != null && (a.g(p0, tb.g()) ^ 0x01)) {
          tb.p();
          this.b = null;
       }
       this.f(p0, false);
       return;
    }
    public final void i(TaskCommonParams p0,TaskCommonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "16")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "update: currentTaskToken:"+p0.getMTaskToken()+" params.taskToken"+p1.getMTaskToken()+" currentProgress:"+p0.getMCurrentProgress()+" params.currentProgress:"+p1.getMCurrentProgress(), false, 4, null);
       p0.update(p1);
       return;
    }
    public boolean i2(TaskCommonParams p0,GifshowActivity p1,int p2,String p3){
       TaskCenterLogUtil obj;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, m.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "param");
       a.p(p1, "activity");
       obj = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(obj, "TaskManagerImpl", "tryStartInitiativeTask", false, 4, null);
       m tb = this.b;
       if (tb != null) {
          this.e(tb);
       }
       tb = this.b;
       if (tb != null) {
          if (!this.d(tb, p0)) {
             String str = null;
          }
          if (tb != null) {
             this.i(tb.g(), p0);
             this.j(tb, p0);
             TaskCenterLogUtil.e(obj, "TaskManagerImpl", "tryStartInitiativeTask, the new task is running", false, 4, null);
             return this.h(p1, p2, p3, null);
          }
       }
       TaskCenterLogUtil.d(obj, "TaskManagerImpl", "tryStartInitiativeTask, get new Task, page="+p2+", page2="+p3, false, 4, null);
       this.b(p1, p0);
       this.f(p0, true);
       RxBus.f.b(new e());
       return this.h(p1, p2, p3, null);
    }
    public final void j(b p0,TaskCommonParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "17")) {
          return;
       }
       if (p1.getMIgnoreLastProgress()) {
          p0.d();
       }
       return;
    }
    public void j2(){
       boolean b;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, m.class, "11")) {
          return;
       }
       int i = 0x5832311c;
       List list = b.a(i).c();
       ArrayList uArrayList = Lists.b();
       a.o(uArrayList, "Lists.newArrayList\(\)");
       String str = null;
       b = (list == null || list.isEmpty())? true: false;
       if (b) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskManagerImpl", "updateTaskFromCacheAndRemoveComplete cacheTaskDatas is null", false, 4, null);
          return;
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskManagerImpl", "updateTaskFromCacheAndRemoveComplete", false, 4, null);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             TaskCommonParams taskCommonPa = iterator.next();
             TaskCenterLogUtil b1 = TaskCenterLogUtil.b;
             TaskCenterLogUtil.d(b1, "TaskManagerImpl", "updateTaskFromCacheAndRemoveComplete "+taskCommonPa.getMTaskTypeId()+" | "+taskCommonPa.getMTaskToken(), false, 4, null);
             if (taskCommonPa.isTaskComplete()) {
                TaskCenterLogUtil.d(b1, "TaskManagerImpl", "this is complete", false, 4, null);
                str = 1;
             }else {
                uArrayList.add(taskCommonPa);
                obj.a(taskCommonPa);
             }
          }
          if (str) {
             k ok = b.a(i);
             Objects.requireNonNull(ok);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, ok, k.class, "3")) {
                a.p(uArrayList, "taskList");
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskDataManager", "updateTaskParamsList: "+uArrayList.size(), false, 4, null);
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                g.a(ok.a.edit().putString("TaskPendantData_"+qCurrentUser.getId(), a.a.q(uArrayList)));
             }
          }
          return;
       }
    }
    public void k2(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "18")) {
          return;
       }
       a.p(p0, "taskParams");
       m tb = this.b;
       if (tb != null && this.d(tb, p0)) {
          tb.p();
          this.b = null;
       }
       if (p0.getMDisableStoreTask()) {
          this.e2(p0);
       }
       return;
    }
}
