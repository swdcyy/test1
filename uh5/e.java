package uh5.e;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import lnc.v3;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import wh5.c;
import java.lang.Number;
import lnc.a1;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import vh5.a;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;

public final class e	// class@0025ec
{
    public static BrowseStyle a;

    static {
       e.a = e.a();
    }
    public void e(){
       super();
    }
    public static BrowseStyle a(){
       BrowseStyle nASA;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       BrowseStyle obj = PatchProxy.apply(objArray, objArray, uoe, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (VisitorModeManager.f()) {
          nASA = BrowseStyle.NASA;
          Log.g("BrowseStyleUtils", "buildBrowseStyle in visitor return "+nASA);
          return nASA;
       }else {
          obj = PatchProxy.apply(objArray, objArray, uoe, "5");
          if (obj != patchProxyRe) {
          }else {
             v3 ov3 = b.a(-892321700);
             int i = (ov3.a != null && (SystemUtil.P() || SystemUtil.K()))? 1: 0;
             if (i && ov3.b != null) {
                objArray1 = BrowseStyle.NASA;
             }else {
                objArray1 = objArray;
             }
          }
          if (obj == null) {
             objArray1 = PatchProxy.apply(objArray, objArray, uoe, "6");
             if (objArray1 != patchProxyRe) {
             }else if(!a.a().c() || TextUtils.x(objArray)){
                objArray1 = BrowseStyle.valueOf(objArray);
             }
          }
          if (objArray1 == null) {
             Object obj1 = PatchProxy.apply(objArray, objArray, uoe, "7");
             if (obj1 != patchProxyRe) {
                objArray1 = obj1;
             }else {
                Log.g("BrowseStyleUtils", "getOnlineBrowseStyle, childLockEnable:"+c.b()+", enableThanosVersion:"+c.b()+", nasaModeOn:true");
                nASA = (c.b())? BrowseStyle.CHILD_NASA: BrowseStyle.NASA;
                objArray1 = nASA;
             }
          }
          Log.g("BrowseStyleUtils", "buildBrowseStyle return "+objArray1);
          return objArray1;
       }
    }
    public static boolean b(){
       boolean b = (e.a == BrowseStyle.THANOS || e.a == BrowseStyle.CHILD_THANOS)? true: false;
       return b;
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070bf1);
    }
    public static BrowseStyle d(){
       return e.a;
    }
    public static boolean e(){
       boolean b = (e.a == BrowseStyle.NASA || e.a == BrowseStyle.CHILD_NASA)? true: false;
       return b;
    }
    public static boolean f(){
       boolean b = (e.a == BrowseStyle.THANOS || e.a == BrowseStyle.CHILD_THANOS)? true: false;
       return b;
    }
    public static void g(int p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, e.class, "3")) {
          return;
       }
       _monitor_enter(e.class);
       BrowseStyle a = e.a;
       e.a = e.a();
       Log.g("BrowseStyleUtils", "refreshBrowseStyle, old:"+a+", new:"+e.a+", causeBy:"+p0);
       if (a != e.a) {
          RxBus.f.b(new a(p0, a, e.a));
          o0 l = n.L;
          if (l instanceof b) {
             l.f(e.a.getClientLogType());
          }
       }
       _monitor_exit(e.class);
       return;
    }
}
