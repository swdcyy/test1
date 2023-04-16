package a43.m;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.List;
import java.lang.Boolean;
import java.util.ArrayList;
import mhc.x;
import com.yxcorp.gifshow.share.platform.b;
import a43.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class m	// class@000045
{

    public void m(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 1568:
             if (p0.equals("11")) {
                i = 0;
             }
             break;
           case 1569:
             if (p0.equals("12")) {
                i = 1;
             }
             break;
           case 0x170060:
             if (p0.equals("1001")) {
                i = 2;
             }
             break;
           case 0x170061:
             if (p0.equals("1002")) {
                i = 3;
             }
             break;
           case 0x170062:
             if (p0.equals("1003")) {
                i = 4;
             }
             break;
           case 0x170063:
             if (p0.equals("1004")) {
                i = 5;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return "reduce_author";
           case 1:
             return "reduce_live";
           case 2:
             return "FOLLOW";
           case 3:
             return "UN_FOLLOW";
           case 4:
             return "REPORT";
           case 5:
             return "SHARE";
           default:
             return "";
       }
    }
    public static List b(boolean p0,boolean p1){
       ArrayList obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, om, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (p1) {
          obj.add("1002");
       }else if(!p0){
          obj.add("12");
       }
       obj.add("1003");
       if (b.k().K()) {
          obj.add("1004");
       }
       if (n.b()) {
          obj.add("1005");
       }
       return obj;
    }
    public static List c(){
       ArrayList obj = PatchProxy.apply(null, null, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (b.k().K()) {
          obj.add("1004");
       }
       return obj;
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.n(p0, "1001") && !TextUtils.n(p0, "1002"))? true: false;
       return b;
    }
}
