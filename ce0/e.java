package ce0.e;
import k2b.s1;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.growth.pendant.core.SelectPageHelper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ce0.b;
import java.lang.StringBuilder;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class e implements s1	// class@0004a2
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void d(String p0,int p1,String p2){
       int this;
       String str1;
       Object[] objArray2;
       SelectPageHelper selectPageHe = SelectPageHelper.class;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "1")) {
          return;
       }
       b uob = b.C();
       StringBuilder str = "page2:"+p0+" subAction:";
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       this = 3;
       if (PatchProxy.isSupport(selectPageHe)) {
          str1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), i, selectPageHe, "12");
          if (str1 != PatchProxyResult.class) {
          }else if(p1 != 1){
             if (p1 != 2) {
                if (p1 != this) {
                   str1 = (p1 != 4)? String.valueOf(p1): "pause";
                }else {
                   str1 = "resume";
                }
             }else {
                str1 = "leave";
             }
          }else {
             str1 = "enter";
          }
       }else {
          goto label_0051 ;
       }
       Object[] objArray = new Object[0];
       uob.D(str+str1+" params: "+p2, objArray);
       if (p1 == 1 || p1 == this) {
          Object[] objArray1 = new Object[0];
          b.C().D("enter new iLog page2="+p0, objArray1);
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (!uActivity instanceof GifshowActivity) {
             uActivity = null;
          }
          if (!TextUtils.n(SelectPageHelper.b(i), p0)) {
             if (uActivity != null) {
                objArray2 = new Object[0];
                b.C().D("onPageChange", objArray2);
                i.e(uActivity, p0);
             }
          }else if(uActivity != null){
             int i2 = uActivity.hashCode();
             Object[] objArray3 = new Object[0];
             b.C().D("currentActivityToken "+i2, objArray3);
             if (i2 != SelectPageHelper.b) {
                objArray2 = new Object[0];
                b.C().D("onSamePageActivityChange", objArray2);
                i.e(uActivity, p0);
             }else {
                objArray = new Object[0];
                b.C().D("onSamePageActivityNotChange "+"mEnterNewActivity="+SelectPageHelper.a(i)+" , "+"mTryTaskOnPageEnterOrResume="+i.d(), objArray);
                if (SelectPageHelper.a(i) && i.d()) {
                   Objects.requireNonNull(i);
                   if (!PatchProxy.applyVoidTwoRefs(uActivity, p0, i, selectPageHe, "4")) {
                      if (uActivity.isFinishing() || uActivity.isDestroyed()) {
                         objArray2 = new Object[0];
                         b.C().D("tryTaskOnSamePage activity get is destroy because ILogManager resume before ActivityContext currentActivity", objArray2);
                         SelectPageHelper.d = true;
                         SelectPageHelper.f = true;
                         SelectPageHelper.c = p0;
                      }else {
                         i.f(uActivity, p0);
                      }
                   }
                }
             }
          }
          SelectPageHelper.c(i, p0);
          int i1 = (uActivity != null)? uActivity.hashCode(): 0;
          SelectPageHelper.b = i1;
          SelectPageHelper.e = false;
       }else if(p1 == 2 && TextUtils.n(SelectPageHelper.b(i), p0)){
          SelectPageHelper.c(i, "");
       }
       return;
    }
}
