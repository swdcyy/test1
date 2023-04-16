package jf.x;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.y;
import java.lang.Double;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;

public class x extends a	// class@002410
{

    public void x(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = true;
       boolean b1 = false;
       int i = -1;
       switch (p1.hashCode()){
           case 0x8eb64e5d:
             if (p1.equals("maximumTrackTintColor")) {
                i = 0;
             }
             break;
           case 0x9877bd25:
             if (p1.equals("thumbImage")) {
                i = 1;
             }
             break;
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i = 2;
             }
             break;
           case 0xc31d2fcb:
             if (p1.equals("minimumTrackTintColor")) {
                i = 3;
             }
             break;
           case 0xc5804910:
             if (p1.equals("maximumTrackImage")) {
                i = 4;
             }
             break;
           case 0xcbb7712d:
             if (p1.equals("testID")) {
                i = 5;
             }
             break;
           case 0x3606cc:
             if (p1.equals("step")) {
                i = 6;
             }
             break;
           case 0x6ac9171:
             if (p1.equals("value")) {
                i = 7;
             }
             break;
           case 0x10263a7c:
             if (p1.equals("disabled")) {
                i = 8;
             }
             break;
           case 0x2accbf31:
             if (p1.equals("maximumValue")) {
                i = 9;
             }
             break;
           case 0x43e9ded0:
             if (p1.equals("trackImage")) {
                i = 10;
             }
             break;
           case 0x4713ea03:
             if (p1.equals("minimumValue")) {
                i = 11;
             }
             break;
           case 0x4f7d117e:
             if (p1.equals("minimumTrackImage")) {
                i = 12;
             }
             break;
           case 0x71fbaff2:
             if (p1.equals("thumbTintColor")) {
                i = 13;
             }
             break;
           default:
       }
    label_00ba :
       double d = 0;
       Integer integer = null;
       switch (i){
           case 0:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setMaximumTrackTintColor(p0, integer);
             break;
           case 1:
             this.a.setThumbImage(p0, p2);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setEnabled(p0, b);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setMinimumTrackTintColor(p0, integer);
             break;
           case 4:
             this.a.setMaximumTrackImage(p0, p2);
             break;
           case 5:
             ta = this.a;
             if (p2 == null) {
                p2 = "";
             }else {
             }
             ta.setTestID(p0, p2);
             break;
           case 6:
             ta = this.a;
             if (p2 != null) {
                d = p2.doubleValue();
             }
             ta.setStep(p0, d);
             break;
           case 7:
             ta = this.a;
             if (p2 != null) {
                d = p2.doubleValue();
             }
             ta.setValue(p0, d);
             break;
           case 8:
             ta = this.a;
             if (p2 != null) {
                b1 = p2.booleanValue();
             }
             ta.setDisabled(p0, b1);
             break;
           case 9:
             ta = this.a;
             double d1 = (p2 == null)? 0x3ff0000000000000: p2.doubleValue();
             ta.setMaximumValue(p0, d1);
             break;
           case 10:
             this.a.setTrackImage(p0, p2);
             break;
           case 11:
             ta = this.a;
             if (p2 != null) {
                d = p2.doubleValue();
             }
             ta.setMinimumValue(p0, d);
             break;
           case 12:
             this.a.setMinimumTrackImage(p0, p2);
             break;
           case 13:
             ta = this.a;
             if (p2 != null) {
                integer = Integer.valueOf(p2.intValue());
             }
             ta.setThumbTintColor(p0, integer);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
