package jf.n;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.o;
import java.lang.Boolean;
import java.lang.Double;

public class n extends a	// class@002406
{

    public void n(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = true;
       int i = 0;
       int i1 = -1;
       switch (p1.hashCode()){
           case 0xbb646bb4:
             if (p1.equals("scrollEnabled")) {
                i1 = 0;
             }
             break;
           case 0xd27198e6:
             if (p1.equals("keyboardDismissMode")) {
                i1 = 1;
             }
             break;
           case 0x416f6d1d:
             if (p1.equals("pageMargin")) {
                i1 = 2;
             }
             break;
           case 0x4981ebf3:
             if (p1.equals("initialPage")) {
                i1 = 3;
             }
             break;
           case 0x726d8566:
             if (p1.equals("peekEnabled")) {
                i1 = 4;
             }
             break;
           default:
       }
       switch (i1){
           case 0:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setScrollEnabled(p0, b);
             break;
           case 1:
             this.a.setKeyboardDismissMode(p0, p2);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                i = p2.intValue();
             }
             ta.setPageMargin(p0, i);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                i = p2.intValue();
             }
             ta.setInitialPage(p0, i);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                i = p2.booleanValue();
             }
             ta.setPeekEnabled(p0, i);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
