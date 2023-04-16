package jf.d;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.e;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;

public class d extends a	// class@0023fc
{

    public void d(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x83e15dd4:
             if (p1.equals("statusBarBackgroundColor")) {
                i = 0;
             }
             break;
           case 0xb67495a4:
             if (p1.equals("drawerBackgroundColor")) {
                i = 1;
             }
             break;
           case 0xd27198e6:
             if (p1.equals("keyboardDismissMode")) {
                i = 2;
             }
             break;
           case 0xffd3355:
             if (p1.equals("drawerWidth")) {
                i = 3;
             }
             break;
           case 0x297a753a:
             if (p1.equals("drawerPosition")) {
                i = 4;
             }
             break;
           case 0x6eb2c17f:
             if (p1.equals("drawerLockMode")) {
                i = 5;
             }
             break;
           default:
       }
    label_004d :
       Integer integer = null;
       switch (i){
           case 0:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setStatusBarBackgroundColor(p0, integer);
             break;
           case 1:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setDrawerBackgroundColor(p0, integer);
             break;
           case 2:
             this.a.setKeyboardDismissMode(p0, p2);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                integer = Float.valueOf(p2.floatValue());
             }
             ta.setDrawerWidth(p0, integer);
             break;
           case 4:
             this.a.setDrawerPosition(p0, p2);
             break;
           case 5:
             this.a.setDrawerLockMode(p0, p2);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
