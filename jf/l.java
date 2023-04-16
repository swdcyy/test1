package jf.l;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.m;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Boolean;

public class l extends a	// class@002404
{

    public void l(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = true;
       boolean b1 = false;
       int i = -1;
       switch (p1.hashCode()){
           case 0x9824432d:
             if (p1.equals("thumbColor")) {
                i = 0;
             }
             break;
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i = 1;
             }
             break;
           case 0xeedf041d:
             if (p1.equals("trackTintColor")) {
                i = 2;
             }
             break;
           case 3551:
             if (p1.equals("on")) {
                i = 3;
             }
             break;
           case 0x6ac9171:
             if (p1.equals("value")) {
                i = 4;
             }
             break;
           case 0x10263a7c:
             if (p1.equals("disabled")) {
                i = 5;
             }
             break;
           case 0x40a6a2d2:
             if (p1.equals("trackColorForFalse")) {
                i = 6;
             }
             break;
           case 0x71fbaff2:
             if (p1.equals("thumbTintColor")) {
                i = 7;
             }
             break;
           case 0x7dfb79ff:
             if (p1.equals("trackColorForTrue")) {
                i = 8;
             }
             break;
           default:
       }
    label_0074 :
       Integer integer = null;
       switch (i){
           case 0:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setThumbColor(p0, integer);
             break;
           case 1:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setEnabled(p0, b);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setTrackTintColor(p0, integer);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setOn(p0, b1);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setValue(p0, b1);
             break;
           case 5:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setDisabled(p0, b1);
             break;
           case 6:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setTrackColorForFalse(p0, integer);
             break;
           case 7:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setThumbTintColor(p0, integer);
             break;
           case 8:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setTrackColorForTrue(p0, integer);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
