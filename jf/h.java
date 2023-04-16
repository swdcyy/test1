package jf.h;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.i;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;

public class h extends a	// class@002400
{

    public void h(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = true;
       boolean b1 = false;
       int i = -1;
       switch (p1.hashCode()){
           case 0xc454c22d:
             if (p1.equals("progress")) {
                i = 0;
             }
             break;
           case 0xcbb7712d:
             if (p1.equals("testID")) {
                i = 1;
             }
             break;
           case 0xd7a7b04b:
             if (p1.equals("typeAttr")) {
                i = 2;
             }
             break;
           case 0x5a72f63:
             if (p1.equals("color")) {
                i = 3;
             }
             break;
           case 0x25bcecbb:
             if (p1.equals("indeterminate")) {
                i = 4;
             }
             break;
           case 0x42ab1b5e:
             if (p1.equals("animating")) {
                i = 5;
             }
             break;
           case 0x6b922b42:
             if (p1.equals("styleAttr")) {
                i = 6;
             }
             break;
           default:
       }
    label_005a :
       double d = 0;
       switch (i){
           case 0:
             ta = this.a;
             d = (p2 == null)? 0: p2.doubleValue();
             ta.setProgress(p0, d);
             break;
           case 1:
             ta = this.a;
             if (p2 == null) {
                p2 = "";
             }else {
             }
             ta.setTestID(p0, p2);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                d = p2;
             }
             ta.setTypeAttr(p0, d);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                d = Integer.valueOf(p2.intValue());
             }
             ta.setColor(p0, d);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setIndeterminate(p0, b1);
             break;
           case 5:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setAnimating(p0, b);
             break;
           case 6:
             ta = this.a;
             if (p2 != null) {
                d = p2;
             }
             ta.setStyleAttr(p0, d);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
