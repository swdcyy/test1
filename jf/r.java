package jf.r;
import ze.a;
import ze.b;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import jf.s;
import java.lang.Boolean;
import java.lang.Double;
import com.facebook.react.bridge.ReadableArray;

public class r extends a	// class@00240a
{

    public void r(b p0){
       super(p0);
    }
    public void a(View p0,String p1,Object p2){
       a ta;
       Objects.requireNonNull(p1);
       boolean b = false;
       int i = -1;
       switch (p1.hashCode()){
           case 0x91a28eb7:
             if (p1.equals("presentationStyle")) {
                i = 0;
             }
             break;
           case 0x91b95871:
             if (p1.equals("supportedOrientations")) {
                i = 1;
             }
             break;
           case 0x991c5d52:
             if (p1.equals("transparent")) {
                i = 2;
             }
             break;
           case 0x9f88aca9:
             if (p1.equals("identifier")) {
                i = 3;
             }
             break;
           case 0xbb16bdd8:
             if (p1.equals("statusBarTranslucent")) {
                i = 4;
             }
             break;
           case 0xd09a29a3:
             if (p1.equals("animated")) {
                i = 5;
             }
             break;
           case 0x4749621f:
             if (p1.equals("hardwareAccelerated")) {
                i = 6;
             }
             break;
           case 0x7911bcde:
             if (p1.equals("animationType")) {
                i = 7;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.a.setPresentationStyle(p0, p2);
             break;
           case 1:
             this.a.setSupportedOrientations(p0, p2);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setTransparent(p0, b);
             break;
           case 3:
             ta = this.a;
             if (p2 != null) {
                b = p2.intValue();
             }
             ta.setIdentifier(p0, b);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setStatusBarTranslucent(p0, b);
             break;
           case 5:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setAnimated(p0, b);
             break;
           case 6:
             ta = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             ta.setHardwareAccelerated(p0, b);
             break;
           case 7:
             this.a.setAnimationType(p0, p2);
             break;
           default:
             super.a(p0, p1, p2);
       }
       return;
    }
}
